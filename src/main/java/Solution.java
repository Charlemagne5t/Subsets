import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();
        backtrack(nums, resultList, new ArrayList<>(), 0);
        return resultList;
    }

    private void backtrack(int[] nums, List<List<Integer>> resultList, List<Integer> currentList, int i){
        if(i == nums.length){
            if(!resultList.contains(currentList)){
                resultList.add(new ArrayList<>(currentList));
            }
            return;
        }
        if(!resultList.contains(currentList)){
            resultList.add(new ArrayList<>(currentList));
        }

        currentList.add(nums[i]);
        backtrack(nums, resultList, currentList, i + 1);
        currentList.remove(currentList.size() - 1);

        backtrack(nums, resultList, currentList, i + 1);

    }
}
