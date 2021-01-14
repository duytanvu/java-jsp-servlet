package webd4021.vud;

public class InvalidPasswordException extends Exception {
  private static final long serialVersionUID = 1L;

  public InvalidPasswordException() {
    super();
  }

  public InvalidPasswordException(String errorMessage) {
    super(errorMessage);
  }
}
