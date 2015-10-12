import java.util.*;
public class findDuplicateinArray{
	public boolean containsDuplicate(int[] nums){
		Set<Integer>set = new HashSet<Integer>();
		if(nums == null || nums.length == 0){
			return false;
		}
		for(int i : nums){
			if(set.contains(i)){ 
				return true;
			}
			else { 
				set.add(i);
			}
		}
		return false;
	}

}