package com.linkelist.socialmediaconnection;

public class SocialMedia {
	 private UserNode head;

	  

	 public void addUser(int id, String name, int age) {
		 UserNode newUser = new UserNode(id, name, age);

		 if (head == null) {
			 head = newUser;
	            return;
		 }

		 UserNode temp = head;
		 while (temp.next != null)
			 temp = temp.next;
		 
		 temp.next = newUser;
	 }

	  

	 public UserNode searchById(int id) {
		 UserNode temp = head;
		 while (temp != null) {
			 if (temp.userId == id)
				 return temp;
			 temp = temp.next;
		 }
		 return null;
	 }

	 public UserNode searchByName(String name) {
		 UserNode temp = head;
		 while (temp != null) {
			 if (temp.name.equalsIgnoreCase(name))
				 return temp;
			 temp = temp.next;
		 }
		 return null;
	 }

	 
	 public void addFriendConnection(int id1, int id2) {
		 UserNode u1 = searchById(id1);
		 UserNode u2 = searchById(id2);
		 
		 if (u1 == null || u2 == null) {
			 System.out.println("User not found");
			 return;
		 }

		 addFriend(u1, id2);
		 addFriend(u2, id1);

		 System.out.println("Friend connection added");
	 }

	 private void addFriend(UserNode user, int friendId) {
		 FriendNode newFriend = new FriendNode(friendId);
		 newFriend.next = user.friends;
		 user.friends = newFriend;
	 }

	   
	 public void removeFriendConnection(int id1, int id2) {
		 UserNode u1 = searchById(id1);
		 UserNode u2 = searchById(id2);
		 
		 if (u1 == null || u2 == null) {
			 System.out.println("User not found");
			 return;
		 }

		 removeFriend(u1, id2);
		 removeFriend(u2, id1);
		 
		 System.out.println("Friend connection removed");
	 }

	 private void removeFriend(UserNode user, int friendId) {
		 FriendNode curr = user.friends, prev = null;
		 
		 while (curr != null) {
			 if (curr.friendId == friendId) {
				 if (prev == null)
					 user.friends = curr.next;
				 else
					 prev.next = curr.next;
				 return;
			 }
			 prev = curr;
			 curr = curr.next;
		 }
	 }

	  
	 
	 public void displayFriends(int userId) {
		 UserNode user = searchById(userId);
		 
		 if (user == null) {
			 System.out.println("User not found");
			 return;	
		 }

		 System.out.print("Friends of " + user.name + ": ");
		 FriendNode temp = user.friends;

		 if (temp == null) {
			 System.out.println("No friends");
			 return;
		 }

		 while (temp != null) {
			 System.out.print(temp.friendId + " ");
			 temp = temp.next;
		 }
		 System.out.println();
	 }

	    

	 public void findMutualFriends(int id1, int id2) {
		 UserNode u1 = searchById(id1);
		 UserNode u2 = searchById(id2);
		 
		 if (u1 == null || u2 == null) {
			 System.out.println("User not found");
			 return;
		 }

		 System.out.print("Mutual Friends: ");
		 boolean found = false;
		 
		 FriendNode f1 = u1.friends;
		 while (f1 != null) {
			 FriendNode f2 = u2.friends;
			 while (f2 != null) {
				 if (f1.friendId == f2.friendId) {
					 System.out.print(f1.friendId + " ");
					 found = true;
				 }
				 f2 = f2.next;
			 }
			 f1 = f1.next;
		 }

		 if (!found)
			 System.out.print("None");
		 
		 System.out.println();
	 }

	   

	 public void countFriendsForAllUsers() {
		 UserNode temp = head;
		 
		 while (temp != null) {
			 int count = 0;
			 FriendNode f = temp.friends;
			 while (f != null) {
				 	count++;
				 	f = f.next;
			 }
			 System.out.println(temp.name + " has " + count + " friends");
			 temp = temp.next;
		 }
	 }	
}
