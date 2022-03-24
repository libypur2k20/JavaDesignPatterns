package com.company.creational.patterns.singleton;

/**
 * Singleton pattern using lazy initialization holder class.
 * This ensures that we have a lazy initialization without
 * worrying about synchronization.
 */
public class LazyRegistryIODH {

    private LazyRegistryIODH(){

    }

    private static class RegistryHolder{
        private static LazyRegistryIODH INSTANCE = new LazyRegistryIODH();
    }

    public static LazyRegistryIODH getInstance(){
        return RegistryHolder.INSTANCE;
    }

}
