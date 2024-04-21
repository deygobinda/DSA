package Trees;

public class BengaliCharacters {
    public static void main(String[] args) {

        int startCode = 0x0980;
        int endCode = 0x09FF;


        for (int i = startCode; i <= endCode; i++) {
            char bengaliChar = (char) i;
            System.out.print(bengaliChar + " ");
        }
    }
}