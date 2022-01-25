import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld beanExtra =(HelloWorld) applicationContext.getBean("helloworld");
        Cat catBean = (Cat) applicationContext.getBean("cat");
        System.out.println(catBean.getMessage());
        Cat catBean2 = (Cat) applicationContext.getBean("cat");
        System.out.println(catBean2.getMessage());

        System.out.println("==============");
        System.out.println(bean==beanExtra);
        System.out.println(catBean==catBean2);

    }
}