package com.company.solid.singleresp;

import java.io.IOException;

//Handles incoming JSON requests that work on User resource/entity
public class UserControllerSingleResponsibility {
	//Store used by user persistence service.
    private UserPersistenceService persistenceService = new UserPersistenceService();
    
    //Create a new user
    public String createUser(String userJson) throws IOException {

        MappingService<User> mappingService = new MappingService<>();
        User user = mappingService.map(userJson, User.class);

        UserValidator userValidator = new UserValidator();
        boolean isValid = userValidator.validateUser(user);

        if(!isValid) {
            return "ERROR";
        }

        persistenceService.saveUser(user);
        
        return "SUCCESS";
    }

}