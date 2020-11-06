 class BankAccount {


    private String owner;
    private int number;
    private static double interestRate;
    private static int totalAcc;


    public BankAccount()
    {
        owner = "Owner not available";
        interestRate = 0;
        incrementCount();
        setNumber(totalAcc);
    }
    public BankAccount(String owner,double interestRate)
    {
        setOwner(owner);
        setInterestRate(interestRate);
        incrementCount();
        setNumber(totalAcc);
    }

     public static int getTotalAcc() {
         return totalAcc;
     }


     public String getOwner() {
         return owner;
     }

     public void setOwner(String owner) {
         this.owner = owner;
     }

     public int getNumber() {
         return number;
     }

     public void setNumber(int number) {
         this.number = number;
     }

     public static double getInterestRate() {
         return interestRate;
     }

     public static void setInterestRate(double interestRate) {
         BankAccount.interestRate = interestRate;
     }

     public String toString()
     {
         return "Owner : " + owner + " \nNumber : " + number + " \nInterest Rate : " + interestRate;
     }

     private static void incrementCount()
     {
         totalAcc++;
     }
 }
