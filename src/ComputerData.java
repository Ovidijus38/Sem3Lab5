import javax.swing.JOptionPane;

public class ComputerData {
    public static void main(String []args)
    {
        float price, cheapest=0, dearest=0;
        int hardDiskSpace=0,numProcessed=0,totalDiskSpace=0,i=0;
        String serialNumber,processorType,cpuTypeCheapest = "",hardDiskSpaceS,
                priceString;
        boolean valid;

        serialNumber = JOptionPane.showInputDialog("Please enter the serial number "
                + "(<CR> to exit)");

        while(!serialNumber.equals(""))
        {

            hardDiskSpaceS = JOptionPane.showInputDialog("Please enter the hard-disk space: ");

            valid = false;

            while(!valid)
            {
                for(i=0; i < hardDiskSpaceS.length();i++)
                    if(!Character.isDigit(hardDiskSpaceS.charAt(i)))
                        break;

                if(i < hardDiskSpaceS.length())
                    hardDiskSpaceS = JOptionPane.showInputDialog(
                            "Invalid! Please re-enter hard-disk space");
                else
                {
                    hardDiskSpace = Integer.parseInt(hardDiskSpaceS);

                    if (hardDiskSpace > 50 && hardDiskSpace < 5000)
                        valid = true;
                    else
                        hardDiskSpaceS = JOptionPane.showInputDialog(
                                "Invalid! Please re-enter hard-disk space");
                }
            }

            processorType = JOptionPane.showInputDialog("Please enter the processor type: ");


            priceString = JOptionPane.showInputDialog("Please enter the price: ");

            price = Float.parseFloat(priceString);

            numProcessed++;

            if(numProcessed == 1)
            {
                cheapest = price;
                dearest = price;
                cpuTypeCheapest = processorType;
            }
            else if(price<cheapest)
            {
                cheapest = price;
                cpuTypeCheapest = processorType;
            }
            else if(price>dearest)
                dearest = price;


            totalDiskSpace+=hardDiskSpace;

            serialNumber = JOptionPane.showInputDialog("Please enter the serial "
                    + "number (<CR> to exit)");
        }

        if(numProcessed > 0)
            JOptionPane.showMessageDialog(null,"\n\nThe average disk space available on "
                            + "the computers processed is: " + String.format("%.0f",
                    averageDiskSpace(totalDiskSpace,numProcessed))
                            + " GB\nThe price range of the computers is from €" + String.format("%.2f",
                    cheapest) + " to €" + String.format("%.2f",dearest) + "\nThe processor type "
                            + "on the cheapest computer is " + cpuTypeCheapest
                    ,"Computer Stats",JOptionPane.INFORMATION_MESSAGE);
        else
            JOptionPane.showMessageDialog(null,"No data entered!","Computer Data",
                    JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }

    public static float averageDiskSpace(int totalDiskSpace,int numProcessed)
    {
        return (float)totalDiskSpace/numProcessed;
    }
}
