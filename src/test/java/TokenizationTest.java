import com.google.gson.GsonBuilder;
import com.safe2pay.api.TokenizationAPI;
import com.safe2pay.Client;
import com.safe2pay.dto.payment.CreditCard;
import com.safe2pay.dto.response.ResponseSafe2Pay;
import com.safe2pay.dto.response.details.TokenizationResponseDetail;
import junit.framework.TestCase;

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

        final ResponseSafe2Pay<TokenizationResponseDetail> response = TokenizationAPI.create(credit);
        System.out.println(new GsonBuilder().setPrettyPrinting().create().toJson(response.getResponseDetail()));
        assertFalse(response.isHasError());
        assertNotNull(response);
    }
}
