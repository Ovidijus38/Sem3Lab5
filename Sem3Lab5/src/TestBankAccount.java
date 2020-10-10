import javax.swing.*;

public class TestBankAccount {
    public static void main(String[] args) {

        String output ="";

        BankAccount acc1 = new BankAccount();

        output += "Calling the no - argument Bank Account constructor. \nThe first Bank Account object details are : " +
                "\n" + acc1.toString();

        BankAccount acc2 = new BankAccount("Richy Rich",0.75);

        output += "\n\nCalling the multi - argument Bank Account constructor. \nThe second Bank Account object details are : " +
                "\n" + acc2.toString();

        BankAccount.setInterestRate(0.5);

        output += "\n\nThe first Bank Account object details are : " +
                "\n" + acc1.toString();

        output += "\n\nThe second Bank Account object details are : " +
                "\n" + acc2.toString();

        output += "\nThe number of Bank Account object created : " + BankAccount.getTotalAcc();


        JOptionPane.showMessageDialog(null,output,"Bank Account Object Data",JOptionPane.INFORMATION_MESSAGE);

    }
}
