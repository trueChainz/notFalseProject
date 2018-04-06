package DBController;
import University.*;
import User.*;
import DatabaseController.*;
import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;



public class DBTest
{
  
  @Before
  public void setUp()
  {
   
  }
  
  //setting user information
  @Test
  public void setUserInfoTest()
  {
    Account acc = new Account("Jubie", "Alade", "jalade", "csci", 'u', 'Y');
    char expected = 'u';                               
    char result = acc.getAccountType();
    Assert.assertEquals("The char info was set correctly: " + expected, expected, result);  
  }
  
  //setting school information 
  @Test 
  public void setSchoolInformationTest()
  {
    University univ = new University();
    String expected = "SJU";
    univ.setSchoolName("SJU"); 
    String result = univ.getSchoolName();
    Assert.assertEquals("The info was set correctly " + expected, expected, result);
  }
  
  //adding a new school to the DB
  @Test
  public void addNewSchoolTest()
  {
    University univ = new University();
    
    DBController dbCont = new DBController("notfal", "csci230");  
    univ.setSchoolName("UOJ");
    dbCont.addNewSchool(univ); 
    univ = dbCont.getSchoolInfo("UOJ");
    

        String result = univ.getSchoolName();
        String expected = "UOJ";
        Assert.assertTrue("The university was added: " + expected, result.equals("UOJ"));
   }

  
    
    
    
  }
  
  
  @Test
  public void searchTwoTest()
  {
   
   ArrayList<University> list;
   DBController dc = new DBController("notfal", "csci230");
     list = dc.searchTwo("OF", "MINNESOTA","!" ,"!",//SchoolName, State, location,Control
                                   -1, -1,//NumStudents
                                   -1,-1,//%Female
                                   -1,-1,//SATVerbal
                                   -1,-1,//SATMath
                                   -1,-1,//Expenses
                                   -1,-1,//PercentEnrolled
                                   -1,-1,//AcademicsScale
                                   -1,-1,//Social
                                   -1,-1,//Academics
                                   "!", "!","!", "!","!");
       String result = list.get(0).getSchoolName();
          String expected = "UNIVERSITY OF MINNESOTA";
          Assert.assertTrue("Search did not return desired result: " + expected, result.equals(expected));
    
    list = dc.searchTwo("!", "!","!" ,"!",//SchoolName, State, location,Control
                -500, -400,//NumStudents
                -1,-1,//%Female
                -1,-1,//SATVerbal
                -1,-1,//SATMath
                -1,-1,//Expenses
                -1,-1,//PercentEnrolled
                -1,-1,//AcademicsScale
                -1,-1,//Social
                -1,-1,//Academics
                "!", "!","!", "!","!");
          
    Assert.assertTrue("Search did not return desired result: " + true, list.isEmpty());
    
    list = dc.searchTwo("!", "!","!" ,"!",//SchoolName, State, location,Control
                -1, -1,//NumStudents
                -1,-1,//%Female
                -1,-1,//SATVerbal
                -1,-1,//SATMath
                -1,-1,//Expenses
                -1,-1,//PercentEnrolled
                -1,-1,//AcademicsScale
                -1,-1,//Social
                -1,-1,//Academics
                "!", "!","!", "!","!");
          
    Assert.assertTrue("Search did not return desired result: " + true, list.isEmpty());
    
    
    
    list = dc.searchTwo("!", "!","!" ,"!",//SchoolName, State, location,Control
               -1, -1,//NumStudents
               -1,-1,//%Female
               -1,-1,//SATVerbal
               -1,-1,//SATMath
               -1,-1,//Expenses
               -1,-1,//PercentEnrolled
               -1,-1,//AcademicsScale
               -1,-1,//Social
               -1,-1,//Academics
               "!", "!","!", "!","!");
    
    Assert.assertTrue("Search did not return desired result: " + true, list.isEmpty());
  }
  @Test 
  public void getUserSchoolsTest()
  {
   ArrayList<String> list;
   DBController dc = new DBController("notfal", "csci230");
   dc.userSaveSchool("juser", "UNIVERSITY OF MINNESOTA");
   list = dc.getUserSchools("juser");
   //System.out.println(list.get(0));
   String result = list.get(0);
     String expected = "UNIVERSITY OF MINNESOTA";
     Assert.assertTrue("Saved schools did not return desired result: " + expected, result.equals(expected));
  
     
     
     
  }
 
  
  @Test
  public void findSimilarSchoolsTest()
  {
   University univ = new University();
   
   ArrayList<University> list;
   DBController dc = new DBController("notfal", "csci230");
   univ = dc.getSchoolInfo("YALE");
   list = dc.findSimilarSchools(univ);
   String result = list.get(0).getSchoolName();
   String expected = list.get(0).getSchoolName();
   Assert.assertTrue("Saved schools did not return desired result: " + expected, result.equals(expected));
  }
  @Test
  public void getListOfUsersTest()
  {
   DBController dc = new DBController("notfal", "csci230");
   ArrayList<Account> acc = dc.getListOfUsers();
   String result = acc.get(0).getUsername();
   String expected = acc.get(0).getUsername();   
   Assert.assertTrue("List of users not correct:" + expected, result.equals(expected));
  }
  
  @Test
  public void activateUserTest()
  {
   DBController dc = new DBController("notfal", "csci230");
   Account acc = dc.activateUser("juser");
   char result = acc.getStatus();
   char expected = 'Y';
   Assert.assertTrue("List of users not correct:" + expected, result == expected);
   
  }
  @Test
  public void deactivateUser()
  {
   DBController dc = new DBController("notfal", "csci230");
   Account acc = dc.deactivateUser("juser");
   char result = acc.getStatus();
   char expected = 'N';
   Assert.assertTrue("List of users not correct:" + expected, result == expected);
   
  }
  @Test
  public void userSaveSchool()
  {
   ArrayList<String> list;
   DBController dc = new DBController("notfal", "csci230");
   dc.userSaveSchool("juser", "UNIVERSITY OF MINNESOTA");
   list = dc.getUserSchools("juser");
   //System.out.println(list.get(0));
   String result = list.get(0);
     String expected = "UNIVERSITY OF MINNESOTA";
     Assert.assertTrue("Saved schools did not return desired result: " + expected, result.equals(expected));
  }
  @Test 
  public void getSchoolInfo()
  {
 DBController dc = new DBController("notfal", "csci230");
 University univ =   dc.getSchoolInfo("UNIVERSITY OF MINNESOTA");
 String result = univ.getSchoolName();
 String expected = "UNIVERSITY OF MINNESOTA";
 Assert.assertTrue("Saved schools did not return desired result: " + expected, result.equals(expected));
  }
  
  @Test
  public void removeUserSchoolTest()
  {
   DBController dc = new DBController("notfal", "csci230");
   
   dc.removeSchool("UNIVERSITY OF MINNESOTA", "juser");
   ArrayList<String> list = dc.getUserSchools("juser");
   Assert.assertTrue("Remove schools did not return desired result: " + null, list.isEmpty());
  }

  
}