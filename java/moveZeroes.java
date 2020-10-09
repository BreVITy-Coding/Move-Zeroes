public void moveZeroes(int[] nums) {
        int cur=0;
        int lastNonZero=0;
        
        for(cur=0;cur<nums.length;cur++){
            
            if(nums[cur]!=0){
                
                int temp=nums[cur];
                nums[cur]=nums[lastNonZero];
                nums[lastNonZero]=temp;
                
                lastNonZero+=1;
            }
        }
    }