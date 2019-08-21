
import com.safe2pay.API.SubscriptionAPI;
import com.safe2pay.CORE.Config;
import com.safe2pay.DTO.Address.Address;
import com.safe2pay.DTO.Customer.Customer;
import com.safe2pay.DTO.Subscription.Subscription;
import junit.framework.TestCase;
import static junit.framework.TestCase.assertNotNull;
import org.junit.Test;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lucas.silva
 */
public class SubscriptionTest extends TestCase {

    protected void setUp() {

        Config enviroment = new Config();
        enviroment.SetEnviroment("5A3A044DE838403F9566BDFBEE9DE763");
    }

    @Test
    public void testAdd() {

        Subscription subscription = new Subscription();
              
        subscription.setChargeDate("2019-06-30");
        subscription.setPlan(156);
        subscription.setIsSandbox(true);

        subscription.setSubscriptionObject(new Object() {
            private String BankAgencyDigit;
            private String BankAgency;
            private String BankAccountDigit;
            private String BankAccount;
            private Object Bank;
            {
                Bank = new Object() {
                    private String Code;
                    {
                        Code = "136";
                    }
                };
                BankAccount = "5432";
                BankAccountDigit = "1";
                BankAgency = "1234";
                BankAgencyDigit = "5";

            }
        });

        subscription.setCustomer(new Customer() {
            {
                setName("João da Silva");
                setIdentity("31037942000178");
                setEmail("safe2pay@safe2pay.com.br");
                setAddress(new Address() {
                    {
                        setZipCode("90670090");
                        setStreet("Logradouro");
                        setNumber("123");
                        setDistrict("Higienopolis");
                        setStateInitials("RS");
                        setCityName("Porto Alegre");
                        setCountryName("Brasil");
                    }
                });
            }
        });

        Object response = SubscriptionAPI.Add(subscription);

        assertNotNull(response);
    }

    @Test
    public void testGet() {

        int Id = 825;

        Object response = SubscriptionAPI.Get(Id);

        assertNotNull(response);

    }

}
