
import com.safe2pay.API.InvoiceAPI;
import com.safe2pay.CORE.Config;
import com.safe2pay.DTO.Address.Address;
import com.safe2pay.DTO.Customer.Customer;
import com.safe2pay.DTO.General.Product;
import com.safe2pay.DTO.Response.ResponseSafe2Pay;
import com.safe2pay.DTO.SingleSale.SingleSale;
import com.safe2pay.DTO.SingleSale.SingleSalePaymentMethod;
import java.util.ArrayList;
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
public class InvoiceTest extends TestCase {

    protected void setUp() {

        Config enviroment = new Config();
        enviroment.SetEnviroment("x-api-key");
    }

    @Test
    public void testAdd() {

        SingleSale sale = new SingleSale();

        sale.setExpirationDate("2019-08-30");
        sale.setDueDate("2019-08-30");
        sale.setReference("Referência Teste");
        sale.setPenaltyAmount(1.00);
        sale.setInterestAmount(1.00);
        sale.setInstruction("Teste");
        sale.setCallbackUrl("https://safe2pay.com.br/api/Notify");
        

       sale.setPaymentMethods(new ArrayList<SingleSalePaymentMethod>(){{
           add(new SingleSalePaymentMethod(){{setCodePaymentMethod("1"); }});
           add(new SingleSalePaymentMethod(){{setCodePaymentMethod("2"); }});
           add(new SingleSalePaymentMethod(){{setCodePaymentMethod("3"); }});
           add(new SingleSalePaymentMethod(){{setCodePaymentMethod("4"); }});
       }});
        
  
        //Lista de produtos incluídos na cobrança
        sale.setProducts(new ArrayList<Product>() {
            {
                add(new Product("001", "Teste 1", 10, 1.99));
                add(new Product("002", "Teste 2", 3, 2.50));
                add(new Product("003", "Teste 3", 7, 1));
            }
        });

        //Dados do cliente
        sale.setCustomer(new Customer() {
            {
                setName("João da Silva");
                setIdentity("54557795000162");
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

        ///Lista de mensagens na cobrança
        sale.setMessages(new ArrayList<String>() {
            {
                add("Message 1");
                add("Message 2");
                add("Message 3");
                add("Message 4");
            }
        });

        ///Lista de mensagens na cobrança
        sale.setEmails(new ArrayList<String>() {
            {
                add("email1@email.com");
                add("email2@email.com");
                add("email3@email.com");
                add("email4@email.com");
            }
        });

        ResponseSafe2Pay response = InvoiceAPI.Add(sale);

        assertEquals(response.HasError, false);

        assertNotNull(response);
    }

    @Test
    public void testUpdate() {

         SingleSale sale = new SingleSale();

         sale.setSingleSaleHash("9af962cb6ea343aabf85a5c76670a7f9");
        sale.setExpirationDate("2019-08-30");
        sale.setDueDate("2019-08-30");
        sale.setReference("Referência Teste");
        sale.setPenaltyAmount(1.00);
        sale.setInterestAmount(1.00);
        sale.setInstruction("Teste");
        sale.setCallbackUrl("https://safe2pay.com.br/api/Notify");
        

       sale.setPaymentMethods(new ArrayList<SingleSalePaymentMethod>(){{
           add(new SingleSalePaymentMethod(){{setCodePaymentMethod("1"); }});
           add(new SingleSalePaymentMethod(){{setCodePaymentMethod("2"); }});
           add(new SingleSalePaymentMethod(){{setCodePaymentMethod("3"); }});
           add(new SingleSalePaymentMethod(){{setCodePaymentMethod("4"); }});
       }});
        
  
        //Lista de produtos incluídos na cobrança
        sale.setProducts(new ArrayList<Product>() {
            {
                add(new Product("001", "Teste 1", 10, 1.99));
                add(new Product("002", "Teste 2", 3, 2.50));
                add(new Product("003", "Teste 3", 7, 1));
            }
        });

        //Dados do cliente
        sale.setCustomer(new Customer() {
            {
                setName("João da Silva");
                setIdentity("54557795000162");
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

        ///Lista de mensagens na cobrança
        sale.setMessages(new ArrayList<String>() {
            {
                add("Message 1");
                add("Message 2");
                add("Message 3");
                add("Message 4");
            }
        });

        ///Lista de mensagens na cobrança
        sale.setEmails(new ArrayList<String>() {
            {
                add("email1@email.com");
                add("email2@email.com");
                add("email3@email.com");
                add("email4@email.com");
            }
        });

        ResponseSafe2Pay response = InvoiceAPI.Add(sale);

         assertEquals(response.HasError, false);

        assertNotNull(response);
    }

    @Test
    public void testGet() {

        String hashsale = "9af962cb6ea343aabf85a5c76670a7f9";

        ResponseSafe2Pay response = InvoiceAPI.Get(hashsale);

         assertEquals(response.HasError, false);

        assertNotNull(response);

    }

    @Test
    public void testList() {

        int pageNumber = 1;
        int rowsPage = 10;

        ResponseSafe2Pay response = InvoiceAPI.List(pageNumber, rowsPage);

        assertEquals(response.HasError, false);

        assertNotNull(response);

    }

    @Test
    public void testCancel() {

        String hashsale = "9af962cb6ea343aabf85a5c76670a7f9";

        ResponseSafe2Pay response = InvoiceAPI.Cancel(hashsale);

       assertEquals(response.HasError, false);

        assertNotNull(response);

    }

}
