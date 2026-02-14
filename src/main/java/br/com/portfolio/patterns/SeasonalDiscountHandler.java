package br.com.portfolio.patterns;

public class SeasonalDiscountHandler extends DiscountHandler {
    private final AppConfig config;

    public SeasonalDiscountHandler(AppConfig config) {
        this.config = config;
    }

    @Override
    protected boolean canHandle(Order order) {
        return config.isSeasonalCampaignEnabled();
    }

    @Override
    protected double calculate(Order order) {
        return order.amount() * 0.95;
    }
}
