package stereotypes.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("stereotypes_annotation_config.xml");
        Instructor instructor = (Instructor) context.getBean("inst");
        System.out.println(instructor);

        Instructor instructor2 = (Instructor) context.getBean("inst");
        System.out.println(instructor2);

    }
}
