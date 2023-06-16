public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
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
