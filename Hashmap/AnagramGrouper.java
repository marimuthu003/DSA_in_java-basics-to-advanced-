package Hashmap;

import java.util.*;

class AnagramGrouper {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            // Sort the characters of the string and use it as a key
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sorted = new String(charArray);

            // Add the string to the corresponding list in the map
            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(s);
        }

        // Return the list of grouped anagrams
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        AnagramGrouper grouper = new AnagramGrouper();
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(grouper.groupAnagrams(strs));
    }
}
