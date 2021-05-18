package ind.keyboard.language;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;

import java.util.ArrayList;
import java.util.HashMap;

import ind.keyboard.litrit.KeyProperties;

public class MarathiLanguage extends Language
{
    public MarathiLanguage()
    {
        //Log.d("debug","marathi");
        name = "marathi";
        symbol = "\u092E";
        nKeys = 256;
        myKey = new ArrayList<KeyProperties>(nKeys);
        defaultBox = new String[] {"\u094D", "\u093E", "\u093F", "\u0940", "\u0941", "\u0942", "\u0947", "\u0948", "\u094B", "\u094C", "ं", "ः"};
        halantExists = false;
        halantEnd = 37;

        Context context;
        Typeface tf;

        // System.out.println("ask"+a);

        KeyProperties tempKey = new KeyProperties();
        for (int i=0; i < nKeys; i++ )
        {
            myKey.add(i, tempKey);
        }

        //Extra Keys Added By Suhrd Begins//

        KeyProperties myKey151 = new KeyProperties();
        myKey151.code = 151;
        myKey151.label = "\u0958" ;
        myKey151.showBox = true ;
        myKey151.showCustomBox = false ;
        myKey151.customBoxLayout = new String[] {} ;
        myKey151.showIcon = true ;
        myKey151.icon = "x";
        myKey151.changeLayout = false ;
        myKey151.layout = "";
        myKey.set(151, myKey151);

        KeyProperties myKey152 = new KeyProperties();
        myKey152.code = 152;
        myKey152.label = "\u095A" ;
        myKey152.showBox = true ;
        myKey152.showCustomBox = false ;
        myKey152.customBoxLayout = new String[] {} ;
        myKey152.showIcon = false ;
        myKey152.icon = "";
        myKey152.changeLayout = false ;
        myKey152.layout = "";
        myKey.set(152, myKey152);

        KeyProperties myKey153 = new KeyProperties();
        myKey153.code = 153;
        myKey153.label = "\u0936" ;
        myKey153.showBox = true ;
        myKey153.showCustomBox = false ;
        myKey153.customBoxLayout = new String[] {} ;
        myKey153.showIcon = true ;
        myKey153.icon = "sh";
        myKey153.changeLayout = false ;
        myKey153.layout = "";
        myKey.set(153, myKey153);

        KeyProperties myKey154 = new KeyProperties();
        myKey154.code = 154;
        myKey154.label = "\u095F" ;
        myKey154.showBox = true ;
        myKey154.showCustomBox = false ;
        myKey154.customBoxLayout = new String[] {} ;
        myKey154.showIcon = false ;
        myKey154.icon = "";
        myKey154.changeLayout = false ;
        myKey154.layout = "";
        myKey.set(154, myKey154);

        KeyProperties myKey155 = new KeyProperties();
        myKey155.code = 155;
        myKey155.label = "\u0937" ;
        myKey155.showBox = true ;
        myKey155.showCustomBox = false ;
        myKey155.customBoxLayout = new String[] {} ;
        myKey155.showIcon = true ;
        myKey155.icon = "ssh";
        myKey155.changeLayout = false ;
        myKey155.layout = "";
        myKey.set(155, myKey155);

        KeyProperties myKey156 = new KeyProperties();
        myKey156.code = 156;
        myKey156.label = "\u0931" ;
        myKey156.showBox = true ;
        myKey156.showCustomBox = false ;
        myKey156.customBoxLayout = new String[] {} ;
        myKey156.showIcon = false ;
        myKey156.icon = "";
        myKey156.changeLayout = false ;
        myKey156.layout = "";
        myKey.set(156, myKey156);

        KeyProperties myKey157 = new KeyProperties();
        myKey157.code = 157;
        myKey157.label = "\u0938" ;
        myKey157.showBox = true ;
        myKey157.showCustomBox = false ;
        myKey157.customBoxLayout = new String[] {} ;
        myKey157.showIcon = true ;
        myKey157.icon = "s";
        myKey157.changeLayout = false ;
        myKey157.layout = "";
        myKey.set(157, myKey157);

        KeyProperties myKey158 = new KeyProperties();
        myKey158.code = 158;
        myKey158.label = "\u095B" ;
        myKey158.showBox = true ;
        myKey158.showCustomBox = false ;
        myKey158.customBoxLayout = new String[] {} ;
        myKey158.showIcon = false ;
        myKey158.icon = "";
        myKey158.changeLayout = false ;
        myKey158.layout = "";
        myKey.set(158, myKey158);

        KeyProperties myKey159 = new KeyProperties();
        myKey159.code = 159;
        myKey159.label = "\u095E" ;
        myKey159.showBox = true ;
        myKey159.showCustomBox = false ;
        myKey159.customBoxLayout = new String[] {} ;
        myKey159.showIcon = true ;
        myKey159.icon = "f";
        myKey159.changeLayout = false ;
        myKey159.layout = "";
        myKey.set(159, myKey159);

        KeyProperties myKey160 = new KeyProperties();
        myKey160.code = 160;
        myKey160.label = "\u0935" + "\u093C" ;
        myKey160.showBox = true ;
        myKey160.showCustomBox = false ;
        myKey160.customBoxLayout = new String[] {} ;
        myKey160.showIcon = false ;
        myKey160.icon = "";
        myKey160.changeLayout = false ;
        myKey160.layout = "";
        myKey.set(160, myKey160);

        KeyProperties myKey161 = new KeyProperties();
        myKey161.code = 161;
        myKey161.label = "\u0939" ;
        myKey161.showBox = true ;
        myKey161.showCustomBox = false ;
        myKey161.customBoxLayout = new String[] {} ;
        myKey161.showIcon = true ;
        myKey161.icon = "h";
        myKey161.changeLayout = false ;
        myKey161.layout = "";
        myKey.set(161, myKey161);

        KeyProperties myKey162 = new KeyProperties();
        myKey162.code = 162;
        myKey162.label = "\u092F" ;
        myKey162.showBox = true ;
        myKey162.showCustomBox = false ;
        myKey162.customBoxLayout = new String[] {} ;
        myKey162.showIcon = true ;
        myKey162.icon = "y";
        myKey162.changeLayout = false ;
        myKey162.layout = "";
        myKey.set(162, myKey162);

        KeyProperties myKey163 = new KeyProperties();
        myKey163.code = 163;
        myKey163.label = "\u0930" ;
        myKey163.showBox = true ;
        myKey163.showCustomBox = false ;
        myKey163.customBoxLayout = new String[] {} ;
        myKey163.showIcon = true ;
        myKey163.icon = "r";
        myKey163.changeLayout = false ;
        myKey163.layout = "";
        myKey.set(163, myKey163);

        KeyProperties myKey164 = new KeyProperties();
        myKey164.code = 164;
        myKey164.label = "\u0932" ;
        myKey164.showBox = true ;
        myKey164.showCustomBox = false ;
        myKey164.customBoxLayout = new String[] {} ;
        myKey164.showIcon = true ;
        myKey164.icon = "l";
        myKey164.changeLayout = false ;
        myKey164.layout = "";
        myKey.set(164, myKey164);

        KeyProperties myKey165 = new KeyProperties();
        myKey165.code = 165;
        myKey165.label = "\u0935" ;
        myKey165.showBox = true ;
        myKey165.showCustomBox = false ;
        myKey165.customBoxLayout = new String[] {} ;
        myKey165.showIcon = true ;
        myKey165.icon = "v";
        myKey165.changeLayout = false ;
        myKey165.layout = "";
        myKey.set(165, myKey165);

        KeyProperties myKey166 = new KeyProperties();
        myKey166.code = 166;
        myKey166.label = "" ;
        myKey166.showBox = false ;
        myKey166.showCustomBox = false ;
        myKey166.customBoxLayout = new String[] {} ;
        myKey166.showIcon = false ;
        myKey166.icon = "";
        myKey166.changeLayout = false ;
        myKey166.layout = "";
        myKey.set(166, myKey166);

        KeyProperties myKey170 = new KeyProperties();
        myKey170.code = 170;
        myKey170.label = "" ;
        myKey170.showBox = true ;
        myKey170.showCustomBox = true ;
//        myKey170.customBoxLayout = new String[] {"\u094D", "ि", "ु", "े", "ो", "ॅ", "ं", "", "", "", "", ""} ;
        myKey170.customBoxLayout = new String[] {"", "अ", "इ", "उ", "ए", "ओ", "", "", "", "", "", ""} ;
        myKey170.showIcon = true ;
        myKey170.icon = "dot";
        myKey170.changeLayout = false ;
        myKey170.layout = "";
        myKey.set(170, myKey170);

        KeyProperties myKey171 = new KeyProperties();
        myKey171.code = 171;
        myKey171.label = "" ;
        myKey171.showBox = true ;
        myKey171.showCustomBox = true ;
//        myKey171.customBoxLayout = new String[] {"ा", "", "", "", "", "", "ः", "ॉ" , "ौ", "ै", "ू", "ी" };
        myKey171.customBoxLayout = new String[] {"", "", "", "", "", "", "", "औ", "ऐ", "ऊ", "ई", "आ"} ;
        myKey171.showIcon = true ;
        myKey171.icon = "dot";
        myKey171.changeLayout = false ;
        myKey171.layout = "";
        myKey.set(171, myKey171);

        KeyProperties myKey172 = new KeyProperties();
        myKey172.code = 172;
        myKey172.label = "" ;
        myKey172.showBox = true ;
        myKey172.showCustomBox = true ;
//        myKey172.customBoxLayout = new String[] {"\u094D", "ि", "ु", "े", "ो", "ॅ", "ं", "", "", "", "", ""} ;
        myKey172.customBoxLayout = new String[] {"", "अं", "ऍ", "ऋ", "ऌ", "\u093C", "", "", "", "", "", ""} ;
        myKey172.showIcon = true ;
        myKey172.icon = "dot";
        myKey172.changeLayout = false ;
        myKey172.layout = "";
        myKey.set(172, myKey172);

        KeyProperties myKey173 = new KeyProperties();
        myKey173.code = 173;
        myKey173.label = "" ;
        myKey173.showBox = true ;
        myKey173.showCustomBox = true ;
//        myKey173.customBoxLayout = new String[] {"ा", "", "", "", "", "", "ः", "ॉ" , "ौ", "ै", "ू", "ी" };
        myKey173.customBoxLayout = new String[] {"", "", "", "", "", "", "", "\u0901", "ॡ", "ॠ", "ऑ", "अः"} ;
        myKey173.showIcon = true ;
        myKey173.icon = "dot";
        myKey173.changeLayout = false ;
        myKey173.layout = "";
        myKey.set(173, myKey173);

        //Keys Added By Suhrd Ends//

        KeyProperties myKey0 = new KeyProperties();
        myKey0.code = 1;
        myKey0.label = "\u0915" ;   //  क  "\u0915"     "\uD83D\uDE0F"
        myKey0.showBox = false ;
        myKey0.showCustomBox = false ;
        myKey0.customBoxLayout = new String[] {} ;
        myKey0.showIcon = true ;
        myKey0.icon = "letter_01_07_consonant_k";
        myKey0.changeLayout = true ;
        myKey0.layout = "";
        myKey.set(0, myKey0);

        KeyProperties myKey1 = new KeyProperties();
        myKey1.code = 2;
        myKey1.label = "\u0916" ;
        myKey1.showBox = false ;
        myKey1.showCustomBox = false ;
        myKey1.customBoxLayout = new String[] {} ;
        myKey1.showIcon = true ;
        myKey1.icon = "letter_01_08_consonant_kh";
        myKey1.changeLayout = true ;
        myKey1.layout = "";
        myKey.set(1, myKey1);

        KeyProperties myKey2 = new KeyProperties();
        myKey2.code = 3;
        myKey2.label = "\u0917" ;
        myKey2.showBox = false ;
        myKey2.showCustomBox = false ;
        myKey2.customBoxLayout = new String[] {} ;
        myKey2.showIcon = true ;
        myKey2.icon = "letter_01_09_consonant_g";
        myKey2.changeLayout = true ;
        myKey2.layout = "";
        myKey.set(2, myKey2);

        KeyProperties myKey3 = new KeyProperties();
        myKey3.code = 4;
        myKey3.label = "\u0918" ;
        myKey3.showBox = false ;
        myKey3.showCustomBox = false ;
        myKey3.customBoxLayout = new String[] {} ;
        myKey3.showIcon = true ;
        myKey3.icon = "letter_01_10_consonant_gh";
        myKey3.changeLayout = true ;
        myKey3.layout = "";
        myKey.set(3, myKey3);

        KeyProperties myKey4 = new KeyProperties();
        myKey4.code = 5;
        myKey4.label = "\u0919" ;
        myKey4.showBox = false ;
        myKey4.showCustomBox = false ;
        myKey4.customBoxLayout = new String[] {} ;
        myKey4.showIcon = true ;
        myKey4.icon = "letter_01_11_consonant_nga";
        myKey4.changeLayout = true ;
        myKey4.layout = "";
        myKey.set(4, myKey4);

        KeyProperties myKey5 = new KeyProperties();
        myKey5.code = 6;
        myKey5.label = "\u091A" ;
        myKey5.showBox = false ;
        myKey5.showCustomBox = false ;
        myKey5.customBoxLayout = new String[] {} ;
        myKey5.showIcon = true ;
        myKey5.icon = "letter_02_07_consonant_ch";
        myKey5.changeLayout = true ;
        myKey5.layout = "";
        myKey.set(5, myKey5);

        KeyProperties myKey6 = new KeyProperties();
        myKey6.code = 7;
        myKey6.label = "\u091B" ;
        myKey6.showBox = false ;
        myKey6.showCustomBox = false ;
        myKey6.customBoxLayout = new String[] {} ;
        myKey6.showIcon = true ;
        myKey6.icon = "letter_02_08_consonant_cha";
        myKey6.changeLayout = true ;
        myKey6.layout = "";
        myKey.set(6, myKey6);

        KeyProperties myKey7 = new KeyProperties();
        myKey7.code = 8;
        myKey7.label = "\u091C" ;
        myKey7.showBox = false ;
        myKey7.showCustomBox = false ;
        myKey7.customBoxLayout = new String[] {} ;
        myKey7.showIcon = true ;
        myKey7.icon = "letter_02_09_consonant_ja";
        myKey7.changeLayout = true ;
        myKey7.layout = "";
        myKey.set(7, myKey7);

        KeyProperties myKey8 = new KeyProperties();
        myKey8.code = 9;
        myKey8.label = "\u091D" ;
        myKey8.showBox = false ;
        myKey8.showCustomBox = false ;
        myKey8.customBoxLayout = new String[] {} ;
        myKey8.showIcon = true ;
        myKey8.icon = "letter_02_10_consonant_jha";
        myKey8.changeLayout = true ;
        myKey8.layout = "";
        myKey.set(8, myKey8);

        KeyProperties myKey9 = new KeyProperties();
        myKey9.code = 10;
        myKey9.label = "\u091E" ;
        myKey9.showBox = false ;
        myKey9.showCustomBox = false ;
        myKey9.customBoxLayout = new String[] {} ;
        myKey9.showIcon = true ;
        myKey9.icon = "letter_02_11_consonant_nja";
        myKey9.changeLayout = true ;
        myKey9.layout = "";
        myKey.set(9, myKey9);

        KeyProperties myKey10 = new KeyProperties();
        myKey10.code = 11;
        myKey10.label = "\u091F" ;
        myKey10.showBox = false ;
        myKey10.showCustomBox = false ;
        myKey10.customBoxLayout = new String[] {} ;
        myKey10.showIcon = true ;
        myKey10.icon = "letter_03_07_consonant_tta";
        myKey10.changeLayout = true ;
        myKey10.layout = "";
        myKey.set(10, myKey10);

        KeyProperties myKey11 = new KeyProperties();
        myKey11.code = 12;
        myKey11.label = "\u0920" ;
        myKey11.showBox = false ;
        myKey11.showCustomBox = false ;
        myKey11.customBoxLayout = new String[] {} ;
        myKey11.showIcon = true ;
        myKey11.icon = "letter_03_08_consonant_ttha";
        myKey11.changeLayout = true ;
        myKey11.layout = "";
        myKey.set(11, myKey11);

        KeyProperties myKey12 = new KeyProperties();
        myKey12.code = 13;
        myKey12.label = "\u0921" ;
        myKey12.showBox = false ;
        myKey12.showCustomBox = false ;
        myKey12.customBoxLayout = new String[] {} ;
        myKey12.showIcon = true ;
        myKey12.icon = "letter_03_09_consonant_dda";
        myKey12.changeLayout = true ;
        myKey12.layout = "";
        myKey.set(12, myKey12);

        KeyProperties myKey13 = new KeyProperties();
        myKey13.code = 14;
        myKey13.label = "\u0922" ;
        myKey13.showBox = false ;
        myKey13.showCustomBox = false ;
        myKey13.customBoxLayout = new String[] {} ;
        myKey13.showIcon = true ;
        myKey13.icon = "letter_03_10_consonant_ddha";
        myKey13.changeLayout = true ;
        myKey13.layout = "";
        myKey.set(13, myKey13);

        KeyProperties myKey14 = new KeyProperties();
        myKey14.code = 15;
        myKey14.label = "\u0923" ;
        myKey14.showBox = false ;
        myKey14.showCustomBox = false ;
        myKey14.customBoxLayout = new String[] {} ;
        myKey14.showIcon = true ;
        myKey14.icon = "letter_03_11_consonant_nna";
        myKey14.changeLayout = true ;
        myKey14.layout = "";
        myKey.set(14, myKey14);

        KeyProperties myKey15 = new KeyProperties();
        myKey15.code = 16;
        myKey15.label = "\u0924" ;
        myKey15.showBox = false ;
        myKey15.showCustomBox = false ;
        myKey15.customBoxLayout = new String[] {} ;
        myKey15.showIcon = true ;
        myKey15.icon = "letter_04_07_consonant_ta";
        myKey15.changeLayout = true ;
        myKey15.layout = "";
        myKey.set(15, myKey15);

        KeyProperties myKey16 = new KeyProperties();
        myKey16.code = 17;
        myKey16.label = "\u0925" ;
        myKey16.showBox = true ;
        myKey16.showCustomBox = false ;
        myKey16.customBoxLayout = new String[] {} ;
        myKey16.showIcon = true ;
        myKey16.icon = "letter_04_08_consonant_tha";
        myKey16.changeLayout = true ;
        myKey16.layout = "";
        myKey.set(16, myKey16);

        KeyProperties myKey17 = new KeyProperties();
        myKey17.code = 18;
        myKey17.label = "\u0926" ;
        myKey17.showBox = false ;
        myKey17.showCustomBox = false ;
        myKey17.customBoxLayout = new String[] {} ;
        myKey17.showIcon = true ;
        myKey17.icon = "letter_04_09_consonant_da";
        myKey17.changeLayout = true ;
        myKey17.layout = "";
        myKey.set(17, myKey17);

        KeyProperties myKey18 = new KeyProperties();
        myKey18.code = 19;
        myKey18.label = "\u0927" ;
        myKey18.showBox = false ;
        myKey18.showCustomBox = false ;
        myKey18.customBoxLayout = new String[] {} ;
        myKey18.showIcon = true ;
        myKey18.icon = "letter_04_10_consonant_dha";
        myKey18.changeLayout = true ;
        myKey18.layout = "";
        myKey.set(18, myKey18);

        KeyProperties myKey19 = new KeyProperties();
        myKey19.code = 20;
        myKey19.label = "\u0928" ;
        myKey19.showBox = false ;
        myKey19.showCustomBox = false ;
        myKey19.customBoxLayout = new String[] {} ;
        myKey19.showIcon = true ;
        myKey19.icon = "letter_04_11_consonant_na";
        myKey19.changeLayout = true;
        myKey19.layout = "";
        myKey.set(19, myKey19);

        KeyProperties myKey20 = new KeyProperties();
        myKey20.code = 21;
        myKey20.label = "\u092A" ;
        myKey20.showBox = false ;
        myKey20.showCustomBox = false ;
        myKey20.customBoxLayout = new String[] {} ;
        myKey20.showIcon = true ;
        myKey20.icon = "letter_05_07_consonant_pa";
        myKey20.changeLayout = true ;
        myKey20.layout = "";
        myKey.set(20, myKey20);

        KeyProperties myKey21 = new KeyProperties();
        myKey21.code = 22;
        myKey21.label = "\u092B" ;
        myKey21.showBox = false ;
        myKey21.showCustomBox = false ;
        myKey21.customBoxLayout = new String[] {} ;
        myKey21.showIcon = true ;
        myKey21.icon = "letter_05_08_consonant_ph";
        myKey21.changeLayout = true ;
        myKey21.layout = "";
        myKey.set(21, myKey21);

        KeyProperties myKey22 = new KeyProperties();
        myKey22.code = 23;
        myKey22.label = "\u092C" ;
        myKey22.showBox = false ;
        myKey22.showCustomBox = false ;
        myKey22.customBoxLayout = new String[] {} ;
        myKey22.showIcon = true ;
        myKey22.icon = "letter_05_09_consonant_ba";
        myKey22.changeLayout = true ;
        myKey22.layout = "";
        myKey.set(22, myKey22);

        KeyProperties myKey23 = new KeyProperties();
        myKey23.code = 24;
        myKey23.label = "\u092D" ;
        myKey23.showBox = false ;
        myKey23.showCustomBox = false ;
        myKey23.customBoxLayout = new String[] {} ;
        myKey23.showIcon = true ;
        myKey23.icon = "letter_05_10_consonant_bha";
        myKey23.changeLayout = true ;
        myKey23.layout = "";
        myKey.set(23, myKey23);

        KeyProperties myKey24 = new KeyProperties();
        myKey24.code = 25;
        myKey24.label = "\u092E" ;
        myKey24.showBox = false ;
        myKey24.showCustomBox = false ;
        myKey24.customBoxLayout = new String[] {} ;
        myKey24.showIcon = true ;
        myKey24.icon = "letter_05_11_consonant_ma";
        myKey24.changeLayout = true ;
        myKey24.layout = "";
        myKey.set(24, myKey24);

        KeyProperties myKey25 = new KeyProperties();
        myKey25.code = 26;
        myKey25.label = "\u092F" ;
        myKey25.showBox = true ;
        myKey25.showCustomBox = false ;
        myKey25.customBoxLayout = new String[] {} ;
        myKey25.showIcon = false ;
        myKey25.icon = "";
        myKey25.changeLayout = false ;
        myKey25.layout = "";
        myKey.set(25, myKey25);

        KeyProperties myKey28 = new KeyProperties();
        myKey28.code = 29;
        myKey28.label = "\"" ;
        myKey28.showBox = false ;
        myKey28.showCustomBox = false ;
        myKey28.customBoxLayout = new String[] {} ;
        myKey28.showIcon = true ;
        myKey28.icon = "dquote";
        myKey28.changeLayout = false ;
        myKey28.layout = "";
        myKey.set(28, myKey28);

        KeyProperties myKey29 = new KeyProperties();
        myKey29.code = 30;
        myKey29.label = "\u0905" ;    //  अ \u0905
        myKey29.showBox = false ;
        myKey29.showCustomBox = false ;
        myKey29.customBoxLayout = new String[] {} ;
        myKey29.showIcon = true ;
        myKey29.icon = "letter_01_03_vowels_aa";     //  letter_01_03_vowels_aa
        myKey29.changeLayout = false ;
        myKey29.layout = "";
        myKey.set(29, myKey29);

        KeyProperties myKey30 = new KeyProperties();
        myKey30.code = 31;
        myKey30.label = "\u0906" ;
        myKey30.showBox = false ;
        myKey30.showCustomBox = false ;
        myKey30.customBoxLayout = new String[] {} ;
        myKey30.showIcon = true ;
        myKey30.icon = "letter_01_02_vowels_aaa";
        myKey30.changeLayout = false ;
        myKey30.layout = "";
        myKey.set(30, myKey30);

        KeyProperties myKey106 = new KeyProperties();
        myKey106.code = 107;
        myKey106.label = "\u0905\u0902" ;
        myKey106.showBox = false ;
        myKey106.showCustomBox = false ;
        myKey106.customBoxLayout = new String[] {} ;
        myKey106.showIcon = true ;
        myKey106.icon = "letter_01_01_vowels_am";
        myKey106.changeLayout = false ;
        myKey106.layout = "";
        myKey.set(106, myKey106);

        KeyProperties myKey107 = new KeyProperties();
        myKey107.code = 108;
        myKey107.label = "\u0905\u0903" ;
        myKey107.showBox = false ;
        myKey107.showCustomBox = false ;
        myKey107.customBoxLayout = new String[] {} ;
        myKey107.showIcon = true ;
        myKey107.icon = "letter_01_05_vowels_ah";
        myKey107.changeLayout = false ;
        myKey107.layout = "";
        myKey.set(107, myKey107);

        KeyProperties myKey108 = new KeyProperties();
        myKey108.code = 109;
        myKey108.label = "\u0905\u094D" ;
        myKey108.showBox = false ;
        myKey108.showCustomBox = false ;
        myKey108.customBoxLayout = new String[] {} ;
        myKey108.showIcon = true ;
        myKey108.icon = "letter_01_04_vowels_a";
        myKey108.changeLayout = false ;
        myKey108.layout = "";
        myKey.set(108, myKey108);

        KeyProperties myKey109 = new KeyProperties();
        myKey109.code = 110;
        myKey109.label = "\u0907" ;
        myKey109.showBox = false ;
        myKey109.showCustomBox = false ;
        myKey109.customBoxLayout = new String[] {} ;
        myKey109.showIcon = true ;
        myKey109.icon = "letter_02_05_vowels_i";
        myKey109.changeLayout = false ;
        myKey109.layout = "";
        myKey.set(109, myKey109);

        KeyProperties myKey110 = new KeyProperties();
        myKey110.code = 111;
        myKey110.label = "\u0908" ;
        myKey110.showBox = false ;
        myKey110.showCustomBox = false ;
        myKey110.customBoxLayout = new String[] {} ;
        myKey110.showIcon = true ;
        myKey110.icon = "letter_02_04_vowels_ii";
        myKey110.changeLayout = false ;
        myKey110.layout = "";
        myKey.set(110, myKey110);

        KeyProperties myKey111 = new KeyProperties();
        myKey111.code = 112;
        myKey111.label = "\u090F" ;
        myKey111.showBox = false ;
        myKey111.showCustomBox = false ;
        myKey111.customBoxLayout = new String[] {} ;
        myKey111.showIcon = true ;
        myKey111.icon = "letter_02_03_vowels_e";
        myKey111.changeLayout = false ;
        myKey111.layout = "";
        myKey.set(111, myKey111);

        KeyProperties myKey112 = new KeyProperties();
        myKey112.code = 113;
        myKey112.label = "\u0910" ;
        myKey112.showBox = false ;
        myKey112.showCustomBox = false ;
        myKey112.customBoxLayout = new String[] {} ;
        myKey112.showIcon = true ;
        myKey112.icon = "letter_02_02_vowels_ai";
        myKey112.changeLayout = false ;
        myKey112.layout = "";
        myKey.set(112, myKey112);

        KeyProperties myKey113 = new KeyProperties();
        myKey113.code = 114;
        myKey113.label = "\u090D" ;
        myKey113.showBox = false ;
        myKey113.showCustomBox = false ;
        myKey113.customBoxLayout = new String[] {} ;
        myKey113.showIcon = true ;
        myKey113.icon = "letter_02_01_vowels_ae";
        myKey113.changeLayout = false ;
        myKey113.layout = "";
        myKey.set(113, myKey113);

        KeyProperties myKey114 = new KeyProperties();
        myKey114.code = 115;
        myKey114.label = "\u0035" ;
        myKey114.showBox = false ;
        myKey114.showCustomBox = false ;
        myKey114.customBoxLayout = new String[] {} ;
        myKey114.showIcon = true ;
        myKey114.icon = "number_5";
        myKey114.changeLayout = false ;
        myKey114.layout = "";
        myKey.set(114, myKey114);

        KeyProperties myKey115 = new KeyProperties();
        myKey115.code = 116;
        myKey115.label = "\u0034" ;
        myKey115.showBox = false ;
        myKey115.showCustomBox = false ;
        myKey115.customBoxLayout = new String[] {} ;
        myKey115.showIcon = true ;
        myKey115.icon = "number_4";
        myKey115.changeLayout = false ;
        myKey115.layout = "";
        myKey.set(115, myKey115);

        KeyProperties myKey116 = new KeyProperties();
        myKey116.code = 117;
        myKey116.label = "\u0033" ;
        myKey116.showBox = false ;
        myKey116.showCustomBox = false ;
        myKey116.customBoxLayout = new String[] {} ;
        myKey116.showIcon = true ;
        myKey116.icon = "number_3";
        myKey116.changeLayout = false ;
        myKey116.layout = "";
        myKey.set(116, myKey116);

        KeyProperties myKey117 = new KeyProperties();
        myKey117.code = 118;
        myKey117.label = "\u0032" ;
        myKey117.showBox = false ;
        myKey117.showCustomBox = false ;
        myKey117.customBoxLayout = new String[] {} ;
        myKey117.showIcon = true ;
        myKey117.icon = "number_2";
        myKey117.changeLayout = false ;
        myKey117.layout = "";
        myKey.set(117, myKey117);

        KeyProperties myKey118 = new KeyProperties();
        myKey118.code = 119;
        myKey118.label = "\u0031" ;
        myKey118.showBox = false ;
        myKey118.showCustomBox = false ;
        myKey118.customBoxLayout = new String[] {} ;
        myKey118.showIcon = true ;
        myKey118.icon = "number_1";
        myKey118.changeLayout = false ;
        myKey118.layout = "";
        myKey.set(118, myKey118);

        KeyProperties myKey119 = new KeyProperties();
        myKey119.code = 120;
        myKey119.label = "\u0030" ;
        myKey119.showBox = false ;
        myKey119.showCustomBox = false ;
        myKey119.customBoxLayout = new String[] {} ;
        myKey119.showIcon = true ;
        myKey119.icon = "number_0";
        myKey119.changeLayout = false ;
        myKey119.layout = "";
        myKey.set(119, myKey119);

        KeyProperties myKey120 = new KeyProperties();
        myKey120.code = 121;
        myKey120.label = "\u0039" ;
        myKey120.showBox = false ;
        myKey120.showCustomBox = false ;
        myKey120.customBoxLayout = new String[] {} ;
        myKey120.showIcon = true ;
        myKey120.icon = "number_9";
        myKey120.changeLayout = false ;
        myKey120.layout = "";
        myKey.set(120, myKey120);

        KeyProperties myKey121 = new KeyProperties();
        myKey121.code = 122;
        myKey121.label = "\u0038" ;
        myKey121.showBox = false ;
        myKey121.showCustomBox = false ;
        myKey121.customBoxLayout = new String[] {} ;
        myKey121.showIcon = true ;
        myKey121.icon = "number_8";
        myKey121.changeLayout = false ;
        myKey121.layout = "";
        myKey.set(121, myKey121);

        KeyProperties myKey122 = new KeyProperties();
        myKey122.code = 123;
        myKey122.label = "\u0037" ;
        myKey122.showBox = false ;
        myKey122.showCustomBox = false ;
        myKey122.customBoxLayout = new String[] {} ;
        myKey122.showIcon = true ;
        myKey122.icon = "number_7";
        myKey122.changeLayout = false ;
        myKey122.layout = "";
        myKey.set(122, myKey122);

        KeyProperties myKey123 = new KeyProperties();
        myKey123.code = 124;
        myKey123.label = "\u0036" ;
        myKey123.showBox = false ;
        myKey123.showCustomBox = false ;
        myKey123.customBoxLayout = new String[] {} ;
        myKey123.showIcon = true ;
        myKey123.icon = "number_6";
        myKey123.changeLayout = false ;
        myKey123.layout = "";
        myKey.set(123, myKey123);

        KeyProperties myKey124 = new KeyProperties();
        myKey124.code = 125;
        myKey124.label = "\u0909" ;
        myKey124.showBox = false ;
        myKey124.showCustomBox = false ;
        myKey124.customBoxLayout = new String[] {} ;
        myKey124.showIcon = true ;
        myKey124.icon = "letter_05_05_vowels_u";
        myKey124.changeLayout = false ;
        myKey124.layout = "";
        myKey.set(124, myKey124);

        KeyProperties myKey125 = new KeyProperties();
        myKey125.code = 126;
        myKey125.label = "\u090A" ;
        myKey125.showBox = false ;
        myKey125.showCustomBox = false ;
        myKey125.customBoxLayout = new String[] {} ;
        myKey125.showIcon = true ;
        myKey125.icon = "letter_05_04_vowels_uu";
        myKey125.changeLayout = false ;
        myKey125.layout = "";
        myKey.set(125, myKey125);

        KeyProperties myKey126 = new KeyProperties();
        myKey126.code = 127;
        myKey126.label = "\u0913" ;
        myKey126.showBox = false ;
        myKey126.showCustomBox = false ;
        myKey126.customBoxLayout = new String[] {} ;
        myKey126.showIcon = true ;
        myKey126.icon = "letter_05_03_vowels_o";
        myKey126.changeLayout = false ;
        myKey126.layout = "";
        myKey.set(126, myKey126);

        KeyProperties myKey127 = new KeyProperties();
        myKey127.code = 128;
        myKey127.label = "\u0914" ;
        myKey127.showBox = false ;
        myKey127.showCustomBox = false ;
        myKey127.customBoxLayout = new String[] {} ;
        myKey127.showIcon = true ;
        myKey127.icon = "letter_05_02_vowels_ou";
        myKey127.changeLayout = false ;
        myKey127.layout = "";
        myKey.set(127, myKey127);

        KeyProperties myKey128 = new KeyProperties();
        myKey128.code = 129;
        myKey128.label = "\u0911" ;
        myKey128.showBox = false ;
        myKey128.showCustomBox = false ;
        myKey128.customBoxLayout = new String[] {} ;
        myKey128.showIcon = true ;
        myKey128.icon = "letter_05_01_vowels_au";
        myKey128.changeLayout = false ;
        myKey128.layout = "";
        myKey.set(128, myKey128);

        KeyProperties myKey200 = new KeyProperties(); //middle spine//
        myKey200.code = 2011;
        myKey200.label = "" ;
        myKey200.showBox = false ;
        myKey200.showCustomBox = false ;
        myKey200.customBoxLayout = new String[] {} ;
        myKey200.showIcon = true ;
        myKey200.icon = "spine";
        myKey200.changeLayout = false ;
        myKey200.layout = "";
        myKey.set(200, myKey200);

        KeyProperties myKey202 = new KeyProperties(); //middle spine//
        myKey202.code = 2012;
        myKey202.label = "" ;
        myKey202.showBox = false ;
        myKey202.showCustomBox = false ;
        myKey202.customBoxLayout = new String[] {} ;
        myKey202.showIcon = true ;
        myKey202.icon = "spine";
        myKey202.changeLayout = false ;
        myKey202.layout = "";
        myKey.set(202, myKey202);

        KeyProperties myKey203 = new KeyProperties(); //middle spine//
        myKey203.code = 2013;
        myKey203.label = "" ;
        myKey203.showBox = false ;
        myKey203.showCustomBox = false ;
        myKey203.customBoxLayout = new String[] {} ;
        myKey203.showIcon = true ;
        myKey203.icon = "spine";
        myKey203.changeLayout = false ;
        myKey203.layout = "";
        myKey.set(203, myKey203);

        KeyProperties myKey204 = new KeyProperties(); //middle spine//
        myKey204.code = 2014;
        myKey204.label = "" ;
        myKey204.showBox = false ;
        myKey204.showCustomBox = false ;
        myKey204.customBoxLayout = new String[] {} ;
        myKey204.showIcon = true ;
        myKey204.icon = "spine";
        myKey204.changeLayout = false ;
        myKey204.layout = "";
        myKey.set(204, myKey204);

        KeyProperties myKey205 = new KeyProperties(); //middle spine//
        myKey205.code = 2015;
        myKey205.label = "" ;
        myKey205.showBox = false ;
        myKey205.showCustomBox = false ;
        myKey205.customBoxLayout = new String[] {} ;
        myKey205.showIcon = true ;
        myKey205.icon = "spine";
        myKey205.changeLayout = false ;
        myKey205.layout = "";
        myKey.set(205, myKey205);

        KeyProperties myKey31 = new KeyProperties();
        myKey31.code = 32;
        myKey31.label = "\u0930\u094D" ;
        myKey31.showBox = false ;
        myKey31.showCustomBox = false ;
        myKey31.customBoxLayout = new String[] {} ;
        myKey31.showIcon = false ;
        myKey31.icon = "";
        myKey31.changeLayout = false ;
        myKey31.layout = "";
        myKey.set(31, myKey31);

        KeyProperties myKey32 = new KeyProperties();
        myKey32.code = 33;
        myKey32.label = "\u0933" ;
        myKey32.showBox = true ;
        myKey32.showCustomBox = false ;
        myKey32.customBoxLayout = new String[] {} ;
        myKey32.showIcon = true ;
        myKey32.icon = "special_02_05_lla";
        myKey32.changeLayout = false ;
        myKey32.layout = "";
        myKey.set(32, myKey32);

        KeyProperties myKey33 = new KeyProperties();
        myKey33.code = 34;
        myKey33.label = "\u0924\u094D\u0930" ;
        myKey33.showBox = true ;
        myKey33.showCustomBox = false ;
        myKey33.customBoxLayout = new String[] {} ;
        myKey33.showIcon = true ;
        myKey33.icon = "tr";
        myKey33.changeLayout = false ;
        myKey33.layout = "";
        myKey.set(33, myKey33);

        KeyProperties myKey34 = new KeyProperties();
        myKey34.code = 35;
        myKey34.label = "\u0915\u094D\u0937" ;
        myKey34.showBox = true ;
        myKey34.showCustomBox = false ;
        myKey34.customBoxLayout = new String[] {} ;
        myKey34.showIcon = true ;
        myKey34.icon = "special_05_03_ksh";
        myKey34.changeLayout = false ;
        myKey34.layout = "";
        myKey.set(34, myKey34);

        KeyProperties myKey35 = new KeyProperties();
        myKey35.code = 36;
        myKey35.label = "\u091C\u094D\u091E" ;
        myKey35.showBox = true ;
        myKey35.showCustomBox = false ;
        myKey35.customBoxLayout = new String[] {} ;
        myKey35.showIcon = true ;
        myKey35.icon = "special_05_05_gya";
        myKey35.changeLayout = false ;
        myKey35.layout = "";
        myKey.set(35, myKey35);

        KeyProperties myKey36 = new KeyProperties();
        myKey36.code = 37;
        myKey36.label = "\u0936\u094D\u0930" ;
        myKey36.showBox = true ;
        myKey36.showCustomBox = false ;
        myKey36.customBoxLayout = new String[] {} ;
        myKey36.showIcon = true ;
        myKey36.icon = "special_01_05_shr";
        myKey36.changeLayout = false ;
        myKey36.layout = "";
        myKey.set(36, myKey36);

        KeyProperties myKey37 = new KeyProperties();
        myKey37.code = 38;
        myKey37.label = "\u093E" ; //aa matra
        myKey37.showBox = true ;
        myKey37.showCustomBox = true ;
        myKey37.customBoxLayout = new String[] {"", "\u0906", "\u0907", "\u0908", "\u0909", "\u090A", "\u090F", "\u0910", "\u0913", "\u0914"} ;

//        else {
//		    myKey37.customBoxLayout = new String[] {"\u094D", "\u093E", "\u093F", "\u0940", "\u0941", "\u0942", "\u0947", "\u0948", "\u094B", "\u094C"} ;}

        myKey37.showIcon = false ;
        myKey37.icon = "";
        myKey37.changeLayout = false ;
        myKey37.layout = "";
        myKey.set(37, myKey37);

//		KeyProperties myKey38 = new KeyProperties();
//		myKey38.code = 39;
//		myKey38.label = "\u0943" ;
//		myKey38.showBox = true ;
//		myKey38.showCustomBox = true ;
//		myKey38.customBoxLayout = new String[] {"\u090b","\u0944", "\u0960", "\u0901", "\u0946", "\u094a", "\u093d","\u0972", "\u0949", "\u0911"} ;
//		myKey38.showIcon = false ;
//		myKey38.icon = "";
//		myKey38.changeLayout = false ;
//		myKey38.layout = "";
//		myKey.set(38, myKey38);

//		KeyProperties myKey39 = new KeyProperties();
//		myKey39.code = 40;
//		myKey39.label = "\u0905" ;
//		myKey39.showBox = true ;
//		myKey39.showCustomBox = true ;
//		myKey39.customBoxLayout = new String[] {"", "\u0906", "\u0907", "\u0908", "\u0909", "\u090A", "\u090F", "\u0910", "\u0913", "\u0914"} ;
//		myKey39.showIcon = false ;
//		myKey39.icon = "";
//		myKey39.changeLayout = false ;
//		myKey39.layout = "";
//		myKey.set(39, myKey39);

        KeyProperties myKey40 = new KeyProperties();
        myKey40.code = 41;
        myKey40.label = "\u002E" ;
        myKey40.showBox = false ;
        myKey40.showCustomBox = false ;
        myKey40.customBoxLayout = new String[] {};//{"\u002E","\u003F", "\u0021", "", "", "", "", "", "", "","\u0964","\u002C"} ;
        myKey40.showIcon = true ;
        myKey40.icon = "punctuate";
        myKey40.changeLayout = false;
        myKey40.layout = "";
        myKey.set(40, myKey40);

        KeyProperties myKey41 = new KeyProperties();
        myKey41.code = 42;
        myKey41.label = "\u002C" ;
        myKey41.showBox = false ;
        myKey41.showCustomBox = false ;
        myKey41.customBoxLayout = new String[] {} ;
        myKey41.showIcon = true ;
        myKey41.icon = "special_04_08_comma";
        myKey41.changeLayout = false ;
        myKey41.layout = "";
        myKey.set(41, myKey41);

        KeyProperties myKey42 = new KeyProperties();
        myKey42.code = 43;
        myKey42.label = "\u0021" ;
        myKey42.showBox = false ;
        myKey42.showCustomBox = false ;
        myKey42.customBoxLayout = new String[] {} ;
        myKey42.showIcon = true ;
        myKey42.icon = "special_05_09_exclamation";
        myKey42.changeLayout = false ;
        myKey42.layout = "";
        myKey.set(42, myKey42);

        KeyProperties myKey43 = new KeyProperties();
        myKey43.code = 44;
        myKey43.label = "\u003F" ;
        myKey43.showBox = false ;
        myKey43.showCustomBox = false ;
        myKey43.customBoxLayout = new String[] {} ;
        myKey43.showIcon = true ;
        myKey43.icon = "special_05_08_question";
        myKey43.changeLayout = false ;
        myKey43.layout = "";
        myKey.set(43, myKey43);

        KeyProperties myKey44 = new KeyProperties();
        myKey44.code = 45;
        myKey44.label = "\u0964" ;
        myKey44.showBox = false ;
        myKey44.showCustomBox = false ;
        myKey44.customBoxLayout = new String[] {} ;
        myKey44.showIcon = true ;
        myKey44.icon = "special_05_10_singleviram";
        myKey44.changeLayout = false ;
        myKey44.layout = "";
        myKey.set(44, myKey44);

        KeyProperties myKey45 = new KeyProperties();
        myKey45.code = 46;
        myKey45.label = "\u201C";
        myKey45.showBox = false ;
        myKey45.showCustomBox = false ;
        myKey45.customBoxLayout = new String[] {} ;
        myKey45.showIcon = true ;
        myKey45.icon = "special_02_08_doublequote";
        myKey45.changeLayout = false ;
        myKey45.layout = "";
        myKey.set(45, myKey45);

        KeyProperties myKey46 = new KeyProperties();
        myKey46.code = 47;
        myKey46.label = "\u0027" ;
        myKey46.showBox = false ;
        myKey46.showCustomBox = false ;
        myKey46.customBoxLayout = new String[] {} ;
        myKey46.showIcon = true ;
        myKey46.icon = "special_02_09_apostrophe";
        myKey46.changeLayout = false ;
        myKey46.layout = "";
        myKey.set(46, myKey46);

        KeyProperties myKey47 = new KeyProperties();
        myKey47.code = 48;
        myKey47.label = "\u0902" ;
        myKey47.showBox = false ;
        myKey47.showCustomBox = false ;
        myKey47.customBoxLayout = new String[] {} ;
        myKey47.showIcon = true ;
        myKey47.icon = "bindu";
        myKey47.changeLayout = false ;
        myKey47.layout = "";
        myKey.set(47, myKey47);

        KeyProperties myKey48 = new KeyProperties();
        myKey48.code = 49;
        myKey48.label = "\u0945" ;
        myKey48.showBox = false ;
        myKey48.showCustomBox = false ;
        myKey48.customBoxLayout = new String[] {} ;
        myKey48.showIcon = true ;
        myKey48.icon = "aakara";
        myKey48.changeLayout = false ;
        myKey48.layout = "";
        myKey.set(48, myKey48);

        KeyProperties myKey49 = new KeyProperties();
        myKey49.code = 50;
        myKey49.label = "\u0903" ;
        myKey49.showBox = false ;
        myKey49.showCustomBox = false ;
        myKey49.customBoxLayout = new String[] {} ;
        myKey49.showIcon = true ;
        myKey49.icon = "visarga";
        myKey49.changeLayout = false ;
        myKey49.layout = "";
        myKey.set(49, myKey49);

        KeyProperties myKey50 = new KeyProperties();
        myKey50.code = 51;
        myKey50.label = "" ;
        myKey50.showBox = false ;
        myKey50.showCustomBox = false ;
        myKey50.customBoxLayout = new String[] {} ;
        myKey50.showIcon = true ;
        myKey50.icon = "eyelashra";
        myKey50.changeLayout = false ;
        myKey50.layout = "";
        myKey50.isException = true;
        myKey.set(50, myKey50);

        KeyProperties myKey51 = new KeyProperties();
        myKey51.code = 52;
        myKey51.label = "्र" ;
        myKey51.showBox = false ;
        myKey51.showCustomBox = false ;
        myKey51.customBoxLayout = new String[] {} ;
        myKey51.showIcon = true ;
        myKey51.icon = "special_02_02_trakar";
        myKey51.changeLayout = false ;
        myKey51.layout = "";
        myKey51.isException = true;
        myKey.set(51, myKey51);

        KeyProperties myKey52 = new KeyProperties();
        myKey52.code = 53;
        myKey52.label = "र्" ;
        myKey52.showBox = false ;
        myKey52.showCustomBox = false ;
        myKey52.customBoxLayout = new String[] {} ;
        myKey52.showIcon = true ;
        myKey52.icon = "special_02_01_rafar";
        myKey52.changeLayout = false ;
        myKey52.layout = "";
        myKey52.isException = true;
        myKey.set(52, myKey52);

        KeyProperties myKey53 = new KeyProperties();
        myKey53.code = 54;
        myKey53.label = "." ;
        myKey53.showBox = false ;
        myKey53.showCustomBox = false ;
        myKey53.customBoxLayout = new String[] {} ;
        myKey53.showIcon = true ;
        myKey53.icon = "special_04_09_fullstop";
        myKey53.changeLayout = false ;
        myKey53.layout = "";
        myKey.set(53, myKey53);

        KeyProperties myKey54 = new KeyProperties();
        myKey54.code = 55;
        myKey54.label = "\u0970" ;
        myKey54.showBox = false ;
        myKey54.showCustomBox = false ;
        myKey54.customBoxLayout = new String[] {} ;
        myKey54.showIcon = false ;
        myKey54.icon = "";
        myKey54.changeLayout = false ;
        myKey54.layout = "";
        myKey.set(54, myKey54);

        KeyProperties myKey55 = new KeyProperties();
        myKey55.code = 56;
        myKey55.label = "\u0967" ;
        myKey55.showBox = false ;
        myKey55.showCustomBox = false ;
        myKey55.customBoxLayout = new String[] {} ;
        myKey55.showIcon = true ;
        myKey55.icon = "special_03_01_number_1";
        myKey55.changeLayout = false ;
        myKey55.layout = "";
        myKey.set(55, myKey55);

        KeyProperties myKey56 = new KeyProperties();
        myKey56.code = 57;
        myKey56.label = "\u0968" ;
        myKey56.showBox = false ;
        myKey56.showCustomBox = false ;
        myKey56.customBoxLayout = new String[] {} ;
        myKey56.showIcon = true ;
        myKey56.icon = "special_03_02_number_2";
        myKey56.changeLayout = false ;
        myKey56.layout = "";
        myKey.set(56, myKey56);

        KeyProperties myKey57 = new KeyProperties();
        myKey57.code = 58;
        myKey57.label = "\u0969" ;
        myKey57.showBox = false ;
        myKey57.showCustomBox = false ;
        myKey57.customBoxLayout = new String[] {} ;
        myKey57.showIcon = true ;
        myKey57.icon = "special_03_03_number_3" ;
        myKey57.changeLayout = false ;
        myKey57.layout = "";
        myKey.set(57, myKey57);

        KeyProperties myKey58 = new KeyProperties();
        myKey58.code = 59;
        myKey58.label = "\u002B" ;
        myKey58.showBox = false ;
        myKey58.showCustomBox = false ;
        myKey58.customBoxLayout = new String[] {} ;
        myKey58.showIcon = true ;
        myKey58.icon = "special_01_11_plus";
        myKey58.changeLayout = false ;
        myKey58.layout = "";
        myKey.set(58, myKey58);

        KeyProperties myKey59 = new KeyProperties();
        myKey59.code = 60;
        myKey59.label = "," ;
        myKey59.showBox = false ;
        myKey59.showCustomBox = false ;
        myKey59.customBoxLayout = new String[] {} ;
        myKey59.showIcon = false ;
        myKey59.icon = "";
        myKey59.changeLayout = false ;
        myKey59.layout = "";
        myKey.set(59, myKey59);

        KeyProperties myKey60 = new KeyProperties();
        myKey60.code = 61;
        myKey60.label = "\u0965" ;
        myKey60.showBox = false ;
        myKey60.showCustomBox = false ;
        myKey60.customBoxLayout = new String[] {} ;
        myKey60.showIcon = false ;
        myKey60.icon = "";
        myKey60.changeLayout = false ;
        myKey60.layout = "";
        myKey.set(60, myKey60);

        KeyProperties myKey61 = new KeyProperties();
        myKey61.code = 62;
        myKey61.label = "\u096A" ;
        myKey61.showBox = false ;
        myKey61.showCustomBox = false ;
        myKey61.customBoxLayout = new String[] {} ;
        myKey61.showIcon = true ;
        myKey61.icon = "special_03_04_number_4";
        myKey61.changeLayout = false ;
        myKey61.layout = "";
        myKey.set(61, myKey61);

        KeyProperties myKey62 = new KeyProperties();
        myKey62.code = 63;
        myKey62.label = "\u096B" ;
        myKey62.showBox = false ;
        myKey62.showCustomBox = false ;
        myKey62.customBoxLayout = new String[] {} ;
        myKey62.showIcon = true ;
        myKey62.icon = "special_03_05_number_5";
        myKey62.changeLayout = false ;
        myKey62.layout = "";
        myKey.set(62, myKey62);

        KeyProperties myKey63 = new KeyProperties();
        myKey63.code = 64;
        myKey63.label = "\u096C" ;
        myKey63.showBox = false ;
        myKey63.showCustomBox = false ;
        myKey63.customBoxLayout = new String[] {} ;
        myKey63.showIcon = true ;
        myKey63.icon = "special_04_01_number_6";
        myKey63.changeLayout = false ;
        myKey63.layout = "";
        myKey.set(63, myKey63);

        KeyProperties myKey64 = new KeyProperties();
        myKey64.code = 65;
        myKey64.label = "\u002D" ;
        myKey64.showBox = false ;
        myKey64.showCustomBox = false ;
        myKey64.customBoxLayout = new String[] {} ;
        myKey64.showIcon = true ;
        myKey64.icon = "special_01_10_minus";
        myKey64.changeLayout = false ;
        myKey64.layout = "";
        myKey.set(64, myKey64);

        KeyProperties myKey65 = new KeyProperties();
        myKey65.code = 66;
        myKey65.label = ";" ;
        myKey65.showBox = false ;
        myKey65.showCustomBox = false ;
        myKey65.customBoxLayout = new String[] {} ;
        myKey65.showIcon = true ;
        myKey65.icon = "special_03_09_semicolon";
        myKey65.changeLayout = false ;
        myKey65.layout = "";
        myKey.set(65, myKey65);

        KeyProperties myKey66 = new KeyProperties();
        myKey66.code = 67;
        myKey66.label = "\u005F" ;
        myKey66.showBox = false ;
        myKey66.showCustomBox = false ;
        myKey66.customBoxLayout = new String[] {} ;
        myKey66.showIcon = true ;
        myKey66.icon = "special_04_11_underscore";
        myKey66.changeLayout = false ;
        myKey66.layout = "";
        myKey.set(66, myKey66);

        KeyProperties myKey67 = new KeyProperties();
        myKey67.code = 68;
        myKey67.label = "\u096D" ;
        myKey67.showBox = false ;
        myKey67.showCustomBox = false ;
        myKey67.customBoxLayout = new String[] {} ;
        myKey67.showIcon = true ;
        myKey67.icon = "special_04_02_number_7";
        myKey67.changeLayout = false ;
        myKey67.layout = "";
        myKey.set(67, myKey67);

        KeyProperties myKey68 = new KeyProperties();
        myKey68.code = 69;
        myKey68.label = "\u096E" ;
        myKey68.showBox = false ;
        myKey68.showCustomBox = false ;
        myKey68.customBoxLayout = new String[] {} ;
        myKey68.showIcon = true ;
        myKey68.icon = "special_04_03_number_8";
        myKey68.changeLayout = false ;
        myKey68.layout = "";
        myKey.set(68, myKey68);

        KeyProperties myKey69 = new KeyProperties();
        myKey69.code = 70;
        myKey69.label = "\u096F" ;
        myKey69.showBox = false ;
        myKey69.showCustomBox = false ;
        myKey69.customBoxLayout = new String[] {} ;
        myKey69.showIcon = true ;
        myKey69.icon = "special_04_04_number_9";
        myKey69.changeLayout = false ;
        myKey69.layout = "";
        myKey.set(69, myKey69);

        KeyProperties myKey70 = new KeyProperties();
        myKey70.code = 71;
        myKey70.label = "x" ;
        myKey70.showBox = false ;
        myKey70.showCustomBox = false ;
        myKey70.customBoxLayout = new String[] {} ;
        myKey70.showIcon = false ;
        myKey70.icon = "";
        myKey70.changeLayout = false ;
        myKey70.layout = "";
        myKey.set(70, myKey70);

        KeyProperties myKey71 = new KeyProperties();
        myKey71.code = 72;
        myKey71.label = "=" ;
        myKey71.showBox = false ;
        myKey71.showCustomBox = false ;
        myKey71.customBoxLayout = new String[] {} ;
        myKey71.showIcon = true ;
        myKey71.icon = "special_03_11_equals";
        myKey71.changeLayout = false ;
        myKey71.layout = "";
        myKey.set(71, myKey71);

        KeyProperties myKey72 = new KeyProperties();
        myKey72.code = 73;
        myKey72.label = ":" ;
        myKey72.showBox = false ;
        myKey72.showCustomBox = false ;
        myKey72.customBoxLayout = new String[] {} ;
        myKey72.showIcon = true ;
        myKey72.icon = "special_03_08_colon";
        myKey72.changeLayout = false ;
        myKey72.layout = "";
        myKey.set(72, myKey72);

        KeyProperties myKey73 = new KeyProperties();
        myKey73.code = 74;
        myKey73.label = "\u2014" ;
        myKey73.showBox = false ;
        myKey73.showCustomBox = false ;
        myKey73.customBoxLayout = new String[] {} ;
        myKey73.showIcon = true ;
        myKey73.icon = "special_04_10_hyphen";
        myKey73.changeLayout = false ;
        myKey73.layout = "";
        myKey.set(73, myKey73);

        KeyProperties myKey74 = new KeyProperties();
        myKey74.code = 75;
        myKey74.label = "*" ;
        myKey74.showBox = false ;
        myKey74.showCustomBox = false ;
        myKey74.customBoxLayout = new String[] {} ;
        myKey74.showIcon = true ;
        myKey74.icon = "special_02_10_multiplication";
        myKey74.changeLayout = false ;
        myKey74.layout = "";
        myKey.set(74, myKey74);

        KeyProperties myKey75 = new KeyProperties();
        myKey75.code = 76;
        myKey75.label = "\u0966" ;
        myKey75.showBox = false ;
        myKey75.showCustomBox = false ;
        myKey75.customBoxLayout = new String[] {} ;
        myKey75.showIcon = true ;
        myKey75.icon = "special_04_05_number_0";
        myKey75.changeLayout = false ;
        myKey75.layout = "";
        myKey.set(75, myKey75);

        KeyProperties myKey76 = new KeyProperties();
        myKey76.code = 77;
        myKey76.label = "#" ;
        myKey76.showBox = false ;
        myKey76.showCustomBox = false ;
        myKey76.customBoxLayout = new String[] {} ;
        myKey76.showIcon = true ;
        myKey76.icon = "special_01_07_hash";
        myKey76.changeLayout = false ;
        myKey76.layout = "";
        myKey.set(76, myKey76);

        KeyProperties myKey77 = new KeyProperties();
        myKey77.code = 78;
        myKey77.label = "\u00F7" ;
        myKey77.showBox = false ;
        myKey77.showCustomBox = false ;
        myKey77.customBoxLayout = new String[] {} ;
        myKey77.showIcon = true ;
        myKey77.icon = "special_02_11_forwardslash";
        myKey77.changeLayout = false ;
        myKey77.layout = "";
        myKey.set(77, myKey77);

        KeyProperties myKey78 = new KeyProperties();
        myKey78.code = 79;
        myKey78.label = "|" ;
        myKey78.showBox = false ;
        myKey78.showCustomBox = false ;
        myKey78.customBoxLayout = new String[] {} ;
        myKey78.showIcon = false ;
        myKey78.icon = "";
        myKey78.changeLayout = false ;
        myKey78.layout = "";
        myKey.set(78, myKey78);

        KeyProperties myKey79 = new KeyProperties();
        myKey79.code = 80;
        myKey79.label = "\u20B9" ;
        myKey79.showBox = false ;
        myKey79.showCustomBox = false ;
        myKey79.customBoxLayout = new String[] {} ;
        myKey79.showIcon = true ;
        myKey79.icon = "special_01_09_rupee";
        myKey79.changeLayout = false ;
        myKey79.layout = "";
        myKey.set(79, myKey79);

        KeyProperties myKey80 = new KeyProperties();
        myKey80.code = 81;
        myKey80.label = "$" ;
        myKey80.showBox = false ;
        myKey80.showCustomBox = false ;
        myKey80.customBoxLayout = new String[] {} ;
        myKey80.showIcon = false ;
        myKey80.icon = "";
        myKey80.changeLayout = false ;
        myKey80.layout = "";
        myKey.set(80, myKey80);

        KeyProperties myKey81 = new KeyProperties();
        myKey81.code = 82;
        myKey81.label = "%" ;
        myKey81.showBox = false ;
        myKey81.showCustomBox = false ;
        myKey81.customBoxLayout = new String[] {} ;
        myKey81.showIcon = true ;
        myKey81.icon = "special_03_10_percentage";
        myKey81.changeLayout = false ;
        myKey81.layout = "";
        myKey.set(81, myKey81);

        KeyProperties myKey82 = new KeyProperties();
        myKey82.code = 83;
        myKey82.label = "\u2122" ;
        myKey82.showBox = false ;
        myKey82.showCustomBox = false ;
        myKey82.customBoxLayout = new String[] {} ;
        myKey82.showIcon = false ;
        myKey82.icon = "";
        myKey82.changeLayout = false ;
        myKey82.layout = "";
        myKey.set(82, myKey82);

        KeyProperties myKey83 = new KeyProperties();
        myKey83.code = 84;
        myKey83.label = "\u00A9" ;
        myKey83.showBox = false ;
        myKey83.showCustomBox = false ;
        myKey83.customBoxLayout = new String[] {} ;
        myKey83.showIcon = false ;
        myKey83.icon = "";
        myKey83.changeLayout = false ;
        myKey83.layout = "";
        myKey.set(83, myKey83);

        KeyProperties myKey84 = new KeyProperties();
        myKey84.code = 85;
        myKey84.label = "/" ;
        myKey84.showBox = false ;
        myKey84.showCustomBox = false ;
        myKey84.customBoxLayout = new String[] {} ;
        myKey84.showIcon = true ;
        myKey84.icon = "";
        myKey84.changeLayout = false ;
        myKey84.layout = "";
        myKey.set(84, myKey84);

        KeyProperties myKey85 = new KeyProperties();
        myKey85.code = 86;
        myKey85.label = "\\" ;
        myKey85.showBox = false ;
        myKey85.showCustomBox = false ;
        myKey85.customBoxLayout = new String[] {} ;
        myKey85.showIcon = true ;
        myKey85.icon = "bslash";
        myKey85.changeLayout = false ;
        myKey85.layout = "";
        myKey.set(85, myKey85);

        KeyProperties myKey86 = new KeyProperties();
        myKey86.code = 87;
        myKey86.label = "@" ;
        myKey86.showBox = false ;
        myKey86.showCustomBox = false ;
        myKey86.customBoxLayout = new String[] {} ;
        myKey86.showIcon = true ;
        myKey86.icon = "special_01_06_at";
        myKey86.changeLayout = false ;
        myKey86.layout = "";
        myKey.set(86, myKey86);

        KeyProperties myKey87 = new KeyProperties();
        myKey87.code = 88;
        myKey87.label = "&" ;
        myKey87.showBox = false ;
        myKey87.showCustomBox = false ;
        myKey87.customBoxLayout = new String[] {} ;
        myKey87.showIcon = true ;
        myKey87.icon = "special_01_08_and";
        myKey87.changeLayout = false ;
        myKey87.layout = "";
        myKey.set(87, myKey87);

        KeyProperties myKey88 = new KeyProperties();
        myKey88.code = 89;
        myKey88.label = "\u0931\u094d" ; //0950
        myKey88.showBox = false ;
        myKey88.showCustomBox = false ;
        myKey88.customBoxLayout = new String[] {} ;
        myKey88.showIcon = false ;
        myKey88.icon = "";
        myKey88.changeLayout = false ;
        myKey88.layout = "";
        myKey.set(88, myKey88);

//		KeyProperties myKey89 = new KeyProperties();
//		myKey89.code = 90;
//		myKey89.label = "\u00AE" ;
//		myKey89.showBox = false ;
//		myKey89.showCustomBox = false ;
//		myKey89.customBoxLayout = new String[] {} ;
//		myKey89.showIcon = false ;
//		myKey89.icon = "registered";
//		myKey89.changeLayout = false ;
//		myKey89.layout = "";
//		myKey.set(89, myKey89);

        KeyProperties myKey90 = new KeyProperties();
        myKey90.code = 91;
        myKey90.label = "~" ;
        myKey90.showBox = false ;
        myKey90.showCustomBox = false ;
        myKey90.customBoxLayout = new String[] {} ;
        myKey90.showIcon = false ;
        myKey90.icon = "";
        myKey90.changeLayout = false ;
        myKey90.layout = "";
        myKey.set(90, myKey90);

        KeyProperties myKey91 = new KeyProperties();
        myKey91.code = 92;
        myKey91.label = "<" ;
        myKey91.showBox = false ;
        myKey91.showCustomBox = false ;
        myKey91.customBoxLayout = new String[] {} ;
        myKey91.showIcon = true ;
        myKey91.icon = "special_05_06_leftangularbracket";
        myKey91.changeLayout = false ;
        myKey91.layout = "";
        myKey.set(91, myKey91);

        KeyProperties myKey92 = new KeyProperties();
        myKey92.code = 93;
        myKey92.label = ">" ;
        myKey92.showBox = false ;
        myKey92.showCustomBox = false ;
        myKey92.customBoxLayout = new String[] {} ;
        myKey92.showIcon = true ;
        myKey92.icon = "special_05_07_rightangularbracket";
        myKey92.changeLayout = false ;
        myKey92.layout = "";
        myKey.set(92, myKey92);

        KeyProperties myKey93 = new KeyProperties();
        myKey93.code = 94;
        myKey93.label = "^" ;
        myKey93.showBox = false ;
        myKey93.showCustomBox = false ;
        myKey93.customBoxLayout = new String[] {} ;
        myKey93.showIcon = false ;
        myKey93.icon = "";
        myKey93.changeLayout = false ;
        myKey93.layout = "";
        myKey.set(93, myKey93);

        KeyProperties myKey94 = new KeyProperties();
        myKey94.code = 95;
        myKey94.label = "\u0950" ;
        myKey94.showBox = false ;
        myKey94.showCustomBox = false ;
        myKey94.customBoxLayout = new String[] {} ;
        myKey94.showIcon = true ;
        myKey94.icon = "special_05_01_om";
        myKey94.changeLayout = false ;
        myKey94.layout = "";
        myKey.set(94, myKey94);

        KeyProperties myKey95 = new KeyProperties();
        myKey95.code = 96;
        myKey95.label = "\u005B" ;
        myKey95.showBox = false ;
        myKey95.showCustomBox = false ;
        myKey95.customBoxLayout = new String[] {} ;
        myKey95.showIcon = true ;
        myKey95.icon = "special_04_06_leftsquarebracket";
        myKey95.changeLayout = false ;
        myKey95.layout = "";
        myKey.set(95, myKey95);

        KeyProperties myKey96 = new KeyProperties();
        myKey96.code = 97;
        myKey96.label = "\u005D" ;
        myKey96.showBox = false ;
        myKey96.showCustomBox = false ;
        myKey96.customBoxLayout = new String[] {} ;
        myKey96.showIcon = true ;
        myKey96.icon = "special_04_07_rightsquarebracket";
        myKey96.changeLayout = false ;
        myKey96.layout = "";
        myKey.set(96, myKey96);

        KeyProperties myKey97 = new KeyProperties();
        myKey97.code = 98;
        myKey97.label = "\u093D" ;
        myKey97.showBox = false ;
        myKey97.showCustomBox = false ;
        myKey97.customBoxLayout = new String[] {} ;
        myKey97.showIcon = true ;
        myKey97.icon = "special_05_02_avagraha";
        myKey97.changeLayout = false ;
        myKey97.layout = "";
        myKey.set(97, myKey97);

        KeyProperties myKey98 = new KeyProperties();
        myKey98.code = 99;
        myKey98.label = "(" ;
        myKey98.showBox = false ;
        myKey98.showCustomBox = false ;
        myKey98.customBoxLayout = new String[] {} ;
        myKey98.showIcon = true ;
        myKey98.icon = "special_02_06_leftcurlybracket";
        myKey98.changeLayout = false ;
        myKey98.layout = "";
        myKey.set(98, myKey98);

        KeyProperties myKey99 = new KeyProperties();
        myKey99.code = 100;
        myKey99.label = ")" ;
        myKey99.showBox = false ;
        myKey99.showCustomBox = false ;
        myKey99.customBoxLayout = new String[] {} ;
        myKey99.showIcon = true ;
        myKey99.icon = "special_02_07_rightcurlybracket";
        myKey99.changeLayout = false ;
        myKey99.layout = "";
        myKey.set(99, myKey99);

        KeyProperties myKey104 = new KeyProperties();
        myKey104.code = 105;
        myKey104.label = "{" ;
        myKey104.showBox = false ;
        myKey104.showCustomBox = false ;
        myKey104.customBoxLayout = new String[] {} ;
        myKey104.showIcon = true ;
        myKey104.icon = "special_03_06_leftcurlybracket";
        myKey104.changeLayout = false ;
        myKey104.layout = "";
        myKey.set(104, myKey104);

        KeyProperties myKey105 = new KeyProperties();
        myKey105.code = 106;
        myKey105.label = "}" ;
        myKey105.showBox = false ;
        myKey105.showCustomBox = false ;
        myKey105.customBoxLayout = new String[] {} ;
        myKey105.showIcon = true ;
        myKey105.icon = "special_03_07_rightcurlybracket";
        myKey105.changeLayout = false ;
        myKey105.layout = "";
        myKey.set(105, myKey105);

        KeyProperties myKey129 = new KeyProperties(); //
        myKey129.code = 130;
        myKey129.label = "\u0901" ;
        myKey129.showBox = false ;
        myKey129.showCustomBox = false ;
        myKey129.customBoxLayout = new String[] {} ;
        myKey129.showIcon = true ;
        myKey129.icon = "special_01_01_chandrabindu";
        myKey129.changeLayout = false ;
        myKey129.layout = "";
        myKey.set(129, myKey129);

        KeyProperties myKey130 = new KeyProperties(); //
        myKey130.code = 131;
        myKey130.label = "\u093C" ;
        myKey130.showBox = false ;
        myKey130.showCustomBox = false ;
        myKey130.customBoxLayout = new String[] {} ;
        myKey130.showIcon = true ;
        myKey130.icon = "special_01_02_nukta";
        myKey130.changeLayout = false ;
        myKey130.layout = "";
        myKey.set(130, myKey130);

        KeyProperties myKey131 = new KeyProperties(); //
        myKey131.code = 132;
        myKey131.label = "\u0960" ;
        myKey131.showBox = false ;
        myKey131.showCustomBox = false ;
        myKey131.customBoxLayout = new String[] {} ;
        myKey131.showIcon = true ;
        myKey131.icon = "special_01_03_rri";
        myKey131.changeLayout = false ;
        myKey131.layout = "";
        myKey.set(131, myKey131);

        KeyProperties myKey132 = new KeyProperties(); //
        myKey132.code = 133;
        myKey132.label = "\u090B" ;
        myKey132.showBox = false ;
        myKey132.showCustomBox = false ;
        myKey132.customBoxLayout = new String[] {} ;
        myKey132.showIcon = true ;
        myKey132.icon = "special_01_04_ri";
        myKey132.changeLayout = false ;
        myKey132.layout = "";
        myKey.set(132, myKey132);

        KeyProperties myKey133 = new KeyProperties(); //
        myKey133.code = 134;
        myKey133.label = "\u0961" ;
        myKey133.showBox = false ;
        myKey133.showCustomBox = false ;
        myKey133.customBoxLayout = new String[] {} ;
        myKey133.showIcon = true ;
        myKey133.icon = "special_02_03_llri";
        myKey133.changeLayout = false ;
        myKey133.layout = "";
        myKey.set(133, myKey133);

        KeyProperties myKey134 = new KeyProperties(); //
        myKey134.code = 135;
        myKey134.label = "\u090C" ;
        myKey134.showBox = false ;
        myKey134.showCustomBox = false ;
        myKey134.customBoxLayout = new String[] {} ;
        myKey134.showIcon = true ;
        myKey134.icon = "special_02_04_lri";
        myKey134.changeLayout = false ;
        myKey134.layout = "";
        myKey.set(134, myKey134);

        KeyProperties myKey135 = new KeyProperties(); //
        myKey135.code = 1136;
        myKey135.label = "\u0924\u094D\u0930" ;
        myKey135.showBox = false ;
        myKey135.showCustomBox = false ;
        myKey135.customBoxLayout = new String[] {} ;
        myKey135.showIcon = true ;
        myKey135.icon = "special_05_04_tra";
        myKey135.changeLayout = false ;
        myKey135.layout = "";
        myKey.set(135, myKey135);

        KeyProperties myKey201 = new KeyProperties(); //
        myKey201.code = 202;
        myKey201.label = "~" ;
        myKey201.showBox = false ;
        myKey201.showCustomBox = false ;
        myKey201.customBoxLayout = new String[] {} ;
        myKey201.showIcon = true ;
        myKey201.icon = "special_05_11_button_other_characters";
        myKey201.changeLayout = false ;
        myKey201.layout = "";
        myKey.set(201, myKey201);


        /***************  Emoji Start     ********************/

        KeyProperties myKey136 = new KeyProperties();
        myKey136.code = 136;
        myKey136.label = "\uD83D\uDE05" ;   // emoji 1      //  "\uD83D\uDE0F"
        myKey136.showBox = false ;
        myKey136.showCustomBox = false ;
        myKey136.customBoxLayout = new String[] {} ;
        myKey136.showIcon = true ;
        //myKey136.icon = "letter_01_07_consonant_k";
        myKey136.changeLayout = true ;
        myKey136.layout = "";
        myKey.set(136, myKey136);

        KeyProperties myKey137 = new KeyProperties();
        myKey137.code = 137;
        myKey137.label = "\uD83D\uDE02" ;     // emoji 2
        myKey137.showBox = false ;
        myKey137.showCustomBox = false ;
        myKey137.customBoxLayout = new String[] {} ;
        myKey137.showIcon = true ;
        //myKey136.icon = "letter_01_07_consonant_k";
        myKey137.changeLayout = true ;
        myKey137.layout = "";
        myKey.set(137, myKey137);

        KeyProperties myKey138 = new KeyProperties();
        myKey138.code = 138;
        myKey138.label = "\uD83D\uDE0D" ;   //  emoji 3
        myKey138.showBox = false ;
        myKey138.showCustomBox = false ;
        myKey138.customBoxLayout = new String[] {} ;
        myKey138.showIcon = true ;
        //myKey136.icon = "letter_01_07_consonant_k";
        myKey138.changeLayout = true ;
        myKey138.layout = "";
        myKey.set(138, myKey138);

        KeyProperties myKey139 = new KeyProperties();
        myKey139.code = 139;
        myKey139.label = "\uD83E\uDD23" ;   //  emoji 4
        myKey139.showBox = false ;
        myKey139.showCustomBox = false ;
        myKey139.customBoxLayout = new String[] {} ;
        myKey139.showIcon = true ;
        //myKey136.icon = "letter_01_07_consonant_k";
        myKey139.changeLayout = true ;
        myKey139.layout = "";
        myKey.set(139, myKey139);

        KeyProperties myKey140 = new KeyProperties();
        myKey140.code = 140;
        myKey140.label = "\uD83D\uDE2D" ;   //  emoji 5
        myKey140.showBox = false ;
        myKey140.showCustomBox = false ;
        myKey140.customBoxLayout = new String[] {} ;
        myKey140.showIcon = true ;
        //myKey136.icon = "letter_01_07_consonant_k";
        myKey140.changeLayout = true ;
        myKey140.layout = "";
        myKey.set(140, myKey140);

        KeyProperties myKey141 = new KeyProperties();
        myKey141.code = 141;
        myKey141.label = "\uD83E\uDD23" ;   //  emoji 6
        myKey141.showBox = false ;
        myKey141.showCustomBox = false ;
        myKey141.customBoxLayout = new String[] {} ;
        myKey141.showIcon = true ;
        //myKey136.icon = "letter_01_07_consonant_k";
        myKey141.changeLayout = true ;
        myKey141.layout = "";
        myKey.set(141, myKey141);

        KeyProperties myKey142 = new KeyProperties();
        myKey142.code = 142;
        myKey142.label = "\uD83D\uDE18" ;   //  emoji 7
        myKey142.showBox = false ;
        myKey142.showCustomBox = false ;
        myKey142.customBoxLayout = new String[] {} ;
        myKey142.showIcon = true ;
        //myKey136.icon = "letter_01_07_consonant_k";
        myKey142.changeLayout = true ;
        myKey142.layout = "";
        myKey.set(142, myKey142);

        KeyProperties myKey143 = new KeyProperties();
        myKey143.code = 143;
        myKey143.label = "\uD83E\uDD23" ;   //  emoji 8
        myKey143.showBox = false ;
        myKey143.showCustomBox = false ;
        myKey143.customBoxLayout = new String[] {} ;
        myKey143.showIcon = true ;
        //myKey136.icon = "letter_01_07_consonant_k";
        myKey143.changeLayout = true ;
        myKey143.layout = "";
        myKey.set(143, myKey143);

        KeyProperties myKey144 = new KeyProperties();
        myKey144.code = 144;
        myKey144.label = "\uD83E\uDD23" ;   //  emoji 9
        myKey144.showBox = false ;
        myKey144.showCustomBox = false ;
        myKey144.customBoxLayout = new String[] {} ;
        myKey144.showIcon = true ;
        //myKey136.icon = "letter_01_07_consonant_k";
        myKey144.changeLayout = true ;
        myKey144.layout = "";
        myKey.set(144, myKey144);

        KeyProperties myKey145 = new KeyProperties();
        myKey145.code = 145;
        myKey145.label = "\uD83E\uDD23" ;   //  emoji 10
        myKey145.showBox = false ;
        myKey145.showCustomBox = false ;
        myKey145.customBoxLayout = new String[] {} ;
        myKey145.showIcon = true ;
        //myKey136.icon = "letter_01_07_consonant_k";
        myKey145.changeLayout = true ;
        myKey145.layout = "";
        myKey.set(145, myKey145);

        KeyProperties myKey146 = new KeyProperties();
        myKey146.code = 146;
        myKey146.label = "\uD83E\uDD23" ;   //  emoji 11
        myKey146.showBox = false ;
        myKey146.showCustomBox = false ;
        myKey146.customBoxLayout = new String[] {} ;
        myKey146.showIcon = true ;
        //myKey136.icon = "letter_01_07_consonant_k";
        myKey146.changeLayout = true ;
        myKey146.layout = "";
        myKey.set(146, myKey146);

        KeyProperties myKey147 = new KeyProperties();
        myKey147.code = 147;
        myKey147.label = "\uD83E\uDD23" ;   //  emoji 12
        myKey147.showBox = false ;
        myKey147.showCustomBox = false ;
        myKey147.customBoxLayout = new String[] {} ;
        myKey147.showIcon = true ;
        //myKey136.icon = "letter_01_07_consonant_k";
        myKey147.changeLayout = true ;
        myKey147.layout = "";
        myKey.set(147, myKey147);

        KeyProperties myKey148 = new KeyProperties();
        myKey148.code = 148;
        myKey148.label = "\uD83D\uDE02" ;     // emoji 13
        myKey148.showBox = false ;
        myKey148.showCustomBox = false ;
        myKey148.customBoxLayout = new String[] {} ;
        myKey148.showIcon = true ;
        //myKey136.icon = "letter_01_07_consonant_k";
        myKey148.changeLayout = true ;
        myKey148.layout = "";
        myKey.set(148, myKey148);

        KeyProperties myKey149 = new KeyProperties();
        myKey149.code = 149;
        myKey149.label = "\uD83D\uDE0D" ;   //  emoji 14
        myKey149.showBox = false ;
        myKey149.showCustomBox = false ;
        myKey149.customBoxLayout = new String[] {} ;
        myKey149.showIcon = true ;
        //myKey136.icon = "letter_01_07_consonant_k";
        myKey149.changeLayout = true ;
        myKey149.layout = "";
        myKey.set(149, myKey149);

        KeyProperties myKey150 = new KeyProperties();
        myKey150.code = 150;
        myKey150.label = "\uD83E\uDD23" ;   //  emoji 15
        myKey150.showBox = false ;
        myKey150.showCustomBox = false ;
        myKey150.customBoxLayout = new String[] {} ;
        myKey150.showIcon = true ;
        //myKey136.icon = "letter_01_07_consonant_k";
        myKey150.changeLayout = true ;
        myKey150.layout = "";
        myKey.set(150, myKey150);

        KeyProperties myKey174 = new KeyProperties();
        myKey174.code = 174;
        myKey174.label = "\uD83D\uDE2D" ;   //  emoji 16
        myKey174.showBox = false ;
        myKey174.showCustomBox = false ;
        myKey174.customBoxLayout = new String[] {} ;
        myKey174.showIcon = true ;
        //myKey136.icon = "letter_01_07_consonant_k";
        myKey174.changeLayout = true ;
        myKey174.layout = "";
        myKey.set(174, myKey174);

        KeyProperties myKey175 = new KeyProperties();
        myKey175.code = 175;
        myKey175.label = "\uD83E\uDD23" ;   //  emoji 17
        myKey175.showBox = false ;
        myKey175.showCustomBox = false ;
        myKey175.customBoxLayout = new String[] {} ;
        myKey175.showIcon = true ;
        //myKey136.icon = "letter_01_07_consonant_k";
        myKey175.changeLayout = true ;
        myKey175.layout = "";
        myKey.set(175, myKey175);

        KeyProperties myKey176 = new KeyProperties();
        myKey176.code = 176;
        myKey176.label = "\uD83D\uDE18" ;   //  emoji 18
        myKey176.showBox = false ;
        myKey176.showCustomBox = false ;
        myKey176.customBoxLayout = new String[] {} ;
        myKey176.showIcon = true ;
        //myKey136.icon = "letter_01_07_consonant_k";
        myKey176.changeLayout = true ;
        myKey176.layout = "";
        myKey.set(176, myKey176);

        KeyProperties myKey177 = new KeyProperties();
        myKey177.code = 177;
        myKey177.label = "\uD83E\uDD23" ;   //  emoji 19
        myKey177.showBox = false ;
        myKey177.showCustomBox = false ;
        myKey177.customBoxLayout = new String[] {} ;
        myKey177.showIcon = true ;
        //myKey136.icon = "letter_01_07_consonant_k";
        myKey177.changeLayout = true ;
        myKey177.layout = "";
        myKey.set(177, myKey177);

        KeyProperties myKey178 = new KeyProperties();
        myKey178.code = 178;
        myKey178.label = "\uD83E\uDD23" ;   //  emoji 20
        myKey178.showBox = false ;
        myKey178.showCustomBox = false ;
        myKey178.customBoxLayout = new String[] {} ;
        myKey178.showIcon = true ;
        //myKey136.icon = "letter_01_07_consonant_k";
        myKey178.changeLayout = true ;
        myKey178.layout = "";
        myKey.set(178, myKey178);

        KeyProperties myKey179 = new KeyProperties();
        myKey179.code = 179;
        myKey179.label = "\uD83E\uDD23" ;   //  emoji 21
        myKey179.showBox = false ;
        myKey179.showCustomBox = false ;
        myKey179.customBoxLayout = new String[] {} ;
        myKey179.showIcon = true ;
        //myKey136.icon = "letter_01_07_consonant_k";
        myKey179.changeLayout = true ;
        myKey179.layout = "";
        myKey.set(179, myKey179);

        KeyProperties myKey180 = new KeyProperties();
        myKey180.code = 180;
        myKey180.label = "\uD83E\uDD23" ;   //  emoji 22
        myKey180.showBox = false ;
        myKey180.showCustomBox = false ;
        myKey180.customBoxLayout = new String[] {} ;
        myKey180.showIcon = true ;
        //myKey136.icon = "letter_01_07_consonant_k";
        myKey180.changeLayout = true ;
        myKey180.layout = "";
        myKey.set(180, myKey180);

        KeyProperties myKey181 = new KeyProperties();
        myKey181.code = 181;
        myKey181.label = "\uD83D\uDE05" ;   // emoji 23      //  "\uD83D\uDE0F"
        myKey181.showBox = false ;
        myKey181.showCustomBox = false ;
        myKey181.customBoxLayout = new String[] {} ;
        myKey181.showIcon = true ;
        //myKey136.icon = "letter_01_07_consonant_k";
        myKey181.changeLayout = true ;
        myKey181.layout = "";
        myKey.set(181, myKey181);

        KeyProperties myKey182 = new KeyProperties();
        myKey182.code = 182;
        myKey182.label = "\uD83D\uDE02" ;     // emoji 24
        myKey182.showBox = false ;
        myKey182.showCustomBox = false ;
        myKey182.customBoxLayout = new String[] {} ;
        myKey182.showIcon = true ;
        //myKey136.icon = "letter_01_07_consonant_k";
        myKey182.changeLayout = true ;
        myKey182.layout = "";
        myKey.set(182, myKey182);

        KeyProperties myKey183 = new KeyProperties();
        myKey183.code = 183;
        myKey183.label = "\uD83D\uDE0D" ;   //  emoji 25
        myKey183.showBox = false ;
        myKey183.showCustomBox = false ;
        myKey183.customBoxLayout = new String[] {} ;
        myKey183.showIcon = true ;
        //myKey136.icon = "letter_01_07_consonant_k";
        myKey183.changeLayout = true ;
        myKey183.layout = "";
        myKey.set(183, myKey183);

        KeyProperties myKey184 = new KeyProperties();
        myKey184.code = 184;
        myKey184.label = "\uD83E\uDD23" ;   //  emoji 26
        myKey184.showBox = false ;
        myKey184.showCustomBox = false ;
        myKey184.customBoxLayout = new String[] {} ;
        myKey184.showIcon = true ;
        //myKey136.icon = "letter_01_07_consonant_k";
        myKey184.changeLayout = true ;
        myKey184.layout = "";
        myKey.set(184, myKey184);

        KeyProperties myKey185 = new KeyProperties();
        myKey185.code = 185;
        myKey185.label = "\uD83D\uDE2D" ;   //  emoji 27
        myKey185.showBox = false ;
        myKey185.showCustomBox = false ;
        myKey185.customBoxLayout = new String[] {} ;
        myKey185.showIcon = true ;
        //myKey136.icon = "letter_01_07_consonant_k";
        myKey185.changeLayout = true ;
        myKey185.layout = "";
        myKey.set(185, myKey185);

        KeyProperties myKey186 = new KeyProperties();
        myKey186.code = 186;
        myKey186.label = "\uD83E\uDD23" ;   //  emoji 28
        myKey186.showBox = false ;
        myKey186.showCustomBox = false ;
        myKey186.customBoxLayout = new String[] {} ;
        myKey186.showIcon = true ;
        //myKey136.icon = "letter_01_07_consonant_k";
        myKey186.changeLayout = true ;
        myKey186.layout = "";
        myKey.set(186, myKey186);

        KeyProperties myKey187 = new KeyProperties();
        myKey187.code = 187;
        myKey187.label = "\uD83D\uDE18" ;   //  emoji 29
        myKey187.showBox = false ;
        myKey187.showCustomBox = false ;
        myKey187.customBoxLayout = new String[] {} ;
        myKey187.showIcon = true ;
        //myKey136.icon = "letter_01_07_consonant_k";
        myKey187.changeLayout = true ;
        myKey187.layout = "";
        myKey.set(187, myKey187);

        KeyProperties myKey188 = new KeyProperties();
        myKey188.code = 188;
        myKey188.label = "\uD83E\uDD23" ;   //  emoji 30
        myKey188.showBox = false ;
        myKey188.showCustomBox = false ;
        myKey188.customBoxLayout = new String[] {} ;
        myKey188.showIcon = true ;
        //myKey136.icon = "letter_01_07_consonant_k";
        myKey188.changeLayout = true ;
        myKey188.layout = "";
        myKey.set(188, myKey188);

        KeyProperties myKey189 = new KeyProperties();
        myKey189.code = 189;
        myKey189.label = "\uD83E\uDD23" ;   //  emoji 31
        myKey189.showBox = false ;
        myKey189.showCustomBox = false ;
        myKey189.customBoxLayout = new String[] {} ;
        myKey189.showIcon = true ;
        //myKey136.icon = "letter_01_07_consonant_k";
        myKey189.changeLayout = true ;
        myKey189.layout = "";
        myKey.set(189, myKey189);

        KeyProperties myKey190 = new KeyProperties();
        myKey190.code = 190;
        myKey190.label = "\uD83E\uDD23" ;   //  emoji 32
        myKey190.showBox = false ;
        myKey190.showCustomBox = false ;
        myKey190.customBoxLayout = new String[] {} ;
        myKey190.showIcon = true ;
        //myKey136.icon = "letter_01_07_consonant_k";
        myKey190.changeLayout = true ;
        myKey190.layout = "";
        myKey.set(190, myKey190);

        KeyProperties myKey191 = new KeyProperties();
        myKey191.code = 191;
        myKey191.label = "\uD83E\uDD23" ;   //  emoji 33
        myKey191.showBox = false ;
        myKey191.showCustomBox = false ;
        myKey191.customBoxLayout = new String[] {} ;
        myKey191.showIcon = true ;
        //myKey136.icon = "letter_01_07_consonant_k";
        myKey191.changeLayout = true ;
        myKey191.layout = "";
        myKey.set(191, myKey191);

        KeyProperties myKey192 = new KeyProperties();
        myKey192.code = 192;
        myKey192.label = "\uD83E\uDD23" ;   //  emoji 34
        myKey192.showBox = false ;
        myKey192.showCustomBox = false ;
        myKey192.customBoxLayout = new String[] {} ;
        myKey192.showIcon = true ;
        //myKey136.icon = "letter_01_07_consonant_k";
        myKey192.changeLayout = true ;
        myKey192.layout = "";
        myKey.set(192, myKey192);

        KeyProperties myKey193 = new KeyProperties();
        myKey193.code = 193;
        myKey193.label = "\uD83D\uDE02" ;     // emoji 35
        myKey193.showBox = false ;
        myKey193.showCustomBox = false ;
        myKey193.customBoxLayout = new String[] {} ;
        myKey193.showIcon = true ;
        //myKey136.icon = "letter_01_07_consonant_k";
        myKey193.changeLayout = true ;
        myKey193.layout = "";
        myKey.set(193 ,myKey193);

        KeyProperties myKey194 = new KeyProperties();
        myKey194.code = 194;
        myKey194.label = "\uD83D\uDE0D" ;   //  emoji 36
        myKey194.showBox = false ;
        myKey194.showCustomBox = false ;
        myKey194.customBoxLayout = new String[] {} ;
        myKey194.showIcon = true ;
        //myKey136.icon = "letter_01_07_consonant_k";
        myKey194.changeLayout = true ;
        myKey194.layout = "";
        myKey.set(194, myKey194);

        KeyProperties myKey195 = new KeyProperties();
        myKey195.code = 195;
        myKey195.label = "\uD83E\uDD23" ;   //  emoji 37
        myKey195.showBox = false ;
        myKey195.showCustomBox = false ;
        myKey195.customBoxLayout = new String[] {} ;
        myKey195.showIcon = true ;
        //myKey136.icon = "letter_01_07_consonant_k";
        myKey195.changeLayout = true ;
        myKey195.layout = "";
        myKey.set(195, myKey195);

        KeyProperties myKey196 = new KeyProperties();
        myKey196.code = 196;
        myKey196.label = "\uD83D\uDE2D" ;   //  emoji 38
        myKey196.showBox = false ;
        myKey196.showCustomBox = false ;
        myKey196.customBoxLayout = new String[] {} ;
        myKey196.showIcon = true ;
        //myKey136.icon = "letter_01_07_consonant_k";
        myKey196.changeLayout = true ;
        myKey196.layout = "";
        myKey.set(196, myKey196);

        KeyProperties myKey197 = new KeyProperties();
        myKey197.code = 197;
        myKey197.label = "\uD83E\uDD23" ;   //  emoji 39
        myKey197.showBox = false ;
        myKey197.showCustomBox = false ;
        myKey197.customBoxLayout = new String[] {} ;
        myKey197.showIcon = true ;
        //myKey136.icon = "letter_01_07_consonant_k";
        myKey197.changeLayout = true ;
        myKey197.layout = "";
        myKey.set(197, myKey197);

        KeyProperties myKey198 = new KeyProperties();
        myKey198.code = 198;
        myKey198.label = "\uD83D\uDE18" ;   //  emoji 40
        myKey198.showBox = false ;
        myKey198.showCustomBox = false ;
        myKey198.customBoxLayout = new String[] {} ;
        myKey198.showIcon = true ;
        //myKey136.icon = "letter_01_07_consonant_k";
        myKey198.changeLayout = true ;
        myKey198.layout = "";
        myKey.set(198, myKey198);

        KeyProperties myKey199 = new KeyProperties();
        myKey199.code = 199;
        myKey199.label = "\uD83E\uDD23" ;   //  emoji 41
        myKey199.showBox = false ;
        myKey199.showCustomBox = false ;
        myKey199.customBoxLayout = new String[] {} ;
        myKey199.showIcon = true ;
        //myKey136.icon = "letter_01_07_consonant_k";
        myKey199.changeLayout = true ;
        myKey199.layout = "";
        myKey.set(199, myKey199);

        KeyProperties myKey206 = new KeyProperties();
        myKey206.code = 206;
        myKey206.label = "\uD83E\uDD23" ;   //  emoji 42
        myKey206.showBox = false ;
        myKey206.showCustomBox = false ;
        myKey206.customBoxLayout = new String[] {} ;
        myKey206.showIcon = true ;
        //myKey136.icon = "letter_01_07_consonant_k";
        myKey206.changeLayout = true ;
        myKey206.layout = "";
        myKey.set(206, myKey206);

        KeyProperties myKey207 = new KeyProperties();
        myKey207.code = 207;
        myKey207.label = "\uD83E\uDD23" ;   //  emoji 43
        myKey207.showBox = false ;
        myKey207.showCustomBox = false ;
        myKey207.customBoxLayout = new String[] {} ;
        myKey207.showIcon = true ;
        //myKey136.icon = "letter_01_07_consonant_k";
        myKey207.changeLayout = true ;
        myKey207.layout = "";
        myKey.set(207, myKey207);

        KeyProperties myKey208 = new KeyProperties();
        myKey208.code = 208;
        myKey208.label = "\uD83E\uDD23" ;   //  emoji 44
        myKey208.showBox = false ;
        myKey208.showCustomBox = false ;
        myKey208.customBoxLayout = new String[] {} ;
        myKey208.showIcon = true ;
        //myKey136.icon = "letter_01_07_consonant_k";
        myKey208.changeLayout = true ;
        myKey208.layout = "";
        myKey.set(208, myKey208);

        KeyProperties myKey209 = new KeyProperties();
        myKey209.code = 209;
        myKey209.label = "\uD83E\uDD23" ;   //  emoji 45
        myKey209.showBox = false ;
        myKey209.showCustomBox = false ;
        myKey209.customBoxLayout = new String[] {} ;
        myKey209.showIcon = true ;
        //myKey136.icon = "letter_01_07_consonant_k";
        myKey209.changeLayout = true ;
        myKey209.layout = "";
        myKey.set(209, myKey209);

        KeyProperties myKey210 = new KeyProperties();
        myKey210.code = 210;
        myKey210.label = "\uD83E\uDD23" ;   //  emoji 46
        myKey210.showBox = false ;
        myKey210.showCustomBox = false ;
        myKey210.customBoxLayout = new String[] {} ;
        myKey210.showIcon = true ;
        //myKey136.icon = "letter_01_07_consonant_k";
        myKey210.changeLayout = true ;
        myKey210.layout = "";
        myKey.set(210, myKey210);

        KeyProperties myKey211 = new KeyProperties();
        myKey211.code = 211;
        myKey211.label = "\uD83E\uDD23" ;   //  emoji 47
        myKey211.showBox = false ;
        myKey211.showCustomBox = false ;
        myKey211.customBoxLayout = new String[] {} ;
        myKey211.showIcon = true ;
        //myKey136.icon = "letter_01_07_consonant_k";
        myKey211.changeLayout = true ;
        myKey211.layout = "";
        myKey.set(211, myKey211);

        KeyProperties myKey212 = new KeyProperties();
        myKey212.code = 212;
        myKey212.label = "\uD83E\uDD23" ;   //  emoji 48
        myKey212.showBox = false ;
        myKey212.showCustomBox = false ;
        myKey212.customBoxLayout = new String[] {} ;
        myKey212.showIcon = true ;
        //myKey136.icon = "letter_01_07_consonant_k";
        myKey212.changeLayout = true ;
        myKey212.layout = "";
        myKey.set(212, myKey212);

        KeyProperties myKey213 = new KeyProperties();
        myKey213.code = 213;
        myKey213.label = "\uD83E\uDD23" ;   //  emoji 49
        myKey213.showBox = false ;
        myKey213.showCustomBox = false ;
        myKey213.customBoxLayout = new String[] {} ;
        myKey213.showIcon = true ;
        //myKey136.icon = "letter_01_07_consonant_k";
        myKey213.changeLayout = true ;
        myKey213.layout = "";
        myKey.set(213, myKey213);

        KeyProperties myKey214 = new KeyProperties();
        myKey214.code = 214;
        myKey214.label = "\uD83E\uDD23" ;   //  emoji 50
        myKey214.showBox = false ;
        myKey214.showCustomBox = false ;
        myKey214.customBoxLayout = new String[] {} ;
        myKey214.showIcon = true ;
        //myKey136.icon = "letter_01_07_consonant_k";
        myKey214.changeLayout = true ;
        myKey214.layout = "";
        myKey.set(214, myKey214);

        KeyProperties myKey215 = new KeyProperties();
        myKey215.code = 215;
        myKey215.label = "\uD83E\uDD23" ;   //  emoji 51
        myKey215.showBox = false ;
        myKey215.showCustomBox = false ;
        myKey215.customBoxLayout = new String[] {} ;
        myKey215.showIcon = true ;
        //myKey136.icon = "letter_01_07_consonant_k";
        myKey215.changeLayout = true ;
        myKey215.layout = "";
        myKey.set(215, myKey215);

        KeyProperties myKey216 = new KeyProperties();
        myKey216.code = 216;
        myKey216.label = "\uD83E\uDD23" ;   //  emoji 52
        myKey216.showBox = false ;
        myKey216.showCustomBox = false ;
        myKey216.customBoxLayout = new String[] {} ;
        myKey216.showIcon = true ;
        //myKey136.icon = "letter_01_07_consonant_k";
        myKey216.changeLayout = true ;
        myKey216.layout = "";
        myKey.set(216, myKey216);

        KeyProperties myKey217 = new KeyProperties();
        myKey217.code = 217;
        myKey217.label = "\uD83E\uDD23" ;   //  emoji 53
        myKey217.showBox = false ;
        myKey217.showCustomBox = false ;
        myKey217.customBoxLayout = new String[] {} ;
        myKey217.showIcon = true ;
        //myKey136.icon = "letter_01_07_consonant_k";
        myKey217.changeLayout = true ;
        myKey217.layout = "";
        myKey.set(217, myKey217);

        KeyProperties myKey218 = new KeyProperties();
        myKey218.code = 218;
        myKey218.label = "\uD83E\uDD23" ;   //  emoji 54
        myKey218.showBox = false ;
        myKey218.showCustomBox = false ;
        myKey218.customBoxLayout = new String[] {} ;
        myKey218.showIcon = true ;
        //myKey136.icon = "letter_01_07_consonant_k";
        myKey218.changeLayout = true ;
        myKey218.layout = "";
        myKey.set(218, myKey218);

        KeyProperties myKey219 = new KeyProperties();
        myKey219.code = 219;
        myKey219.label = "\uD83E\uDD23" ;   //  emoji 55
        myKey219.showBox = false ;
        myKey219.showCustomBox = false ;
        myKey219.customBoxLayout = new String[] {} ;
        myKey219.showIcon = true ;
        //myKey136.icon = "letter_01_07_consonant_k";
        myKey219.changeLayout = true ;
        myKey219.layout = "";
        myKey.set(219, myKey219);
    }

    @Override @SuppressLint("UseSparseArrays")
    public HashMap<Integer, KeyProperties> hashThis()
    {
        HashMap<Integer, KeyProperties> hashed = new HashMap<Integer, KeyProperties>();
        for (int i=0; i<nKeys; i++)
        {
            KeyProperties key = myKey.get(i);
            hashed.put(key.code, key);
        }
        return hashed;
    }
}