import java.util.Arrays;

public class booleanASCII {

    public static void main(String[] args) {

        exercise();
        indices();
    }

    public static boolean exercise() {
        //Check if the numeric equivalents of letters 'A', 'G', 'X' from the ASCII table are stored in 'numbers' array.
        // If so, match them a 'true' or 'false' value. Then find the numbers of indices which store arguments of these letters from the ASCII table
        int[] numbers = {82, 89, 74, 67, 74, 78, 84, 80, 69, 75, 65, 78, 90, 87, 75, 86, 68, 78, 72, 89, 67, 84, 69, 71, 66, 71, 88, 74, 80, 73, 77, 77, 90, 67, 69, 85, 89, 81, 85, 84, 84, 67, 79, 66, 72, 74, 82, 83, 68, 89, 73};
        boolean isA = false;
        boolean isG = false;
        boolean isX = false;
        int numberOf65 = 0;
        int numberOf71 = 0;
        int numberOf88 = 0;


        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] == 65) {             // Number '65' is an argument for whom is matched letter 'A' in the ASCII table
                isA = true;
                numberOf65++;
            }
            if (numbers[i] == 71) {             // Number '71' is an argument for whom is matched letter 'G' in the ASCII table
                isG = true;
                numberOf71++;
            }
            if (numbers[i] == 88) {             // Number '88' is an argument for whom is matched letter 'X' in the ASCII table
                isX = true;
                numberOf88++;
            }
        }


        System.out.println("Integer value of a letter A from the ASCII table is an element of an array 'numbers': " + isA);
        System.out.println("Integer value of a letter G from the ASCII table is an element of an array 'numbers': " + isG);
        System.out.println("Integer value of a letter X from the ASCII table is an element of an array 'numbers': " + isX);
        System.out.println("The number of occurrences of a number 65: " + numberOf65);
        System.out.println("The number of occurrences of a number 71: " + numberOf71);
        System.out.println("The number of occurrences of a number 88: " + numberOf88);
        return isA && isG && isX;
    }


    public static void indices() {
            // In this method we will find the numbers of indices of a "numbers" array in which are stored numeric values of letters 'A', 'G' and 'X'
            // Appropriated 's-outs' from the previous method will make it easy.

        int[] numbers = {82, 89, 74, 67, 74, 78, 84, 80, 69, 75, 65, 78, 90, 87, 75, 86, 68, 78, 72, 89, 67, 84, 69, 71, 66, 71, 88, 74, 80, 73, 77, 77, 90, 67, 69, 85, 89, 81, 85, 84, 84, 67, 79, 66, 72, 74, 82, 83, 68, 89, 73};
        int k = 0;    //We have to initialize two different variables for numbers of indices from a "numbers" array which store a number "71".
        int l = 1;
        int[] indicesOf65 = new int[k + l];
        int[] indicesOf71 = new int[k + 2*l];
        int[] indicesOf88 = new int[k + l];

        for (int j = 0; j < numbers.length; j++) {                      //In a loop we create conditions for two different variables 'j' and 'i' also.
            for (int i = 0; (i < numbers.length) && (j != i); i++) {

                if (numbers[i] == 71 && numbers[j] == 71) {
                        indicesOf71[k] = i;
                        indicesOf71[l] = j;
                }
                if (numbers[i] == 65) {
                        indicesOf65[k] = i;
                    }
                if (numbers[i] == 88) {
                        indicesOf88[k] = i;
                    }
                }
            }

            System.out.println();
            System.out.println("The number of an index of an array 'numbers' which in occurs a number 65: " + Arrays.toString(indicesOf65));
            System.out.println("The numbers of indices of an array 'numbers' which in occurs a number 71: " + Arrays.toString(indicesOf71)); // Here we can see in which indices of a "numbers" array is stored a number "71"
            System.out.println("The number of an index of an array 'numbers' which in occurs a number 88: " + Arrays.toString(indicesOf88));


    }

}
