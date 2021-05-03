public class Game implements Entity{
    private int id;
    private int campaignId;
    private String name;
    private double price;
    private boolean isCampaignAvailable;

    public Game(int id, String name, double price, boolean isCampaignAvailable, int campaignId) {
        this.setId(id);
        this.setName(name);
        this.setPrice(price);
        this.setCampaignAvailable(isCampaignAvailable);
        this.setCampaignId(campaignId);
    }

    public Game(int id, String name, double price, boolean isCampaignAvailable){
        this.setId(id);
        this.setName(name);
        this.setPrice(price);
        this.setCampaignAvailable(isCampaignAvailable);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isCampaignAvailable() {
        return isCampaignAvailable;
    }

    public void setCampaignAvailable(boolean campaignAvailable) {
        isCampaignAvailable = campaignAvailable;
    }

    public int getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(int campaignId) {
        this.campaignId = campaignId;
    }
}
