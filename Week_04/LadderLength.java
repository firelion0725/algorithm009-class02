package com.leo.algorithm;

import java.util.*;

/**
 * https://leetcode-cn.com/problems/word-ladder/
 */
public class LadderLength {

    public static void main(String[] args) {
        List<String> wordList = new ArrayList<>();
        String[] words = {"hot", "dot", "dog", "lot", "log", "cog"};
        Collections.addAll(wordList, words);

        LadderLength solution = new LadderLength();
        String beginWord = "hit";
        String endWord = "cog";
        int ladderLength = solution.ladderLength(beginWord, endWord, wordList);
        System.out.println(String.format("从 %s 到 %s 的最短转换序列的长度：%d。", beginWord, endWord, ladderLength));
    }


    /**
     * 原题解 觉得这个讲的不错
     * https://leetcode-cn.com/problems/word-ladder/solution/yan-du-you-xian-bian-li-shuang-xiang-yan-du-you-2/
     * 双向BFS搜索
     */
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        // 先将 wordList 放到哈希表里，便于判断某个单词是否在 wordList 里
        Set<String> wordSet = new HashSet<>(wordList);
        //判断边界
        if (wordSet.size() == 0 || !wordSet.contains(endWord)) {
            return 0;
        }

        // 标准写法，总的 visited 数组
        Set<String> visited = new HashSet<>();

        // 分别用左边和右边扩散的哈希表代替单向 BFS 里的队列
        Set<String> beginVisited = new HashSet<>();
        beginVisited.add(beginWord);

        Set<String> endVisited = new HashSet<>();
        endVisited.add(endWord);

        int len = beginWord.length();
        int step = 1;
        // 简化成 while (!beginVisited.isEmpty()) 亦可
        while (!beginVisited.isEmpty() && !endVisited.isEmpty()) {
            // 打开以方便调试
            System.out.println("beginVisited => " + beginVisited);
            System.out.println("  endVisited => " + endVisited + "\n");

            // 优先选择小的哈希表进行扩散，考虑到的情况更少
            if (beginVisited.size() > endVisited.size()) {
                Set<String> temp = beginVisited;
                beginVisited = endVisited;
                endVisited = temp;
            }

            // 逻辑到这里，保证 beginVisited 是相对较小的集合
            // nextLevelVisited 在扩散完成以后，会成为新的 beginVisited
            Set<String> nextLevelVisited = new HashSet<>();
            for (String word : beginVisited) {
                char[] charArray = word.toCharArray();
                for (int i = 0; i < len; i++) {
                    char currentChar = charArray[i];
                    for (char c = 'a'; c <= 'z'; c++) {
                        if (charArray[i] == c) {
                            continue;
                        }
                        charArray[i] = c;
                        String nextWord = String.valueOf(charArray);
                        if (wordSet.contains(nextWord)) {
                            if (endVisited.contains(nextWord)) {
                                return step + 1;
                            }
                            if (!visited.contains(nextWord)) {
                                nextLevelVisited.add(nextWord);
                                visited.add(nextWord);
                            }
                        }
                    }
                    // 恢复，下次再用
                    charArray[i] = currentChar;
                }
            }

            // 这一行代表表示从 begin 这一侧向外扩散了一层
            beginVisited = nextLevelVisited;
            step++;
        }
        return 0;
    }
}
