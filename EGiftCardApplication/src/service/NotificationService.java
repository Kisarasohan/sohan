package service;

import java.util.List;

import entity.Gift_recd_details;
import entity.Gift_redeem_details;

public interface NotificationService {
	
	List<Gift_recd_details> getAllGift_recd_details();
	List<Gift_redeem_details> getAllGift_redeem_details();
	
	Gift_redeem_details sendGift_redeem_detailsNotification(Gift_redeem_details gift_redeem_details);
	Gift_recd_details sendGift_recd_detailsNotification(Gift_recd_details gift_recd_details);

}
