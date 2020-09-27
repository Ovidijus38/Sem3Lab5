import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumbersGUI {

    JLabel jLabelLargest, jLabelSmallest;
    float largest = -1e38f, smallest = 1e38f;
    JTextField jTextField;

    public NumbersGUI()
    {
        JFrame jFrameWindow = new JFrame("Numbers App");
        FlowLayout flowLayout = new FlowLayout();
        jFrameWindow.setLayout(flowLayout);
        jFrameWindow.setSize(500,150);
        jFrameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel jLabelPromt = new JLabel("Please enter your number here: ");
        jLabelLargest = new JLabel("No numbers entered yet");
        jLabelSmallest  = new JLabel();
        jLabelSmallest = new JLabel();

        jTextField = new JTextField(20);

        jFrameWindow.add(jLabelPromt);
        jFrameWindow.add(jTextField);
        jFrameWindow.add(jLabelLargest);
        jFrameWindow.add(jLabelSmallest);

        jTextField.addActionListener(new TextFieldEventHandler());

        jFrameWindow.setVisible(true);
    }

    public static void main(String[] args) {

        NumbersGUI app = new NumbersGUI();
    }

    private class TextFieldEventHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            float number;
            String numberString;

            if(jTextField.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null,"You must enter something!!!","Error",JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                numberString = jTextField.getText();
                jTextField.setText("");
                number = Float.parseFloat(numberString);

                if(number > largest)
                    largest = number;

                if(number < smallest)
                    smallest = number;

                jLabelLargest.setText("Largest number so far is : " + largest);
                jLabelSmallest.setText("Smallest number so far is : " + smallest);
            }
        }
    }
}
