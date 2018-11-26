package autowiring.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("autowiring_annotation_config.xml");
        Employee employee = (Employee) context.getBean("employee");
        System.out.println(employee);

    }
}
