package com.TrainCompanion;

public class TrainCompanion {
	private Compartment head;
	private Compartment tail;
	
	public void addCompartment(String name, boolean pantry , boolean wifi) {
		Compartment newCompartment = new Compartment (name, pantry, wifi);
		
		if(head == null) {
			head = tail = newCompartment;
		}
		else {
			tail.next = newCompartment;
			newCompartment.prev = tail;
			tail = newCompartment;
		}
	}
	
	//Remove Compartment
	public void removeCompartment(String name) {
		Compartment current = head;
		
		while(current !=null) {
			if(current.name.equals(name)) {
				if(current == head) {
					head = current.next;
					if(head != null)
						head.prev = null;
				}
				else if(current == tail) {
					tail = current.prev;
					tail.next  = null;
				}
				else {
					current.prev.next = current.next;
					current.next.prev = current.prev;
				}
				System.out.println("Compartment "+ name + "removed ");
				return;
			}
			current = current.next;
		}
		System.out.println("Compartment not found");
	}
	
	//Traverse Forward
	public void traverseForward() {
		Compartment current = head;
		System.out.println("Forward traversal");
		
		while(current != null) {
			displayCompartment(current);
			current = current.next;
		}
	}
	
	//Traverse Backward
	public void traverseBackward() {
		Compartment current = tail;
		System.out.println("Backward traversal");
		
		while(current != null) {
			displayCompartment(current);
			current = current.prev;
		}
	}
	
	//Search service
	public void searchService(String service) {
		Compartment current  = head;
		System.out.println("Compartments with " + service +";");
		
		while(current != null) {
			if(service.equalsIgnoreCase("pantry") && current.hasPantry || service.equalsIgnoreCase("wifi") && current.hasWifi) {
				System.out.println(current.name);
			}
			current = current.next;
		}
	}
	
	//Show Adjacent Compartment
	public void showAdjacent(String name) {
		Compartment current = head;
		
		while( current != null) {
			if(current.name.equals(name)) {
				System.out.println("Current" + current.name);
				System.out.println("Previous: " +
                        (current.prev != null ? current.prev.name : "None"));
                System.out.println("Next: " +
                        (current.next != null ? current.next.name : "None"));
                return;
            }
            current = current.next;
        }
        System.out.println("Compartment not found.");
    }
	
	//display
	private void displayCompartment(Compartment c) {
        System.out.println(
                c.name +
                " | Pantry: " + (c.hasPantry ? "Yes" : "No") +
                " | WiFi: " + (c.hasWifi ? "Yes" : "No")
        );
    }
}
