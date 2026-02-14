package br.com.portfolio.patterns;

public class NoDiscountHandler extends DiscountHandler {
    @Override
    protected boolean canHandle(Order order) {
        return true;
    }

    @Override
    protected double calculate(Order order) {
        return order.amount();
    }
}
