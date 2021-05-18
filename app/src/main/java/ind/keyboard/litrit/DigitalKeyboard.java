package ind.keyboard.litrit;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.inputmethodservice.InputMethodService;
import android.inputmethodservice.Keyboard;
import android.inputmethodservice.Keyboard.Key;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.RelativeLayout;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import ind.keyboard.emoji.Emoji;
import ind.keyboard.hindi.HindiKeyboardView;
import ind.keyboard.hindi.HindiLanguage;
import ind.keyboard.language.Language;
import ind.keyboard.language.MarathiLanguage;
import ind.keyboard.language.english.English;
import ind.keyboard.settings.SettingsActivity;

import static ind.keyboard.litrit.SetKeys.keys;

/**
 * Input Method Service that runs when the keyboard is up and manages the whole life cycle of the keyboard
 * @author Manideep Polireddi, Madhu Kiran
 *
 */

public class DigitalKeyboard extends InputMethodService
{
    private CustomKeyboard mKeyboardView;
    private Keyboard mKeyboard;
    private HashMap<Integer, KeyProperties> mKeys;
    private HashMap<Integer, KeyProperties> marathiKeys;
    private HashMap<Integer, KeyProperties> englishKeys;
    private HashMap<Integer, KeyProperties> hindiKeys;
    private MarathiLanguage marathiLanguage;
    public String mainLanguageSymbol;
    private English english;
    private Language language;
    private HindiLanguage hindiLanguage;
    private InputConnection mInputConnection;
    private String languageName = "";
    private Context mContext;
    private String displayMode;
    private Key mEnterKey;
    private static Context appContext = null;
    private boolean isPassword;
    private String[] a = new String[12];
    static RelativeLayout layout;

    public void Digital(String[] a)
    {
        this.a = Arrays.copyOf(a,12);
        System.out.println("wed"+ Arrays.toString(a));

        onInitializeInterface();
    }

    @Override
    public void onCreate()
    {
        super.onCreate();
        Log.d("settings","onCreate Called");
        appContext = getApplicationContext();
        Installation.id(getApplicationContext());

       // SetKeys.setContext(view);
    }

    @Override
    public void onInitializeInterface()
    {
        marathiLanguage = new MarathiLanguage();
        marathiKeys = marathiLanguage.hashThis();
        mainLanguageSymbol = marathiLanguage.symbol;

        english = new English();
        englishKeys = english.hashThis();

        hindiLanguage = new HindiLanguage();
        hindiKeys = hindiLanguage.hashThis();

        if (languageName == "")
            setLanguage("main");
        else
            setLanguage(languageName);
    }

    @Override
    public View onCreateInputView()
    {
        mContext = this;
        if (languageName == "")
            setLanguage("main");
        else
            setLanguage(languageName);

        detectDisplayMode();
        int keyboardViewResourceId = getKeyboardViewResourceId();

        layout = (RelativeLayout) getLayoutInflater().inflate(keyboardViewResourceId, null);

        if(languageName == "main")
            mKeyboardView = (MasterKeyboardView) layout.findViewById(R.id.keyboard);
        else if(languageName == "english")
            mKeyboardView = (EnglishKeyboardView) layout.findViewById(R.id.keyboard);
        else if(languageName == "hindi")
            mKeyboardView = (HindiKeyboardView) layout.findViewById(R.id.keyboard);

        int resourceId = getResourceId("default");
        mKeyboard = new Keyboard(this, resourceId);
        mKeyboardView.setKeyboard(mKeyboard);
        mKeyboardView.init(this, language, mKeys);
        updateFullscreenMode();

        mKeyboardView.invalidateAllKeys();

        return layout;
    }

    @Override
    public void onFinishInputView(boolean finishingInput)
    {
        super.onFinishInputView(finishingInput);
        if(!isPassword)
        { }
    }

    public static Context appContext()
    {
        return appContext;
    }

    /**
     * Generates the layout resource id for the keyboard view based on the displayMode and current language
     * @return layout resource id of the keyboard view to be shown
     */
    private int getKeyboardViewResourceId()
    {
        String file = "kview_" + displayMode + languageName;
        Log.d("chakra", "filename = " + file);
        int output = getResources().getIdentifier(file, "layout", getPackageName());

        return output;
    }

    @Override
    public void onStartInputView(EditorInfo info, boolean restarting)
    {
        mInputConnection = getCurrentInputConnection();
        mKeyboardView.resetInputConnection(mInputConnection);
        mKeyboardView.setAlpha(1);
        setImeOptions();

        String prevDisplayMode = displayMode;
        detectDisplayMode();
        if(!displayMode.equals(prevDisplayMode))
            setInputView(onCreateInputView());
    }

