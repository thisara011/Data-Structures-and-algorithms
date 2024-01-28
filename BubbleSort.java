
package bubblesort;

class Sorting
{
    public void Run()
    {
        int[] nums = {25,7,5,79,46,23,87};
        int size = nums.length;
        int temp=0;
        
        
          System.out.println("Befor sorting ");
        for(int num : nums)  // enhance for loop
        {
            System.out.print(num + " " );
            
        }
       
        
        for(int i =0;i <size;i++)
        {
          for(int j =0;j <size-i-1;j++)
          {
              if(nums[j]> nums[j+1])
              {
                 temp =nums[j];
                 nums[j]= nums[j+1];       
                 nums[j+1]= temp;
                   
              }
              else{
                  
              }
          }
        }
        System.out.println("");
         System.out.println("After sorting with Acending order : ");
         for(int num : nums)  // enhance for loop
        {
            System.out.print(num + " " );
            
        }
         for(int i =0;i <size;i++)
        {
          for(int j =0;j <size-i-1;j++)
          {
              if(nums[j] < nums[j+1])
              {
                 temp =nums[j];
                 nums[j]= nums[j+1];       
                 nums[j+1]= temp;
                   
              }
              else{
                  
              }
          }
        }
        System.out.println("");
         System.out.println("After sorting with decending order : ");
         for(int num : nums)  // enhance for loop
        {
            System.out.print(num + " " );
            
        } 
         
    }
}
public class BubbleSort {

    public static void main(String[] args) {
    Sorting S1 = new Sorting();
    S1.Run();
    }
    
}
