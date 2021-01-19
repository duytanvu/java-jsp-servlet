package webd4021.vud;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * The User class that implements CollegeInterface Parent class of Faculty and Student classes
 *
 * @author Duy Tan Vu
 * @version 1.0, 01/18/2021
 * @since 1.0
 */
public class User implements CollegeInterface {
  /** The constant containing default id */
  protected static final long DEFAULT_ID = 100123456;

  /** The constant containing default password */
  protected static final String DEFAULT_PASSWORD = "password";

  /** The constant containing minimum password length */
  protected static final byte MINIMUM_PASSWORD_LENGTH = 8;

  /** The constant containing maximum password length */
  protected static final byte MAXIMUM_PASSWORD_LENGTH = 40;

  /** The constant containing default first name */
  protected static final String DEFAULT_FIRST_NAME = "John";

  /** The constant containing default last name */
  protected static final String DEFAULT_LAST_NAME = "Doe";

  /** The constant containing default email address */
  protected static final String DEFAULT_EMAIL_ADDRESS = "john.doe@dcmail.ca";

  /** The constant containing default enabled status */
  protected static final boolean DEFAULT_ENABLED_STATUS = true;

  /** The constant containing default type */
  protected static final char DEFAULT_TYPE = 's';

  /** The constant containing id number length */
  protected static final byte ID_NUMBER_LENGTH = 9;

  /** The constant containing minimum ID */
  protected static final int MINIMUM_ID = 100000000;

  /** The constant containing maximum ID */
  protected static final int MAXIMUM_ID = 999999999;

