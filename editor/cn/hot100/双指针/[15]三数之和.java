class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int left = 1, right = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>0) return res;
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            left=i+1;
            right=nums.length-1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum > 0) right--;
                else if (sum < 0)left++;
                else{
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    //去除b c重
                    while(left<right&&nums[left]==nums[left+1]) left++;
                    while(left<right&&nums[right]==nums[right-1]) right--;
                    left++;
                    right--;
                }
            }
        }
        return res;
    }
}