package webd4021.vud;

import java.text.DecimalFormat;

public class Mark {
    public static final float MINIMUM_GPA = 0.0f;
    public static final float MAXIMUM_GPA = 5.0f;

    // Placeholder for class attribute
    public static final DecimalFormat GPA = new DecimalFormat("#.#");

    private String courseCode;
    private String courseName;
    private int result;
    private float gpaWeighting;

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public float getGpaWeighting() {
        return gpaWeighting;
    }

    public void setGpaWeighting(float gpaWeighting) {
        this.gpaWeighting = gpaWeighting;
    }

    public Mark(String courseCode, String courseName, int result, float gpaWeighting) {
        setCourseCode(courseCode);
        setCourseName(courseName);
        setResult(result);
        setGpaWeighting(gpaWeighting);
    }

    public String toString() {
        return String.format("%-12s1%-35s2%d1%f3", getCourseCode(), getCourseName(), getResult(), getGpaWeighting());
    }
}
