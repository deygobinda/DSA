package Recursion;

public class permutationCaseChange {
    public static void generateSubstrings(String ip, String op, int start) {
        if (start == ip.length()) {
            System.out.print(op + " "); // Print the complete substring
            return;
        }
        char small = ip.charAt(start);
        char capital =(char) (ip.charAt(start) - 32);

        // Include the current character
        generateSubstrings(ip, op +small, start + 1);

        // Exclude the current character (explore other possibilities)
        generateSubstrings(ip, op+capital, start + 1);
    }

    public static void main(String[] args) {
        String str = "ab";
        generateSubstrings(str, "", 0);
    }
}
