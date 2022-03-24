package com.company.creational.patterns.singleton;

/**
 * This class uses eager initialization of singleton instance.
 */
public class EagerRegistry {

    private static final EagerRegistry INSTANCE = new EagerRegistry();

    private EagerRegistry(){

    }

    public static EagerRegistry getInstance(){
        return INSTANCE;
    }

}
