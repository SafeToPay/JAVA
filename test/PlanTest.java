import com.safe2pay.API.PlanAPI;
import com.safe2pay.CORE.Config;
import com.safe2pay.DTO.Plan.Plan;
import com.safe2pay.DTO.Plan.PlanFrequence;
import com.safe2pay.DTO.Response.ResponseSafe2PayRecurrence;
import junit.framework.TestCase;
import org.junit.Test;

///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
///**
// *
// * @author lucas.silva
// */
public class PlanTest extends TestCase {

    protected void setUp() {

        Config enviroment = new Config();
        enviroment.SetEnviroment("x-api-key");
    }

    @Test
    public void testAdd() {

        Plan plan = new Plan();
        // Modelos de plano
        // Code Tipo
        // 1 Personalizado
        // 2 Fixo
        plan.setPlanOption(1);
        // Frequencia do plano
        // Code Name
        // 1 Mensal
        // 2 Bimestral
        // 3 Trimestral
        // 4 Semestral
        // 5 Anual
        // 6 Semanal
        // 7 Diário
        plan.setPlanFrequence(1);

        // Nome do plano
        plan.setName("Teste SDK JAVA");

        plan.setDescription("Teste SDK JAVA");
        // Valor do plano
        plan.setAmount(10.00);
        // Dia de cobrança
        plan.setChargeDay(10);
        // Taxa de adesão
        plan.setSubscriptionTax(10);
        // Limite de adesões
        plan.setSubscriptionLimit(10);
        // Geração da cobrança até 1 hora após a criação da assinatura
        plan.setIsImediateCharge(true);
        // Números de ciclos do plano
        plan.setBillingCycle(6);
        // Dias Dias que antecedem o vencimento para envio do boleto
        plan.setDaysBeforeChargeDateExpiration(3);
        // URL de callback para notificação via Webhook
        plan.setCallbackUrl("https://callbacks.exemplo.com.br/api/Notify");
        // Dia do vencimento
        plan.setDaysDue(20);
        // Instrução que será enviada no boleto
        plan.setInstruction("Pagável até o vencimento");
        // Multa que será aplicado após o vencimento
        plan.setPenaltyAmount(1.00);
        // Juros que será aplicado após o vencimento
        plan.setInterestAmount(1.00);
        // Tipo de desconto
        plan.setDiscountType(1);
        // Quantidade de dias limites de desconto
        plan.setDiscountDue(3);
        // Valor de desconto
        plan.setDiscountAmount(1.00);

        ResponseSafe2PayRecurrence response = PlanAPI.Add(plan);

        assertEquals(response.success, true);

        assertNotNull(response);
    }

    @Test
    public void testDisable() {

        int Id = 4017;

        ResponseSafe2PayRecurrence response = PlanAPI.DisablePlan(Id);

        assertEquals(response.success, false);

        assertNotNull(response);
    }

    @Test
    public void testGet() {

        int Id = 4402;

        ResponseSafe2PayRecurrence response = PlanAPI.Get(Id);
        assertEquals(response.success, true);

        assertNotNull(response);

    }

    @Test
    public void testList() {

        String Name = "Teste";
        boolean IsEnabled = true;
        int pageNumber = 1;
        int rowsPage = 10;

        ResponseSafe2PayRecurrence response = PlanAPI.List(Name, IsEnabled, pageNumber, rowsPage);

        assertEquals(response.success, true);

        assertNotNull(response);

    }

}
