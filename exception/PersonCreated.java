package one.dio.dioapi.exception;

public class PersonCreated extends Exception {
    
    public PersonCreated(Long id){
        super("Person created with id: " + id);
    }


}
