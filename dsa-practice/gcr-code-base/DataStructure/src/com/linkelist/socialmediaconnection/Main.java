package com.linkelist.socialmediaconnection;

public class Main {
	public static void main(String[] args) {

        SocialMedia sm = new SocialMedia();

        sm.addUser(1, "Himesh", 22);
        sm.addUser(2, "Lucky", 24);
        sm.addUser(3, "Rajeev", 23);
        sm.addUser(4, "Nageshwar", 25);

        sm.addFriendConnection(1, 2);
        sm.addFriendConnection(1, 3);
        sm.addFriendConnection(2, 3);
        sm.addFriendConnection(2, 4);

        sm.displayFriends(1);
        sm.displayFriends(2);

        sm.findMutualFriends(1, 2);

        sm.removeFriendConnection(1, 3);

        sm.displayFriends(1);

        sm.countFriendsForAllUsers();
    }
}
