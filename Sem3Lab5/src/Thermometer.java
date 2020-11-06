 class Thermometer {

    private int currentTemp;
    private int maximumTemp;
    private int minimumTemp;

    public Thermometer()
    {
        currentTemp = 0;
        maximumTemp = Integer.MIN_VALUE;
        minimumTemp = Integer.MAX_VALUE;
    }
    public Thermometer(int currentTemp)
    {

        setCurrentTemp(currentTemp);
        setMaximumTemp(currentTemp);
        setMinimumTemp(currentTemp);

    }

     public int getCurrentTemp()
     {
         return currentTemp;
     }

     public void setCurrentTemp(int currentTemp)
     {
         this.currentTemp = currentTemp;
     }

     public int getMaximumTemp()
     {
         return maximumTemp;
     }

     public void setMaximumTemp(int maximumTemp)
     {
         this.maximumTemp = maximumTemp;
     }

     public int getMinimumTemp()
     {
         return minimumTemp;
     }

     public void setMinimumTemp(int minimumTemp)
     {
         this.minimumTemp = minimumTemp;
     }

     public void setTemperature(int currentTemp)
     {
         this.currentTemp = currentTemp;

         updateMaxMinTemp(currentTemp);
     }

     private void updateMaxMinTemp(int currentTemp)
     {
        if(currentTemp > maximumTemp)
            maximumTemp = currentTemp;

        if(currentTemp < minimumTemp)
            minimumTemp = currentTemp;
     }

     public String toString()
     {
         return "Current temperature : " + currentTemp + "\nMaximum temperature : " + maximumTemp + "\nMinimum temperature : " + minimumTemp;
     }
 }
