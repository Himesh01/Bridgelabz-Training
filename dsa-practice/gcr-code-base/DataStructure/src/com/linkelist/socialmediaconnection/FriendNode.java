package com.linkelist.socialmediaconnection;

public class FriendNode {
	int friendId;
    FriendNode next;

    FriendNode(int friendId) {
        this.friendId = friendId;
        this.next = null;
    }
}
