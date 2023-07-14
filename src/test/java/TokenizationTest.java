
import com.safe2pay.API.TokenizationAPI;
import com.safe2pay.API.TransactionAPI;
import com.safe2pay.CORE.Client;
import com.safe2pay.CORE.Config;
import com.safe2pay.DTO.Payment.CreditCard;
import com.safe2pay.DTO.Response.ResponseSafe2Pay;
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
public class TokenizationTest extends TestCase {

    protected void setUp() {

        Config enviroment = new Config();
        enviroment.SetEnviroment("x-api-key");
    }

    @Test
    public void testCreate() {

        CreditCard credit = new CreditCard();
        credit.setHolder("João da Silva");
        credit.setCardNumber("4024007153763191");
        credit.setExpirationDate("12/2019");
        credit.setSecurityCode("241");

        ResponseSafe2Pay response = TokenizationAPI.Create(credit);

        assertEquals(response.HasError, false);

        assertNotNull(response);

    }
}
