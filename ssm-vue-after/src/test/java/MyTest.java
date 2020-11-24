import com.lzz.pojo.User;
import com.lzz.service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test1(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService user=(UserService)context.getBean("UserServiceImpl");
        User myUser=user.queryUserByNamePwd("l1035702328","fei123456");
        System.out.println(myUser);

    }
}
