package com.github.verhagen.collectorsexchange.domain.user;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class UserTest {

    @Test
    public void create() throws Exception {
        User user = User.create("Cornelis", "van den", "Coebergh");
        assertEquals(user.getFullName(), "Cornelis van den Coebergh");
    }

}
