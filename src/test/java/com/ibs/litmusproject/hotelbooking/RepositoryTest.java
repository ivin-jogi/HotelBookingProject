package com.ibs.litmusproject.hotelbooking;

import static org.assertj.core.api.Assertions.assertThat;

import com.ibs.litmusproject.hotelbooking.model.User;
import com.ibs.litmusproject.hotelbooking.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class RepositoryTest {

   /* @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private UserRepository userRepository;

    // test methods go below


    @Test
    public void testCreateUser() {
        User user = new User();
        user.setFirstName("Harry");
        user.setLastName("Potter");
        user.setEmail("harry123@gmail.com");
        user.setPassword("harrypotter");


        User savedUser = userRepository.save(user);

        User existUser = entityManager.find(User.class, savedUser.getId());

        assertThat(user.getEmail()).isEqualTo(existUser.getEmail());

    }*/
}