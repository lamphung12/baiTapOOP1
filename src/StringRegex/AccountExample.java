package StringRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountExample {
    private final String Account_Regex ="^[_a-z0-9]{6,}$";

    public AccountExample() {
    }
    public boolean valiDate(String date){
        Pattern pattern = Pattern.compile(Account_Regex);
        Matcher matcher = pattern.matcher(date);
        return matcher.matches();
    }

    public static final String [] validAccount =new String[] {"123abc_", "_abc123", "______", "123456","abcdefgh" };
    public static final String[] invalidAccount = new String[] { ".@", "12345", "1234_", "abcde" };
    public static void main(String[] args) {
      AccountExample acc = new AccountExample();
        for (String acc1:validAccount) {
            boolean value = acc.valiDate(acc1);
            System.out.println("acc1 : " +acc1 + "value:  "+value );
        }
        for (String acc1:invalidAccount) {
            boolean value = acc.valiDate(acc1);
            System.out.println("acc1:  " +acc1 + "value:  "+value );
        }



    }
}
