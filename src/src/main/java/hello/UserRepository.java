package src.main.java.hello;

import org.springframework.data.repository.CrudRepository;

import src.main.java.hello.User;

//this is Auto implemented by spring -

public interface UserRepository extends CrudRepository<User, Integer> {

}