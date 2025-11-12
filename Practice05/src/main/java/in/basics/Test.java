package in.basics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext apctx = new ClassPathXmlApplicationContext("bean.xml");
        UserDao dao = apctx.getBean(UserDao.class);
        dao.getData();

        ConfigurableApplicationContext cac = (ConfigurableApplicationContext) apctx;
        cac.close();
    }
}
