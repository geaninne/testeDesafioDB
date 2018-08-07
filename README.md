# testeDesafioDB

Teste automatizado com Selenium WebDriver.
TestCase: realizar uma compra com sucesso.

Requisitos:

    IDE IntellijIdea -> jetbrains.com
  
    Chrome WebDriver = https://sites.google.com/a/chromium.org/chromedriver/downloads
    
    JDK 8

  Dependencias Maven:

    JUnit 4.12 -> https://mvnrepository.com/artifact/junit/junit
    Selenium Java 3.0.1 -> https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java

Pacotes:

   Os pacotes se encontram dentro do diretorio: src/test/java

    pages: Pacote contém as páginas utilizadas no teste (Estratégia de Organização PageObjects)
  
     suport: Pacote contém classes que auxiliares: Screenshot(captura de tela), Generator (gera uma string), Web (cria e encerra uma instancia do Chrome, seguindo o padrão SingleTown) 
  
    tasks: Pacote contém classes que realizam tarefas inclusas no teste como: adicionar produto ao carrinho e cadastrar usuário.
  
    tests: Contém a classe com o caso de teste.
  
    verifications: Contém classes que realizam verificações durante a execução do teste.


Instruções de Execução:

    Clique em Build Project;
    Vá até a classe ComprarProdutoTest e execute o teste.



