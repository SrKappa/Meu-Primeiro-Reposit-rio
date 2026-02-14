package br.com.portfolio.patterns;

public abstract class DiscountHandler {
    private DiscountHandler next;

    public DiscountHandler setNext(DiscountHandler next) {
        this.next = next;
        return next;
    }

    public double apply(Order order) {
        if (canHandle(order)) {
            return calculate(order);
        }
        if (next == null) {
            return order.amount();
        }
        return next.apply(order);
    }

    protected abstract boolean canHandle(Order order);

    protected abstract double calculate(Order order);
}
