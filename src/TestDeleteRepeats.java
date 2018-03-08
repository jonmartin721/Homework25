import java.util.Arrays;

public class TestDeleteRepeats {

    public static void main(String[] args) {

        //creating an array just like the problem suggests
        char[] partialArray = new char[10];
        partialArray[0] = 'a';
        partialArray[1] = 'b';
        partialArray[2] = 'a';
        partialArray[3] = 'c';
        int usedSize = 4;

        //print before info
        System.out.println("Size before deleting repeats: " + usedSize);
        System.out.println("Values before: ");
        for (int i = 0 ; i < usedSize; i ++) {
            System.out.print(partialArray[i] + " ");
        }

        //print after info
        usedSize = deleteRepeats(partialArray, usedSize);
        System.out.println("Size after deleting repeats: " + usedSize);
        System.out.println("Values after: ");
        for (int i = 0 ; i < usedSize; i ++) {
            System.out.print(partialArray[i] + " ");
        }

    }

    public static int deleteRepeats(char[] partialArray, int size) {

        //initially, usedSize will be the same as size passed to it
        int usedSize = size;

        //go through the array element by element
        for (int i = 0; i < usedSize; i ++) {

            char leftChar = partialArray[i];

            //go through and check if there are any duplicates
            for (int j = i + 1; j < usedSize; j ++) { //initialized j as i + 1 so that it won't scan backwards and waste time

                char rightChar = partialArray[j];

                //if there is a duplicate
                if (rightChar == leftChar) {

                    partialArray[rightChar] = '\u0000'; //puts the null character into the "searching" character index
                    

                }

            }



        }




        return usedSize;
    }

}
