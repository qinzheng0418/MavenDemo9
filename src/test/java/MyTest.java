import dao.UserDao;
import domain.User;
import org.junit.Test;


import java.util.List;


public class MyTest {

    @Test
    public void test1() throws Exception {
        List<User> allUser = new UserDao().findAllUser();
        System.out.println(allUser);
    }
}
