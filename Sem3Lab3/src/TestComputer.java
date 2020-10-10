import javax.swing.*;

public class TestComputer {
    public static void main(String[] args) {

        String output = "";

        ComputerObject c1 = new ComputerObject();

        output += "Calling the no - argument Computer constructor. " +
                  "The first Computer object details are : \n\n" +
                  "Manufacturer: " + c1.toString();

        ComputerObject c2 = new ComputerObject("Alienware","Laptop",3.25,16,550.99);

        ComputerObject c3 = new ComputerObject("Pear","Desktop",2.9,12,865.00);

        c2.setPrice(-500);
        c2.setSpeed(-3.15);
        c3.setRam(-8);

        output += "\n\nCalling the multi - argument Computer constructor. " +
                  "\n\nThe second Computer object details are :\n " + c2.toString() +
                  "\n\nThe third computer objects details are : \n " + c3.toString();

        JOptionPane.showMessageDialog(null,output,"Computer Object Data",JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
