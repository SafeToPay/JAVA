
# Safe2Pay JAVA SDK

![Safe2Pay](https://safe2pay.com.br/static/img/banner-github.png)


## Principais recursos

* [x] Consulta de transações.
* [x] Tokenização de cartão.
* [x] Pagamentos.
    * [x] Boleto bancário.
    * [x] Cartão de crédito.
    * [x] Bitcoin.
    * [x] Cartão de débito.




## Utilização

A integração com a API do Safe2Pay se dá pelo modelo RESTful, de forma a realizar a transferência segura e simplificada dos dados pelo formato JSON. Para facilitar o envio dos dados, deve-se montar um objeto para envio baseado nos modelos disponíveis, com exemplos abaixo, e a própria chamada do método desejado realizará o tratamento e conversão deste objeto para JSON. 


### Tratamento das respostas da API

Após o envio, a própria chamada devolverá a resposta em um objeto completo com as propriedades desta, onde um cast das classes de resposta permitirá o tratamento das propriedades do objeto de retorno de forma simplificada, sem a necessidade de criar os mesmos modelos em seu projeto. Utilize a `Response` para transações.

## Dependências

* JDK  >= 1.7

## Pagamentos / Transações

A informação da forma de pagamento é dada por meio da propriedade `PaymentMethod`, onde deve ser informado o código correspondente ao método desejado:

1. Boleto Bancário;
2. Cartão de Crédito;
3. Bitcoin;
4. Cartão de Débito

O retorno do envio da transação trará um status para esta, que pode ser igual a:

```
1 = PENDENTE
2 = PROCESSAMENTO
3 = AUTORIZADO
4 = DISPONÍVEL
5 = EM DISPUTA
6 = DEVOLVIDO
7 = BAIXADO
8 = RECUSADO
11 = LIBERADO
12 = EM CANCELAMENTO
```

### Criando uma venda com Boleto

```java
        Client.SetEnviroment("x-api-key");

         //Inicializar método de pagamento
        Transaction payload = new Transaction();
        //Ambiente de homologação
        payload.setIsSandbox(true);
        //Descrição geral 
        payload.setApplication("Teste SDK JAVA");
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
// ...
```

### Criando uma venda com cartão de crédito

```java

        //Inicializar método de pagamento
        Transaction payload = new Transaction();
        //Ambiente de homologação
        payload.setIsSandbox(true);
        //Descrição geral 
        payload.setApplication("Teste SDK JAVA");
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
// ...
```

### Criando uma venda com Bitcoin

```java
        Client.SetEnviroment("x-api-key");

        //Inicializar método de pagamento
        Transaction payload = new Transaction();
        //Ambiente de homologação
        payload.setIsSandbox(true);
        //Descrição geral 
        payload.setApplication("Teste SDK JAVA");
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

// ...
```

### Criando uma venda com cartão de débito

```java
        Client.SetEnviroment("x-api-key");

        //Inicializar método de pagamento
        Transaction payload = new Transaction();
        //Ambiente de homologação
        payload.setIsSandbox(true);
        //Descrição geral 
        payload.setApplication("Teste SDK JAVA");
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

// ...
```

### Tokenizando um cartão

```java
        Client.SetEnviroment("x-api-key");

        CreditCard credit = new CreditCard();
        credit.setHolder("João da Silva");
        credit.setCardNumber("4024007153763191");
        credit.setExpirationDate("12/2019");
        credit.setSecurityCode("241");

        ResponseSafe2Pay response = TokenizationAPI.Create(credit);

// ...
```

### Consultar transação

```java
 int Id = 852920;

        Client.SetEnviroment("x-api-key");

        ResponseSafe2Pay response = TransactionAPI.Get(Id);

// ...
```

## Informações adicionais / Contato

A orientação sobre a utilização da API também está disponível na documentação de referência da API, disponível aqui, porém salientamos que ela se encontra em atualização para a nova versão da API.

Em caso de dúvidas, ficamos à disposição em nossos canais ou diretamente pelo e-mail integracao@safe2pay.com.br.
