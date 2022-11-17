
import com.safe2pay.API.PaymentAPI;
import com.safe2pay.CORE.Config;
import com.safe2pay.DTO.Address.Address;
import com.safe2pay.DTO.Bank.BankData;
import com.safe2pay.DTO.Customer.Customer;
import com.safe2pay.DTO.General.Product;
import com.safe2pay.DTO.Payment.BankSlip;
import com.safe2pay.DTO.Payment.Carnet;
import com.safe2pay.DTO.Payment.CarnetLot;
import com.safe2pay.DTO.Payment.CreditCard;
import com.safe2pay.DTO.Response.ResponseSafe2Pay;
import com.safe2pay.DTO.Transactions.Transaction;
import java.util.ArrayList;
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
public class PaymentTest extends TestCase {

    protected void setUp() {

        Config enviroment = new Config();
        enviroment.SetEnviroment("58D772128EB247E5A34F527B5CA76325");
    }

    @Test
    public void testGetPaymentMethods() {

        ResponseSafe2Pay response = PaymentAPI.GetPaymentMethods();

        assertEquals(response.HasError, false);

        assertNotNull(response);
    }

    @Test
    public void testBankSlip() {

        //Inicializar método de pagamento
        Transaction payload = new Transaction();
        //Ambiente de homologação
        payload.setIsSandbox(true);
        //Descrição geral 
        payload.setApplication("Teste SDK PHP");
        //Nome do vendedor
        payload.setVendor("João da Silva");
        //Url de callback
        payload.setCallbackUrl("https://callbacks.exemplo.com.br/api/Notify");
        //Código da forma de pagamento
        // 1 - Boleto bancário
        // 2 - Cartão de crédito
        // 3 - Criptomoeda
        // 4 - Cartão de débito 
        // 10 - Débito em conta 
        payload.setPaymentMethod("1");

        //Informa o objeto de pagamento
        //Objeto de pagamento - para boleto bancário
        payload.setPaymentObject(new BankSlip() {
            {
                setDueDate("16/09/2019");
                setCancelAfterDue(false);
                setIsEnablePartialPayment(false);
                setPenaltyRate(2.00);
                setInterestRate(0.40);
                setInstruction("Instrução de Exemplo");
                setMessage(new ArrayList<String>() {
                    {
                        add("mensagem 1");
                        add("mensagem 2");
                        add("mensagem 3");
                    }
                });
            }
        });

        //Lista de produtos incluídos na cobrança
        payload.setProducts(new ArrayList<Product>() {
            {
                add(new Product("001", "Teste 1", 10, 1.99));
                add(new Product("002", "Teste 2", 3, 2.50));
                add(new Product("003", "Teste 3", 7, 1));
            }
        });

        //Dados do cliente
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

        ResponseSafe2Pay response = PaymentAPI.BankSlip(payload);

        assertEquals(response.HasError, false);

        assertNotNull(response);
    }

    @Test
    public void testCreditCard() {

        //Inicializar método de pagamento
        Transaction payload = new Transaction();
        //Ambiente de homologação
        payload.setIsSandbox(true);
        //Descrição geral 
        payload.setApplication("Teste SDK PHP");
        //Nome do vendedor
        payload.setVendor("João da Silva");
        //Url de callback
        payload.setCallbackUrl("https://callbacks.exemplo.com.br/api/Notify");
        //Código da forma de pagamento
        // 1 - Boleto bancário
        // 2 - Cartão de crédito
        // 3 - Criptomoeda
        // 4 - Cartão de débito 
        // 10 - Débito em conta 
        payload.setPaymentMethod("2");

        //Informa o objeto de pagamento
        //Objeto de pagamento - para boleto bancário
        payload.setPaymentObject(new CreditCard() {
            {
                setHolder("João da Silva");
                setCardNumber("4024007153763191");
                setExpirationDate("12/2019");
                setSecurityCode("241");
            }
        });

        //Lista de produtos incluídos na cobrança
        payload.setProducts(new ArrayList<Product>() {
            {
                add(new Product("001", "Teste 1", 10, 1.99));
                add(new Product("002", "Teste 2", 3, 2.50));
                add(new Product("003", "Teste 3", 7, 1));
            }
        });

        //Dados do cliente
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

        ResponseSafe2Pay response = PaymentAPI.CreditCard(payload);

        assertEquals(response.HasError, false);

        assertNotNull(response);
    }

    @Test
    public void testCryptoCurrency() {

        //Inicializar método de pagamento
        Transaction payload = new Transaction();
        //Ambiente de homologação
        payload.setIsSandbox(true);
        //Descrição geral 
        payload.setApplication("Teste SDK PHP");
        //Nome do vendedor
        payload.setVendor("João da Silva");
        //Url de callback
        payload.setCallbackUrl("https://callbacks.exemplo.com.br/api/Notify");
        //Código da forma de pagamento
        // 1 - Boleto bancário
        // 2 - Cartão de crédito
        // 3 - Criptomoeda
        // 4 - Cartão de débito 
        // 10 - Débito em conta 
        payload.setPaymentMethod("3");

        //Lista de produtos incluídos na cobrança
        payload.setProducts(new ArrayList<Product>() {
            {
                add(new Product("001", "Teste 1", 10, 1.99));
                add(new Product("002", "Teste 2", 3, 2.50));
                add(new Product("003", "Teste 3", 7, 1));
            }
        });

        //Dados do cliente
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

        ResponseSafe2Pay response = PaymentAPI.CryptoCurrency(payload);

        assertEquals(response.HasError, false);

        assertNotNull(response);
    }

