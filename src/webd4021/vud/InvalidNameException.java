package webd4021.vud;

import java.io.Serial;

/** InvalidNameException to validate first name and last name extends from the InvalidUserDataException Class
 * @author Duy Tan Vu
 * @version 1.0, 01/18/2021
 * @since 1.0
 */
public class InvalidNameException extends InvalidUserDataException {
  @Serial
  private static final long serialVersionUID = 1L;

  /**
   * Default Constructor
   */
  public InvalidNameException() {
    super();
  }

  /**
   * Parameterized Constructor calling the parent's constructor
   * @param errorMessage String errorMessage
   */
  public InvalidNameException(String errorMessage) {
    super(errorMessage);
  }
}