    @Override
    public boolean onEvaluateFullscreenMode()
    {
        return false;
    }

    /**
     * sets the labels to the keys on the keyboard
     */
    void setKeys()
    {
        List<Key> keys = mKeyboard.getKeys();

        SetKeys.setKeys(keys);

        for(Key key : keys)
        {
            if(mKeys.containsKey(key.codes[0]))
            {
                KeyProperties tempKey = mKeys.get(key.codes[0]);
                key.label = tempKey.label;

                System.out.println("don "+key.label);

               /* System.out.println("setkeys.getA"+SetKeys.getA());

                if(SetKeys.getA() == 1)
                {
                    key.icon = Drawable.createFromPath(SetKeys.getX());
                    System.out.println("setKeys" + key.label);
                }*/

               // key.label = a;
                System.out.println(a);

                if (tempKey.showIcon)
                {
                    int id = getDrawableId(tempKey.icon);
                    if (id != 0)
                    {
                        key.icon = getResources().getDrawable(id);
                        key.label = null;
                        Log.d("Location", "set icon " + key.icon);
                    }
                }
            }
        }
        setImeOptions();
    }

    public void setKey(String lang)
    {
        List<Key> keys = new ArrayList<Key>();
       // List<Key> keys = mKeyboard.getKeys();

        if(lang == "main")
        {
            marathiLanguage = new MarathiLanguage();
            marathiKeys = marathiLanguage.hashThis();
            mKeys = marathiKeys;
        }
        else if(lang == "hindi")
        {
            hindiLanguage = new HindiLanguage();
            hindiKeys = hindiLanguage.hashThis();
            mKeys = hindiKeys;
        }


        keys = SetKeys.getKeys();

      /*  for(Key key : keys)
        {
            System.out.println("go "+key.label);

            if(key.code == 30)
                key.label = SetKeys.getX();
        }*/

        for(Key key : keys)
        {
           // key.label = SetKeys.getX();
            if(mKeys.containsKey(key.codes[0]))
            {
                KeyProperties tempKey = mKeys.get(key.codes[0]);
               // key.label = tempKey.label;

                String[] a = SetKeys.getX();

               // int[] keycode = {109,31,110,111,125,126,112,113,127,128,107,108,30,114,129,130};

                if(tempKey.code == 109)
                    key.label = a[0];
                else if(tempKey.code == 31)
                    key.label = a[1];
                else if(tempKey.code == 110)
                    key.label = a[2];
                else if(tempKey.code == 111)
                    key.label = a[3];
                else if(tempKey.code == 125)
                    key.label = a[4];
                else if(tempKey.code == 126)
                    key.label = a[5];
                else if(tempKey.code == 112)
                    key.label = a[6];
                else if(tempKey.code == 113)
                    key.label = a[7];
                else if(tempKey.code == 127)
                    key.label = a[8];
                else if(tempKey.code == 128)
                    key.label = a[9];
                else if(tempKey.code == 107)
                    key.label = a[10];
                else if(tempKey.code == 108)
                    key.label = a[11];
                else if(tempKey.code == 30)
                    key.label = a[12];
                else if(tempKey.code == 114)
                    key.label = a[13];
                else if(tempKey.code == 129)
                    key.label = a[14];
                else if(tempKey.code == 130)
                    key.label = a[15];
                else if(tempKey.code == 131)
                    key.label = a[16];
                else if(tempKey.code == 132)
                    key.label = a[17];
                else if(tempKey.code == 133)
                    key.label = a[18];
                else if(tempKey.code == 53)
                    key.label = a[19];
                else if(tempKey.code == 52)
                    key.label = a[20];
                else if(tempKey.code == 134)
                    key.label = a[21];
                else if(tempKey.code == 135)
                    key.label = a[22];
               /* else if(tempKey.code == 41)
                    key.label = ".";*/

                System.out.print("dig"+tempKey.code);

                SetKeys.setA(1);

                System.out.println("yg "+key.label+" "+tempKey.code);

                System.out.println("setkeys.getA"+SetKeys.getA());

               /* if (tempKey.showIcon)
                {
                    int id = getDrawableId(tempKey.icon);
                    if (id != 0)
                    {
                        key.icon = appContext.getDrawable(id);
                        key.label = null;
                        Log.d("Location", "set icon " + key.icon);
                    }
                }*/
            }
        }

        if(lang == "main")
            mKeyboardView = (MasterKeyboardView) layout.findViewById(R.id.keyboard);
        else if(lang == "hindi")
            mKeyboardView = (HindiKeyboardView) layout.findViewById(R.id.keyboard);
        mKeyboardView.invalidateAllKeys();
    }

