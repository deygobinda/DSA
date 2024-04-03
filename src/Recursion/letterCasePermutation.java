package Recursion;


public class letterCasePermutation {
    public static void generateSubstrings(String ip, String op, int start) {
        if (start == ip.length()) {
            System.out.print(op + " "); // Print the complete substring
            return;
        }

        char op1 = ip.charAt(start);
        if (Character.isDigit(op1)) {
            generateSubstrings(ip, op + op1, start + 1);
        } else {
            char op2;
            if (op1 >= 97) {
                op2 = (char) (op1 - 32);
            } else {
                op2 = (char) (op1 + 32);
            }
            // Include the current character
            generateSubstrings(ip, op + op1, start + 1);

            // Exclude the current character (explore other possibilities)
            generateSubstrings(ip, op + op2, start + 1);

        }


    }

    public static void main(String[] args) {
        String str = "A1b24G53S";
        generateSubstrings(str, "", 0);
    }
}
