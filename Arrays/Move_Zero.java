class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int k=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                continue;
            }
            else{
                nums[k]=nums[i];
                k++;
            }

        }
        for(int i=k;i<n;i++){
            nums[i]=0;
        }
        System.out.print('[');
        for(int i=0;i<n;i++){
            System.out.print(nums[i]);
        }
        System.out.print(']');
    }
}
