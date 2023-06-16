public class Main {
    public static void main(String[] args) {
        int[] sales = {100, 13, 405, 8, 60};

        SalesManager manager = new SalesManager(sales);
        System.out.println(manager.max());
    }
}
