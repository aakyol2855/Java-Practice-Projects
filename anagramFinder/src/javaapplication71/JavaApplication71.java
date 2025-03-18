package javaapplication71;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JavaApplication71 {
   
    public int[] twoSum(int[] nums, int target) {
        
        for(int i=0;i<nums.length;i++){
            for(int j = i ; j<nums.length;j++){
                
                if(nums[i]+nums[j]==target){
                    int[] temp = new int[]{i,j};
                    return temp;
                }
            }
        }
        int[] temp = new int[]{};
                    return temp;
    }
    
    public static void main(String[] args) {
        //nums dizisinde bir rakam birden fazla ise true, her rakam tek ise false döndürecek
        int nums[] = new int[]{1,2,3,4,4};
        int flag = 0;
        
        for(int i =0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] == nums[j]){
                    flag+=1;
                    System.out.println(i+j );
                }
                else {
                    
                }
            }
        }
    
        if(flag >=1){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        String[] strs = {"act", "pots", "tops", "cat", "stop", "hat"};
        
        // Map to hold sorted string as key and list of original strings as value
        Map<String, List<String>> map = new HashMap<>();
        
        // Populate the map
        for (String str : strs) {
            char[] tmp = str.toCharArray();
            Arrays.sort(tmp);
            String sorted = new String(tmp);
            
            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(str);
        }
        
        // Prepare the list of anagram groups
        ArrayList<ArrayList<String>> angrm = new ArrayList<>();
        
        for (List<String> group : map.values()) {
            angrm.add(new ArrayList<>(group));
        }
        
        // Print the anagram groups
        for (ArrayList<String> group : angrm) {
            System.out.println(group);
        }
        
    }
    
}
