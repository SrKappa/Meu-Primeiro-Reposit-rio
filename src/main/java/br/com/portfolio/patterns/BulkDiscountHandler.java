package br.com.portfolio.patterns;

public class BulkDiscountHandler extends DiscountHandler {
    @Override
    protected boolean canHandle(Order order) {
        return order.items() >= 10;
    }

    @Override
    protected double calculate(Order order) {
        return order.amount() * 0.85;
    }
}
