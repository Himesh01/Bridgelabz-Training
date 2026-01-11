package com.AmbulanceRoute;

public class AmbulanceRoute {

    private HospitalUnit head = null;

    public void addUnit(String name, boolean available) {
        HospitalUnit newUnit = new HospitalUnit(name, available);

        if (head == null) {
            head = newUnit;
            newUnit.next = head;
            return;
        }

        HospitalUnit temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newUnit;
        newUnit.next = head;
    }
    public void findAvailableUnit() {
        if (head == null) {
            System.out.println("No hospital units available!");
            return;
        }

        HospitalUnit temp = head;
        do {
            if (temp.available) {
                System.out.println("🚑 Redirect patient to: " + temp.name);
                return;
            }
            temp = temp.next;
        } while (temp != head);

        System.out.println("⚠️ No available units currently!");
    }

    public void removeUnit(String unitName) {
        if (head == null) return;

        HospitalUnit curr = head;
        HospitalUnit prev = null;

        do {
            if (curr.name.equalsIgnoreCase(unitName)) {

                if (curr == head && curr.next == head) {
                    head = null;
                }

                else if (curr == head) {
                    HospitalUnit temp = head;
                    while (temp.next != head) {
                        temp = temp.next;
                    }
                    head = head.next;
                    temp.next = head;
                }
                else {
                    prev.next = curr.next;
                }

                System.out.println("❌ Unit removed (maintenance): " + unitName);
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);
    }

    public void displayRoute() {
        if (head == null) return;

        HospitalUnit temp = head;
        System.out.print("Hospital Route: ");
        do {
            System.out.print(temp.name + " → ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(back to " + head.name + ")");
    }
}