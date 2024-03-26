package Recursion;

class generateSubstrings {

    public static void generateSubstrings(String ip, String op, int start) {
        if (start == ip.length()) {
            System.out.print(op + " "); // Print the complete substring
            return;
        }

        // Include the current character
        generateSubstrings(ip, op + ip.charAt(start), start + 1);

        // Exclude the current character (explore other possibilities)
        generateSubstrings(ip, op, start + 1);
    }

    public static void main(String[] args) {
        String str = "abc";
        generateSubstrings(str, "", 0);
    }
}
