package one.dio.dioapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import one.dio.dioapi.entity.Person;
@Repository
public interface PersonRepository extends JpaRepository<Person,Long> {
    
}
