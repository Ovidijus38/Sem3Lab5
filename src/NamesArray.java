import javax.swing.*;
import java.util.Arrays;

public class NamesArray {
    public static void main(String[] args) {

        String []names = new String[5];
        String longestName ="";
        int totalCharacters = 0;

        populateArray(names);

        for(int i=0; i<names.length; i++)
        {
            if(names[i].length() > longestName.length())
                longestName = names[i];

            totalCharacters += names[i].length();
        }

        Arrays.sort(names);

        JOptionPane.showMessageDialog(null,"The longest name is " + longestName +
                                                                 "\nAverage characters per name is " + String.format("%.0f", ((float)totalCharacters/ names.length)) +
                                                                 "\nThe array sorted in ascending order is : \n\n" + Arrays.toString(names), "Results" ,JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);

    }

    public static void populateArray(String[] names)
    {
        for(int i=0; i<names.length; i++)
        {
            names[i] = JOptionPane.showInputDialog("Please enter the name of the person " + (i+1));
        }
    }
}
