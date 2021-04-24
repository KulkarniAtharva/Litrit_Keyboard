package ind.keyboard.litrit;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;

import java.util.ArrayList;

import ind.keyboard.language.Language;
import ind.keyboard.language.MasterLanguage;

public class Litrit extends View
{
    private float mOuterRadius;
    private float mInnerRadius;
    private float mShadowRadius;
    private float mArcTextRadius;
    private float centerX, centerY;
    private Paint mBlackPaint;
    private Paint mWhitePaint;
    private Paint mShadowPaint;
    private Paint mInnerPaint;
    private Paint mInnerTextPaint;
    private Paint mArcPaint;
    private Paint mArcDividerPaint;
    private Paint mArcPrevPaint;
    private Paint mArcTextPaint;
    private float screen_width;
    private float screen_height;
    private RectF bound;
    private static String[] defaultBox;
    private static int nArcs;
    private int arc;
    private static boolean halantExists;
    private KeyProperties currentKey;
    private String keyLabel;

    public Litrit(Context context)
    {
        super(context);
        init(context);
        // TODO Auto-generated constructor stub
    }

    public Litrit(Context context, AttributeSet attrs)
    {
        super(context,attrs);
        init(context);
    }

    @SuppressLint("NewApi")
    private void init(Context context)
    {
        mBlackPaint = new Paint();
        mBlackPaint.setColor(Color.rgb(255,255,255));
        mBlackPaint.setAntiAlias(true);
        mWhitePaint = new Paint();
        mWhitePaint.setColor(Color.rgb(102,127,102));
        mWhitePaint.setAntiAlias(true);
        mShadowPaint = new Paint();
        mShadowPaint.setColor(Color.argb(17,0,0,0));
        mShadowPaint.setAntiAlias(true);
        mInnerPaint = new Paint();
        mInnerPaint.setColor(Color.rgb(102,127,102));
        mInnerPaint.setAntiAlias(true);
        mInnerTextPaint = new Paint();
        mInnerTextPaint.setColor(Color.WHITE);
        mInnerTextPaint.setTypeface(Typeface.createFromAsset(getResources().getAssets(), "rajdhani.ttf"));
        mInnerTextPaint.setTextAlign(Align.CENTER);
        mArcPaint = new Paint();
        mArcPaint.setColor(Color.rgb(255, 255, 255));
        mArcPaint.setAntiAlias(true);
        mArcDividerPaint = new Paint();
        mArcDividerPaint.setColor(Color.rgb(255, 255, 255));
        mArcDividerPaint.setAntiAlias(true);
        mArcPrevPaint = new Paint();
        mArcPrevPaint.setColor(Color.rgb(238, 238, 238));
        mArcPrevPaint.setAntiAlias(true);
        mArcTextPaint = new Paint();
        mArcTextPaint.setColor(Color.rgb(102, 127, 102));
        mArcTextPaint.setAntiAlias(true);
        mArcTextPaint.setTextAlign(Align.CENTER);
        mArcTextPaint.setTypeface(Typeface.createFromAsset(getResources().getAssets(), "rajdhani.ttf"));

        setLayerType(View.LAYER_TYPE_NONE, null);
        arc = -1;

        WindowManager wm = (WindowManager)context.getSystemService(Context.WINDOW_SERVICE);
        Display display = wm.getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        display.getMetrics(displayMetrics);
        screen_width = displayMetrics.widthPixels;
        screen_height = displayMetrics.heightPixels;
    }

    public void setMetrics(int mode)
    {
        switch(mode)
        {
            case 0:
                mOuterRadius = (float) (0.28*Math.min(screen_width, screen_height));
                break;
            case 1:
                mOuterRadius = (float) (0.28*Math.min(screen_width, screen_height));
            default:
//			0.25 & 0.17
                break;
        }
        mInnerRadius = (float) (0.32*mOuterRadius);
        mShadowRadius = (float) (1.01*mOuterRadius);
        mArcTextPaint.setTextSize((float) 0.18*mOuterRadius);
        mInnerTextPaint.setTextSize((float) 0.18*mOuterRadius);
        mArcTextRadius = (float) (0.64*mOuterRadius);
        bound = new RectF(mOuterRadius,mOuterRadius,3*mOuterRadius, 3*mOuterRadius);
        centerX = bound.centerX();
        centerY = bound.centerY();
    }

