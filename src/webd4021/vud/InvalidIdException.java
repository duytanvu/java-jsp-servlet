package webd4021.vud;

import java.io.Serial;

/** InvalidIdException to validate ID extends from the InvalidUserDataException Class
 * @author Duy Tan Vu
 * @version 1.0, 01/18/2021
 * @since 1.0
 */
public class InvalidIdException extends InvalidUserDataException{
  @Serial
  private static final long serialVersionUID = 1L;

  /**
   * Default Constructor
   */
  public InvalidIdException() {
    super();
  }

  /**
   * Parameterized Constructor calling the parent's constructor
   * @param errorMessage String errorMessage
   */
  public InvalidIdException(String errorMessage) {
    super(errorMessage);
  }
}
