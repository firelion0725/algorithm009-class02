DFS demo:
    
    private void dfs(HashSet set,Node node) {
        if(node == null){
            return;
        }
        set.add(node);
        //add children of node
        dfs(set,node.left);
        dfs(set,node.right);
    }
    
    
BFS demo:

    private void bfs(HashSet set , Quene quene,Node node) {
        while(!quene.isEmpty()) {
        //从队列里拿到结果集
            Node node = quene.poll();
            set.add(node);
            //生成新一层的队列
            quene.add(node.left);
            quene.add(node.right);
        }         
    }  
    
二分 demo:

    private int mid(int[]nums, int start, int end,int target) {
        if(start >= end) {
            return nums[left]; 
        }
        int mid = (start + end)/2;
        if(mid == target){
            return nums[mid];
        }else if(mid < target){
            start = mid+1;
            mid(nums,start,end,target);
        }else{
            end = mid-1;
            mid(nums,start,end,target);
        }
    }  
  
    