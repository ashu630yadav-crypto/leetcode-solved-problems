class Solution {
    public void rotate(int[] nums, int k) {
        
        int arr[] = new int[nums.length];
        int index = 0;
        k = k % nums.length;
         
         for( int i = nums.length -k ; i<nums.length;i++)
         {
            arr[index]=nums[i];
            index++;
         }
         for(int i= 0; i<nums.length-k ; i++)
         {
            arr[index]= nums[i];
            index++;
         }

         for(int i =0 ; i<nums.length; i++)
         {
            nums[i]=arr[i];
         }

    }
}