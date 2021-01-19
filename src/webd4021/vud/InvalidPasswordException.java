package webd4021.vud;

import java.io.Serial;

/** InvalidPasswordException to validate password extends from the InvalidUserDataException Class
 * @author Duy Tan Vu
 * @version 1.0, 01/18/2021
 * @since 1.0
 */
public class InvalidPasswordException extends InvalidUserDataException {
  @Serial
  private static final long serialVersionUID = 1L;

  /**
   * Default Constructor
   */
  public InvalidPasswordException() {
    super();
  }

  /**
   * Parameterized Constructor calling the parent's constructor
   * @param errorMessage String errorMessage
   */
  public InvalidPasswordException(String errorMessage) {
    super(errorMessage);
  }
}
