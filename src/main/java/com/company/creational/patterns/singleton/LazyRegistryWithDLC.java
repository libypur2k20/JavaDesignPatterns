package com.company.creational.patterns.singleton;

/**
 * This class demonstrates singleton pattern using Double Checked Locking
 * or "classic" singleton.
 * This is also a lazy initialization singleton.
 * Although this implementation solves the multi-threading issue with lazy
 * initialization, using volatile and double check locking, the volatile
 * keyword is guaranteed to work only after JVMs starting with version 1.5
 * and later.
 */
public class LazyRegistryWithDLC {

    // By using 'volatile', threads will not use their cached
    // version of INSTANCE, so everytime they want to access the
    // instance value, they will reference to the main memory,
    // and that way we can guarantee that both of these theads
    // that are coming to our synchronized block will get the
    // latest value that is present.
    private static volatile LazyRegistryWithDLC INSTANCE;

    private LazyRegistryWithDLC(){

    }

    public static LazyRegistryWithDLC getInstance() {
        if (INSTANCE == null){
            synchronized(LazyRegistryWithDLC.class){
                if (INSTANCE == null){
                    INSTANCE = new LazyRegistryWithDLC();
                }
            }
        }
        return INSTANCE;
    }

}
