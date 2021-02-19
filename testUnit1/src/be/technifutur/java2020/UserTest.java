package be.technifutur.java2020;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void testageuser25valid() {
        User user = new User(25);

        assertEquals(25, user.getAge());
    }


}