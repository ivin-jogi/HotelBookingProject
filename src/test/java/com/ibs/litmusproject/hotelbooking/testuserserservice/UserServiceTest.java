package com.ibs.litmusproject.hotelbooking.testuserserservice;

import com.ibs.litmusproject.hotelbooking.model.User;
import com.ibs.litmusproject.hotelbooking.repository.AuthorityRepository;
import com.ibs.litmusproject.hotelbooking.repository.UserRepository;
import com.ibs.litmusproject.hotelbooking.service.UserService;
import com.ibs.litmusproject.hotelbooking.service.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Date;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = UserServiceImpl.class)
public class UserServiceTest {
    @MockBean
    private UserRepository mockUserRepo;

    @MockBean
    private AuthorityRepository mockAuthorityRepo;

    @MockBean
    private BCryptPasswordEncoder mockBcryptEncode;


    @Autowired
    private UserService testUserService;

    @Test
    public void TestUserService() {
        User user = new User();
        user.setFirstName("Harry");
        user.setLastName("Potter");
        user.setEmail("harry123@gmail.com");
        user.setPassword("harrypotter");


        Mockito.when(mockUserRepo.save(user)).thenReturn(new User(user.getFirstName(), user.getLastName(),
                user.getEmail(), user.getPassword(), new Date()));

        User updatedUser = mockUserRepo.save(user);
        // assertEquals(new User(),updatedUser);
        assertThat(user.getEmail()).isEqualTo(updatedUser.getEmail());
    }
}
