package in.basics.test;

import in.basics.AppConfig;
import in.basics.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext apctx = new AnnotationConfigApplicationContext(AppConfig.class);
        UserDao dao = apctx.getBean(UserDao.class);
    }
}
