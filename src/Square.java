public class Square {
    private double number;

    public Square(int input) throws IllegalArgumentException {
        if (input < 0) throw new IllegalArgumentException("负数无实数域平方根");
        number = input;
    }

    // 判断是否是完全平方数
    public static boolean isSquareNum(int num) {
        if(num < 0) {
            return false;
        }
        int mid = num / 2;

        for (int i = 0; i <= mid; i++) {
            int tmp = i * i;
            /*if (tmp >= num) { // 非常奇妙的写法
                return tmp == num;
            }*/
            if(tmp > num) {
                int close = (i-1)*(i-1);

                if(tmp - num < num - close) {
                    close = tmp;
                }
                System.out.println("最靠近的完全平方数是: " + close);
                return false;
            }
        }
        return true;
    }

    // 牛顿迭代法 控制迭代次数版
    public double getSqrtNM(int times) throws IllegalArgumentException {
        if (times <= 0) {
            throw new IllegalArgumentException("迭代次数非法");
        }
        double tmp = number / 2; // 随便取
        while (times > 0) {
            tmp = (tmp + number / tmp) / 2; // 迭代公式
            times--;
        }
        return tmp;
    }
    // 牛顿迭代法 控制精度版
    public double getSqrtNM2(double precision) throws IllegalArgumentException {
        if (precision >= 1 || precision < 0) throw new IllegalArgumentException("非法精度");
        double tmp = number / 2; // 随便取
        while (Math.abs(tmp * tmp - number) > precision) {
            tmp = (tmp + number / tmp) / 2; // 迭代公式
        }
        return tmp;
    }

    // 二分法查找 precision是精度，大小在 0 ~ 1 之间 一般取 1e-n (1^-n,n是正整数)
    public double getSqrtBBDS(double precision) throws IllegalArgumentException {
        if (precision >= 1 || precision < 0) throw new IllegalArgumentException("非法精度");
        double high = number;
        double mid = 0;
        double tmp;
        double low = 0;
        while (high - low > precision) {  // 如果误差大于要求就计算
            mid = low + (high - low) / 2; // 区间中值
            tmp = mid * mid;
            if (tmp - number > precision) {
                high = mid; // 缩小区间
            } else if (number - tmp > precision) {
                low = mid; // 缩小区间
            } else {
                return mid;
            }
        }
        return mid;
    }
}
