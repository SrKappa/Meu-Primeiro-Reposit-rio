package br.com.portfolio.patterns;

public final class AppConfig {
    private static final AppConfig INSTANCE = new AppConfig();
    private boolean seasonalCampaignEnabled = true;

    private AppConfig() {
    }

    public static AppConfig getInstance() {
        return INSTANCE;
    }

    public boolean isSeasonalCampaignEnabled() {
        return seasonalCampaignEnabled;
    }

    public void setSeasonalCampaignEnabled(boolean seasonalCampaignEnabled) {
        this.seasonalCampaignEnabled = seasonalCampaignEnabled;
    }
}
