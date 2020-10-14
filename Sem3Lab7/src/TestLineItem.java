public class TestLineItem {
    public static void main(String[] args) {

        LineItem allLineItems[] = new LineItem[10];

        Product p1 = new Product("Pen","This is red pen");
        Product p2 = new Product("Pencil","This is a pencil");
        Product p3 = new Product("Ruler","This is a ruler");
        Product p4 = new Product("Water bottle","This is water bottle");

        LineItem item1 = new LineItem(1,3,p1);
        LineItem item2 = new LineItem(2,4,p2);
        LineItem item3 = new LineItem(3,2,p3);


        allLineItems[0] = item1;
        allLineItems[1] = item2;
        allLineItems[2] = item3;


        System.out.println("Displaying the state all line - items ... \n\n");
        for(int i=0; i<allLineItems.length; i++)
            if(allLineItems[i] != null)
                System.out.println(allLineItems[i]);

        System.out.println("Now changing product associated with first line - item to a marker ... \n\n");
        item1.setProduct(p4);

        System.out.println("Displaying the state of all line - items again ... \n\n");
        for(int i=0; i<allLineItems.length; i++)
            if(allLineItems[i] != null)
                System.out.println(allLineItems[i]);

        System.out.println("Now deleting the second line item ( 4 pencils ) ... \n");

        item2 = null;
        allLineItems[1] = null;

        System.out.println("Displaying the state of second product ... \n");
        System.out.println(p2);

        System.out.println("Displaying the state of all line - items one last time ...\n\n");
        for(int i=0; i<allLineItems.length; i++)
            if(allLineItems[i] != null)
                System.out.println(allLineItems[i]);

    }
}
