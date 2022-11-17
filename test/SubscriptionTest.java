import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.safe2pay.API.SubscriptionAPI;
import com.safe2pay.CORE.Config;
import com.safe2pay.DTO.Address.Address;
import com.safe2pay.DTO.Address.City;
import com.safe2pay.DTO.Customer.Customer;
import com.safe2pay.DTO.Plan.Plan;
import com.safe2pay.DTO.Response.ResponseSafe2PayRecurrence;
import com.safe2pay.DTO.Subscription.Subscription;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

//*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//
///**
// *
// * @author lucas.silva
// */
public class SubscriptionTest extends TestCase {

    protected void setUp() {

        Config enviroment = new Config();
        enviroment.SetEnviroment("58D772128EB247E5A34F527B5CA76325");
    }

    @Test
    public void testAdd() {

        Subscription subscription = new Subscription();

        subscription.setPaymentMethod(1);

        subscription.setEmails(new ArrayList<String>() {
            {
                add("safe2pay@safe2pay.com.br");
                add("email2@email.com");
            }
        });

        subscription.setCustomer(new Customer() {
            {
                setName("João da Silva");
                setIdentity("54557795000162");
                setEmail("safe2pay@safe2pay.com.br");
                setAddress(new Address() {
                    {
                        setZipCode("90670090");
                        setStreet("Logradouro");
                        setNumber("123");
                        setDistrict("Higienopolis");
                        setStateInitials("RS");
                        setCityName("Porto Alegre");
                        setCountryName("Brasil");
                        setCity(new City(){
                            {
                                setCodeIBGE("4323002");
                            }
                        });
                    }
                });
            }
        });

        int id = 4402;

        ResponseSafe2PayRecurrence response = SubscriptionAPI.Add(id,subscription);

        assertEquals(response.success, true);

        assertNotNull(response);
    }

    @Test
    public void testGet() {

        int Id = 10532;

        ResponseSafe2PayRecurrence response = SubscriptionAPI.Get(Id);

         assertEquals(response.success, true);

         assertNotNull(response);

         }

         public void testList(){

         int pageNumber = 1;
         int rowsPage = 10 ;
         String CustomerName = "Teste";
         String Status = "Ativo";
         String InitialDate = "12-02-2022";
         String EndDate = "12-10-2022";
         int IdPlan = 4019;


             ResponseSafe2PayRecurrence response = SubscriptionAPI.List(pageNumber, rowsPage, CustomerName, Status, InitialDate, EndDate, IdPlan);

         assertEquals(response.success, true);

         assertNotNull(response);

         }

         public void testDisable(){

         int Id = 17483;

             ResponseSafe2PayRecurrence response = SubscriptionAPI.DisableSubscription(Id);

         assertEquals(response.success, true);

        assertNotNull(response);

    }

    public void testSimulation() {

        Subscription simulation = new Subscription();

        simulation.setSubscriptionDate("2022-03-25");
        simulation.setPaymentMethod(1);
        simulation.setPlan(new Plan() {
            {
                setPlanFrequence(1);
                setName("Teste");
                setDescription("Teste");
                setAmount(10);
                setSubscriptionTax(0);
                setSubscriptionLimit(0);
                setChargeDay(5);
                setDaysChurn(0);
                setDaysChurnAlert(0);
                setDaysDelayAlert(0);
                setIsEnabled(true);
                setIsImediateCharge(true);
                setIsChargeOverdue(true);
                setCallbackUrl("String");
                setDaysDue(0);
                setDaysBeforeCancel(0);
                setInstruction("String");
                setPenaltyAmount(0);
                setInterestAmount(0);
                setMessage("String");
                setDiscountType(0);
                setDiscountDue(0);
                setDiscountAmount(0);
                setBillingCycle(2);
                setDaysBeforeChargeDateExpiration(0);
                setDayOfWeek(0);
                setPlanOption(1);
            }
        });

        ResponseSafe2PayRecurrence response = SubscriptionAPI.Simulation(simulation);

        assertEquals(response.success, true);

        assertNotNull(response);

    }

    public void testUpdateTokenCard() throws JsonProcessingException {

        int Id = 17626;
        var values = new HashMap<String, String>() {{
            put("Token", "adf1f7e73cf344bebba715799cf3b1cc");
        }};

        var objectMapper = new ObjectMapper();
        String requestBody = objectMapper
                .writeValueAsString(values);

        ResponseSafe2PayRecurrence response = SubscriptionAPI.UpdateToken(requestBody, Id);

        assertEquals(response.success, true);

        assertNotNull(response);

    }

    public void testListCharge() {

        int Id = 10532;

        ResponseSafe2PayRecurrence response = SubscriptionAPI.ListCharges(Id);

        assertEquals(response.success, true);

        assertNotNull(response);

    }

}

