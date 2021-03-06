package petstoreproject.petstore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jdk.management.resource.internal.inst.SocketOutputStreamRMHooks;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
     ApplicationContext context = new ClassPathXmlApplicationContext("springbeans.xml");
     
     //PetStore class                  xml id ,class name
     PetStore store = context.getBean("petStore",PetStore.class);
     System.out.println(store.getStoreName());
     System.out.println(store.getAddress());
     
     //Customer class                   xml id ,class name
     Customer store1 = context.getBean("ncustomer",Customer.class);
     System.out.println(store1.getCustomerName());
     System.out.println(store1.getAddress());
     System.out.println(store1.getEmail());
     
     Customer store11 = context.getBean("customer",Customer.class);
     System.out.println(store11.getCustomerName());
     System.out.println(store11.getAddress());
     System.out.println(store11.getEmail());
     
     //Pet class                    xml id ,class name
     Pet store111 = context.getBean("pet",Pet.class);
     System.out.println(store111.getPetName());
     System.out.println(store111.getAge());
     System.out.println(store111.getType());
     
     //PetService class with reference of PetStore
     PetService petS = context.getBean("petS",PetService.class);
     System.out.println(petS.getPetStore().getStoreName());
     System.out.println(petS.getPetStore().getAddress());
     
    // PetHelpLineService petHelp = context.getBean("petNumber",PetHelpLineService.class);
    // System.out.println(petHelp.getPetHelpLineNumber());
     // System.out.println(petS.getHelpLineNumber().getPetHelpLineNumber());
    }
}
