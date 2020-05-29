import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String string : strs) {
            char[] chars = string.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            if (map.containsKey(key)) {
                map.get(key).add(string);
            } else {
                List<String> list = new ArrayList<>();
                list.add(string);
                map.put(key, list);
            }
        }
        return new ArrayList<>(map.values());
    }


}