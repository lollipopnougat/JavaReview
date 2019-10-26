public class Program {
    public static void main(String[] args) {
        System.out.println("test");
        Square sq = new Square(3);
        System.out.println(Square.isSquareNum(36));
        System.out.println(sq.getSqrtNM(10));
        System.out.println(sq.getSqrtBBDS(1e-7));
        int[] arr = new int[]{9, 7, 3, 4, 1, 5, 6, 2, 8};
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
    }
}
