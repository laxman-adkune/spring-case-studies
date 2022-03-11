package onlineshopping.onlineshopapp;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("beandata.xml");
        
        System.out.println("----------------User data-------------");
        User userdata=context.getBean("user",User.class);
        System.out.println(userdata.getUsername());
        System.out.println(userdata.getEmail());
        System.out.println(userdata.getPassword());
        System.out.println(userdata.getBilling_address());
        System.out.println(userdata.getShipping_address());
        
        System.out.println("----------------Product1 data-------------");
        Product productdata = context.getBean("product1",Product.class);
        System.out.println(productdata.getProduct_name());
        System.out.println(productdata.getPrice());
        System.out.println(productdata.getQuantity_in_stock());
        System.out.println(productdata.getImagelocation());
        
        Order order=context.getBean("order",Order.class);
        
        List<Cart> cartList=order.getCartList();
        for(Cart ca:cartList){
        	System.out.println("----------------Cart data-----------------");
            System.out.println(ca.getUser().getUsername());
            System.out.println(ca.getUser().getEmail());
            System.out.println(ca.getUser().getPassword());
            System.out.println(ca.getUser().getShipping_address());
            System.out.println(ca.getUser().getBilling_address());
           
            System.out.println("--------------All Product data-----------------");
        	for(Product p:ca.getProductList()){
        		System.out.println(p.getProduct_name());
        		System.out.println(p.getPrice());
        		System.out.println(p.getQuantity_in_stock());
        		System.out.println(p.getImagelocation());
               
        		
        	}
        	System.out.println("------------Total and status-----------");
        	System.out.println(ca.getTotal_amount());
        	System.out.println(ca.isConfirmorder());
            
        }
    }
}
