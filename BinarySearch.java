package BinarySearch;

class Search {
    public void Run() {
        int[] nums = {2, 3, 56, 745, 34};
        int target = 12;

        int results = BinarySearch(nums, target);

        if (results != -1) {
            System.out.println("Number index is " + results);
        } else {
            System.out.println("Cannot find index");
        }
    }
}

public class BinarySearch {
    public static void main(String[] args) {
        Search a = new Search();
        a.Run();
    }

    public static int BinarySearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int mid;

        while (start <= end) {
            mid = (start + end) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }
}
