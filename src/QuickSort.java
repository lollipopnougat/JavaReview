public class QuickSort extends Sorter {
    /* 快速排序 时间复杂度 O(nlogn)
    快速排序（Quicksort）是对冒泡排序的一种改进。
    它的基本思想是：通过一趟排序将要排序的数据分割成独立的两部分，
    其中一部分的所有数据都比另外一部分的所有数据都要小，
    然后再按此方法对这两部分数据分别进行快速排序，
    整个排序过程可以递归进行，以此达到整个数据变成有序序列
    */ 
    public QuickSort(int[] array) {
        super(array);
    }

    @Override
    public void sort() {
        quickSort(0, numsLen - 1);
        isSorted = true;
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

    // 快速排序三分钟版(合并)
    public static void QSort(int[] n, int l, int h) {
        int ol = l;
        int oh = h;
        if (l < h) {
            int t = n[l];
            while (l < h) {
                while (l < h && n[h] >= t)  h--;
                n[l] = n[h];
                while (l < h && n[l] <= t) l++;
                n[l] = t;
            }
            QSort(n, ol, l - 1);
            QSort(n, l + 1, oh);
        }
    }
}
