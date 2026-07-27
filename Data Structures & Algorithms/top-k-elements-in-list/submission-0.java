
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        List<List<Integer>> freq = new ArrayList<>();
        for (int i = 0; i <= nums.length; i++) freq.add(new ArrayList<>());
        for (int n : nums) map.put(n, map.getOrDefault(n, 0) + 1);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            freq.get(entry.getValue()).add(entry.getKey());
        }
        int[] answer = new int[k];
        int idx = 0;
        for (int i = freq.size() - 1; i >= 0; i--){
            for (int n : freq.get(i)) {
                answer[idx++] = n;
                if (idx == k) return answer;
            }
        }
        return answer;
    }
}
