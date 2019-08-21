
import com.safe2pay.API.TransactionAPI;
import com.safe2pay.CORE.Client;
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
       Client.SetEnviroment("5A3A044DE838403F9566BDFBEE9DE763");
    }
    
@Test
    public void testGet() {
        
        int Id = 852920;

        Object response = TransactionAPI.Get(Id);
             
        assertNotNull(response);

    }
    
   

}