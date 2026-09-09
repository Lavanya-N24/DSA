class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
          List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        findCombination(candidates,target,0,list,ans);
        return ans;
    }

        public void findCombination(int[] candidates,int target,int index,List<Integer>list,List<List<Integer>>ans){
        if (target == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }

        if (index ==candidates.length) {
            return;
        }

        // Take the current number
        if (candidates[index] <= target) {
            list.add(candidates[index]);
            findCombination(candidates, target - candidates[index], index, list,ans);
            list.remove(list.size() - 1);
        }

        // Skip the current number
        findCombination(candidates, target, index + 1, list,ans);
    }
}

    
