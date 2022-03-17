package com.company.creational.patterns.simple.factory;

public class Client {

    public static void main(String[] args){

        NewsPost newsPost = (NewsPost) PostFactory.createPost(EnumPostType.News);
        System.out.println(newsPost);

        Post blogPost = PostFactory.createPost(EnumPostType.Blog);
        System.out.println(blogPost);
    }
}
