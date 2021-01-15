package webd4021.vud;

public class InvalidUserDataException extends Exception{
  private static final long serialVersionUID = 1L;

  public InvalidUserDataException() {
    super();
  }

  public InvalidUserDataException(String errorMessage) {
    super(errorMessage);
  }
}
