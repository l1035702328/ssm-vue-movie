import com.lzz.pojo.Movies;
import com.lzz.pojo.User;
import com.lzz.service.MovieService;
import com.lzz.service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class MyTest {
    @Test
    public void test1(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MovieService user=(MovieService) context.getBean("MovieServiceImpl");
        List<Movies> movies=user.queryMovies();
        for (Movies movie : movies) {
            System.out.println(movie);
        }


    }
}
