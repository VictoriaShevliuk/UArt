package ViktoriaProjects.UArtApplication.exeption;

public class NullEntityReferenceException extends RuntimeException{
    public NullEntityReferenceException() {    }

    public NullEntityReferenceException(String message) {
        super(message);
    }
}
