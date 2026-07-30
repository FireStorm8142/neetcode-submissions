class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> count = new HashMap<>();
        for (String s : strs){
            int[] freq = new int[26];
            for (char c : s.toCharArray()) freq[c - 'a']++;
            String key = Arrays.toString(freq);
            count.putIfAbsent(key, new ArrayList<>());
            count.get(key).add(s);
        }
        return new ArrayList<>(count.values());
    }
}
