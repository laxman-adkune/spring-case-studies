package ratingproject.ratingapp;

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
    	
        ApplicationContext context=new ClassPathXmlApplicationContext("springbeans.xml");
        System.out.println("============================User Details================================");

        User user=context.getBean("user",User.class);
        System.out.println("Username:"+user.getUsername());
        System.out.println("Emailid:"+user.getEmailid());
        System.out.println("Mobileno:"+user.getMobileno());
        System.out.println("Password:"+user.getPassword());
        System.out.println("============================Financial Product================================");
        Financialproduct financialproduct=context.getBean("financialproduct",Financialproduct.class);
        System.out.println("Product_Id:"+financialproduct.getFinancialproductid());
        System.out.println("Product_Name:"+financialproduct.getFinancialproduct_name());
        System.out.println("Product_Description:"+financialproduct.getDescription());
        System.out.println("Product_Rating:"+financialproduct.getRating());
        
        System.out.println("============================Review================================");

        System.out.println("Review_id:"+financialproduct.getReview().getReviewid());
        System.out.println("Product_Name:"+financialproduct.getReview().getFinancialproduct_reviewed().getFinancialproduct_name());

        System.out.println("Review_Text:"+financialproduct.getReview().getReview_text());
        System.out.println("============================Comments================================");
        List<Comment> comments=financialproduct.getReview().getComments();
        for(Comment c:comments){
        	System.out.println("-----------------------comment--------------------------------");
        	System.out.println("Comment_id:"+c.getComment_id());
        	System.out.println("Comments_text:"+c.getComment_text());
        	System.out.println("Comment_Like:"+c.getLikes());
        	System.out.println("Comment_dislike:"+c.getDislikes());


        }





    }
}
