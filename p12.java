class Solution {
    public int findPeakElement(int[] nums) {
        int len = nums.length;
        int start = 0;
        int end = len-1;

        while(start<end)
        {
            int mid = (start +end)/2;

            if(nums[mid]<nums[mid+1])
            {
                start = mid +1;
            }
            else
            {
                end = mid;
            }
        }

        return start;
    }
}