
public class ForEachLoop_TwoDimensionalArray
{

   public static void getAvg(int[][] a)
   {
      double total = 0;
      for (int[] innerArray : a)
      {
         for (int val : innerArray)
         {
        	 System.out.print(val);
         }
         System.out.println();
      }
   }

   public static void main(String[] args)
   {
      int[][] theArray = {  {80, 90, 70}, {20, 80, 75}};
      ForEachLoop_TwoDimensionalArray obj=new ForEachLoop_TwoDimensionalArray();
      obj.getAvg(theArray);
   }
}
