
import com.safe2pay.API.MarketplaceAPI;
import com.safe2pay.API.PlanAPI;
import com.safe2pay.CORE.Config;
import com.safe2pay.DTO.Address.Address;
import com.safe2pay.DTO.Bank.BankData;
import com.safe2pay.DTO.Merchant.Merchant;
import com.safe2pay.DTO.Merchant.MerchantSplit;
import com.safe2pay.DTO.Merchant.MerchantSplitTax;
import com.safe2pay.DTO.Plan.Plan;
import com.safe2pay.DTO.Plan.PlanFrequence;
import com.safe2pay.DTO.Response.ResponseSafe2Pay;
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
public class MarketplaceTest extends TestCase {

    protected void setUp() {

        Config enviroment = new Config();
        enviroment.SetEnviroment("5A3A044DE838403F9566BDFBEE9DE763");
    }

    @Test
    public void testAdd() {
Merchant merchant = new Merchant();

        merchant.setIdentity("53797700000115");
        merchant.setName("Francisco e Laís Filmagens ME");
        merchant.setCommercialName("Teste");
        merchant.setEmail("2e8901a1478999@hellomail.fun");
        merchant.setResponsibleName("Responsável");
        merchant.setResponsibleIdentity("09341593000");

        merchant.setTechEmail("aaee24177acb@hellomail.fun");
        merchant.setTechName("Responsável técnico");
        merchant.setTechIdentity("32001774117");

        merchant.setAddress(new Address() {
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

        merchant.setBankData(new BankData() {
            {
                setBank("041");
                setBankAgency("1676");
                setBankAgencyDigit("0");
                setBankAccount("41776");
                setBankAccountDigit("7");
                setOperation("3");
            }
        });

        merchant.setMerchantSplit(new ArrayList<MerchantSplit>() {
            {
                add(new MerchantSplit() {
                    {
                        setIsSubaccountTaxPayer(false);
                        setPaymentMethodCode("1");
                        setTaxes(new ArrayList<MerchantSplitTax>() {
                            {
                                add(new MerchantSplitTax("1", 1.00));

                            }
                        });
                    }
                });

                add(new MerchantSplit() {
                    {
                        setIsSubaccountTaxPayer(false);
                        setPaymentMethodCode("2");
                        setTaxes(new ArrayList<MerchantSplitTax>() {
                            {
                                add(new MerchantSplitTax("1", 1.00));

                            }
                        });
                    }
                });

                add(new MerchantSplit() {
                    {
                        setIsSubaccountTaxPayer(false);
                        setPaymentMethodCode("3");
                        setTaxes(new ArrayList<MerchantSplitTax>() {
                            {
                                add(new MerchantSplitTax("1", 1.00));

                            }
                        });
                    }
                });

                add(new MerchantSplit() {
                    {
                        setIsSubaccountTaxPayer(false);
                        setPaymentMethodCode("4");
                        setTaxes(new ArrayList<MerchantSplitTax>() {
                            {
                                add(new MerchantSplitTax("1", 1.00));

                            }
                        });
                    }
                });
            }
        });

        ResponseSafe2Pay response = MarketplaceAPI.Add(merchant);

         assertEquals(response.HasError, true);

        assertNotNull(response);
    }

    @Test
    public void testUpdate() {

        Merchant merchant = new Merchant();

        merchant.setId(1079);
        merchant.setIdentity("53797700000115");
        merchant.setName("Francisco e Laís Filmagens ME");
        merchant.setCommercialName("Teste");
        merchant.setEmail("2e8901a27@hellomail.fun");
        merchant.setResponsibleName("Responsável");
        merchant.setResponsibleIdentity("09341593000");

        merchant.setTechEmail("aaee255acb@hellomail.fun");
        merchant.setTechName("Responsável técnico");
        merchant.setTechIdentity("32001774117");

        merchant.setAddress(new Address() {
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

        merchant.setBankData(new BankData() {
            {
                setBank("041");
                setBankAgency("1676");
                setBankAgencyDigit("0");
                setBankAccount("41776");
                setBankAccountDigit("7");
                setOperation("3");
            }
        });

        merchant.setMerchantSplit(new ArrayList<MerchantSplit>() {
            {
                add(new MerchantSplit() {
                    {
                        setIsSubaccountTaxPayer(false);
                        setPaymentMethodCode("1");
                        setTaxes(new ArrayList<MerchantSplitTax>() {
                            {
                                add(new MerchantSplitTax("1", 1.00));

                            }
                        });
                    }
                });

                add(new MerchantSplit() {
                    {
                        setIsSubaccountTaxPayer(false);
                        setPaymentMethodCode("2");
                        setTaxes(new ArrayList<MerchantSplitTax>() {
                            {
                                add(new MerchantSplitTax("1", 1.00));

                            }
                        });
                    }
                });

                add(new MerchantSplit() {
                    {
                        setIsSubaccountTaxPayer(false);
                        setPaymentMethodCode("3");
                        setTaxes(new ArrayList<MerchantSplitTax>() {
                            {
                                add(new MerchantSplitTax("1", 1.00));

                            }
                        });
                    }
                });

                add(new MerchantSplit() {
                    {
                        setIsSubaccountTaxPayer(false);
                        setPaymentMethodCode("4");
                        setTaxes(new ArrayList<MerchantSplitTax>() {
                            {
                                add(new MerchantSplitTax("1", 1.00));

                            }
                        });
                    }
                });
            }
        });

        ResponseSafe2Pay response = MarketplaceAPI.Update(merchant);

        assertEquals(response.HasError, false);

        assertNotNull(response);
    }

    @Test
    public void testGet() {

        int Id = 1079;

        ResponseSafe2Pay response = MarketplaceAPI.Get(Id);

        assertEquals(response.HasError, false);

        assertNotNull(response);

    }

    @Test
    public void testList() {

        int pageNumber = 1;
        int rowsPage = 10;

        ResponseSafe2Pay response = MarketplaceAPI.List(pageNumber, rowsPage);

        assertEquals(response.HasError, false);

        assertNotNull(response);

    }

    @Test
    public void testDelete() {

        int Id = 828;

        ResponseSafe2Pay response = MarketplaceAPI.Delete(Id);

       assertEquals(response.HasError, false);

        assertNotNull(response);
    }

}
