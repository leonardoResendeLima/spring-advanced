package autowiring.assignment;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("autowiring_assignment_config.xml");
        Customer customer = (Customer) context.getBean("customer");
        System.out.println(customer);

    }
}
