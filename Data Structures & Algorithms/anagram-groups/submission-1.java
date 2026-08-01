class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> count = new HashMap<>();
        for (String s : strs){
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String key = Arrays.toString(c);
            count.putIfAbsent(key, new ArrayList<>());
            count.get(key).add(s);
        }
        return new ArrayList<>(count.values());
    }
}
