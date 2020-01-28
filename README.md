﻿Softwares necessários:
IDE: [Eclipse](http://www.eclipse.org/)
Java: [Java](http://www.oracle.com/technetwork/pt/java/index.html)
Mozilla Firefox: [Mozilla](https://www.mozilla.org/pt-BR/firefox/new/)

           Caso de teste proposto: realizar uma compra com sucesso
1. Acessar o site: www.automationpractice.com.
2. Escolha um produto qualquer na loja.
3. Adicione o produto escolhido ao carrinho.
4. Prossiga para o checkout.
5. Valide se o produto foi corretamente adicionado ao carrinho e prossiga caso esteja tudo certo.
6. Realize o cadastro do cliente preenchendo todos os campos obrigatórios dos formulários.
7. Valide se o endereço está correto e prossiga.
8. Aceite os termos de serviço e prossiga.
9. Valide o valor total da compra.
10. Selecione um método de pagamento e prossiga.
11. Confirme a compra e valide se foi finalizada com sucesso.

           Preparação do ambiente
1. Baixe e instale o Eclipse;
2. Baixe e instale o Java: JRE e JDK;
3. Baixe e instale o Mozilla Firefox;
4. Configure o Java no Windows 10: vá até o Painel de Controle > Sistema e Segurança > Sistema;
5. Clique em "Configurações avançadas do sistema";
6. Clique em "Variáveis de Ambiente...";
7. Clique no botão “Nova” em “Variáveis do sistema”;
8. Digite no nome da variável: "JAVA_HOME";
9. No valor da variável: coloque o endereço onde foi instalado. Exempo: “C:\Program Files\Java\jdk1.8.0_221”;
10. Clique em "OK";
11. Selecione "Path" e clique em "Editar...";
12. Clique em "Novo" e digite "%JAVA_HOME%\bin" depois clique em "OK";
13. Clique em "OK" novamente para salvar as configurações;
14. Verifique a versão e se foi configurado corretamente, vá ao CMD(Prompt de comando) e digite "java -version"

            Executando o script
1. Baixe o projeto e descompacte-o;
2. Acesse o Eclipse;
3. Dentro do eclipse clique em "File" e depois em "Import...";
4. Em Import source, selecione a opção "Existing Maven Projects" e clique no botão "Next>";
5. Em Import Maven Projects clique em "Browse" e selecione a pasta "automation-practice-aderson", clique no botão "Ok" e espere o projeto carregar;
6. Após, clique em "automation-practice-aderson" e depois clique em "src/test/java";
7. Clique no pacote "application.testsuites" e com o botão direito sobre o SuiteTestRegression.java e selecione "Run As" e após "JUnit Test";
8. Espere so casos de testes serem executados no navegador web;
9. Ao terminar e a barra de status do JUnit ficará verde, acesse a pasta do projeto e clique em "reports" e clique para abrir o report.html no navegador web, você poderá verificar o resultado gerado.
