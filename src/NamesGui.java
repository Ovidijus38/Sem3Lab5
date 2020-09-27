import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.EventHandler;
import java.util.Arrays;

public class NamesGui {

    JButton longestButton, searchButton;
    JTextField nameField;
    JFrame jFrameWindow;
    JLabel infoLabel;

    String []names = new String[5];
    int i=0;

    public NamesGui()
    {
        jFrameWindow = new JFrame("Student Names");
        FlowLayout flowLayout = new FlowLayout();
        jFrameWindow.setLayout(flowLayout);
        jFrameWindow.setSize(500, 100);
        jFrameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel nameLabel = new JLabel("Name");
        jFrameWindow.add(nameLabel);
        nameField = new JTextField(20);
        jFrameWindow.add(nameField);

        infoLabel = new JLabel("The names arrays currently empty! Add names using text - field above");
        jFrameWindow.add(infoLabel);

        EventHandler handler = new EventHandler();
        nameField.addActionListener(handler);
        jFrameWindow.setVisible(true);


    }

    public static void main(String[] args) {

        NamesGui guiApp = new NamesGui();

    }

    private class EventHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if(e.getSource() == nameField && i<=4)
            {
                names[i] = nameField.getText();
                infoLabel.setText("Name added " + (4 - i) + " slots of array remain empty ");
                nameField.setText("");
                i++;

                if(i == 5)
                {
                    JOptionPane.showMessageDialog(null,"Names array now full to find longest name or search this array hit return ", "Array Full",JOptionPane.INFORMATION_MESSAGE);
                    infoLabel.setVisible(false);

                    searchButton = new JButton("Search");
                    jFrameWindow.add(searchButton);

                    longestButton = new JButton("Find longest name");
                    jFrameWindow.add(longestButton);
                    EventHandler handler = new EventHandler();
                    longestButton.addActionListener(handler);
                    searchButton.addActionListener(handler);
                }
            }
            else if(e.getSource() == searchButton)
            {
                Arrays.sort(names);
                String name = nameField.getText();

                if(binarySearch(names, name))
                    JOptionPane.showMessageDialog(null,"The name you searched for " + name + " , was found!","Name Found",JOptionPane.INFORMATION_MESSAGE);
                else
                    JOptionPane.showMessageDialog(null,"The name you searched for, " + name + ", was not found!","Name not Found!",JOptionPane.INFORMATION_MESSAGE);

            }
            else if(e.getSource() == longestButton)
            {
                String longest = names[0];

                for(int i=1; i<=4; i++)
                    if(names[i].length() > longest.length())
                        longest = names[i];

                    JOptionPane.showMessageDialog(null,"The longest found is " + longest,"Longest name",JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
    private static boolean binarySearch(String []names, String name)
    {
        int higherSub = name.length() - 1, lowerSub=0, middleSub;

        while(lowerSub <= higherSub)
        {
            middleSub = (higherSub + lowerSub) / 2;

            if(names[middleSub].compareTo(name) < 0)
                lowerSub = middleSub + 1;
            else if(names[middleSub].compareTo(name) > 0)
                higherSub = middleSub - 1;
            else
                return true;
        }
        return false;
    }
}
