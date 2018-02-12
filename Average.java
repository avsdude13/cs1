/************************************************************
/     This program is the average class. It is used to      /
/     calculate the mean of a group of numbers, display     /
/     them in decending order using arrays.                 / 
/              @ Matt Kline                                 /
/              @ November 19, 2014                          /
/                                                           /
/***********************************************************/

public class Average
{   
   private int[] data;
   
   public Average (int score1, int score2, int score3, int score4, int score5) {
      int value1, value2, value3, value4, value5;
      
      value1 = score1;
      value2 = score2;
      value3 = score3;
      value4 = score4;
      value5 = score5;
      
      data = new int []{value1, value2, value3, value4, value5};   
      
      selectionSort();
   }
 
   public double calculateMean() {
      double mean = 0;
      double total = 0;
      
      for (int i=0; i < data.length; i++) {
         total = total + data[i];
      }
      mean = total / data.length;

      return mean;
   } 

   public String toString() {
      String total = " ";
      
      for (int i=0; i<data.length; i++) {
         total += (data[i] + ", ");
      }
      return total; 
   } 

   public void selectionSort() {
      int temp = 0;
      
      for (int startpoint = 0; startpoint < data.length; startpoint++) {
         for (int testpoint = startpoint + 1; testpoint < data.length; testpoint++) {
            if (data [startpoint] > data [testpoint]) {
               temp = data [startpoint];
               data [startpoint] = data [testpoint];
               data [testpoint]= temp;
            }
         }
      }
   }   
}