package listas;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList2 {
	
	public static void main(String[] args) {

		
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(15);
		nums.add(1);
		nums.add(12);
		nums.add(198);
		nums.add(17);
		
		for (Integer inte : nums) {
			System.out.println(inte);
		}
		
		Collections.sort(nums);
		System.out.println();
		
		for (Integer inte : nums) {
			System.out.println(inte);			
		}
		
	}	
}
