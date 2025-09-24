public class WizardsMirror {
    static String reverseString(String s) {
        if (s.length() == 0) return "";
        return reverseString(s.substring(1)) + s.charAt(0);
    }

    public static void main(String[] args) {
        String s = "hello";
        System.out.println(reverseString(s));
    }
}
