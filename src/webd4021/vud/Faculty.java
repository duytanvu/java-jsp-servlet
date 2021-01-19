package webd4021.vud;

import java.util.Date;

/**
 * The Faculty class that extends User class
 * Faculty is a child class of User parent class
 * @author Duy Tan Vu
 * @version 1.0, 01/18/2021
 * @since 1.0
 */
public class Faculty extends User {
  /**
   * The constant containing default school code
   */
  public static final String DEFAULT_SCHOOL_CODE = "SET";

  /**
   * The constant containing default school description
   */
  public static final String DEFAULT_SCHOOL_DESCRIPTION = "School of Engineering & Technology";

  /**
   * The constant containing default office number
   */
  public static final String DEFAULT_OFFICE = "H-140";

  /**
   * The constant containing default phone number extension
   */
  public static final int DEFAULT_PHONE_EXTENSION = 1234;


  /**
   * Instance attribute containing school code
   */
  private String schoolCode;

  /**
   * Instance attribute containing school description
   */
  private String schoolDescription;

  /**
   * Instance attribute containing office number
   */
  private String office;

  /**
   * Instance attribute containing phone number extension
   */
  private int extension;

  /**
   * Parameterized constructor for Faculty class instance
   * @param id long id number of faculty
   * @param password String password of faculty
   * @param firstName String first name of faculty
   * @param lastName String last name of faculty
   * @param emailAddress String email address of faculty
   * @param lastAccess Date last access of faculty
   * @param enrolDate Date enrolled date of faculty
   * @param enabled boolean enabled status of faculty
   * @param type char type of faculty
   * @param schoolCode String school code of faculty
   * @param schoolDescription String school description of faculty
   * @param office String office number of faculty
   * @param extension int phone extension of faculty
   * @throws InvalidUserDataException throw customized exception when any argument is invalid
   */
  public Faculty(
          long id,
          String password,
          String firstName,
          String lastName,
          String emailAddress,
          Date lastAccess,
          Date enrolDate,
          boolean enabled,
          char type,
          String schoolCode,
          String schoolDescription,
          String office,
          int extension) throws InvalidUserDataException {
    super(id, password, firstName, lastName, emailAddress, lastAccess, enrolDate, enabled, type);
    setSchoolCode(schoolCode);
    setSchoolDescription(schoolDescription);
    setOffice(office);
    setExtension(extension);
  }

  /**
   * Default constructor calling parent constructor to set default attributes
   * @throws InvalidUserDataException throw customized exception when any argument is invalid
   */
  public Faculty() throws InvalidUserDataException {
    super();
    setSchoolCode(DEFAULT_SCHOOL_CODE);
    setSchoolDescription(DEFAULT_SCHOOL_DESCRIPTION);
    setOffice(DEFAULT_OFFICE);
    setExtension(DEFAULT_PHONE_EXTENSION);
  }

  /**
   * Returns a formatted String of the Faculty object
   * @return String containing faculty information
   */
  @Override
  public String toString() {
    String faculty = super.toString().replace("User", "Faculty");
    faculty +=
            "\n\t"
                    + getSchoolDescription()
                    + " ("
                    + getSchoolCode()
                    + ")"
                    + "\n\tOffice: "
                    + getOffice()
                    + "\n\t(905)721-2000 x"
                    + getExtension();
    return faculty;
  }

  /**
   * Returns a String containing the type of Faculty object
   * @return String containing the type of Faculty object
   */
  public String getTypeForDisplay() {
    return "Faculty";
  }

  /**
   * Returns a String containing the school code of the class instance
   * @return String school code of Faculty class instance
   */
  public String getSchoolCode() {
    return schoolCode;
  }

  /**
   * Set this class instance school code attribute with the passed argument
   * @param schoolCode A String representing school code
   */
  public void setSchoolCode(String schoolCode) {
    this.schoolCode = schoolCode;
  }

  /**
   * Returns a String containing the school description of the class instance
   * @return String school description of Faculty class instance
   */
  public String getSchoolDescription() {
    return schoolDescription;
  }

  /**
   * Set this class instance school description attribute with the passed argument
   * @param schoolDescription A String representing school description
   */
  public void setSchoolDescription(String schoolDescription) {
    this.schoolDescription = schoolDescription;
  }

  /**
   * Returns a String containing the office number of the class instance
   * @return String office number of Faculty class instance
   */
  public String getOffice() {
    return office;
  }

  /**
   * Set this class instance office number attribute with the passed argument
   * @param office A String representing office number
   */
  public void setOffice(String office) {
    this.office = office;
  }

  /**
   * Returns a String containing the phone extension of the class instance
   * @return String phone extension of Faculty class instance
   */
  public int getExtension() {
    return extension;
  }

  /**
   * Set this class instance phone extension attribute with the passed argument
   * @param extension A String representing phone extension
   */
  public void setExtension(int extension) {
    this.extension = extension;
  }
}
