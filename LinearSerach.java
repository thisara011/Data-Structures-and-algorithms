package linearserach;

import static linearserach.LinearSerach.linearSearch;

 class search
 {
     public void Run(){
           int[] nums = {2, 3, 56, 745, 34};
        int target = 12;

        int results = linearSearch(nums, target);

        if (results != -1) {
            System.out.println("Number index is " + results);
        } else {
            System.out.println("Cannot find index");
        }
     }
 }
public class LinearSerach {
    
    public static void main(String[] args)
    {
      search a = new search();
      a.Run();
    }

    public static int linearSearch(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
