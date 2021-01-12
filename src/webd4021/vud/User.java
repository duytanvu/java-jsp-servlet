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
    protected static final DateFormat DF = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.CANADA);

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

    public void setId(long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public User() {
        this(DEFAULT_ID, DEFAULT_PASSWORD, DEFAULT_FIRST_NAME, DEFAULT_LAST_NAME, DEFAULT_EMAIL_ADDRESS, new Date(), new Date(), DEFAULT_ENABLED_STATUS, DEFAULT_TYPE);
    }

    public User(long id, String password, String firstName, String lastName, String emailAddress, Date lastAccess, Date enrolDate, boolean enabled, char type) {
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
        return "User Info for: " + getId()
                + "\n\tName: " + getFirstName() + getLastName() + " (" + getEmailAddress() + ")"
                + "\n\tCreated on: " + getEnrolDate()
                + "\n\tLast access: " + getLastAccess();
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
}
