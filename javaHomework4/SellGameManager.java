public class SellGameManager implements SellGameService{

    @Override
    public void sellGame(Game game, Customer customer, Campaign campaign) {
        if((game.isCampaignAvailable() && game.getCampaignId() == 1) || (game.isCampaignAvailable() && game.getCampaignId() == 2)){
            System.out.println("İndirim mevcut: " + campaign.getName() + " İndirim oranı: " + "%" + campaign.getDiscount());
        }
        System.out.println(game.getName() + " adlı oyun " + customer.getFirstName() + " adlı oyuncuya satıldı");
    }
}
