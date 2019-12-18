package common.helpers;

public class StringHelper {

    public static boolean isNullOrEmpty(String s) {
        return s == null || s.length() == 0;
    }

    public static int charCount(String s) {return s.length();}

    public static boolean longAssString(String s)
    { if(s.length() > 100){
        return true;
    } else
        return false;
    }

    public static int indexChar(String s, char i) {return s.indexOf(i);}

}
