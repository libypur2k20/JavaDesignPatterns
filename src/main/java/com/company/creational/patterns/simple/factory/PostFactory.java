package com.company.creational.patterns.simple.factory;

/**
 * This class acts as a simple factory for creation of
 * different posts on web site.
 */
public class PostFactory {

    public static Post createPost(EnumPostType postType){

        switch(postType){
            case Blog:
                return new BlogPost();
            case News:
                return new NewsPost();
            case Product:
                return new ProductPost();
            default:
                throw new IllegalArgumentException("Post type is unknown");
        }
    }
}
