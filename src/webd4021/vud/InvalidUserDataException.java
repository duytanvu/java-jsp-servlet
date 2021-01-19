package webd4021.vud;

import java.io.Serial;

/** InvalidPasswordException to validate user data extends from the Exception Class
 * @author Duy Tan Vu
 * @version 1.0, 01/18/2021
 * @since 1.0
 */
public class InvalidUserDataException extends Exception{
  @Serial
  private static final long serialVersionUID = 1L;

  /**
   * Default Constructor
   */
  public InvalidUserDataException() {
    super();
  }

  /**
   * Parameterized Constructor calling the parent's constructor
   * @param errorMessage String errorMessage
   */
  public InvalidUserDataException(String errorMessage) {
    super(errorMessage);
  }
}
