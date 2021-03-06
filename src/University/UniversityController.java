

/**
 * File: UniversityController.java
 * 
 * @author Jubie Alade
 * 
 * @version April 4, 2018
 */
package University;



/**
 * 
 *
 * A class that creates an array for university objects, contructs universities and 
 * 
 * adds them to the list 
 * 
 */

public class UniversityController 
{ 
 
  /**
   * 
   *
   * Constructs university object
   * 
   * 
   * 
   * @param schoolName a string containing the school name 
   * 
   * @param state a string containing the name of the state
   * 
   * @param location a string containing the name of the schools location
   * 
   * @param control a String specifying who controls the new university
   * 
   * @param numStudents an integer for the number of students at school 
   * 
   * @param percentFemale a double out of 100 representing the percentage of females in the student population
   * 
   * @param satVerbal a double out of 800 representing the average SAT Verbal exam score for all students currently enrolled in the new university
   * 
   * @param satMath a double out of 800 representing the average SAT Math exam score for all students currently enrolled in the new university
   * 
   * @param tuition a double representing the annual tuition for the new university
   * 
   * @param percentRecFinAid a double out of 100 representing the percentage of students receiving any form sort 
   * 
   * of financial assistance from the new university
   * 
   * @param numApplicants an integer representing the number of students who typically apply annually to the new university 
   * 
   * @param percentAccepted a double out of 100 representing the percentage of applicants who are admitted annually to the new university
   * 
   * @param percentEnroll a double out of 100 representing the percentage of admitted students who enroll in the new university
   * 
   * @param academicScale an int between 1 and 5 (with 5 being best) indicating the quality of the academics at the new university
   * 
   * @param social an int between 1 and 5 (with 5 being best) indicating the quality of the social life at the new university
   * 
   * @param qualOfLife an int between 1 and 5 (with 5 being best) indicating the overall quality of life at the new university
   * 
   * @param studyArea1 a string containing the name of the study area
   * 
   * @param studyArea2 a string containing the name of the study area
   * 
   * @param studyArea3 a string containing the name of the study area
   * 
   * @param studyArea4 a string containing the name of the study area
   * 
   * @param studyArea5 a string containing the name of the study area
   * 
   * 
   * 
   * @return university object created 
   * 
   */
  
  public University makeUniversity(String schoolName,String state,String location, String control, int numStudents,
                                   
                                   double percentFemale, double satVerbal,double satMath, double tuition, double percentRecFinAid,
                                   
                                   int numApplicants, double percentAccepted, double percentEnroll, int academicScale, int social,
                                   
                                   int qualOfLife, String studyArea1,String studyArea2,String studyArea3,String studyArea4, 
                                   
                                   String studyArea5)
    
  {    
    
    //contructs a university object 
    
    University university = new University(schoolName, state, location, control, numStudents,
                                           
                                           percentFemale,satVerbal,satMath, tuition, percentRecFinAid,
                                           
                                           numApplicants, percentAccepted, percentEnroll, academicScale, social,
                                           
                                           qualOfLife, studyArea1, studyArea2, studyArea3, studyArea4, 
                                           
                                           studyArea5);  
    
    
    if (percentFemale > 100 || percentFemale < 0)
    {
      throw new IllegalArgumentException("Invalid female percentage.");
    }
    else if (percentAccepted > 100 || percentAccepted < 0)
    {
      throw new IllegalArgumentException("Invalid acceptance percentage.");
    }
    else if (percentRecFinAid > 100 || percentRecFinAid < 0)
    {
      throw new IllegalArgumentException("Illegal financial aid percentage");
    }
    else if (numStudents < 0)
    {
      throw new IllegalArgumentException("Invalid number of students");
    }
    else if (satVerbal > 800 || satVerbal < 0 || satMath > 800 || satMath < 0)
    {
      throw new IllegalArgumentException("Invalid scores");
    }
    else if (tuition < 0)
    {
      throw new IllegalArgumentException("Invalid tuition");
    }
    else if (numApplicants < 0)
    {
      throw new IllegalArgumentException("Invalid num applicants");
    }
    else if (percentEnroll > 100 || percentEnroll < 0)
    {
      throw new IllegalArgumentException("Invalid enroll percentage");
    }
    else if (academicScale < 0 || academicScale > 5)
    {
      throw new IllegalArgumentException("Invalid academic scale");
    }
    else if (social < 0 || social > 5)
    {
      throw new IllegalArgumentException("Invalid social scale");
    }
    else if (qualOfLife < 0 || qualOfLife > 5)
    {
      throw new IllegalArgumentException("Invalid qual of life");
    }
    else if (control != "PRIVATE" || control != "STATE" || control != "CITY" || control != "-1")
    {
      throw new IllegalArgumentException("Invalid control");
    }
    else if (state != "ALABAMA" || state != "ALASKA" || state != "ARIZONA" || state != "ARKANSAS" ||
             state != "CALIFORNIA" || state != "COLORADO" || state != "CONNECTICUT" || state != "DELAWARE" ||
             state != "FLORIDA" || state != "GEORGIA" || state != "HAWAII" || state != "IDAHO" || state != "ILLINOIS" ||
             state != "INDIANA" || state != "IOWA" || state != "KANSAS" || state != "KENTUCKY" || state != "LOUISIANA" ||
             state != "MAINE" || state != "MARYLAND" || state != "MASSACHUSETTS" || state != "MICHIGAN" || state != "MINNESOTA" ||
             state != "MISSISSIPPI" || state != "MISSOURI" || state != "MONTANA" || state != "NEBRASKA" || 
             state != "NEVADA" || state != "NEW HAMPSHIRE" || state != "NEW MEXICO" || state != "NEW YORK" ||
             state != "NORTH CAROLINA" || state != "NORTH DAKOTA" || state != "OHIO" || state != "OKLAHOMA" ||
             state != "OREGON" || state != "PENNSYLVANIA" || state != "RHODE ISLAND" || state != "SOUTH CAROLINA" ||
             state != "SOUTH DAKOTA" || state != "TENNESSEE" || state != "TEXAS" || state != "UTAH" ||
             state != "VERMONT" || state != "VIRGINIA" || state != "WASHINGTON" || state != "WEST VIRGINIA" ||
             state != "WISCONSIN" || state != "WYOMING" || state != "FOREIGN" || state != "-1")
    {
      throw new IllegalArgumentException("Invalid state");
    }
   else if (location != "SUBURBAN" || location != "URBAN" || location != "SMALL-CITY"|| location != "-1")
   {
     throw new IllegalArgumentException("Invalid location");
   }
    
    
    
//    //adds created object to universityList
//    
//    universityList.add(university); 
//    
    
    
    //returns university object 
    
    return university; 
    
  }
  
}
