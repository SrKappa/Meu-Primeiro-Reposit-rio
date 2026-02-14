package br.com.portfolio.patterns;

public class Main {
    public static void main(String[] args) {
        DiscountHandler chain = new DiscountChainFactory().createDefaultChain();

        Order loyaltyOrder = new Order(200.0, true, 2);
        Order bulkOrder = new Order(500.0, false, 12);
        Order normalOrder = new Order(100.0, false, 1);

        printResult("Cliente fidelidade", loyaltyOrder, chain);
        printResult("Compra em volume", bulkOrder, chain);
        printResult("Compra comum", normalOrder, chain);
    }

    private static void printResult(String label, Order order, DiscountHandler chain) {
        double finalPrice = chain.apply(order);
        System.out.printf("%s -> valor original: R$%.2f | valor final: R$%.2f%n",
                label,
                order.amount(),
                finalPrice);
    }
}
