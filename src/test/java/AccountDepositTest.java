import com.safe2pay.API.AccountDepositAPI;
import com.safe2pay.CORE.Config;
import com.safe2pay.DTO.Response.ResponseSafe2Pay;
import junit.framework.TestCase;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author lucas.silva
 */
public class AccountDepositTest extends TestCase {

    protected void setUp() {

        Config enviroment = new Config();
        enviroment.SetEnviroment("x-api-key");
    }

    @Test
    public void testGetBankAccount() {

        ResponseSafe2Pay response = AccountDepositAPI.GetBankAccount();

        assertEquals(response.HasError, false);

        assertNotNull(response);

    }

    @Test
    public void testDetail() {

        int Id = 287891;

        ResponseSafe2Pay response = AccountDepositAPI.Detail(Id);

        assertEquals(response.HasError, false);

        assertNotNull(response);

    }

    @Test
    public void testList() {

        int pageNumber = 1;
        int rowsPage = 10;
        String CreatedDateInitial = "2019-07-01";
        String CreatedDateEnd = "2019-07-16";

        ResponseSafe2Pay response = AccountDepositAPI.List(CreatedDateInitial, CreatedDateEnd, pageNumber, rowsPage);

        assertEquals(response.HasError, false);

        assertNotNull(response);

    }

}
