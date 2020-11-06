import javax.swing.*;

public class TestComputer {
    public static void main(String[] args) {
        String output = "";

        ComputerObject c1 = new ComputerObject();

        output += "Calling the no-argument Computer constructor. " +
                "The first Computer object details are: \n\n" + c1.toString();

        ComputerObject c2 = new ComputerObject("Dell","Laptop",3.25,16,550.99);

        c2.setSpeed(-3.15);

        output += "\n\nCalling the multi-argument Computer constructor. " +
                "The second Computer object details are: \n\n" + c2.toString();

        ComputerObject c3 = new ComputerObject("Apple","Tablet",3.65,-16,-500.25);

        output += "\n\nCalling the multi-argument Computer constructor. " +
                "The third Computer object details are: \n\n" + c3.toString();

        JOptionPane.showMessageDialog(null,output,"Computer Object Data",
                JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
