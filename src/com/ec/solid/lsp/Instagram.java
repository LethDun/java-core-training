package com.ec.solid.lsp;

public class Instagram extends SocialMedia{

    // child Instagram is not substituted of parent SocialMedia/ doesn't support Liskov Principal

    @Override
    public void chatWithFriends() {

    }

    @Override
    public void publishPosts() {
        //not applicable
    }

    @Override
    public void sendPhotoAndVideo() {

    }

    @Override
    public void groupVideoCall() {
        //not applicable
    }
}
