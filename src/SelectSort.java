public class SelectSort extends Sorter {
    /*简单选择排序
    /算法思想：每次循环找出最大值，放到上次的最大值后面
    图形演示: https://lollipopnougat.github.io/SortDemo/
    */
    public SelectSort(int[] array) {
        super(array);
    }

    @Override
    public void sort() {
        int findMaxNums = 0;
        int currentMaxIndex = 0;
        while(findMaxNums < numsLen - 1) {
            for (int j = 1; j < numsLen - findMaxNums; j++) {
                if(nums[j] > nums[currentMaxIndex]) {
                    currentMaxIndex = j;
                }
            }
            swap(currentMaxIndex,numsLen - findMaxNums - 1);
            findMaxNums++;
            currentMaxIndex = 0;
        }
        isSorted = true;
    }


}
