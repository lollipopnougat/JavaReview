public class QuickSort extends Sorter {

    public QuickSort(int[] array) {
        super(array);
    }

    @Override
    public void sort() {
        quickSort(0, numsLen - 1);
    }

    private int getIndex(int low, int high) {
        int tmp = nums[low];
        while (low < high){ // 当队尾的元素大于等于基准数据时,向前挪动high指针
            while (low < high && nums[high] >= tmp) {
                high -= 1;
            }
            nums[low] = nums[high];  // 如果队尾元素小于tmp了,需要将其赋值给low
            while (low < high && nums[low] <= tmp){
                low += 1;
            }
            nums[high] = nums[low];
        }
        nums[low] = tmp;
        return low;
    }

    private void quickSort(int low, int high) {
        if (low < high) {
            int index = getIndex(low, high);
            quickSort(0, index - 1);
            quickSort(index + 1, high);
        }
    }
}
