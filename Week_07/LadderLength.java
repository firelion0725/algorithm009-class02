package com.leo.algorithm;

import java.util.*;

/**
 * BFS
 */
public class LadderLength {

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if (!wordList.contains(endWord)) {
            return 0;
        }
        Set<String> wordSet = new HashSet<>(wordList);
        wordSet.remove(beginWord);
        //初始化
        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);
        Set<String> visited = new HashSet<>();
        visited.add(beginWord);
        int res = 1;

        //BFS模板
        while (!queue.isEmpty()) {
            int q_size = queue.size();
            for (int i = 0; i < q_size; i++) {
                String string = queue.poll();
                char[] chars = string.toCharArray();

                //开始搜索
                for (int j = 0; j < beginWord.length(); j++) {
                    char c = chars[j];
                    for (char k = 'a'; k <= 'z'; k++) {
                        if (c == k) {
                            continue;
                        }
                        chars[j] = k;
                        String str = new String(chars);
                        if (wordSet.contains(str)) {
                            if (str.equals(endWord)) {
                                return res + 1;
                            }
                            if (!visited.contains(str)) {
                                //回归bfs模版
                                visited.add(str);
                                queue.add(str);
                            }
                        }
                    }
                    chars[j] = c;
                }
            }
            res++;
        }
        return 0;
    }

}
