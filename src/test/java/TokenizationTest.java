import com.safe2pay.API.TokenizationAPI;
import com.safe2pay.CORE.Client;
import com.safe2pay.DTO.Payment.CreditCard;
import com.safe2pay.DTO.Response.ResponseSafe2Pay;
import junit.framework.TestCase;
import org.junit.Test;

public class TokenizationTest extends TestCase {

    protected void setUp() {
        Client.setToken("x-api-key");
    }

    public void testCreate() {
        final CreditCard credit = new CreditCard();
        credit.setHolder("João da Silva");
        credit.setCardNumber("4024007153763191");
        credit.setExpirationDate("12/2019");
        credit.setSecurityCode("241");

        final ResponseSafe2Pay response = TokenizationAPI.create(credit);
        assertFalse(response.HasError);
        assertNotNull(response);
    }
}
