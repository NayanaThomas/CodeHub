package codeing;

public class InsertPosition {
    public int searchInsert(int[] nums, int target) {
        return bSearch(nums, target, 0, nums.length-1);
    }
    
    public int bSearch(int[]nums, int target, int l, int r) {
        if(r<l) {
            return l;
        }
        else {
            int mid = (l+r)/2;
            if(target == nums[mid]) {
                return mid;
            }
            if(target < nums[mid]) {
                return bSearch(nums, target, l, mid-1);
            }
            else {
                return bSearch(nums, target, mid+1, r);
            }
            
        }
    }
    
    public static void main(String[] args) {
    		InsertPosition i = new InsertPosition();
    		int[] nums= {1,3,5,6};
    		int target = 0;
    		int pos = i.searchInsert(nums, target);
    		System.out.println(pos);
    }

}
