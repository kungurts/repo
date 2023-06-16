public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public int average() {
        int max = max();
        int min = max;
        int sum = 0;
        for (int x : sales) {
            min = Math.min(min, x);
            sum += x;
        }
        sum = sum - max - min;
        return sum / (sales.length - 2);
    }
}
