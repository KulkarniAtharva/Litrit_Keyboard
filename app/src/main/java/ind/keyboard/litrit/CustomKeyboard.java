package ind.keyboard.litrit;

import ind.keyboard.language.Language;

import android.content.Context;
import android.inputmethodservice.KeyboardView;
import android.util.AttributeSet;
import android.view.inputmethod.InputConnection;

import java.util.HashMap;

public class CustomKeyboard extends KeyboardView
{
    public final int BACKSPACE = Integer.parseInt(getResources().getString(R.string.backspace));
    public final int SYMBOLS = Integer.parseInt(getResources().getString(R.string.symbols));
    public final int ENGLISH = Integer.parseInt(getResources().getString(R.string.english));
    public final int SPACE = Integer.parseInt(getResources().getString(R.string.space));
    public final int ENTER = Integer.parseInt(getResources().getString(R.string.enter));
    public final int SHIFT = Integer.parseInt(getResources().getString(R.string.shift));
    public final int NUMBERS = Integer.parseInt(getResources().getString(R.string.numbers));

    public CustomKeyboard(Context context, AttributeSet attrs, int defStyle)
    {
        super(context, attrs, defStyle);
        // TODO Auto-generated constructor stub
    }

    public CustomKeyboard(Context context, AttributeSet attrs)
    {
        super(context, attrs);
        // TODO Auto-generated constructor stub
    }

    public void init(DigitalKeyboard mSoftKeyboard, Language lang, HashMap<Integer, KeyProperties> keys)
    {

    }

    public void configChanged()
    {

    }

    public int getEnterKeyCode()
    {
        return ENTER;
    }

    public void resetInputConnection(InputConnection ic)
    {

    }
}