import java.util.Scanner;
public class main{
    public static String encode(String input) {
        StringBuilder encoded = new StringBuilder();
        for (int i=0; i<input.length();i++) {
            char ch = input.charAt(i);
            if (Character.isLetter(ch)) {
                char base = Character.isLowerCase(ch) ? 'a' : 'A';
                ch = (char) ((ch - base + 3) % 26 + base);
            }
            encoded.append(ch);
        }
        return encoded.toString();
    }
    public static String decode(String input) {
        StringBuilder decoded = new StringBuilder();
        for (int i=0; i<input.length();i++) {
            char ch = input.charAt(i);
            if (Character.isLetter(ch)) {
                char base = Character.isLowerCase(ch) ? 'a' : 'A';
                ch = (char) ((ch - base - 3 + 26) % 26 + base);
            }
            decoded.append(ch);
        }
        return decoded.toString();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to be encoded and decoded:");
        String input = scanner.nextLine();
        String encoded = encode (input);
        String decoded = decode (encoded);
        System.out.println("Given string: " + input);
        System.out.println("Encoded string: " + encoded);
        System.out.println("Decoded string: " + decoded);
    }
}