    @Test
    public void testDebitCard() {

        //Inicializar método de pagamento
        Transaction payload = new Transaction();
        //Ambiente de homologação
        payload.setIsSandbox(true);
        //Descrição geral 
        payload.setApplication("Teste SDK PHP");
        //Nome do vendedor
        payload.setVendor("João da Silva");
        //Url de callback
        payload.setCallbackUrl("https://callbacks.exemplo.com.br/api/Notify");
        //Código da forma de pagamento
        // 1 - Boleto bancário
        // 2 - Cartão de crédito
        // 3 - Criptomoeda
        // 4 - Cartão de débito 
        // 10 - Débito em conta 
        payload.setPaymentMethod("4");

        //Informa o objeto de pagamento
        //Objeto de pagamento - para boleto bancário
        payload.setPaymentObject(new CreditCard() {
            {
                setHolder("João da Silva");
                setCardNumber("4024007153763191");
                setExpirationDate("12/2019");
                setSecurityCode("241");
            }
        });

        //Lista de produtos incluídos na cobrança
        payload.setProducts(new ArrayList<Product>() {
            {
                add(new Product("001", "Teste 1", 10, 1.99));
                add(new Product("002", "Teste 2", 3, 2.50));
                add(new Product("003", "Teste 3", 7, 1));
            }
        });

        //Dados do cliente
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

        ResponseSafe2Pay response = PaymentAPI.DebitCard(payload);

        assertEquals(response.HasError, false);

        assertNotNull(response);
    }

    @Test
    public void testCarnet() {

        //Inicializar método de pagamento
        Transaction payload = new Transaction();
        //Ambiente de homologação
        payload.setIsSandbox(true);
        //Descrição geral 
        payload.setApplication("Teste SDK PHP");
        //Nome do vendedor
        payload.setVendor("João da Silva");
        //Url de callback
        payload.setCallbackUrl("https://callbacks.exemplo.com.br/api/Notify");
        //Código da forma de pagamento
        // 1 - Boleto bancário
        // 2 - Cartão de crédito
        // 3 - Criptomoeda
        // 4 - Cartão de débito 
        // 10 - Débito em conta 
        payload.setPaymentMethod("1");

        //Adiciona boletos do carnê
        Carnet carnet = new Carnet();
        carnet.setMessage("Teste");
        carnet.setPenaltyAmount(10);
        carnet.setInterestAmount(10);
        carnet.setIsProcessed(false);
        carnet.setIsAsync(false);
        carnet.setIsEnablePartialPayment(false);
        carnet.setPayableAfterDue(false);

        carnet.setBankSlips(new ArrayList<BankSlip>() {
            {
                add(new BankSlip() {
                    {
                        setAmount(1.99);
                        setDueDate("2019-08-30");
                        setInstruction("Instrução exemplo");
                        setAmount(1.99);
                        setAmount(1.99);
                        setMessage(new ArrayList<String>() {
                            {
                                add("Mensagem 1");
                                add("Mensagem 2");
                                add("Mensagem 3");
                            }
                        });
                    }
                });

                add(new BankSlip() {
                    {
                        setAmount(1.99);
                        setDueDate("2019-08-30");
                        setInstruction("Instrução exemplo");
                        setAmount(1.99);
                        setAmount(1.99);
                        setMessage(new ArrayList<String>() {
                            {
                                add("Mensagem 1");
                                add("Mensagem 2");
                                add("Mensagem 3");
                            }
                        });
                    }
                });

                add(new BankSlip() {
                    {
                        setAmount(1.99);
                        setDueDate("2019-08-30");
                        setInstruction("Instrução exemplo");
                        setAmount(1.99);
                        setAmount(1.99);
                        setMessage(new ArrayList<String>() {
                            {
                                add("Mensagem 1");
                                add("Mensagem 2");
                                add("Mensagem 3");
                            }
                        });
                    }
                });

            }
        });

        //Lista de produtos incluídos na cobrança
        payload.setProducts(new ArrayList<Product>() {
            {
                add(new Product("001", "Teste 1", 10, 1.99));
                add(new Product("002", "Teste 2", 3, 2.50));
                add(new Product("003", "Teste 3", 7, 1));
            }
        });

        //Dados do cliente
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

        payload.setPaymentObject(carnet);

        ResponseSafe2Pay response = PaymentAPI.Carnet(payload);

        assertEquals(response.HasError, false);

        assertNotNull(response);

    }

