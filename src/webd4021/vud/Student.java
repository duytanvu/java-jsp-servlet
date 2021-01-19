package webd4021.vud;

import java.util.Date;
import java.util.Vector;

/**
 * The Student class that extends User class
 * Student is a child class of User parent class
 * @author Duy Tan Vu
 * @version 1.0, 01/18/2021
 * @since 1.0
 */
public class Student extends User {
  /**
   * The constant containing default program code
   */
  public static final String DEFAULT_PROGRAM_CODE = "UNDC";

  /**
   * The constant containing default program description
   */
  public static final String DEFAULT_PROGRAM_DESCRIPTION = "Undeclared";

  /**
   * The constant containing default year
   */
  public static final int DEFAULT_YEAR = 1;

  /**
   * Instance attribute containing program code
   */
  private String programCode;

  /**
   * Instance attribute containing program description
   */
  private String programDescription;

  /**
   * Instance attribute containing year
   */
  private int year;

  /**
   * Instance attribute containing vector of marks
   */
  Vector<Mark> marks = new Vector<Mark>();

  /**
   * Parametrized Constructor call the parent's constructor
   * @param id long student id
   * @param password String password
   * @param firstName String student first name
   * @param lastName String student last name
   * @param emailAddress String email address
   * @param lastAccess Date last access
   * @param enrolDate Date enroll date
   * @param enabled boolean enabled status
   * @param type char type
   * @param programCode String program code
   * @param programDescription String program description
   * @param year int year
   * @param marks Vector marks
   * @throws InvalidUserDataException throws a customized exception if any argument is invalid
   */
  public Student(
      long id,
      String password,
      String firstName,
      String lastName,
      String emailAddress,
      Date lastAccess,
      Date enrolDate,
      boolean enabled,
      char type,
      String programCode,
      String programDescription,
      int year,
      Vector<Mark> marks) throws InvalidUserDataException {
    super(id, password, firstName, lastName, emailAddress, lastAccess, enrolDate, enabled, type);
    setProgramCode(programCode);
    setProgramDescription(programDescription);
    setYear(year);
    setMarks(marks);
  }

  /**
   * An overloaded Constructor overloading parameterized constructor and add empty vector of marks
   * @param id long student id
   * @param password String password
   * @param firstName String student first name
   * @param lastName String student last name
   * @param emailAddress String email address
   * @param lastAccess Date last access
   * @param enrolDate Date enroll date
   * @param enabled boolean enabled status
   * @param type char type
   * @param programCode String program code
   * @param programDescription String program description
   * @param year int year
   * @throws InvalidUserDataException throws a customized exception if any argument is invalid
   */
  public Student(
      long id,
      String password,
      String firstName,
      String lastName,
      String emailAddress,
      Date lastAccess,
      Date enrolDate,
      boolean enabled,
      char type,
      String programCode,
      String programDescription,
      int year) throws InvalidUserDataException {
    this(
        id,
        password,
        firstName,
        lastName,
        emailAddress,
        lastAccess,
        enrolDate,
        enabled,
        type,
        programCode,
        programDescription,
        year,
        new Vector<Mark>(0));
  }

  /**
   * Default constructor that set all attributes to default value calling the overloaded parameterized constructor
   * @throws InvalidUserDataException hrows a customized exception if any argument is invalid
   */
  public Student() throws InvalidUserDataException {
    this(
        DEFAULT_ID,
        DEFAULT_PASSWORD,
        DEFAULT_FIRST_NAME,
        DEFAULT_LAST_NAME,
        DEFAULT_EMAIL_ADDRESS,
        new Date(),
        new Date(),
        DEFAULT_ENABLED_STATUS,
        DEFAULT_TYPE,
        DEFAULT_PROGRAM_CODE,
        DEFAULT_PROGRAM_DESCRIPTION,
        DEFAULT_YEAR);
  }

  /**
   * Returns a String containing student's program code
   * @return String programCode
   */
  public String getProgramCode() {
    return programCode;
  }

  /**
   * Set the programCode attribute of Student object with the passed argument
   * @param programCode String programCode
   */
  public void setProgramCode(String programCode) {
    this.programCode = programCode;
  }

  /**
   * Returns a String containing student's program description
   * @return String programDescription
   */
  public String getProgramDescription() {
    return programDescription;
  }

  /**
   * Set the programDescription attribute of Student object with the passed argument
   * @param programDescription String programDescription
   */
  public void setProgramDescription(String programDescription) {
    this.programDescription = programDescription;
  }

  /**
   * Returns an int containing student's current year
   * @return int year
   */
  public int getYear() {
    return year;
  }

  /**
   * Set the year attribute of Student object with the passed argument
   * @param year int year
   */
  public void setYear(int year) {
    this.year = year;
  }

  /**
   * Returns a vector containing student's marks
   * @return Vector of marks
   */
  public Vector<Mark> getMarks() {
    return marks;
  }

  /**
   * Set the marks vector of Student object with the passed argument
   * @param marks Vector of marks
   */
  public void setMarks(Vector<Mark> marks) {
    this.marks = marks;
  }

  /**
   * Returns a formatted String containing Student information
   * @return String result
   */
  @Override
  public String toString() {
    String yearSuffix;
    if (getYear() == 1) yearSuffix = "st";
    else if (getYear() == 2) yearSuffix = "nd";
    else if (getYear() == 3) yearSuffix = "rd";
    else yearSuffix = "th";

    return "Student Info for: "
        + "\n\t"
        + getFirstName()
        + " "
        + getLastName()
        + " ("
        + getId()
        + ")"
        + "\n\tCurrently in "
        + getYear()
        + yearSuffix
        + " year of "
        + getProgramDescription()
        + " ("
        + getProgramCode()
        + ")"
        + "\n\tEnrolled: "
        + getEnrolDate();
  }
}
