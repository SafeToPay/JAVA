import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.safe2pay.Client;
import com.safe2pay.api.TransactionAPI;
import com.safe2pay.dto.response.ResponseSafe2Pay;
import com.safe2pay.dto.response.details.TransactionResponseDetail;
import junit.framework.TestCase;

public class TransactionTest extends TestCase {

    protected void setUp() {
        Client.setToken("x-api-key");
    }

    public void testGet() {
        int Id = 38737074;
        final ResponseSafe2Pay<TransactionResponseDetail> response = TransactionAPI.Get(Id);
        try {
            System.out.println(new ObjectMapper().writeValueAsString(response.getResponseDetail()));
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        assertFalse(response.isHasError());
        assertNotNull(response);
    }


}