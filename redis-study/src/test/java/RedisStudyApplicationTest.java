import com.lilili.study.RedisStudyApplication;
import com.lilili.study.config.RedisUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.swing.*;

@SpringBootTest(classes = RedisStudyApplication.class)
@RunWith(SpringRunner.class)
public class RedisStudyApplicationTest {

    @Autowired
    RedisUtil redisUtil;

    @Test
    public void test01() {
        redisUtil.setRedis("username:01", "lilili957");
        System.out.println(redisUtil.getRedis("username:01"));
    }
}
