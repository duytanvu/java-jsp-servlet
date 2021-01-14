package webd4021.vud;

import java.util.Date;
import java.util.Vector;

public class Student extends User {
  public static final String DEFAULT_PROGRAM_CODE = "UNDC";
  public static final String DEFAULT_PROGRAM_DESCRIPTION = "Undeclared";
  public static final int DEFAULT_YEAR = 1;

  private String programCode;
  private String programDescription;
  private int year;
  Vector<Mark> marks = new Vector<Mark>();

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
      Vector<Mark> marks) throws InvalidIdException {
    super(id, password, firstName, lastName, emailAddress, lastAccess, enrolDate, enabled, type);
    setProgramCode(programCode);
    setProgramDescription(programDescription);
    setYear(year);
    setMarks(marks);
  }

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
      int year) throws InvalidIdException {
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

  public Student() throws InvalidIdException {
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

  public String getProgramCode() {
    return programCode;
  }

  public void setProgramCode(String programCode) {
    this.programCode = programCode;
  }

  public String getProgramDescription() {
    return programDescription;
  }

  public void setProgramDescription(String programDescription) {
    this.programDescription = programDescription;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public Vector<Mark> getMarks() {
    return marks;
  }

  public void setMarks(Vector<Mark> marks) {
    this.marks = marks;
  }

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
        + "("
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
