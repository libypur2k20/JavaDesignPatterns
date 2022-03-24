package com.company.creational.patterns.singleton;

public class Client {

    public static void main(String[] args){

        EagerRegistry registry1 = EagerRegistry.getInstance();
        EagerRegistry registry2 = EagerRegistry.getInstance();

        System.out.println("Eager Registry works? " + (registry1 == registry2));

        LazyRegistryWithDLC lazyRegistry1 = LazyRegistryWithDLC.getInstance();
        LazyRegistryWithDLC lazyRegistry2 = LazyRegistryWithDLC.getInstance();

        System.out.println("Lazy Registry  With DLC works? " + (lazyRegistry1 == lazyRegistry2));

        LazyRegistryIODH lazyRegistry3 = LazyRegistryIODH.getInstance();
        LazyRegistryIODH lazyRegistry4 = LazyRegistryIODH.getInstance();

        System.out.println("Lazy Registry IODH works? " + (lazyRegistry3 == lazyRegistry4));

    }
}
