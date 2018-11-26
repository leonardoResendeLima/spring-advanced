package standalonecollections;

import autowiring.Employee;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("standalonecollections_config.xml");
        ProductsList productList = (ProductsList) context.getBean("productsList");
        System.out.println(productList);

    }
}
