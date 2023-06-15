package com.kodilla.stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UsersManagerTest {
    @Test
    public void testFilterChemistGroupUsernames() {
            List<String> expectedUsernames = List.of("Walter White", "Gale Boetticher");

            List<String> chemistUsernames = UsersManager.filterChemistGroupUsernames();

            assertEquals(expectedUsernames, chemistUsernames);
        }
@Test
public void testGetUsersOlderThan() {
    int expectedUserAge = 26;
    List<User> olderUsers = UsersManager.getBackUserList(expectedUserAge);

    for (User user : olderUsers) {
        Assertions.assertTrue(user.getAge() > expectedUserAge);
    }
}

@Test
    public void testGetNumberOfPost() {
    int numberOfPostUnder =115;
    List<User> numbersOfPost = UsersManager.getBackUserList(numberOfPostUnder);

    for (User user : numbersOfPost) {
        Assertions.assertTrue(user.getNumberOfPost() > numberOfPostUnder);
    }


}
}