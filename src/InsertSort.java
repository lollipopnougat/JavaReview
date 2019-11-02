public class InsertSort extends Sorter {
    /* 直接插入排序 时间复杂度O(n^2)
     把左侧当作有序列表，每次把右侧元素插入到左侧有序列表中
     在线演示 https://lollipopnougat.github.io/SortDemo/*/
    public InsertSort(int[] array) {
        super(array);
    }

    @Override
    public void sort() {
        for (int i = 1; i < numsLen; i++) {
            int tmp = nums[i];
            for (int j = i; j > 0 ; j--) {
                if(nums[j - 1] > nums[i]) {
                    nums[i] = nums[j - 1];
                }
                else {
                    nums[j] = tmp;
                }
            }
        }
        isSorted = true;
    }
}
