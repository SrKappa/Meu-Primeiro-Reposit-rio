package br.com.portfolio.patterns;

public class LoyaltyDiscountHandler extends DiscountHandler {
    @Override
    protected boolean canHandle(Order order) {
        return order.loyaltyCustomer();
    }

    @Override
    protected double calculate(Order order) {
        return order.amount() * 0.90;
    }
}
