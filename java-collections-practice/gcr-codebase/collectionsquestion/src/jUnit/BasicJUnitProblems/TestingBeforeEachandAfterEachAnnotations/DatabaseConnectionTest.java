package jUnit.BasicJUnitProblems.TestingBeforeEachandAfterEachAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class DatabaseConnectionTest {

    DatabaseConnection db;

    @BeforeEach
    void setup() {
        db = new DatabaseConnection();
        db.connect();
    }

    @AfterEach
    void cleanup() {
        db.disconnect();
    }

    @Test
    void testConnectionIsEstablished() {
        assertTrue(db.isConnected());
    }

    @Test
    void testConnectionIsClosed() {
        assertTrue(db.isConnected()); 

        db.disconnect();

        assertFalse(db.isConnected());
    }
}