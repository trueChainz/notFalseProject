import User.*;
  
/**
 * @author zvetter001
 * @version 3/15/18
 */
public class TextDriver {
  
  Account activeAccount;
  Admin admin;
  User user;
  
  /**
   * @param args
   */
  public static void main(String [] args) {
    /*TODO
     * Log in with User Account
     * View Profile
     * Edit Profile
     * Search Schools
     * View Results
     * View School Information
     * Display similar recommendations
     * Add School to profile
     * View Saved Schools
     * Remove Schools
     * Log out
     * 
     * Log in as Admin
     * View Universities
     * Add new school
     * Save school
     * Edit school
     * View Users
     * Add new user
     * Deactivate user
     * Edit user
     */
    AccountInteractions accountInteractions = new AccountInteractions();
    AdminInteractions adminInteractions = new AdminInteractions();
    
    System.out.println("Logging in with invalid user credentials:");
    accountInteractions.logOn("ERROR", "ERROR");
    System.out.println("Logging in with valid user credentials:");
    accountInteractions.logOn("juser", "user");
    System.out.println("Logging in with valid admin credentials:");
    accountInteractions.logOn("nadmin", "admin");
    
    adminInteractions.getListOfUsers();
    adminInteractions.addNewUser("Trevor", "Wensman","trevor", "password", 'u');
    
  }

}















