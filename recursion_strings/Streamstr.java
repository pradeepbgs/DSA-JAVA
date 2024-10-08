package recursion_strings;

public class Streamstr {
    public static void main(String[] args) {
        String ans = skip("baccad");
        System.out.println(ans);
    }

    static String skip(String up){
        if (up.isEmpty()) {
            return "";
        }

        char ch = up.charAt(0);

        if (ch == 'a') {
            return skip(up.substring(1));
        } else {
            return ch + skip(up.substring(1));
        }
    }

}
