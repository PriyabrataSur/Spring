package in.Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext apctx = new AnnotationConfigApplicationContext(AppConfig.class);
        UserDao dao = apctx.getBean(UserDao.class);
        dao.getData();

        ConfigurableApplicationContext cac = (ConfigurableApplicationContext) apctx;
        cac.close();

    }
}
