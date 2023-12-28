import com.safe2pay.API.PaymentAPI;
import com.safe2pay.CORE.Client;
import com.safe2pay.DTO.Address.Address;
import com.safe2pay.DTO.Customer.Customer;
import com.safe2pay.DTO.General.Product;
import com.safe2pay.DTO.Payment.BankSlip;
import com.safe2pay.DTO.Payment.CreditCard;
import com.safe2pay.DTO.Response.ResponseSafe2Pay;
import com.safe2pay.DTO.Transactions.Transaction;
import junit.framework.TestCase;

import java.util.ArrayList;

public class PaymentTest extends TestCase {

    protected void setUp() {
        Client.setToken("x-api-key");
    }

    public void testGetPaymentMethods() {
        final ResponseSafe2Pay response = PaymentAPI.getPaymentMethods();
        assertFalse(response.HasError);
        assertNotNull(response);
    }

    public void testBankSlip() {
        // Inicializar método de pagamento
        final Transaction payload = new Transaction();
        // Ambiente de homologação
        payload.setIsSandbox(true);
        // Descrição geral
        payload.setApplication("Teste SDK PHP");
        // Nome do vendedor
        payload.setVendor("João da Silva Rodrigues");
        // Url de callback
        payload.setCallbackUrl("https://callbacks.exemplo.com.br/api/Notify");
        // Código da forma de pagamento
        // 1 - Boleto bancário
        // 2 - Cartão de crédito
        // 3 - Criptomoeda
        // 4 - Cartão de débito
        // 10 - Débito em conta
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
                add(new Product("001", "Teste 1", 10, 1.99));
                add(new Product("002", "Teste 2", 3, 2.50));
                add(new Product("003", "Teste 3", 7, 1));
            }
        });

        // Dados do cliente
        payload.setCustomer(new Customer() {
            {
                setName("João da Silva Rodrigues");
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
                    }
                });
            }
        });

        final ResponseSafe2Pay response = PaymentAPI.payWithBankSlip(payload);
        assertFalse(response.HasError);
        assertNotNull(response);
    }

    public void testCreditCard() {
        // Inicializar método de pagamento
        final Transaction payload = new Transaction();
        // Ambiente de homologação
        payload.setIsSandbox(true);
        // Descrição geral
        payload.setApplication("Teste SDK PHP");
        // Nome do vendedor
        payload.setVendor("João da Silva Rodrigues");
        // Url de callback
        payload.setCallbackUrl("https://callbacks.exemplo.com.br/api/Notify");
        // Código da forma de pagamento
        // 1 - Boleto bancário
        // 2 - Cartão de crédito
        // 3 - Criptomoeda
        // 4 - Cartão de débito
        // 10 - Débito em conta
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
                add(new Product("001", "Teste 1", 10, 1.99));
                add(new Product("002", "Teste 2", 3, 2.50));
                add(new Product("003", "Teste 3", 7, 1));
            }
        });

        // Dados do cliente
        payload.setCustomer(new Customer() {
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
                    }
                });
            }
        });

        final ResponseSafe2Pay response = PaymentAPI.payWithCreditCard(payload);
        assertFalse(response.HasError);
        assertNotNull(response);
    }

    public void testRefund() {
        final int Id = 898421;
        final ResponseSafe2Pay response = PaymentAPI.refund(Id);
        assertFalse(response.HasError);
        assertNotNull(response);
    }

}
