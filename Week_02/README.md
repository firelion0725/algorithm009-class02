学习笔记

Hash get()
核心代码：
* first = tab[(n - 1) & hash] 获取算法对应的值下标 所在对象（该对象为一个数据结构的头节点）

first为获取的数据结构的顶部对象

* (first.hash == hash && ((k = first.key) == key || (key != null && key.equals(k))))
如果first就是想要的对象直接返回

目前hashmap 内部就两种数据结构作为存储单元 一种为链表Node 另一种为红黑树TreeNode

如果first不是期望的对象则进行数据结构判断
* if (first instanceof TreeNode) 

如果为红黑树则 first.getTreeNode(hash, key);

链表则 

                do {
                    if (e.hash == hash &&
                        ((k = e.key) == key || (key != null && key.equals(k))))
                        return e;
                } while ((e = e.next) != null);
                
        
循环整个链表获取期望的对象