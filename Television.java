/******************************************************
/    This class is used to control a television       /
/                      @Matt Kline                    /
/                      @Due 11/04/2014                 /
/                      @version 1                     /
/*****************************************************/                 

public class Television {
   
   private String manufacturer;
   private int screenSize;
   private boolean powerOn = false;
   private int channel = 2;
   private int volume = 20;
   
   /**
    * Constructor is used to get the brand and size of the TV
    * @param brand
    * @param size 
    */  
   public Television (String brand, int size) {
      manufacturer = brand;
      screenSize = size;
   }

   /**
    * setChannel is used to change the TV channel
    * @param station
    */
   public void setChannel (int station) {
      channel = station;
   }

   /**
    * power is used to toggle the power of the TV
    */
   public void power() {
      powerOn = !powerOn;
   }

   /**
    * increaseVolume is used to turn up the TV volume
    */
   public void increaseVolume() {
      volume++;
   }

   /**
    * decreaseVolume is used to turn down the TV volume
    */
   public void decreaseVolume() {
      volume--;
   }

   /**
    * getChannel is used to get the channel that the TV is on and will return channel
    */      
   public int getChannel() {
      return channel;
   }

   /**
    * getVolume is used to get the volume of the TV and will return volume
    */       
   public int getVolume() {
      return volume;
   }

   /**
    * getManufacturer is used to get the TV manufacturer and will return manufacturer
    */ 
   public String getManufacturer() {
      return manufacturer;
   }

   /**
    * getScreenSize is used to get the size of the TV and will return screenSize
    */       
   public int getScreenSize() {
      return screenSize;
   }
}
   