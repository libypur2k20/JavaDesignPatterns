package com.company.solid.singleresp;

public class UserPersistenceService {

    private Store store = new Store();

	public void saveUser(User user){
        store.store(user);
    }

    public User getUserByName(String name){
        return store.getUser(name);
    }
}