    public void SetShiftKey(int keyCode, String lang)
    {
        if(lang == "main")
        {
            marathiLanguage = new MarathiLanguage();
            marathiKeys = marathiLanguage.hashThis();
            mKeys = marathiKeys;
        }
        else if(lang == "hindi")
        {
            hindiLanguage = new HindiLanguage();
            hindiKeys = hindiLanguage.hashThis();
            mKeys = hindiKeys;
        }

        for(Key key : keys)
        {
            // key.label = SetKeys.getX();
            if (mKeys.containsKey(key.codes[0]))
            {
                KeyProperties tempKey = mKeys.get(key.codes[0]);

                KeyProperties key1 = mKeys.get(keyCode);

                if (key.codes[0] == 130)
                    key.label = key1.label + "ँ";
                if (key.codes[0] == 131)
                    key.label = key1.label + "़";
                if (key.codes[0] == 132)
                    key.label = key1.label + "ॄ";
                if (key.codes[0] == 133)
                    key.label = key1.label + "ृ";
                if (key.codes[0] == 53)
                    key.label = "र"+"्"+key1.label;
                if (key.codes[0] == 52)
                    key.label = key1.label+"्"+"र";
                if (key.codes[0] == 134)
                    key.label = key1.label + "ॣ";
                if (key.codes[0] == 135)
                    key.label = key1.label + "ॢ";
            }
        }

        if(lang == "main")
            mKeyboardView = (MasterKeyboardView) layout.findViewById(R.id.keyboard);
        else if(lang == "hindi")
            mKeyboardView = (HindiKeyboardView) layout.findViewById(R.id.keyboard);
        mKeyboardView.invalidateAllKeys();
    }

    /**
     * changes the keyboard in the keyboardView
     * @param layoutFile	layout id of the layout to be loaded into the keyboardView
     */
    public void changeKeyboard(String layoutFile)
    {
        String prevDisplayMode = displayMode;
        detectDisplayMode();
        if(prevDisplayMode != displayMode)
            setInputView(onCreateInputView());

        int resourceId = getResourceId(layoutFile);
        System.out.println(resourceId+"resourceid");
        if (resourceId != 0)
        {
            mKeyboard = new Keyboard(mContext, resourceId);
            setKeys();
            mKeyboardView.setKeyboard(mKeyboard);
        }
     //   else
       //     Log.d("layout", "you suck");
    }

    /**
     * sets the current language and keys hashmap according to the language
     * @param name	name of the language
     */
    public void setLanguage(String name)
    {
        languageName = name;
        if (name == "english")
        {
            language = english;
            mKeys = englishKeys;
        }
        else if(name == "main")
        {
            language = marathiLanguage;
            mKeys = marathiKeys;
        }
        else if(name == "hindi")
        {
            language = hindiLanguage;
            mKeys = hindiKeys;
        }
    }

    /**
     * Changes the language of the keyboard from english to main language and vice-versa
     */
    public void changeLanguage(String lang)
    {
        if (languageName == "main")
            language = marathiLanguage;
        else if(languageName == "english")
            language = english;
        else if(languageName == "hindi")
            language = hindiLanguage;

        language = hindiLanguage;
        languageName = lang;
        setLanguage(lang);

       /* if (languageName == "main")
        {
            language = english;
            languageName = "english";
            setLanguage("english");
        }
        else if(languageName == "english")
        {
            language = marathiLanguage;
            languageName = "main";
            setLanguage("main");
        }
        else if(languageName == "hindi")
        {
            language = hindiLanguage;
            languageName = "hindi";
            setLanguage("hindi");
        }*/

        setInputView(onCreateInputView());
    }

    public boolean showTablet(Context context)
    {
        // SharedPreferences settings = mySharedPreferences();
        SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(DigitalKeyboard.appContext());
        SharedPreferences.Editor editor = settings.edit();
        String key = context.getResources().getString(R.string.tablet_layout_setting_key);
        boolean isFirstRun = settings.getBoolean("is_first_run", true);
        if(isFirstRun)
        {
            editor.putBoolean("is_first_run", false);
            editor.putBoolean(key, isTablet(context));
            editor.commit();
        }

        boolean showTabletLayout = settings.getBoolean(key, false);
        return showTabletLayout;
    }

    public static boolean isTablet(Context context)
    {
        return (context.getResources().getConfiguration().screenLayout & Configuration.SCREENLAYOUT_SIZE_MASK) >= Configuration.SCREENLAYOUT_SIZE_LARGE;
    }

