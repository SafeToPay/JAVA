import com.google.gson.GsonBuilder;
import com.safe2pay.Client;
import com.safe2pay.api.PaymentAPI;
import com.safe2pay.dto.general.ProductS2P;
import com.safe2pay.dto.general.address.AddressS2P;
import com.safe2pay.dto.general.customer.CustomerS2P;
import com.safe2pay.dto.payment.BankSlip;
import com.safe2pay.dto.payment.CreditCard;
import com.safe2pay.dto.response.ResponseSafe2Pay;
import com.safe2pay.dto.response.details.BankSlipResponseDetail;
import com.safe2pay.dto.response.details.CreditCardResponseDetail;
import com.safe2pay.dto.transactions.Transaction;
import junit.framework.TestCase;

import java.util.ArrayList;

public class PaymentTest extends TestCase {

    protected void setUp() {
        Client.setToken("x-api-key");
    }

    public void testBankSlip() {
        // Inicializar método de pagamento
        final Transaction payload = new Transaction();
        // Ambiente de homologação
        payload.setSandbox(true);
        // Descrição geral
        payload.setApplication("Teste SDK PHP");
        // Nome do vendedor
        payload.setVendor("João da Silva Rodrigues");
        // Url de callback
        payload.setCallbackUrl("https://callbacks.exemplo.com.br/api/Notify");
        // Código da forma de pagamento
        // 1 - Boleto bancário
        // 2 - Cartão de crédito
        // 6 - PIX
        payload.setPaymentMethod("1");

        // Informa o objeto de pagamento
        // Objeto de pagamento - para boleto bancário
        payload.setPaymentObject(new BankSlip() {
            {
                setDueDate("16/09/2024");
                setCancelAfterDue(false);
                setIsEnablePartialPayment(false);
                setPenaltyRate(2.00);
                setInterestRate(0.40);
                setInstruction("Instrução de Exemplo");
                setMessage(new ArrayList<>() {
                    {
                        add("mensagem 1");
                        add("mensagem 2");
                        add("mensagem 3");
                    }
                });
            }
        });

        // Lista de produtos incluídos na cobrança
        payload.setProducts(new ArrayList<>() {
            {
                add(new ProductS2P("001", "Teste 1", 10, 1.99));
                add(new ProductS2P("002", "Teste 2", 3, 2.50));
                add(new ProductS2P("003", "Teste 3", 7, 1));
            }
        });

        // Dados do cliente
        payload.setCustomer(new CustomerS2P() {
            {
                setName("João da Silva Rodrigues");
                setIdentity("54557795000162");
                setEmail("safe2pay@safe2pay.com.br");
                setAddress(new AddressS2P() {
                    {
                        setZipCode("90670090");
                        setStreet("Logradouro");
                        setNumber("123");
                        setDistrict("Higienopolis");
                        setStateInitials("RS");
                        setCityName("Porto Alegre");
                        setCountryName("Brasil");
                    }
                });
            }
        });

        final ResponseSafe2Pay<BankSlipResponseDetail> response = PaymentAPI.payWithBankSlip(payload);
        System.out.println(new GsonBuilder().setPrettyPrinting().create().toJson(response.getResponseDetail()));
        assertFalse(response.isHasError());
        assertNotNull(response);
    }

    public void testCreditCard() {
        // Inicializar método de pagamento
        final Transaction payload = new Transaction();
        // Ambiente de homologação
        payload.setSandbox(true);
        // Descrição geral
        payload.setApplication("Teste SDK PHP");
        // Nome do vendedor
        payload.setVendor("João da Silva Rodrigues");
        // Url de callback
        payload.setCallbackUrl("https://callbacks.exemplo.com.br/api/Notify");
        // Código da forma de pagamento
        // 1 - Boleto bancário
        // 2 - Cartão de crédito
        // 6 - PIX
        payload.setPaymentMethod("2");

        // Informa o objeto de pagamento
        // Objeto de pagamento - para boleto bancário
        payload.setPaymentObject(new CreditCard() {
            {
                setHolder("João da Silva");
                setCardNumber("4024007153763191");
                setExpirationDate("12/2024");
                setSecurityCode("241");
            }
        });

        // Lista de produtos incluídos na cobrança
        payload.setProducts(new ArrayList<>() {
            {
                add(new ProductS2P("001", "Teste 1", 10, 1.99));
                add(new ProductS2P("002", "Teste 2", 3, 2.50));
                add(new ProductS2P("003", "Teste 3", 7, 1));
            }
        });

        // Dados do cliente
        payload.setCustomer(new CustomerS2P() {
            {
                setName("João da Silva");
                setIdentity("54557795000162");
                setEmail("safe2pay@safe2pay.com.br");
                setAddress(new AddressS2P() {
                    {
                        setZipCode("90670090");
                        setStreet("Logradouro");
                        setNumber("123");
                        setDistrict("Higienopolis");
                        setStateInitials("RS");
                        setCityName("Porto Alegre");
                        setCountryName("Brasil");
                    }
                });
            }
        });

        final ResponseSafe2Pay<CreditCardResponseDetail> response = PaymentAPI.payWithCreditCard(payload);
        System.out.println(new GsonBuilder().setPrettyPrinting().create().toJson(response.getResponseDetail()));
        assertFalse(response.isHasError());
        assertNotNull(response);
    }

}
