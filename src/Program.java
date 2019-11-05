import java.lang.reflect.InvocationTargetException;

public class Program {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        System.out.println("test");
        Square sq = new Square(3);
        System.out.println(Square.isSquareNum(36));
        System.out.println("控制次数的牛顿迭代 " + sq.getSqrtNM(4));
        System.out.println("控制精度的牛顿迭代 " + sq.getSqrtNM2(1e-10));
        System.out.println("Math.sqrt参考 " + Math.sqrt(3));
        System.out.println("控制精度的二分查找 " + sq.getSqrtBBDS(1e-7));
        int[] arr = new int[]{9, 7, 3, 4, 1, 5, 6, 2, 8};
        int[] ar = new int[]{13, 89, 5, 16, 7, 5, 33, 49, 21, 36, 9, 17};
        System.out.println("原数组: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        Sorter sorter1 = new SelectSort(arr);
        sorter1.sort();
        System.out.println("简单选择: ");
        for (int i : sorter1.getNums()) {
            System.out.print(i + " ");
        }
        System.out.println(" ");

        Sorter sorter2 = new QuickSort(arr);
        sorter2.sort();
        System.out.println("快速排序: ");
        for (int i : sorter2.getNums()) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        Sorter sorter3 = new BubbleSort(ar);
        sorter3.sort();
        System.out.println("冒泡排序: ");
        for (int i : sorter3.getNums()) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        Sorter sorter4 = new BubbleSort(arr);
        sorter4.sort();
        System.out.println("插入排序: ");
        for (int i : sorter4.getNums()) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        System.out.println("快速排序2: ");
        QuickSort.QSort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        Class cl = Class.forName("ClassTest");
        ClassTest ct = (ClassTest) cl.newInstance();
        System.out.println(ct.name);
    }



}
