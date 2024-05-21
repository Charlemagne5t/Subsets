import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        for(int i = 0; i < nums.length; i++) {
            List<Integer> cur = new ArrayList<>();
            cur.add(nums[i]);
            dfs(nums, res, i, cur );
        }

        return res;
    }
    void dfs(int[] nums, List<List<Integer>> res, int i, List<Integer> cur) {


        for(int j = i + 1; j < nums.length; j++) {
            cur.add(nums[j]);
            dfs(nums, res, j, cur);
            cur.remove(cur.size() - 1);
        }
        res.add(new ArrayList<>(cur));
    }
}