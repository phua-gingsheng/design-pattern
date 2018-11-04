import com.phua.builder.Product;
import com.phua.factory.ContractTimeEmployee;
import com.phua.factory.Employee;
import com.phua.factory.FullTimeEmployee;
import com.phua.singleton.ThreadSafeSingleton;
import org.junit.Test;

public class TestDesignPattern {

    @Test
    public void testSingleton(){
        ThreadSafeSingleton singleton = ThreadSafeSingleton.getInstance();
        ThreadSafeSingleton safeSingleton = ThreadSafeSingleton.getInstanceUsingDoubleLocking();
        System.out.println(singleton.id);
        System.out.println(safeSingleton.id);

    }


    @Test
    public void testFactory() {

        Employee fullTime = new FullTimeEmployee("McGregor", 8, 60, Employee.Type.FULLTIME);
        System.out.println("McGregor Monthly Salary : " + fullTime.calculateMonthlySalary());
        System.out.println("McGregor Bonus : " + fullTime.calculateBonus());

        Employee contract = new ContractTimeEmployee("Khabib", 8, 100, Employee.Type.CONTRACT);
        System.out.println("Khabib Monthly Salary : " + contract.calculateMonthlySalary());
        System.out.println("Khabib Bonus : " + contract.calculateBonus());

    }

    @Test
    public void testBuilder() {
        Product iphone = Product.builder().name("iphone").price(5000d).build();
        Product samsung = Product.builder().name("samsung").price(4000d).build();
        System.out.println(iphone.getName());
        System.out.println(samsung.getName());

    }
}