    public float getOuterRadius()
    {
        return mOuterRadius;
    }

    public float getInnerRadius()
    {
        return mInnerRadius;
    }

    public float getShadowRadius()
    {
        return mShadowRadius;
    }

    public float getScreenHeight()
    {
        return screen_height;
    }

    public static void setDefaultChakra(String[] swaras)
    {
        defaultBox = swaras;
        nArcs = defaultBox.length;
    }

    public static int getNArcs()
    {
        return nArcs;
    }

    public void setArc(int region)
    {
        if(region != arc)
        {
            arc = region;
            invalidate();
        }
    }

    public void setCurrentKey(KeyProperties currentKey)
    {
        this.currentKey = currentKey;
    }

    public void setKeyLabel(String label)
    {
        keyLabel = label;
    }

    public void desetArc()
    {
        arc = -1;
        invalidate();
    }

    //  no
    @SuppressLint("NewApi")
    @Override
    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);

        canvas.drawCircle(centerX, centerY, mShadowRadius, mShadowPaint);

        canvas.drawCircle(centerX, centerY, mOuterRadius, mBlackPaint);

        float anglePerArc = (float) (360.0/nArcs);
        Paint arcPaint;
        for(int i =0; i< nArcs; i++)
        {
            arcPaint = mArcPaint;
            if(i == arc)
                arcPaint = mArcPrevPaint;

            //arcs
            canvas.drawArc(bound, getMidAngle(i) - anglePerArc/2, anglePerArc-1, true, arcPaint);

            //arc seperators
            canvas.drawArc(bound, getMidAngle(i) + anglePerArc/2 -1, 1, true, mArcDividerPaint);
        }

        canvas.drawCircle(centerX, centerY, mInnerRadius, mInnerPaint);
        drawLetters(canvas);
    }

    // no
    private void drawLetters(Canvas canvas)
    {
        float offsetY = 0;
        Rect textBounds = new Rect();
        mInnerTextPaint.getTextBounds(getText(), 0, getText().length(), textBounds);
        offsetY = (textBounds.bottom - textBounds.top)/2;
        canvas.drawText(getText(), centerX, centerY + offsetY, mInnerTextPaint);

       // output();

        for(int i = 0; i<nArcs; i++)
        {
            PointF textPos = getArcTextPoint(i);
            canvas.drawText(getTextForArc(i), textPos.x, textPos.y, mArcTextPaint);
        }
    }

    @Override
    protected void onMeasure(int measuredWidth, int measuredHeight)
    {
        setMeasuredDimension((int)(4*mOuterRadius),(int)(4*mOuterRadius));
    }

    public static void setHalantExists(boolean b)
    {
        halantExists = b;
    }

    public boolean isHalant()
    {
        boolean thisIsHalant = !currentKey.showCustomBox;
        return (arc == 0) && halantExists && thisIsHalant;
    }

    public float getMidAngle(int region)
    {
        float anglePerArc = (float) (360.0/nArcs);
        float offset = -90;
        float midAngle = region*anglePerArc + offset;
        return midAngle;
    }

    private PointF getArcTextPoint(int region)
    {
        PointF textPos = new PointF();
        Rect textBounds = new Rect();
        String text = getTextForArc(region);

       // System.out.println(text);



       /* Language l = new Language();
        //ArrayList<KeyProperties> myKey;
        myKey = new ArrayList<KeyProperties>(nKeys);

        KeyProperties myKey29 = new KeyProperties();
        myKey29.code = 30;
        myKey29.label = "28" ;
        myKey29.showBox = false ;
        myKey29.showCustomBox = false ;
        myKey29.customBoxLayout = new String[] {} ;
        myKey29.showIcon = true ;
        myKey29.icon = "letter_01_03_vowels_aa";
        myKey29.changeLayout = false ;
        myKey29.layout = "";
        l.myKey.set(29, myKey29);*/

        mArcTextPaint.getTextBounds(text, 0, text.length(), textBounds);
        float offsetX = 0;
        float offsetY = 0;
        offsetY = (textBounds.bottom - textBounds.top)/2;
        float angleRad = (float) Math.toRadians(getMidAngle(region));
        textPos.x = centerX + (float) (mArcTextRadius*Math.cos(angleRad)) + offsetX;
        textPos.y = centerY + (float) (mArcTextRadius*Math.sin(angleRad)) + offsetY;
        return textPos;
    }

    public String getText()
    {
        if(arc < 0)
        {
            return keyLabel;
        }
        return getTextForArc(arc);
    }

    public String getTextForArc(int region)
    {
        String[] chakra = defaultBox;
        if(currentKey.showCustomBox)
        {
            chakra = currentKey.customBoxLayout;
            return chakra[region];
        }
        if(chakra[region] !="")
        {
            //chakra[12] = keyLabel;
           // chakra[13] = "U+0945";
           // chakra[14] = "U+0949";
            /*chakra[15] = "U+0901";
            chakra[16] = "U+093C";
            chakra[17] = "";
            chakra[18] = "";
            chakra[19] = "";
            chakra[20] = "";
            chakra[21] = "";
            chakra[22] = "";*/

            String text = keyLabel + chakra[region];
            System.out.println("hola "+keyLabel +" "+chakra[region]);
            return text;
        }
        else
        {
            String text = chakra[region];
           // System.out.println(text);
            return text;
        }
    }

    /*void output()
    {
        String[] a = new String[23];

        /*for(int i =0; i<12;i++)
        {
            String s = getTextForArc(i);
            System.out.println("a"+s);
            str[i] = s;

            //MasterLanguage mainLanguage = new MasterLanguage("xyz");
        }
        str[12] = keyLabel;
        str[13] = keyLabel + "ॅ";
        str[14] = keyLabel + "ॉ";
        str[15] = keyLabel + "ँ";
        str[16] = keyLabel + "़";
        str[17] = keyLabel + "ॄ";
        str[18] = keyLabel + "ृ";
        str[19] = "र"+"्"+keyLabel;
        str[20] = keyLabel+"्"+"र";
        str[21] = keyLabel + "ॣ";
        str[22] = keyLabel + "ॢ";*/


     /*   a[0] = keyLabel + "्";         a[8] = keyLabel + "ो";             a[16] = keyLabel + "़";
        a[1] = keyLabel + "ा";         a[9] = keyLabel + "ौ";             a[17] = keyLabel + "ॄ";
        a[2] = keyLabel + "ि";         a[10] = keyLabel + "ं";             a[18] = keyLabel + "ृ";
        a[3] = keyLabel + "ी";         a[11] = keyLabel + "ः";            a[19] = "र"+"्" + keyLabel;
        a[4] = keyLabel + "ु";          a[12] = keyLabel;                  a[20] = keyLabel+"्"+"र";
        a[5] = keyLabel + "ू";          a[13] = keyLabel + "ॅ";             a[21] = keyLabel + "ॣ";
        a[6] = keyLabel + "े";          a[14] = keyLabel + "ॉ";            a[22] = keyLabel + "ॢ";
        a[7] = keyLabel + "ै";          a[15] = keyLabel + "ँ";

       // System.out.println("x"+str[13]);


        if(!keyLabel.equals("."))
        {
            SetKeys.setX(a);
            SetKeys.setA(1);

            DigitalKeyboard obj = new DigitalKeyboard();
            //obj.Digital(str);


            obj.setKey();
        }
    }*/
}