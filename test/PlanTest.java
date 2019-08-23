
import com.safe2pay.API.PlanAPI;
import com.safe2pay.CORE.Config;
import com.safe2pay.DTO.Plan.Plan;
import com.safe2pay.DTO.Plan.PlanFrequence;
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
public class PlanTest extends TestCase {

    protected void setUp() {

        Config enviroment = new Config();
        enviroment.SetEnviroment("x-api-key");
    }

    @Test
    public void testAdd() {

        Plan plan = new Plan();
        //Frequencia do plano
        // Code	Name
        // 1	Mensal
        // 2	Bimestral
        // 3	Trimestral
        // 4	Semestral
        // 5	Anual
        // 6	Semanal
        // 7	Diário
        plan.setPlanFrequence(new PlanFrequence() {
            {
                setCode("1");
            }
        });

        //Nome do plano
        plan.setName("Teste");
        // Valor do plano
        plan.setAmount(10.00);
        // Limite de adesões
        plan.setSubscriptionLimit(200);
// Período de teste 
        plan.setDaysTrial(30);
        // Dias de inadimplência
        plan.setDaysToInactive(2);
        // Dia de cobrança
        plan.setChargeDay(10);
        // Taxa de adesão
        plan.setSubscriptionTax(20.00);
        //Cobrança Pro-Rata
        plan.setIsProRata(true);
        //Ativado
        plan.setIsEnabled(true);
        //Cobrar imediatamente
        plan.setIsImmediateCharge(true);
        // URL de callback para notificação via Webhook
        plan.setCallbackUrl("https://webhook.site/251107e2-bdb1-480d-934c-bab0eb413318");

        ResponseSafe2Pay response = PlanAPI.Add(plan);

        assertEquals(response.HasError, false);

        assertNotNull(response);
    }

    @Test
    public void testUpdate() {

        Plan plan = new Plan();

        plan.setId(156);
        //Frequencia do plano
        // Code	Name
        // 1	Mensal
        // 2	Bimestral
        // 3	Trimestral
        // 4	Semestral
        // 5	Anual
        // 6	Semanal
        // 7	Diário
        plan.setPlanFrequence(new PlanFrequence() {
            {
                setCode("1");
            }
        });

        //Nome do plano
        plan.setName("Teste");
        // Valor do plano
        plan.setAmount(10.00);
        // Limite de adesões
        plan.setSubscriptionLimit(200);
// Período de teste 
        plan.setDaysTrial(30);
        // Dias de inadimplência
        plan.setDaysToInactive(2);
        // Dia de cobrança
        plan.setChargeDay(10);
        // Taxa de adesão
        plan.setSubscriptionTax(20.00);
        //Cobrança Pro-Rata
        plan.setIsProRata(true);
        //Ativado
        plan.setIsEnabled(true);
        //Cobrar imediatamente
        plan.setIsImmediateCharge(true);
        // URL de callback para notificação via Webhook
        plan.setCallbackUrl("https://webhook.site/251107e2-bdb1-480d-934c-bab0eb413318");

        ResponseSafe2Pay response = PlanAPI.Add(plan);

        assertEquals(response.HasError, false);

        assertNotNull(response);
    }

    @Test
    public void testGet() {

        int Id = 156;

        ResponseSafe2Pay response = PlanAPI.Get(Id);

        assertEquals(response.HasError, false);

        assertNotNull(response);

    }

    @Test
    public void testList() {

        int pageNumber = 1;
        int rowsPage = 10;

        ResponseSafe2Pay response = PlanAPI.List(pageNumber, rowsPage);

        assertEquals(response.HasError, false);

        assertNotNull(response);

    }

}
