[http://www.nowcoder.com/test/question/ac27e60e63b549d6a9b59f815d9bc6e2?pid=1429468&tid=3901233](http://www.nowcoder.com/test/question/ac27e60e63b549d6a9b59f815d9bc6e2?pid=1429468&tid=3901233)

小明陪小红去看钻石，他们从一堆钻石中随机抽取两颗并比较她们的重量。这些钻石的重量各不相同。在他们们比较了一段时间后，它们看中了两颗钻石g1和g2。现在请你根据之前比较的信息判断这两颗钻石的哪颗更重。

给定两颗钻石的编号g1,g2，编号从1开始，同时给定关系数组vector,其中元素为一些二元组，第一个元素为一次比较中较重的钻石的编号，第二个元素为较轻的钻石的编号。最后给定之前的比较次数n。请返回这两颗钻石的关系，若g1更重返回1，g2更重返回-1，无法判断返回0。输入数据保证合法，不会有矛盾情况出现。

> 测试样例：
> 2,3,[[1,2],[2,4],[1,3],[4,3]],4
> 返回: 1