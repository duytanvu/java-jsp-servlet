package webd4021.vud;

public class InvalidNameException extends Exception {
  private static final long serialVersionUID = 1L;

  public InvalidNameException() {
    super();
  }

  public InvalidNameException(String errorMessage) {
    super(errorMessage);
  }
}