  /** The constant containing date formatter */
  protected static final DateFormat DF =
      DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.CANADA);

  /** Instance attribute containing id */
  private long id;

  /** Instance attribute containing password */
  private String password;

  /** Instance attribute containing first name */
  private String firstName;

  /** Instance attribute containing last name */
  private String lastName;

  /** Instance attribute containing email address */
  private String emailAddress;

  /** Instance attribute containing last access date */
  private Date lastAccess;

  /** Instance attribute containing enrolled date */
  private Date enrolDate;

  /** Instance attribute containing enabled status */
  private boolean enabled;

  /** Instance attribute containing type */
  private char type;

  /**
   * Default constructor calling the parameterized constructor to set default attributes
   *
   * @throws InvalidUserDataException throw customized exception when any argument is invalid
   */
  public User() throws InvalidUserDataException {
    this(
        DEFAULT_ID,
        DEFAULT_PASSWORD,
        DEFAULT_FIRST_NAME,
        DEFAULT_LAST_NAME,
        DEFAULT_EMAIL_ADDRESS,
        new Date(),
        new Date(),
        DEFAULT_ENABLED_STATUS,
        DEFAULT_TYPE);
  }

  /**
   * Parameterized constructor for User class instance
   *
   * @param id long id number of user
   * @param password String password of user
   * @param firstName String first name of user
   * @param lastName String last name of user
   * @param emailAddress String email address of user
   * @param lastAccess Date last access of user
   * @param enrolDate Date enrolled date of user
   * @param enabled boolean enabled status of user
   * @param type char type of user
   * @throws InvalidUserDataException throw customized exception when any argument is invalid
   */
  public User(
      long id,
      String password,
      String firstName,
      String lastName,
      String emailAddress,
      Date lastAccess,
      Date enrolDate,
      boolean enabled,
      char type)
      throws InvalidUserDataException {
    setId(id);
    setPassword(password);
    setFirstName(firstName);
    setLastName(lastName);
    setEmailAddress(emailAddress);
    setLastAccess(lastAccess);
    setEnrolDate(enrolDate);
    setEnabled(enabled);
    setType(type);
  }

  /**
   * Returns a long containing the id of the class instance
   *
   * @return long id of User class instance
   */
  public long getId() {
    return id;
  }

  /**
   * Set id attribute with the passed argument
   *
   * @param id long id of user
   * @throws InvalidIdException throws a customized exception message if id is invalid
   */
  public void setId(long id) throws InvalidIdException {
    if (verifyId(id)) {
      this.id = id;
    } else if (id < 0) {
      throw new InvalidIdException(id + " is an invalid ID (negative number). Please try again.");
    } else if (id < MINIMUM_ID) {
      throw new InvalidIdException(id + " is an invalid ID (too small). Please try again.");
    } else if (id > MAXIMUM_ID) {
      throw new InvalidIdException(id + " is an invalid ID (too big). Please try again.");
    }
  }

  /**
   * Returns a String containing the password of the class instance
   *
   * @return String password of User class instance
   */
  public String getPassword() {
    return password;
  }

  /**
   * Set password attribute with the passed argument
   *
   * @param password String password of user
   * @throws InvalidPasswordException throws a customized exception message if password is invalid
   */
  public void setPassword(String password) throws InvalidPasswordException {
    if (password.length() < MINIMUM_PASSWORD_LENGTH) {
      throw new InvalidPasswordException("Password must not be less than " + MINIMUM_PASSWORD_LENGTH + " characters.");
    } else if (password.length() > MAXIMUM_PASSWORD_LENGTH) {
      throw new InvalidPasswordException("Password must not be greater than " + MAXIMUM_PASSWORD_LENGTH + " characters.");
    } else this.password = password;
  }

  /**
   * Returns a String containing the first name of the class instance
   *
   * @return String first name of User class instance
   */
  public String getFirstName() {
    return firstName;
  }

  /**
   * Set first name attribute with the passed argument
   *
   * @param firstName String first name of user
   * @throws InvalidNameException throws a customized exception message if first name is invalid
   */
  public void setFirstName(String firstName) throws InvalidNameException {
    if (firstName.trim().length() == 0) {
      throw new InvalidNameException("First name cannot be left empty. Please try again.");
    } else if (isNumeric(firstName)) {
      // Name is invalid if it's a number, name is valid if it is alphanumeric
      throw new InvalidNameException("First name cannot be a number");
    } else this.firstName = firstName;
  }

  /**
   * Returns a String containing the last name of the class instance
   *
   * @return String last name of User class instance
   */
  public String getLastName() {
    return lastName;
  }

  /**
   * Set last name attribute with the passed argument
   *
   * @param lastName String last name of User
   * @throws InvalidNameException throws a customized exception message if first name is invalid
   */
  public void setLastName(String lastName) throws InvalidNameException {
    if (lastName.trim().length() == 0) {
      throw new InvalidNameException("Last name cannot be left empty. Please try again.");
    } else if (isNumeric(lastName)) {
      // Name is invalid if it's a number, name is valid if it is alphanumeric
      throw new InvalidNameException("Last name cannot be a number");
    } else this.lastName = lastName;
  }

  /**
   * Returns a String containing the email address of the class instance
   *
   * @return String email address of User class instance
   */
  public String getEmailAddress() {
    return emailAddress;
  }

  /**
   * Set email address attribute with the passed argument
   *
   * @param emailAddress String email address of User
   */
  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  /**
   * Returns a Date containing the last access of the class instance
   *
   * @return Date last access of User class instance
   */
  public Date getLastAccess() {
    return lastAccess;
  }

  /**
   * Set last access attribute with the passed argument
   *
   * @param lastAccess Date last access of User
   */
  public void setLastAccess(Date lastAccess) {
    this.lastAccess = lastAccess;
  }

  /**
   * Returns a Date enrolled of the class instance
   *
   * @return Date enrolled of User class instance
   */
  public Date getEnrolDate() {
    return enrolDate;
  }

  /**
   * Set enroll date attribute with the passed argument
   *
   * @param enrolDate Date enrolled date of User
   */
  public void setEnrolDate(Date enrolDate) {
    this.enrolDate = enrolDate;
  }

  /**
   * Returns a boolean enabled status of the class instance
   *
   * @return boolean enabled status of User class instance
   */
  public boolean isEnabled() {
    return enabled;
  }

  /**
   * Set enabled status with the passed argument
   *
   * @param enabled boolean enabled status of User
   */
  public void setEnabled(boolean enabled) {
    this.enabled = enabled;
  }

  /**
   * Returns a char type of the class instance
   *
   * @return char type of User class instance
   */
  public char getType() {
    return type;
  }

  /**
   * Set type with the passed argument
   *
   * @param type char type of User
   */
  public void setType(char type) {
    this.type = type;
  }

  /**
   * Returns a formatted string containing user info
   *
   * @return String containing user's info
   */
  public String toString() {
    return "User Info for: "
        + getId()
        + "\n\tName: "
        + getFirstName()
        + " "
        + getLastName()
        + " ("
        + getEmailAddress()
        + ")"
        + "\n\tCreated on: "
        + getEnrolDate()
        + "\n\tLast access: "
        + getLastAccess();
  }

  /** Print to the console the string from the toString() method */
  public void dump() {
    System.out.println(toString());
  }

  /**
   * Validate and return the validity of the id
   *
   * @param id long id of user
   * @return boolean result whether the id is valid or not
   */
  public static Boolean verifyId(long id) {
    return (Long.toString(id)).length() == ID_NUMBER_LENGTH;
  }

  /**
   * Returns a String indicating the type of the object
   *
   * @return String "user"
   */
  public String getTypeForDisplay() {
    return "User";
  }

  /**
   * Validate first name and last name of user, returns a boolean value
   *
   * @param input String first name/last name
   * @return boolean the validity of first name/last name
   */
  private Boolean isNumeric(String input) {
    try {
      Double.parseDouble(input);
    } catch (NumberFormatException nfe) {
      return false;
    }
    return true;
  }
}
