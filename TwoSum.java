
import java.util.HashSet;
import java.util.Set;

public class TwoSum {

    int[] twoSum(int[] nums, int k){
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int numberToFind = k - nums[i];
            if (set.contains(numberToFind)){
                return new int[]{numberToFind,nums[i]};
            }
            set.add(nums[i]);
        }
        return new int[0];
    }

    int [] secondVariant(int [] array, int k){
        for(int i=0;i<array.length;i++){
            int numberToFind =k-array[i];
            int l = i+1;
            int r= array.length -1;
            while (l <=r){
                int mid=l+(r-l)/2;
                if (array[mid]==numberToFind){
                    return  new int[]{array[i],array[mid]};
                }
                if(numberToFind <array[mid]){
                    r=mid-1;
                }else {
                    l = mid+1;
                }
            }
        }
        return new int[0];
    }
}
