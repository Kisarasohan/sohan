package service;

import java.util.List;

import entity.User_Gift_details;
import entity.User;

public interface User_Gift_detailsAccountManagementService {
	List<User_Gift_details> getAllUser_Gift_details();
	
	User_Gift_details getUser_Gift_details(int User_Gift_detailsId);
	
	User_Gift_details addUser_Gift_details(User_Gift_details User_Gift_details);
	User_Gift_details UpdateUser_Gift_details(User_Gift_details User_Gift_details);
	User_Gift_details UpdateUser_Gift_detailsById(int User_Gift_detailsId);
	String deleteUser_Gift_details(User_Gift_details User_Gift_details);
	String deleteUser_Gift_detailsById(int User_Gift_detailsId);
}
