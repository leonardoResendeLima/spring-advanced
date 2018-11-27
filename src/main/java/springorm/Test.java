package springorm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springorm.dao.ProductDao;
import springorm.entity.Product;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("springorm_config.xml");
        ProductDao productDao = (ProductDao) context.getBean("product");

        Product product = new Product();
        product.setId(2);
        product.setName("Mackbook");
        product.setDesc("Fucking Great");
        product.setPrice((double) 4000);

        // productDao.create(product);
        // productDao.update(product);
        // productDao.delete(product);

        // Product result = productDao.find(1);
        List<Product> result = productDao.findAll();
        System.out.println(result);


    }
}
