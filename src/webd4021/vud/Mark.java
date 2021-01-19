package webd4021.vud;

import java.text.DecimalFormat;

/**
 * The Mark class that representing student marks
 *
 * @author Duy Tan Vu
 * @version 1.0, 01/18/2021
 * @since 1.0
 */
public class Mark {
  /** The constant containing minimum GPA */
  public static final float MINIMUM_GPA = 0.0f;

  /** The constant containing maximum GPA */
  public static final float MAXIMUM_GPA = 5.0f;

  /** The constant containing DecimalFormat type to format GPA */
  public static final DecimalFormat GPA = new DecimalFormat("#.#");

  /** Instance attribute containing course code */
  private String courseCode;

  /** Instance attribute containing course name */
  private String courseName;

  /** Instance attribute containing result */
  private int result;

  /** Instance attribute containing GPA weighting */
  private float gpaWeighting;

  /**
   * Parameterized Constructor of the class Mark
   *
   * @param courseCode String the course code
   * @param courseName String the course name
   * @param result int the result
   * @param gpaWeighting float the GPA weighting
   */
  public Mark(String courseCode, String courseName, int result, float gpaWeighting) {
    setCourseCode(courseCode);
    setCourseName(courseName);
    setResult(result);
    setGpaWeighting(gpaWeighting);
  }

  /**
   * Returns a String containing the course code of the object
   *
   * @return String course code
   */
  public String getCourseCode() {
    return courseCode;
  }

  /**
   * Set this class instance course code attribute with the passed argument
   *
   * @param courseCode String course code
   */
  public void setCourseCode(String courseCode) {
    this.courseCode = courseCode;
  }

  /**
   * Returns a String containing the course name of the object
   *
   * @return String course name
   */
  public String getCourseName() {
    return courseName;
  }

  /**
   * Set this class instance course name attribute with the passed argument
   *
   * @param courseName String course name
   */
  public void setCourseName(String courseName) {
    this.courseName = courseName;
  }

  /**
   * Returns an int containing the result of the object
   *
   * @return int result
   */
  public int getResult() {
    return result;
  }

  /**
   * Set this class instance result attribute with the passed argument
   *
   * @param result int result
   */
  public void setResult(int result) {
    this.result = result;
  }

  /**
   * Returns an int containing the gpa weighting of the object
   *
   * @return float gpaWeighting
   */
  public float getGpaWeighting() {
    return gpaWeighting;
  }

  /**
   * Set this class instance gpa weighting attribute with the passed argument
   * @param gpaWeighting float gpaWeighting
   */
  public void setGpaWeighting(float gpaWeighting) {
    this.gpaWeighting = gpaWeighting;
  }

  /**
   * Returns a formatted String containing student's result
   * @return String result
   */
  public String toString() {
    return String.format(
        "%-12s %-35s %10d %-10s", getCourseCode(), getCourseName(), getResult(), GPA.format(getGpaWeighting()));
  }
}
