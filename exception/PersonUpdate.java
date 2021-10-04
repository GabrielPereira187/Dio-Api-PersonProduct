package one.dio.dioapi.exception;

public class PersonUpdate extends Exception{

    public PersonUpdate(Long id){
        super("Person updated with id: " + id);
    }
    
}
