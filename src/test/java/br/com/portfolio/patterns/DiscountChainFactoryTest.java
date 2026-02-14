package br.com.portfolio.patterns;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DiscountChainFactoryTest {

    private final DiscountHandler chain = new DiscountChainFactory().createDefaultChain();

    @Test
    void shouldApplyLoyaltyDiscountFirst() {
        Order order = new Order(100.0, true, 20);

        double result = chain.apply(order);

        assertEquals(90.0, result, 0.0001);
    }

    @Test
    void shouldApplyBulkDiscountWhenNotLoyalty() {
        Order order = new Order(100.0, false, 10);

        double result = chain.apply(order);

        assertEquals(85.0, result, 0.0001);
    }

    @Test
    void shouldApplySeasonalDiscountWhenEnabled() {
        AppConfig.getInstance().setSeasonalCampaignEnabled(true);
        Order order = new Order(100.0, false, 1);

        double result = chain.apply(order);

        assertEquals(95.0, result, 0.0001);
    }

    @Test
    void shouldApplyNoDiscountWhenSeasonalDisabled() {
        AppConfig.getInstance().setSeasonalCampaignEnabled(false);
        Order order = new Order(100.0, false, 1);

        double result = chain.apply(order);

        assertEquals(100.0, result, 0.0001);
    }
}
