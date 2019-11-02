// 抽象排序类
public abstract class Sorter {

    public Sorter(int[] array) {
        nums = array;
        numsLen = array.length;
    }

    protected boolean isSorted = false;
    protected int numsLen = 0;

    public boolean isSorted() {
        return isSorted;
    }

    protected int[] nums;

    protected void swap(int lhs, int rhs) {
        int tmp = nums[lhs];
        nums[lhs] = nums[rhs];
        nums[rhs] = tmp;
    }

    public abstract void sort();

    public int[] getNums() {
        return nums;
    }
}
