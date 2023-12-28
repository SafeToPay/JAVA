import com.safe2pay.API.TransactionAPI;
import com.safe2pay.CORE.Client;
import com.safe2pay.DTO.Response.ResponseSafe2Pay;
import junit.framework.TestCase;

public class TransactionTest extends TestCase {

    protected void setUp() {
        Client.setToken("x-api-key");
    }

    public void testGet() {
        int Id = 38737074;
        final ResponseSafe2Pay response = TransactionAPI.Get(Id);
        assertFalse(response.HasError);
        assertNotNull(response);
    }


}