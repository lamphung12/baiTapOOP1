package StringRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValiDateSoDienThoai {
    private final String SDT_REGEX = "^\\d{2}-\\d{9}$";

    public ValiDateSoDienThoai() {
    }
    public boolean check(String chuoi){
        Pattern pattern = Pattern.compile(SDT_REGEX);
        Matcher matcher = pattern.matcher(chuoi);
        return matcher.matches();
    }
    public static final String[] vali =new String[]{ "23-123456789","B5-2324355","PA-123445678"};
    public static void main(String[] args) {
        ValiDateSoDienThoai sdt = new ValiDateSoDienThoai();
        for (String st :vali) {
            boolean value = sdt.check(st);
            System.out.println(" Ktra value : " + value );
        }
    }
}
