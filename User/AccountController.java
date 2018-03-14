package User;
import DatabaseController;
/**

 * Provides the logic for the Account Controller class 
 * author: Jess Hansen
 * date: 2/27/2018
 */
import java.util.*;

public class AccountController {
  
  
  private String password, user;
  private DBController dbController;
  private Account account;
  
  /**
   * Checks if the user's credentials are valid and either
   * logs them in or supplies them with an error message to try again
   * @return boolean value regarding if the sign in was successful or not
   */
  public boolean logOn(String username, String password){

    Scanner keyboard = new Scanner(System.in);
    
    System.out.println("Enter username here: ");
    String inpUser = keyboard.nextLine();
    System.out.println("Enter password here: ");
    String inpPass = keyboard.nextLine(); 
   
    if (dbController.findUser(inpUser)) {
        //System.out.print("User found and logged in.");
        return true;
    } else {
       // System.out.print("User was not found.");
      showError();
      return false;
      
    }
    
  }
  
 // public void displayOptions(){}
  
  /**
   * If the user is logged on, the user is able to log off using this method 
   * @return boolean value whether they successfully log off or not
   */
  public void logOff(){
    account.logOff();
    
  }
  
  /**
   * This allows the user to recover their password if they forgot it.
   * They enter their username and are able to retrieve.
   * @return String of the user's password
   */
  public ArrayList<String> getPassword(){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter your username: ");
    String user = in.nextLine();
    ArrayList<String> userInfo = dbController.getUserInfo(user);
    return userInfo;
  }
  
  /**
   * Allows the user to edit their account by being able 
   * to change their username, password, or status.
   * @param username of the account that wants to edit their account
   * @param password of the account that wants to edit
   * @param status of the account that wants to edit
   * @return String of account details changed
   */
  public void editAccount(String username, String password, String firstName, String lastName, char type, char status){
    
    if(dbController.findUser(username))
    {
      ArrayList<String> userInfo = dbController.getUserInfo(user);
      dbController.setUserInfo(username,password,firstName,  lastName,  type,  status);
    }
    else{
     showError(); 
    }
    
    
  }
  
  /**
   * Shows an error message if the user gave incorrect credentials
   */
  public void showError(){
    
    System.out.println("Error, try again.");
    
  }
  
  
  
}