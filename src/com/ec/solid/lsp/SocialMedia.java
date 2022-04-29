package com.ec.solid.lsp;

public abstract class SocialMedia {

    // Support for Facebook, Instagram, Telegram
    public abstract void chatWithFriends();

    // Support for Facebook
    public abstract void publishPosts();

    // Support for Facebook, Instagram
    public abstract void sendPhotoAndVideo();

    // Support for Facebook, Telegram
    public abstract void groupVideoCall();

}
