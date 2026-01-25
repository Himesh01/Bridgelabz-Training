package jUnit.BasicJUnitProblems.TestingListOperations;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ListManagerTest {

    ListManager manager;
    List<Integer> list;

    @BeforeEach
    void setup() {
        manager = new ListManager();
        list = new ArrayList<>();
    }

    @Test
    void testAddElement() {
        manager.addElement(list, 10);
        manager.addElement(list, 20);

        assertEquals(2, manager.getSize(list));
        assertTrue(list.contains(10));
        assertTrue(list.contains(20));
    }

    @Test
    void testRemoveElement() {
        list.add(10);
        list.add(20);

        boolean removed = manager.removeElement(list, 10);

        assertTrue(removed);
        assertFalse(list.contains(10));
        assertEquals(1, manager.getSize(list));
    }

    @Test
    void testGetSize() {
        assertEquals(0, manager.getSize(list));

        manager.addElement(list, 5);
        manager.addElement(list, 15);

        assertEquals(2, manager.getSize(list));
    }
}