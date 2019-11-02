public class BubbleSort extends Sorter {
    /* 冒泡排序 时间复杂度 O(n^2)
     越大/小的元素会经由交换慢慢“浮”到数列的一端
     在线演示:  https://lollipopnougat.github.io/SortDemo/*/
    public BubbleSort(int[] array) {
        super(array);
    }

    @Override
    public void sort() {
        for (int i = 0; i < numsLen - 1; i++) {
            for (int j = 0; j < numsLen - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    swap(j, j + 1);
                }
            }
        }
        isSorted = true;
    }
}
