import javax.swing.*;

public class TestBook2 {
    public static void main(String[] args) {

        String output = "";

        Thermometer term1 = new Thermometer(35);

        output += "Calling the single - argument constructor ... setting the temperatures of the first thermometer to 35C " +
                "\n First thermometer : \n" +
                term1.toString();

        Thermometer term2 = new Thermometer();

        output += "\n\nCalling the no - argument constructor ...  setting the temperature of second thermometer to 0C" +
                "\n Second thermometer: \n" +
                term2.toString();

        int temperature = Integer.parseInt(JOptionPane.showInputDialog("Please enter the temperature:"));


        term1.setTemperature(temperature);

        output += "\n\nCalling setTemperature() - setting the temperature of the second thermometer to 25C " +
                "\nSecond thermometer : \n" +
                term1.toString();

        JOptionPane.showMessageDialog(null,output,"***** Temperature Testing *****",JOptionPane.INFORMATION_MESSAGE);


        System.exit(0);
    }
}

