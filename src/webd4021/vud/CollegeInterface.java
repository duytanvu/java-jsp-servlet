package webd4021.vud;

/** College Interface being used by User class
 * @author Duy Tan Vu
 * @version 1.0, 01/18/2021
 * @since 1.0
 */
public interface CollegeInterface {
  /**
   * Constant string represent college's name
   */
  final String COLLEGE_NAME = "Durham College";

  /**
   * Constant string represent college's phone number
   */
  final String PHONE_NUMBER = "(905)721-2000";

  /**
   * Interface method to return the type for display
   * @return String variable for display
   */
  public String getTypeForDisplay();
}
