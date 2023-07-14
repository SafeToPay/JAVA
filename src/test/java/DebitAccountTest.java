
import com.safe2pay.API.DebitAccountAPI;
import com.safe2pay.API.TransactionAPI;
import com.safe2pay.CORE.Config;
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

  /*
public class DebitAccountTest extends TestCase {

    protected void setUp() {

        Config enviroment = new Config();
        enviroment.SetEnviroment("x-api-key");
    }

  
    @Test
    public void testGet() {

        int Id = 8;

        ResponseSafe2Pay response = DebitAccountAPI.Get(Id);

        assertEquals(response.HasError, false);

        assertNotNull(response);

    }

    @Test
    public void testCancel() {

        int Id = 8;

        ResponseSafe2Pay response = DebitAccountAPI.Cancel(Id);

        assertEquals(response.HasError, false);

        assertNotNull(response);

    }
 

}
   */