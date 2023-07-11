package com.retailapp.loginservice.Dao;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;



import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.retailapp.loginservice.POJO.User;


@ExtendWith(MockitoExtension.class)
public class UserDaoTest {

  @Mock
  private UserDao userDao;
  
  @Test
  public void testFindByEmail() {
      String email = "test@test.com";
      User expectedUser = new User();
      expectedUser.setEmail(email);
      expectedUser.setPassword("1234567890");
      when(userDao.FindByEmail(anyString())).thenReturn(expectedUser);
      
      User actualUser = userDao.FindByEmail(email);
      
      assertThat(actualUser.getEmail()).isEqualTo(expectedUser.getEmail());

  }
}
