package webd4021.vud;

public class InvalidIdException extends  Exception{
  private static final long serialVersionUID = 1L;

  public InvalidIdException() {
    super();
  }

  public InvalidIdException(String errorMessage) {
    super(errorMessage);
  }
}
