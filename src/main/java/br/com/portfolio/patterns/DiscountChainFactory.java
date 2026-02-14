package br.com.portfolio.patterns;

public class DiscountChainFactory {
    public DiscountHandler createDefaultChain() {
        DiscountHandler loyalty = new LoyaltyDiscountHandler();
        DiscountHandler bulk = new BulkDiscountHandler();
        DiscountHandler seasonal = new SeasonalDiscountHandler(AppConfig.getInstance());
        DiscountHandler noDiscount = new NoDiscountHandler();

        loyalty.setNext(bulk).setNext(seasonal).setNext(noDiscount);
        return loyalty;
    }
}
