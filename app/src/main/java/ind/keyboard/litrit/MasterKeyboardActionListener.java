package ind.keyboard.litrit;

import java.util.HashMap;
import java.util.List;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.inputmethodservice.Keyboard.Key;
import android.inputmethodservice.KeyboardView.OnKeyboardActionListener;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnTouchListener;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MasterKeyboardActionListener implements OnKeyboardActionListener, OnTouchListener
{
    private DigitalKeyboard mSoftKeyboard;
    private static MasterKeyboardView mKeyboardView;
    private static PopupWindow mChakraPopup;
    private static Litrit mSwaraChakra;
    private static View mPopupParent;
    private int touchDownX;
    private int touchDownY;
    private static boolean isChakraVisible;

    private boolean inHalantMode;
    private boolean isShifted;
    private boolean inSymbolMode;
    private boolean isPersistent;
    private boolean inExceptionMode;
    private boolean spaceHandled;
    private boolean shiftHandled;
    private int exceptionCode;
    private String preText;
    private HashMap<Integer, KeyProperties> mKeys;
    private HashMap<Integer, KeyProperties> sKeys;
    private int ENTER;
    private int BACKSPACE;
    private int SPACE;
    private int ENGLISH;
    private int SYMBOLS;
    private int SHIFT;
    private int MOVE_THRESHOLD = 0;
    private int DIM_THRESHOLD = 0;
    private InputConnection mInputConnection;
    private int halantEnd;
    private static final int MSG_SHOW_CHAKRA = 1;
    private static final int MSG_REMOVE_CHAKRA = 2;
    private static final int DELAY_BEFORE_SHOW = 70;

    private static PopupWindow mPreviewPopup;
    private static TextView mPreviewTextView;
    private static HashMap<Integer, Key> mKeyboardKeys;
    private boolean isSpinePressed;
    int selecteditem = -1;
    static int clicked;

    static Handler mHandler = new Handler()
    {
        @Override
        public void handleMessage(Message msg)
        {
            switch (msg.what)
            {
                case MSG_SHOW_CHAKRA:
                   mSwaraChakra.setVisibility(View.VISIBLE);
                   // mKeyboardView.setAlpha(0.75f);
                    break;

                case MSG_REMOVE_CHAKRA:
                    removeChakra();
                    break;

                default:
                    mKeyboardView.setAlpha(0.75f);
                    break;
            }
        }
    };

    public void initialize(MasterKeyboardView mKeyboardView)
    {
        MasterKeyboardActionListener.mKeyboardView = mKeyboardView;

        mChakraPopup = mKeyboardView.mChakraPopup;
        mSwaraChakra = mKeyboardView.mSwaraChakra;
        mPopupParent = mKeyboardView.mPopupParent;

        BACKSPACE = mKeyboardView.BACKSPACE;
        ENTER = mKeyboardView.ENTER;
        SPACE = mKeyboardView.SPACE;
        ENGLISH = mKeyboardView.ENGLISH;
        SYMBOLS = mKeyboardView.SYMBOLS;
        SHIFT = mKeyboardView.SHIFT;

        initVariables();
        MOVE_THRESHOLD = (int) mSwaraChakra.getInnerRadius();
        DIM_THRESHOLD = (int) mSwaraChakra.getOuterRadius();

        buildKeyboardKeys();

        mPreviewPopup = mKeyboardView.mPreviewPopup;
        mPreviewTextView = mKeyboardView.mPreviewTextView;
    }

    private void initVariables()
    {
        isChakraVisible = false;
        inHalantMode = false;
        inExceptionMode = false;
        exceptionCode = 0;
        preText = "";
    }

    public void setInputConnection(InputConnection ic)
    {
        mInputConnection = ic;
        initVariables();
        changeLayout("default");
    }

    public void setKeysMap(HashMap<Integer, KeyProperties> mKeys)
    {
        this.mKeys = mKeys;
    }

    public void setHalantEnd(int h)
    {
        halantEnd = h;
    }

    public void setTouchDownPoint(int x, int y)
    {
        touchDownX = x;
        touchDownY = y;
    }

    public void setSoftKeyboard(DigitalKeyboard sk)
    {
        this.mSoftKeyboard = sk;
    }

    private static void showBoxAt(int posX, int posY)
    {
        final PopupWindow chakraPopup = mChakraPopup;
        mSwaraChakra.measure(View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED), View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED));
        float offset = 2 * mSwaraChakra.getOuterRadius();

        int w = mSwaraChakra.getMeasuredWidth();
        int h = mSwaraChakra.getMeasuredHeight();
        int x = (int) (posX - offset);
        int y = (int) (posY - offset);

        if (chakraPopup.isShowing())
            chakraPopup.update(x, y, w, h);
        else
        {
            chakraPopup.setWidth(w);
            chakraPopup.setHeight(h);
            chakraPopup.showAtLocation(mPopupParent, Gravity.NO_GRAVITY, x, y);
        }
        mHandler.sendMessageDelayed(mHandler.obtainMessage(MSG_SHOW_CHAKRA), DELAY_BEFORE_SHOW);
        isChakraVisible = true;
    }

    private static void removeChakra()
    {
        mHandler.removeMessages(MSG_SHOW_CHAKRA);
        mSwaraChakra.desetArc();
        mSwaraChakra.setVisibility(View.GONE);
        isChakraVisible = false;
        mKeyboardView.setAlpha(1);
    }

    public void onLongPress(Key key)
    {
        /*System.out.println("longpress"+key.codes[0]);

        int keycode[] = {108,2011,1,110,2012,6,115,2013,11,120,2014,16,125,2015,21};
        String labels[] = {"ह","क़","ग़","उ","श","य़","र","ष","र","ल","स","ज़","व","फ़",""};

       // KeyProperties key1 = null;

        isSpinePressed = true;

        if(key.codes[0] == 2011 || key.codes[0] == 2012 || key.codes[0] == 2013 || key.codes[0] == 2014 || key.codes[0] == 2015)
        {
            List<Key> keys = mKeyboardView.getKeyboard().getKeys();
            for (Key key1 : keys)
            {
                int code = key1.codes[0];

                for (int i = 0; i < 15; i++)
                {
                    if (code == keycode[i])
                        key1.label = labels[i];
                }
            }
            mKeyboardView.invalidateAllKeys();
        }*/

        showPreview(key.codes[0],"a");


        if (key.codes[0] == SHIFT)
        {
            if (isShifted && isPersistent)
            {
                changeLayout("default");
                isPersistent = false;
                isShifted = false;
            }
            else
            {
                changeLayout("shift");
                isPersistent = true;
                isShifted = true;
            }
            shiftHandled = true;
        }
        else if (key.codes[0] == SPACE)
        {
            InputMethodManager imm = (InputMethodManager) mSoftKeyboard.getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.showInputMethodPicker();
            spaceHandled = true;
        }
    }

    @Override
    public void onKey(int arg0, int[] arg1)
    {
        // TODO Auto-generated method stub
    }

    @Override
    public void onPress(int keyCode)
    {
        spaceHandled = false;
        shiftHandled = false;
        KeyProperties key = null;
        boolean showBox = false;
        if (inExceptionMode && sKeys.containsKey(keyCode))
        {
            showBox = sKeys.get(keyCode).showBox && !(isChakraVisible);
            key = sKeys.get(keyCode);

            key.label = "asasa";

            System.out.println(key.label);
            System.out.println("onPress1");
        }
        else if (mKeys.containsKey(keyCode))
        {
            showBox = mKeys.get(keyCode).showBox && !(isChakraVisible);
            key = mKeys.get(keyCode);

            System.out.println("yooo"+keyCode+" "+key.label);

            if(keyCode >= 1 && keyCode <=25)
            {
                clicked = keyCode;

                String[] a = new String[23];

                a[0] = key.label + "्";             a[8] = key.label + "ो";             a[16] = key.label + "़";
                a[1] = key.label + "ा";            a[9] = key.label + "ौ";             a[17] = key.label + "ॄ";
                a[2] = key.label + "ि";            a[10] = key.label + "ं";             a[18] = key.label + "ृ";
                a[3] = key.label + "ी";            a[11] = key.label + "ः";            a[19] = "र" + "्" + key.label;
                a[4] = key.label + "ु";             a[12] = key.label;                  a[20] = key.label + "्" + "र";
                a[5] = key.label + "ू";             a[13] = key.label + "ॅ";            a[21] = key.label + "ॣ";
                a[6] = key.label + "े";             a[14] = key.label + "ॉ";            a[22] = key.label + "ॢ";
                a[7] = key.label + "ै";             a[15] = key.label + "ँ";

                SetKeys.setX(a);
                SetKeys.setA(1);

                DigitalKeyboard obj = new DigitalKeyboard();
                obj.setKey();
            }

            int flag1 = 0;
            int flag = 0;

            if(isSpinePressed)
            {
                List<Key> keys = mKeyboardView.getKeyboard().getKeys();

                int[] keycode = {108,2011,1,110,2012,6,115,2013,11,120,2014,16,125,2015,21};

                for (int value : keycode)
                {
                    if (value == keyCode)
                    {
                        flag = 1;
                        break;
                    }
                }

                // closing on spine when clicked outside
                if(flag == 1)
                {
                    for (Key key1 : keys)
                    {
                        int code = key1.codes[0];

                        if (code == keyCode)
                        {
                            String label;

                            if (key1.label != null)
                            {
                                label = key1.label.toString();

                                convertToDynamic(label);

                                changeLayout("default");
                                DigitalKeyboard obj1 = new DigitalKeyboard();

                                obj1.setKey();

                                //if(SetKeys.getA() == 1)
                                commitText(key1.label.toString());

                                showPreview(keyCode, key1.label.toString());
                                //flag1 =1;
                            }

                            break;
                        }
                    }
                }
                else
                {
                    flag1 = 1;
                    changeLayout("default");
                }

                isSpinePressed = false;
            }

            if(SetKeys.getA() == 0 && (keyCode == 2011 || keyCode == 2012 || keyCode == 2013 || keyCode == 2014 || keyCode == 2015))
            {
                isSpinePressed = true;

                // opening spine drawer

                int[] keycode = {108,2011,1,110,2012,6,115,2013,11,120,2014,16,125,2015,21};
                String[] labels = {"ह","क़","ग़","य","श","य़","र","ष","ऱ","ल","स","ज़","व","फ़","व़"};

                List<Key> keys = mKeyboardView.getKeyboard().getKeys();
                for(Key key1 : keys)
                {
                    int code = key1.codes[0];

                    for(int i = 0; i < 15; i++)
                    {
                        if (code == keycode[i])
                        {
                            System.out.print(key1.label);

                           // key1.icon = SetKeys.getContext().getDrawable(R.drawable.shift);
                            key1.label = labels[i];
                        }
                    }
                }

               // if (tempKey.showIcon)
               /* {
                    int id = getDrawableId(tempKey.icon);
                    if (id != 0)
                    {
                        key.icon = getApplicationContext().getDrawable(id);
                        key.label = null;
                        Log.d("Location", "set icon " + key.icon);
                    }
                }*/

                mKeyboardView.invalidateAllKeys();
            }
            else
            {
                if(flag == 0 && flag1 == 0)
                    showPreview(keyCode, key.label);

                /*if(isSpinePressed)
                {
                    convertToDynamic(key.label);
                }*/
            }

            System.out.println(key.label);
            System.out.println("onPress2");
        }

        if (showBox)
        {
            mSwaraChakra.setCurrentKey(key);
            mSwaraChakra.setKeyLabel(getKeyLabel(keyCode));
            showBoxAt(touchDownX, touchDownY);

            //Toast.makeText(mSoftKeyboard, getKeyLabel(keyCode), Toast.LENGTH_SHORT).show();
            System.out.println("onPress3");

            key = mKeys.get(keyCode);
            System.out.println(key.icon);
            key.icon = "xy12";
        }
    }

   /* public int getDrawableId(String drawable)
    {
        int resourceId = 0;
        resourceId = getApplicationContext().getResources().getIdentifier(drawable, "drawable", getPackageName());
        Log.d("Location", "R id " + resourceId);
        return resourceId;
    }*/

    @Override
    public void onRelease(int keyCode)
    {
        removePreview();

        if (mKeys.containsKey(keyCode))
        {
            if (isShifted && !(isPersistent))
            {
                changeLayout("default");
                isShifted = false;
            }
        }

        if(inExceptionMode)
        {
            inExceptionMode = false;
            updateKeyLabels();
            if (mKeys.containsKey(keyCode))
            {
                if (mKeys.get(keyCode).isException && (exceptionCode == keyCode))
                {
                    exceptionCode = 0;
                    return;
                }
            }
            exceptionCode = 0;
        }

        if(isChakraVisible)
        {
            String text = mSwaraChakra.getText();
            if (mSwaraChakra.isHalant())
                setHalant(text);
            else
            {
                removeHalantMode();
              //  commitText(text);
            }
            removeChakra();
        }

        String temp = "";

        System.out.println("weeeee");

        if (mKeys.containsKey(keyCode))
        {
            KeyProperties key = mKeys.get(keyCode);

            System.out.println("dff"+keyCode);

            if(SetKeys.getA() == 1)
                commitText(key.label);

            if(SetKeys.getA() == 1)
            {
                if(keyCode == 30 || keyCode == 31 || keyCode == 53 || keyCode == 52 || (keyCode >= 107 && keyCode <=135))
                {
                    backspace();
                    backspace();
                }

                if(keyCode == 107 || keyCode == 108 || keyCode == 109 || keyCode == 52 || keyCode == 53)
                    backspace();
            }

            if(key.changeLayout)
            {
                changeLayout(key.layout);
            }
            else
            {


                ShowDynamiconEditText(keyCode);
            }

            temp = key.label;
        }
        else
        {
            System.out.println("shift");
            handleSpecialInput(keyCode);
           // removeHalantMode();

            KeyProperties key = mKeys.get(keyCode);

           /* if(keyCode == SYMBOLS)
            {
                System.out.print("lllll");
                convertToDynamic(temp);
            }*/
        }

        removePreview();
    }

    void backspace()
    {
        CharSequence selection = mInputConnection.getSelectedText(0);
        commitText("");

        if (selection == null)
            mInputConnection.deleteSurroundingText(1, 0);
    }

    void ShowDynamiconEditText(int keyCode)
    {
        KeyProperties key = mKeys.get(keyCode);
        String[] a = SetKeys.getX();

        // show 12 vowels on edittext of particular

        int[] keycode = {109,31,110,111,125,   126,112,113,127,  128,107,108,30,114,129,130,131,132,133,53,52,134,135};

       // commitText(key.label);

        System.out.println("amd");

        if(SetKeys.getA() == 1)
        {
            for(int i=0 ; i < keycode.length; i++)
            {
                if(keyCode == keycode[i])
                {
                    //backspace();
                    commitText(a[i]);
                    break;
                }
            }

            //  backspace();
            //  backspace();

            if(keyCode == 30 || keyCode == 31 || keyCode == 52 || keyCode ==53 || (keyCode >= 107 && keyCode <=135))
                 changeLayout("default");
            SetKeys.setA(0);
        }
        else
        {
          //  backspace();
            commitText(key.label);
        }

        System.out.println("xddd"+key.label);

        removePreview();
    }

    void convertToDynamic(String label)     // converting to dynamic of spine
    {
        String[] x = new String[23];

       // int[] keycode = {109,31,110,111,125,126,   112,113,127,128,107,  108,30,114,129,130,  131,132,133,53,52,  134,135};

        x[0] = label + "्";         x[1] = label + "ा";         x[2] = label+"ि";             x[3] = label + "ी";
        x[4] = label + "ु";         x[5] = label + "ू";          x[6] = label + "े";            x[7] = label + "ै";
        x[8] = label + "ो";        x[9] = label + "ौ";         x[10] = label + "ं";           x[11] = label + "ः";
        x[12] = label ;             x[13] = label + "ॅ";        x[14] = label + "ॉ";           x[15] = label + "";
        x[16] = label + "";        x[17] = label + "";        x[18] = label + "";             x[19] = label + "";
        x[20] = label + "";        x[21] = label + "";        x[22] = label + "";

        SetKeys.setX(x);
        SetKeys.setA(1);
    }

    private void handleException(int keyCode)
    {
        inExceptionMode = true;
        exceptionCode = keyCode;
//        sKeys = mExceptionHandler.handleException(keyCode);
        updateKeyLabels();
    }

    private void removeHalantMode()
    {
        if (inHalantMode)
        {
            inHalantMode = false;
            preText = "";
            updateKeyLabels();
        }
    }

    /**
     * Sets halant mode and changes the labels of the keyboard accrding to the
     * halant text
     *
     * @param text The string to be added to the labels of the keyboard when
     *             halant is selected in swarachakra
     */
    private void setHalant(String text)
    {
        if (inHalantMode)
            System.out.println(text);
        else
            inHalantMode = true;

        preText = text;
        updateKeyLabels();
    }

    /**
     * Changes the layout of the keyboard
     *
     * @param layout name string of the layout resource
     */
    private void changeLayout(String layout)
    {
        mSoftKeyboard.changeKeyboard(layout);
    }

    /**
     * Changes the language of the keyboard
     *
     * @param layout name string of the layout resource
     */
    private void changeLanguage()
    {
        mSoftKeyboard.changeLanguage();
    }

    /**
     * Handles what to be done when keys like ENTER, SPACE, BACKSPACE, EN,
     * SHIFT, SYM
     *
     * @param keyCode key code of the key whose functionality is to be handled
     */
    private void handleSpecialInput(int keyCode)
    {
        KeyProperties key = mKeys.get(keyCode);

        if (keyCode == SHIFT && !shiftHandled)
        {
            System.out.println("shi");
            if(!inSymbolMode)
            {
                if(isShifted)
                {
                    isShifted = false;
                    isPersistent = false;
                    changeLayout("default");
                }
                else
                {
                    isShifted = true;
                    changeLayout("shift");
                   // convertToDynamic(key.label);
                }
            }
        }
        else if(keyCode == BACKSPACE)
        {
            CharSequence selection = mInputConnection.getSelectedText(0);
            commitText("");
            if(selection == null)
                mInputConnection.deleteSurroundingText(1, 0);

           // CharSequence selection1 = mInputConnection.getSelectedText(2);

           // System.out.println("charsequence"+selection1);

           // changeLayout("default");
        }
        else if(keyCode == SPACE)
        {
            if (!spaceHandled)
            {
                mInputConnection.finishComposingText();
                commitText(" ");
            }

            changeLayout("default");
        }
        else if (keyCode == SYMBOLS)
        {
            List<Key> keys = mKeyboardView.getKeyboard().getKeys();

            System.out.println("sym");
            if (inSymbolMode)
            {
                System.out.println("insymbolmode");
                inSymbolMode = !(inSymbolMode);
                if (isPersistent && isShifted)
                    changeLayout("shift");
                else
                    changeLayout("default");

             /*   Drawable activeShift = mSoftKeyboard.getResources().getDrawable(R.drawable.shift_active);

                 for(Key key1 : keys)
                {
                    if(key1.codes[0] == SHIFT) {
                        System.out.println("active" + keys);
                        key1.icon = activeShift;
                        key1.label = null;
                    }
                }
                mKeyboardView.invalidateAllKeys();*/
            }
            else
            {
                System.out.println(" not insymbolmode");
                inSymbolMode = !(inSymbolMode);
                changeLayout("symbols");

                if(SetKeys.getA() == 1)
                {
                    DigitalKeyboard obj = new DigitalKeyboard();
                    obj.SetShiftKey(clicked);
                }
            }

           // assert key != null;
            //convertToDynamic(key.label);
        }
        else if (keyCode == ENGLISH)
        {
            String[] listItems = {"English", "Marathi", "Hindi"};

            AlertDialog.Builder builder = new AlertDialog.Builder(SetKeys.getContext());
            builder.setTitle("Change Language");
            builder.setIcon(R.drawable.language);

            final int checkedItem = -1; //this will checked the item when user open the dialog

            // Get the layout inflater
            LayoutInflater inflater = (SetKeys.getContext()).getLayoutInflater();
            // Inflate and set the layout for the dialog
            // Pass null as the parent view because its going in the dialog layout


           // builder.setView(inflater.inflate(R.layout.dialog_layout, null));

            builder.setSingleChoiceItems(listItems, checkedItem, new DialogInterface.OnClickListener()
            {
                @Override
                public void onClick(DialogInterface dialog, int which)
                {
                    //Toast.makeText(EnglishKeyboardActionListener.this, "Position: " + which + " Value: " + listItems[which], Toast.LENGTH_LONG).show();

                   // selecteditem = which;

                    if(which == 0)
                        changeLanguage();

                    dialog.dismiss();
                }
            });

           /* builder.setPositiveButton("Done", new DialogInterface.OnClickListener()
            {
                @Override
                public void onClick(DialogInterface dialog, int which)
                {
                    if(selecteditem == 0)
                        changeLanguage();

                    dialog.dismiss();
                }
            });*/

            AlertDialog dialog = builder.create();
            dialog.show();
        }
        else if (keyCode == ENTER)
            handleEnter();
    }

    private void handleEnter()
    {
        // TODO Auto-generated method stub
        mInputConnection.sendKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_ENTER));
        mInputConnection.sendKeyEvent(new KeyEvent(KeyEvent.ACTION_UP, KeyEvent.KEYCODE_ENTER));
    }

    /**
     * Send text to the EditText
     *
     * @param text string to be sent to EditText
     */
    private void commitText(String text)
    {
        mInputConnection.setComposingText(text, 1);
        mInputConnection.finishComposingText();
        updateExtractedText();
    }

    private void updateExtractedText()
    {
        try
        {
            ExtractedText edt = mInputConnection.getExtractedText(new ExtractedTextRequest(), 0);

//            if(edt != null){
//                mKeyLogger.extractedText = edt.text.toString();
//            }
//            else{
//                Log.d(mKeyLogger.TAG,"handlechar(): About to hide, nothing to save" + edt);
//            }
        }
        catch (Exception ex)
        {
//            Log.d(mKeyLogger.TAG,"handlechar():ex "+ex.getMessage());
        }
    }

    private void updateKeyLabels()
    {
        List<Key> keys = mKeyboardView.getKeyboard().getKeys();
        for(Key key : keys)
        {
            int code = key.codes[0];
            if(code <= halantEnd)
            {
                String nextLabel = "";
                if(inExceptionMode && sKeys.containsKey(code))
                {
                    nextLabel = sKeys.get(code).label;
                    Log.d("exhandle", "nextLabel = " + nextLabel);
                }
                else
                    nextLabel = preText + mKeys.get(code).label;

                key.label = nextLabel;
            }
            System.out.println("nextlabel"+key.label);
        }
        mKeyboardView.invalidateAllKeys();
    }

    private String getKeyLabel(int keyCode)
    {
        if (inExceptionMode)
        {
            if (sKeys.containsKey(keyCode))
            {
                String label = sKeys.get(keyCode).label;
                return label;
            }
        }
        String label = preText + mKeys.get(keyCode).label;
        return label;
    }

    @Override
    public void onText(CharSequence arg0) {// TODO Auto-generated method stub
    }

    @Override
    public void swipeDown() {// TODO Auto-generated method stub
         }

    @Override
    public void swipeLeft() {// TODO Auto-generated method stub
    }

    @Override
    public void swipeRight() {// TODO Auto-generated method stub
    }

    @Override
    public void swipeUp() {// TODO Auto-generated method stub
    }

    @Override
    public boolean onTouch(View view, MotionEvent me)
    {
        // TODO Auto-generated method stub
        MasterKeyboardView mKeyboardView = (MasterKeyboardView) view;
        int action = me.getAction();
        if (action == MotionEvent.ACTION_DOWN)
        {
            int x = (int) me.getX();
            int y = (int) me.getY();
            setTouchDownPoint(x, y);
        }
        else if (action == MotionEvent.ACTION_UP || (action == MotionEvent.ACTION_OUTSIDE))
        {
        }
        else if (action == MotionEvent.ACTION_MOVE)
        {
            int x = (int) me.getX();
            int y = (int) me.getY();
            handleMove(x, y);

            return true;
        }
        else if (action == MotionEvent.ACTION_CANCEL)
            mSwaraChakra.desetArc();

        return mKeyboardView.onTouchEvent(me);
    }

    private void handleMove(int x, int y)
    {
        int touchMovementX = (int) x - touchDownX;
        int touchMovementY = (int) y - touchDownY;

        if (y == 0 && touchMovementX < mSwaraChakra.getOuterRadius() && touchMovementY < mSwaraChakra.getOuterRadius())
        {
            float outerRadius = (float) (1.2 * mSwaraChakra.getOuterRadius());
            touchMovementY = -(int) Math.sqrt(outerRadius * outerRadius - touchMovementX * touchMovementX);
        }

        int radius = (int) Math.sqrt((touchMovementX * touchMovementX) + (touchMovementY * touchMovementY));
        float theta = (float) Math.toDegrees(Math.atan2(touchMovementY, touchMovementX));

        if (radius > MOVE_THRESHOLD)
        {
            int arc = findArc(theta);
            if (isChakraVisible)
            {
                mSwaraChakra.setArc(arc);
                String text = mSwaraChakra.getText();
                mInputConnection.setComposingText(text, 1);
            }
        }
        else
        {
            if (isChakraVisible)
            {
                mSwaraChakra.desetArc();
                String text = mSwaraChakra.getText();
             //   Toast.makeText(mSoftKeyboard, text, Toast.LENGTH_SHORT).show();
                mInputConnection.setComposingText(text, 1);
            }
        }

        if (radius > DIM_THRESHOLD)
            if (mSwaraChakra.getVisibility() == View.VISIBLE)
                mKeyboardView.setAlpha(0.75f);
        else
        {
            if (mSwaraChakra.getVisibility() == View.VISIBLE)
            {
//				float a = 0;
//				double k = (-0.45) / DIM_THRESHOLD;
//				a = (float) (0.80 + k * radius);
                mKeyboardView.setAlpha(0.75f);
            }
        }
    }

    private int findArc(float theta)
    {
        int nArcs = Litrit.getNArcs();
        float offset = (float) -(90.0 + 360.0 / (2 * nArcs));
        float relAngle = theta - offset;
        if (relAngle < 0)
            relAngle = 360 + relAngle;

        int region = (int) (relAngle * nArcs / 360);
        return region;
    }

    private void showPreview(int keyCode, String label)
    {
        buildKeyboardKeys();

        if (keyCode != 0)
        {
            Key key = mKeyboardKeys.get(keyCode);
            int w = 0;
            int h = 0;
            int x = 0;
            int y = 0;

            System.out.println("aa"+key);

            /*if(key.width == 0)
            {
                key.width = 2;
                key.height = 2;
            }*/
          //  System.out.println("keyy"+key.x);

           // key.width = 97;
           // key.height = 145;

            w = (int)(key.width * 1.5);
            h = key.height*5/4;
            x = key.x - w / 5;
            y = key.y - h + (int)(0.02*h);

            mPreviewTextView.setText(label);
            //Toast.makeText(mSoftKeyboard, keyCode+"", Toast.LENGTH_SHORT).show();

            if (mPreviewPopup.isShowing())
            {
                mPreviewPopup.update(x, y, w, h);
            }
            else
            {
                mPreviewPopup.setWidth(w);
                mPreviewPopup.setHeight(h);
                mPreviewPopup.showAtLocation(mKeyboardView, Gravity.NO_GRAVITY, x, y);
            }
            mPreviewTextView.setVisibility(View.VISIBLE);
        }
    }

    @SuppressLint("UseSparseArrays")
    private static void buildKeyboardKeys()
    {
        mKeyboardKeys = new HashMap<Integer, Key>();
        List<Key> keys = mKeyboardView.getKeyboard().getKeys();
        for (Key key : keys)
        {
            mKeyboardKeys.put(key.codes[0], key);
        }
    }

    private void removePreview()
    {
        mPreviewTextView.setVisibility(View.GONE);
    }
}