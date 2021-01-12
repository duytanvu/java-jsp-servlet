package webd4021.vud;

import java.util.Date;

public class Faculty extends  User {
    public static final String DEFAULT_SCHOOL_CODE = "SET";
    public static final String DEFAULT_SCHOOL_DESCRIPTION = "School of Engineering & Technology";
    public static final String DEFAULT_OFFICE = "H-140";
    public static final int DEFAULT_PHONE_EXTENSION = 1234;

    private String schoolCode;
    private String schoolDescription;
    private String office;
    private int extension;

    public String getSchoolCode() {
        return schoolCode;
    }

    public void setSchoolCode(String schoolCode) {
        this.schoolCode = schoolCode;
    }

    public String getSchoolDescription() {
        return schoolDescription;
    }

    public void setSchoolDescription(String schoolDescription) {
        this.schoolDescription = schoolDescription;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public int getExtension() {
        return extension;
    }

    public void setExtension(int extension) {
        this.extension = extension;
    }

    public Faculty(long id, String password, String firstName, String lastName, String emailAddress, Date lastAccess, Date enrolDate, boolean enabled, char type, String schoolCode, String schoolDescription, String office, int extension) {
        super(id, password, firstName, lastName, emailAddress, lastAccess, enrolDate, enabled, type);
        setSchoolCode(schoolCode);
        setSchoolDescription(schoolDescription);
        setOffice(office);
        setExtension(extension);
    }

    public Faculty() {
        super();
        setSchoolCode(DEFAULT_SCHOOL_CODE);
        setSchoolDescription(DEFAULT_SCHOOL_DESCRIPTION);
        setOffice(DEFAULT_OFFICE);
        setExtension(DEFAULT_PHONE_EXTENSION);
    }

    @Override
    public String toString() {
        String faculty = super.toString().replace("User", "Faculty");
        faculty += "\n\t" + getSchoolDescription() + " (" + getSchoolCode() + ")"
                + "\n\tOffice: " + getOffice()
                + "\n\t(905)721-2000 x" + getExtension();
        return faculty;
    }
}