    /**
     * Detects the display config(landscape or portrait) and sets the displayMode accordingly
     */
    public void detectDisplayMode()
    {
        int dispMode = getResources().getConfiguration().orientation;

        if (dispMode == 1)
        {
            displayMode = "";
            if(showTablet(mContext)){displayMode = "tablet_";}
        }
        else
            displayMode = "land_";
    }

    /**
     * Gets the layout file resource id of the keyboard based on displayMode and languageName
     * @param layoutFile	layout of the keyboard whose resource id is to be returned
     * @return Resource id of the layout file of the keyboard to be shown
     */
    public int getResourceId(String layoutFile)
    {
        int resourceId = 0;
        resourceId = getResources().getIdentifier(languageName + "_" + displayMode + layoutFile, "layout", getPackageName());
        return resourceId;
    }

    /**
     * Gets the resource id of the drawable
     * @param drawable	drawable name of whose resource id is to be returned
     * @return Drawable id in the resources
     */
    public int getDrawableId(String drawable)
    {
        int resourceId = 0;
        resourceId = getApplicationContext().getResources().getIdentifier(drawable, "drawable", getPackageName());
        Log.d("Location", "R id " + resourceId);
        return resourceId;
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig)
    {
        if (mInputConnection != null)
        {
            mInputConnection.setComposingText("", 1);
            mInputConnection.finishComposingText();
            mKeyboardView.configChanged();
        }
        super.onConfigurationChanged(newConfig);
    }

    /**
     * Changes the appearance of the enter key based on IME options
     */
    void setImeOptions()
    {
        Resources res = getResources();
        EditorInfo ei = getCurrentInputEditorInfo();
        int textOptions = ei.inputType;
        int options = ei.imeOptions;
        for(Key k: mKeyboard.getKeys())
            if(k.codes[0] == mKeyboardView.getEnterKeyCode())
                mEnterKey = k;

        if (mEnterKey == null)
            return;

        switch (options & (EditorInfo.IME_MASK_ACTION | EditorInfo.IME_FLAG_NO_ENTER_ACTION))
        {
            case EditorInfo.IME_ACTION_GO:
                mEnterKey.iconPreview = null;
//			mEnterKey.label = "Go";
                mEnterKey.icon = res.getDrawable(R.drawable.sym_keyboard_return);
                break;
            case EditorInfo.IME_ACTION_NEXT:
                mEnterKey.iconPreview = null;
//			mEnterKey.icon = null;
                mEnterKey.icon = res.getDrawable(R.drawable.sym_keyboard_return);
//			mEnterKey.label = "Next";
                break;
            case EditorInfo.TYPE_TEXT_VARIATION_EMAIL_SUBJECT:
                mEnterKey.iconPreview = null;
//			mEnterKey.icon = null;
                mEnterKey.icon = res.getDrawable(R.drawable.sym_keyboard_return);
//			mEnterKey.label = "NEXT";
                break;
            case EditorInfo.IME_ACTION_DONE:
                mEnterKey.iconPreview = null;
                mEnterKey.icon = res.getDrawable(R.drawable.sym_keyboard_return);
//			mEnterKey.label = "Done";

                break;
            case EditorInfo.IME_ACTION_SEARCH:
//			mEnterKey.icon = res.getDrawable(R.drawable.ic_action_search);
                mEnterKey.icon = res.getDrawable(R.drawable.sym_keyboard_return);
                break;
            case EditorInfo.IME_ACTION_SEND:
//			mEnterKey.iconPreview = null;
                mEnterKey.icon = res.getDrawable(R.drawable.sym_keyboard_return);
//			mEnterKey.label = "Send";
                break;
            default:
                mEnterKey.icon = res.getDrawable(R.drawable.sym_keyboard_return);
                mEnterKey.label = null;
                break;
        }

        switch (textOptions)
        {
            case EditorInfo.TYPE_NUMBER_VARIATION_PASSWORD:
                this.setPassword(true);
                break;
            case EditorInfo.TYPE_TEXT_VARIATION_PASSWORD:
                this.setPassword(true);
                break;
            case EditorInfo.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD:
                this.setPassword(true);
                break;
            case EditorInfo.TYPE_TEXT_VARIATION_WEB_PASSWORD:
                this.setPassword(true);
                break;
            default:
                this.setPassword(false);
                break;
        }
        mKeyboardView.invalidateAllKeys();
    }

    public boolean isPassword()
    {
        return isPassword;
    }

    public void setPassword(boolean isPassword)
    {
        this.isPassword = isPassword;
    }
}