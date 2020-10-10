import javax.swing.*;

public class TestBook {
    public static void main(String[] args) {

        String output = "";

        BookObject b1 = new BookObject();

        output += "Calling the no - argument Book constructor. " +
                "\nThe first book object details are : \n" +
                  b1.toString();

        BookObject b2 = new BookObject("Da Vinci Code", "199339", 34.50,500 );

        output += "\n\nCalling the multi - argument Book constructor. " +
                "\nThe second book object details are : \n" +
                b2.toString();

        String title = JOptionPane.showInputDialog("Please enter the title of your favourite book");

        double price = Double.parseDouble(JOptionPane.showInputDialog("Please enter the price of your favourite book"));

        String ISBN = JOptionPane.showInputDialog("Please enter ISBN of your book: ");

        int pages = Integer.parseInt(JOptionPane.showInputDialog("Please enter number of pages of your book:"));

        BookObject b3 = new BookObject(title,ISBN,price,pages);

        output += "\n\nCalling the multi - argument Book constructor. " +
                "\nThe third book object details are : \n" +
                b3.toString();

        JOptionPane.showMessageDialog(null,output,"Computer Object Data",JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