    @Test
    public void testCarnetLot() {

        CarnetLot lote = new CarnetLot();

        lote.setCallbackUrl("https://callbacks.exemplo.com.br/api/Notify");

        Transaction payload = null;

        ArrayList<Transaction> transactions = new ArrayList<>();

        for (int i = 0; i < 10; i++) {

            //Inicializar método de pagamento
            payload = new Transaction();
            //Ambiente de homologação
            payload.setIsSandbox(true);
            //Descrição geral 
            payload.setApplication("Teste SDK PHP");
            //Nome do vendedor
            payload.setVendor("João da Silva");
        //Código da forma de pagamento
            // 1 - Boleto bancário
            // 2 - Cartão de crédito
            // 3 - Criptomoeda
            // 4 - Cartão de débito 
            // 10 - Débito em conta 
            payload.setPaymentMethod("1");

            //Adiciona boletos do carnê
            Carnet carnet = new Carnet();
            carnet.setMessage("Teste");
            carnet.setPenaltyAmount(10);
            carnet.setInterestAmount(10);
            carnet.setIsProcessed(false);
            carnet.setIsAsync(false);
            carnet.setIsEnablePartialPayment(false);
            carnet.setPayableAfterDue(false);

            carnet.setBankSlips(new ArrayList<BankSlip>() {
                {
                    add(new BankSlip() {
                        {
                            setAmount(1.99);
                            setDueDate("2019-08-30");
                            setInstruction("Instrução exemplo");
                            setAmount(1.99);
                            setAmount(1.99);
                            setMessage(new ArrayList<String>() {
                                {
                                    add("Mensagem 1");
                                    add("Mensagem 2");
                                    add("Mensagem 3");
                                }
                            });
                        }
                    });

                    add(new BankSlip() {
                        {
                            setAmount(1.99);
                            setDueDate("2019-08-30");
                            setInstruction("Instrução exemplo");
                            setAmount(1.99);
                            setAmount(1.99);
                            setMessage(new ArrayList<String>() {
                                {
                                    add("Mensagem 1");
                                    add("Mensagem 2");
                                    add("Mensagem 3");
                                }
                            });
                        }
                    });

                    add(new BankSlip() {
                        {
                            setAmount(1.99);
                            setDueDate("2019-08-30");
                            setInstruction("Instrução exemplo");
                            setAmount(1.99);
                            setAmount(1.99);
                            setMessage(new ArrayList<String>() {
                                {
                                    add("Mensagem 1");
                                    add("Mensagem 2");
                                    add("Mensagem 3");
                                }
                            });
                        }
                    });

                }
            });

            //Lista de produtos incluídos na cobrança
            payload.setProducts(new ArrayList<Product>() {
                {
                    add(new Product("001", "Teste 1", 10, 1.99));
                    add(new Product("002", "Teste 2", 3, 2.50));
                    add(new Product("003", "Teste 3", 7, 1));
                }
            });

            //Dados do cliente
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
            payload.setPaymentObject(carnet);

            transactions.add(payload);
        }

        lote.setItems(transactions);

            ResponseSafe2Pay response = PaymentAPI.CarnetLot(lote);

        assertEquals(response.HasError, false);

        assertNotNull(response);

    }
    /*
     @Test
     public void testDebitAccount() {

     //Inicializar método de pagamento
     Transaction payload = new Transaction();
     //Ambiente de homologação
     payload.setIsSandbox(true);
     //Descrição geral 
     payload.setApplication("Teste SDK PHP");
     //Nome do vendedor
     payload.setVendor("João da Silva");
     //Url de callback
     payload.setCallbackUrl("https://callbacks.exemplo.com.br/api/Notify");
     //Código da forma de pagamento
     // 1 - Boleto bancário
     // 2 - Cartão de crédito
     // 3 - Criptomoeda
     // 4 - Cartão de débito 
     // 10 - Débito em conta 
     payload.setPaymentMethod("10");

     BankData bankData = new BankData();

     payload.setPaymentObject(new Object() {
     private BankData BankData;
     private String DueDate;

     {
     DueDate = "2019-05-30";
     BankData = new BankData() {
     {
     setBank("033");
     setBankAgency("0435");
     setBankAgencyDigit("1");
     setBankAccount("7879487");
     setBankAccountDigit("2");

     }
     };
     }
     });

     //Lista de produtos incluídos na cobrança
     payload.setProducts(new ArrayList<Product>() {
     {
     add(new Product("001", "Teste 1", 10, 1.99));
     add(new Product("002", "Teste 2", 3, 2.50));
     add(new Product("003", "Teste 3", 7, 1));
     }
     });

     //Dados do cliente
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

     ResponseSafe2Pay response = PaymentAPI.DebitAccount(payload);

     assertEquals(response.HasError, false);

     assertNotNull(response);
     }
     */

    @Test
    public void testRefund() {

        int Id = 898421;

        ResponseSafe2Pay response = PaymentAPI.Refund(Id);

        assertEquals(response.HasError, false);

        assertNotNull(response);
    }

}
