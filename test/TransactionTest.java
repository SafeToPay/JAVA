
import com.safe2pay.API.TransactionAPI;
import com.safe2pay.CORE.Client;
import com.safe2pay.DTO.Response.ResponseSafe2Pay;
import junit.framework.TestCase;
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

public class TransactionTest extends TestCase {
    
    protected void setUp() {
       Client.SetEnviroment("x-api-key");
    }
    
@Test
    public void testGet() {
        
        int Id = 38737074;
        
        

        ResponseSafe2Pay response = TransactionAPI.Get(Id);
        
           
        assertEquals(response.HasError, false);
        
        assertNotNull(response);

    }
    
   

}