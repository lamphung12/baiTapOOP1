package StringRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateEmail {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String EMAIL_REGEX = "^[\\w]+[\\w]*@[\\w]+(\\.[\\w]+)$";

    public ValidateEmail() {
        pattern = Pattern.compile(EMAIL_REGEX);
    }
    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
class Main{
        public static final String[] validEmail = new String[] { "a@gmail.com", "ab@yahoo.com", "abc@hotmail.com" };
        public static final String[] invalidEmail = new String[] { "@gmail.com", "ab@gmail.", "@#abc@gmail.com" };

        public static void main(String args[]) {
            ValidateEmail emailExample = new ValidateEmail();
            for (String email : validEmail) {
                boolean valid = emailExample.validate(email);
                System.out.println("Email is " + email +" is valid: "+ valid);
            }
            for (String email : invalidEmail) {
                boolean valid = emailExample.validate(email);
                System.out.println("Email is " + email +" is valid: "+ valid);
            }
    }
}
