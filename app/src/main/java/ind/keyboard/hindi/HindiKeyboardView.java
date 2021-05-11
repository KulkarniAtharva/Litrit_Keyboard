package ind.keyboard.hindi;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.inputmethodservice.Keyboard.Key;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputConnection;
import android.widget.PopupWindow;
import android.widget.TextView;

import java.util.HashMap;

import ind.keyboard.language.Language;
import ind.keyboard.litrit.CustomKeyboard;
import ind.keyboard.litrit.DigitalKeyboard;
import ind.keyboard.litrit.KeyProperties;
import ind.keyboard.litrit.Litrit;
import ind.keyboard.litrit.MasterKeyboardActionListener;
import ind.keyboard.litrit.R;

// where marathi keyboard is getting mapped

public class HindiKeyboardView extends CustomKeyboard
{
    public PopupWindow mChakraPopup;
    public View mPopupParent;
    public Litrit mSwaraChakra;
    private HindiKeyboardActionListener mActionListener;
    private boolean isPassword;
    private Paint tf;
    private Context mContext;

    public PopupWindow mPreviewPopup;
    public TextView mPreviewTextView;
    public PopupWindow mPreviewPopup2;
    public TextView mPreviewTextView2;

    public HindiKeyboardView(Context context, AttributeSet attrs)
    {
        super(context, attrs);
        initialize(context);
        // TODO Auto-generated constructor stub
    }

    public HindiKeyboardView(Context context, AttributeSet attrs, int defStyle)
    {
        super(context, attrs, defStyle);
        initialize(context);
        // TODO Auto-generated constructor stub
    }

    private void initialize(Context context)
    {
        super.setPreviewEnabled(false);
        mContext = context;

        setLayerType(View.LAYER_TYPE_HARDWARE, null);

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = inflater.inflate(R.layout.chakra_layout, null);
        mSwaraChakra = (Litrit) v.findViewById(R.id.litrit);
        // TO BE DONE
        int mode = 0;
        if(isTablet(context))
        {
            mode = 1;
        }
        mSwaraChakra.setMetrics(mode);
        mSwaraChakra.setVisibility(View.GONE);

        mChakraPopup = new PopupWindow(context);
        mChakraPopup.setContentView(v);
        mChakraPopup.setTouchable(false);
        mChakraPopup.setClippingEnabled(false);
        mChakraPopup.setBackgroundDrawable(null);
        mPopupParent = this;


        mPreviewPopup = new PopupWindow();
        LayoutInflater inflater1 = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v1 = inflater1.inflate(R.layout.preview_layout, null);
        mPreviewTextView = (TextView) v1.findViewById(R.id.preview_text_view);
        mPreviewTextView.setVisibility(View.GONE);

        mPreviewPopup.setContentView(v1);
        mPreviewPopup.setTouchable(false);
        mPreviewPopup.setBackgroundDrawable(null);
        mPreviewPopup.setClippingEnabled(false);


      /*  mPreviewPopup2 = new PopupWindow();
        LayoutInflater inflater2 = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v2 = inflater2.inflate(R.layout.preview_layout2, null);
        mPreviewTextView2 = (TextView) v2.findViewById(R.id.preview_text_view1);
        mPreviewTextView2.setVisibility(View.GONE);

        mPreviewPopup2.setContentView(v2);
        mPreviewPopup2.setTouchable(false);
        mPreviewPopup2.setBackgroundDrawable(null);
        mPreviewPopup2.setClippingEnabled(false);  */
    }

    public static boolean isTablet(Context context)
    {
        return (context.getResources().getConfiguration().screenLayout
                & Configuration.SCREENLAYOUT_SIZE_MASK)
                >= Configuration.SCREENLAYOUT_SIZE_LARGE;
    }

    @Override
    public void init(DigitalKeyboard sk, Language lang, HashMap<Integer, KeyProperties> keys)
    {
        mActionListener = new HindiKeyboardActionListener();
        this.setOnKeyboardActionListener(mActionListener);
        mActionListener.initialize(this);
       // this.setOnTouchListener(mActionListener);
        mActionListener.setKeysMap(keys);
        mActionListener.setHalantEnd(lang.halantEnd);
        mActionListener.setSoftKeyboard(sk);
        InputConnection mInputConnection = sk.getCurrentInputConnection();
        mActionListener.setInputConnection(mInputConnection);

        isPassword = sk.isPassword();

        String[] swaras = lang.defaultBox;
        boolean halantExists = lang.halantExists;
        Litrit.setHalantExists(halantExists);
        Litrit.setDefaultChakra(swaras);
    }

    @Override
    public void resetInputConnection(InputConnection ic)
    {
        mActionListener.setInputConnection(ic);
        if (!isPassword)
        {
        }
    }

    @Override
    protected boolean onLongPress(Key key)
    {
        mActionListener.onLongPress(key);
        return super.onLongPress(key);
    }

    @Override
    public void configChanged()
    {
        // TODO Auto-generated method stub
        mChakraPopup.dismiss();
    }

    @Override
    public boolean onTouchEvent(MotionEvent me)
    {
        return super.onTouchEvent(me);
    }
}