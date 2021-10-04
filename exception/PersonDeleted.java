package one.dio.dioapi.exception;

public class PersonDeleted extends Exception{

    public PersonDeleted(Long id){
        super("Person deleted with id: " + id);
    }
    
}
