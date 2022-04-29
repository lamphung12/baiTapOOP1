package StringRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateNameClass {
    private final String CLASS_REGEX = "^[C|A|P]+[\\d{4,}]+[G|H|I|K|L|M]$";

    public ValidateNameClass() {
    }
    public boolean check(String chuoi){
        Pattern pattern = Pattern.compile(CLASS_REGEX);
        Matcher matcher = pattern.matcher(chuoi);
        return matcher.matches();
    }
    public static final String[] vali =new String[]{ "C0000G","B555G","PA126G"};

    public static void main(String[] args) {
        ValidateNameClass validateNameClass = new ValidateNameClass();
        for (String st :vali) {
            boolean value = validateNameClass.check(st);
            System.out.println(" Ktra value : " + value );
        }
    }


}
