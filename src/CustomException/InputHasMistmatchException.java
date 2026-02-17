package CustomException;

public class InputHasMistmatchException extends RuntimeException{

    public InputHasMistmatchException(){
        super();
    }
    public InputHasMistmatchException(String message){
        super(message);
    }

    public InputHasMistmatchException(String message , Throwable cause){
        super(message , cause);
    }
}
