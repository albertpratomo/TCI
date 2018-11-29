package UserService;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class UserServiceTest {

    @Test
    public void userGetsNewCorrectPasswordAndAddedToBackend() throws Exception {
        // ARRANGE
        // Create mockUser
        User mockUser = mock(User.class);
        //Specify behaviours
        when(mockUser.getPassword()).thenReturn("password");

        // Create mockSecurityService
        SecurityService mockSecurityService = mock(SecurityService.class);
        //Specify behaviours
        when(mockSecurityService.md5(mockUser.getPassword())).thenReturn("passwordmd5");

        // Create mockDAO
        UserDAO mockDAO = mock(UserDAO.class);
        //Specify behaviours

        // Create SUT
        UserServiceImpl SUT = new UserServiceImpl(mockDAO, mockSecurityService);

        // ACT
        SUT.assignPassword(mockUser);

        // ASSERT
        verify(mockUser).setPassword("passwordmd5");
        verify(mockDAO).updateUser(mockUser);
    }
}
