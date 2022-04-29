package com.ec.solid.lsp;

public class Facebook extends SocialMedia{

    // child Facebook is substituted of parent SocialMedia/ supports Liskov Principal

    @Override
    public void chatWithFriends() {

    }

    @Override
    public void publishPosts() {

    }

    @Override
    public void sendPhotoAndVideo() {

    }

    @Override
    public void groupVideoCall() {

    }
}
