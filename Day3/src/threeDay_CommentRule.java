/*
Java代码规范
1.类、方法的注释，要以javadoc的方式来写
2.非Java Doc的注释，往往是给代码的维护者来看的，着重告诉读者为什么这样写，
如何修改，注意什么问题等
3.使用tab操作，实现缩进，默认整体向右边移动，使用shift+tab整体向左移
4.运算符和 = 两边习惯性各加一个空格。比如:2 + 4 * 5 + 345 - 89 = ???
5.源代码使用utf-8编码
6.行宽度不要超过80字符（阿里规范不要超过120）
7.代码编写风格【次行风格】和【行尾风格】
 */
public class threeDay_CommentRule {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    /*行尾风格
    void ArrayList(int initialCapacity){
        if(initialCapacity >0){
            this.elementData = new Object[initialCapacity];
        } else if (initialCapacity == 0) {
            this.elementData = EMPTY_ELEMENTDATA;
        } else {
            throw new IllegalArgumentException("Illegal Capacity:" + initialCapacity);
        }
    }
     */
    /*次行风格
    void ArrayList(int initialCapacity)
    {
        if(initialCapacity >0)
        {
            this.elementData = new Object[initialCapacity];
        } else if (initialCapacity == 0)
        {
            this.elementData = EMPTY_ELEMENTDATA;
        } else
        {
            throw new IllegalArgumentException("Illegal Capacity:" + initialCapacity);
        }
    }
     */
}