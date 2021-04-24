package ind.keyboard.litrit;

public class KeyProperties
{
    public int code;
    public String label;
    public boolean showIcon;
    public String icon;
    public boolean showBox;
    public boolean showCustomBox;
    public String[] customBoxLayout;
    public boolean changeLayout;
    public String layout;
    public boolean isException;

    public KeyProperties(int code, String label, boolean showIcon, String icon, boolean showBox,
                         boolean showCustomBox, String[] customBoxLayout,
                         boolean changeLayout, String layout, boolean isException)
    {
        this.code = code;
        this.label = label;
        this.showIcon = showIcon;
        this.icon = icon;
        this.showBox = showBox;
        this.showCustomBox = showCustomBox;
        this.customBoxLayout = customBoxLayout;
        this.changeLayout = changeLayout;
        this.layout = layout;
        this.isException = isException;
    }

    public KeyProperties()
    {
        this.code = 0;
        this.label = "";
        this.showIcon = false;
        this.icon = "";
        this.showBox = false;
        this.showCustomBox = false;
        this.customBoxLayout = new String[] {};
        this.changeLayout = false;
        this.layout = "";
        this.isException = false;
    }
}