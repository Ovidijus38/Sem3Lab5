import javax.swing.*;
import java.util.Arrays;

public class RandomArray {
    public static void main(String[] args) {

        int []numbers = new int[10];
        int over100 = 0;

        populateArray(numbers);

        String output = "The initial content of the array is " + Arrays.toString(numbers);

        Arrays.sort(numbers);

        for(int i=0; i<10; i++)
            if(numbers[i] > 100)
                over100++;

            output += "\nThe percentage of values that exceed 100 is : " + over100 * 10 + "%" +
                      "\nThe content of the array after sorting is : " + Arrays.toString(numbers);


        JOptionPane.showMessageDialog(null,output,"Array Stats",JOptionPane.INFORMATION_MESSAGE);
    }
    public static void populateArray(int[] numbers)
    {
        for(int i=0; i<10; i++)
            numbers[i] = (int)(Math.random() * 100) + 1;
    }
}
