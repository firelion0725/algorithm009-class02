[1]:https://leetcode-cn.com/problems/permutations/solution/hui-su-suan-fa-xiang-jie-by-labuladong-2/
[回溯算法框架：] [1]

解决一个回溯问题，实际上就是一个决策树的遍历过程。你只需要思考 3 个问题：

1、路径：也就是已经做出的选择。

2、选择列表：也就是你当前可以做的选择。

3、结束条件：也就是到达决策树底层，无法再做选择的条件。


代码框架

    result = []
    def backtrack(路径, 选择列表):
        if 满足结束条件:
            result.add(路径)
            return
    
    for 选择 in 选择列表:
        做选择
        backtrack(路径, 选择列表)
        撤销选择


此处我个人补充一句 有时候可能需要做状态赋值和撤销

其核心就是 for 循环里面的递归，在递归调用之前「做选择」，在递归调用之后「撤销选择」。

我个人定制的一个解题模板

    void backTrance(结果集, 任务条件数据，达成任务条件， 选择起始点 ，当前数据集 ) {
        if(当前数据集 达成任务条件) {
            结果集.add (当前数据集)
        }
        
        for(int i = 选择起始点； i<达成任务条件 ; i++) {
            当前任务集.add(条件数据 with i)
            backTrance(结果集, 任务条件数据，达成任务条件， 选择起始点+1 ，当前数据集)
             当前任务集.remove(当前任务集最后一条数据)
        }
    }
    
    solution(条件数据，达成任务条件) {
        初始化结果集，当前数据集
        backTrance(结果集, 任务条件数据，达成任务条件， 通常为0或1 ，当前数据集)
        return 结果集
    }









