public class Day12_BubbleSort {
    public static void main(String[] args){
        /*
        排序是将多个数据，依指定的顺序进行排列的过程
        内部排序:
        指将需要处理的所有数据都加载到内部存储器中进行排序。包括(交换式排序法、选择式排序法和插入式排序法)；
        外部排序法:
        数据量过大，无法全部加载到内存中，需要 借助外部存储进行排序。包括(合并排序法和直接合并排序法)
        冒泡排序（Bubble Sorting）的基本思想是：通过对待排序序列从后向前（从下标较大的元素开始），依次比较相邻元素
        的值，若发现逆序则交换，使值较大的元素逐渐从前移向后部，就象水底下的气泡一样逐渐向上冒。
        将五个无序：24,69,80,57,13 使用冒泡排序法将其排成一个从小到大的有序数列。
        */
        int[] Bubble = {24,69,80,57,13};
        System.out.println("排序前的Bubble数组为:");
        for (int i = 0; i < Bubble.length; i++){
            System.out.println("Bubble["+i+"]="+Bubble[i]);
        }
        for (int i = Bubble.length-1; i>=0 ; i--){
            for (int j = i ; j >= 0 ; j--){
                if (Bubble[j]>Bubble[i]){
                    int temp = Bubble[j];
                    Bubble[j]=Bubble[i];
                    Bubble[i]=temp;
                }
            }
        }
        System.out.println("排序后的Bubble数组为:");
        for (int i = 0; i < Bubble.length; i++){
            System.out.println("Bubble["+i+"]="+Bubble[i]);
        }
    }
}
