package webd4021.vud;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class User implements CollegeInterface {
  protected static final long DEFAULT_ID = 100123456;
  protected static final String DEFAULT_PASSWORD = "password";
  protected static final byte MINIMUM_PASSWORD_LENGTH = 8;
  protected static final byte MAXIMUM_PASSWORD_LENGTH = 40;
  protected static final String DEFAULT_FIRST_NAME = "John";
  protected static final String DEFAULT_LAST_NAME = "Doe";
  protected static final String DEFAULT_EMAIL_ADDRESS = "john.doe@dcmail.ca";
  protected static final boolean DEFAULT_ENABLED_STATUS = true;
  protected static final char DEFAULT_TYPE = 's';
  protected static final byte ID_NUMBER_LENGTH = 9;
  protected static final DateFormat DF =
      DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.CANADA);

  private long id;
  private String password;
  private String firstName;
  private String lastName;
  private String emailAddress;
  private Date lastAccess;
  private Date enrolDate;
  private boolean enabled;
  private char type;

  public long getId() {
    return id;
  }

  public void setId(long id) throws InvalidIdException {
    if (id < 100000000 || id > 999999999) {
      throw new InvalidIdException(id + " is invalid. Please try again.");
    } else {
      this.id = id;
    }
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) throws InvalidPasswordException {
    if (password.length() < 8) {
      throw new InvalidPasswordException("Password must not be less than 8 characters.");
    } else if (password.length() > 30) {
      throw new InvalidPasswordException("Password must not be greater than 30 characters.");
    } else this.password = password;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) throws InvalidNameException {
    if (firstName.trim().length() == 0) {
      throw new InvalidNameException("First name cannot be left empty. Please try again.");
    } else if (isNumeric(firstName)) {
      throw new InvalidNameException("First name cannot be a number");
    } else this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) throws InvalidNameException {
    if (lastName.trim().length() == 0) {
      throw new InvalidNameException("Last name cannot be left empty. Please try again.");
    } else if (isNumeric(lastName)) {
      throw new InvalidNameException("Last name cannot be a number");
    } else this.lastName = lastName;
  }

  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public Date getLastAccess() {
    return lastAccess;
  }

  public void setLastAccess(Date lastAccess) {
    this.lastAccess = lastAccess;
  }

  public Date getEnrolDate() {
    return enrolDate;
  }

  public void setEnrolDate(Date enrolDate) {
    this.enrolDate = enrolDate;
  }

  public boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(boolean enabled) {
    this.enabled = enabled;
  }

  public char getType() {
    return type;
  }

  public void setType(char type) {
    this.type = type;
  }

  public User() throws InvalidIdException, InvalidPasswordException, InvalidNameException {
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
          throws InvalidIdException, InvalidPasswordException, InvalidNameException {
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

  public String toString() {
    return "User Info for: "
        + getId()
        + "\n\tName: "
        + getFirstName()
        + getLastName()
        + " ("
        + getEmailAddress()
        + ")"
        + "\n\tCreated on: "
        + getEnrolDate()
        + "\n\tLast access: "
        + getLastAccess();
  }

  public void dump() {
    System.out.println(toString());
  }

  public static Boolean veridyId(long id) {
    return id >= 100000000 && id <= 999999999;
  }

  public String getTypeForDisplay() {
    return "";
  }

  private Boolean isNumeric(String input) {
    try {
      double d = Double.parseDouble(input);
    } catch (NumberFormatException nfe) {
      return false;
    }
    return true;
  }
}
