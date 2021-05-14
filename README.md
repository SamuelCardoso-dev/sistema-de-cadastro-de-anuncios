# sistema-de-cadastro-de-anuncios
Esse sistema foi desenvolvido na linguagem JAVA e tem a funcionalidade de permitir o cadastro de anúncios através do fornecimento dos seguintes dados: Nome do Anúncio, cliente, data de início, data de término e investimento por dia. Além disso, esse sistema permite filtrar os anúncios pelo cliente ou pelo intervalo de dias(Através do fornecimento das datas de início e término. Ao filtrar o relatório, o sistema fornecerá um relatório contendo o valor investido, a quantidade máxima de visualizações, a quantidade máxima de cliques e a quantidade máxima de compartilhamentos.

1 -Para executar o projeto, será necessário instalar os seguintes programas:

JDK 8, que será necessário para executar o projeto JAVA.
Eclipse, para compilar o projeto e assim verificar no console os dados do relatório.

2-Descrição de como compilar e executar o programa: 
Para compilar e executar o programa será necessário abrir o projeto no Eclipse. Para isso, o projeto sistema-de-cadastro-de-anuncios deverá ser salvo na pasta eclipse-workspace.
 Logo após, deve-se clicar em File que está na localizado na barra de ferramentas superior do eclipse, em seguida deve-se clicar em
Import, depois em Existing Projects into Workspace, em seguida clicar no botão Next, e depois no botão Browser que abrirá a pasta eclipse-workspace.
Depois selecione o projeto sistema-de-cadastro-de-anuncios e clique no botão Selecionar Pasta e por fim clique em Finish. Após isso,
o projeto será adicionado no Package Explorer do Eclipse.
Para compilar, clique duas vezes na pasta sistema-de-cadastro-de-anuncios para abrir o projeto, em seguida clique na pasta src e depois no pacote br.com.divulgatudo.sistemadecadastrodeanuncios.teste
Após abrir o pacote, clique duas vezes em TesteAnuncio.java para abrir a classe (essa é a classe que irá testar o nosso sistema). Para executar, clique no botão direito do mouse e em seguida em Run As, depois em
1 Java Application. Logo após a execução, aparecerá no console o resultado dos relatórios dos anúncios cadastrados no sistema com os dados do nome do anúncio, cliente, data de início, 
data de término e valor investido. Serão impressos no console 8 relatórios, 2 para cada anúncio cadastrado, pois
foi realizada a filtragem tanto pelo cliente, quanto pelo intervalo de dias. Os 4 anúncios foram cadastrados a título de exemplo para a realização dos testes, mas podem ser adicionados mais anúncios no sistema que o mesmo funcionará.

3- Como adicionar mais anúncios no Sistema de Cadastro de Anúncios:

3.1 -Inicialmente deve-se cadastrar as datas de início e de término, conforme o exemplo abaixo:

Date dataDeInicio = null;
Date dataDeTermino = null;

String dataInicial = "05/05/2021";

		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			dataDeInicio = sdf.parse(dataInicial);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		String dataFinal = "06/05/2021";

		try {
			SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
			dataDeTermino = sdf1.parse(dataFinal);
		} catch (ParseException e) {
			e.printStackTrace();
		}

3.2 - Depois deve-se instanciar o objeto Anúncio fornecendo os seguintes dados em senquenêcia : nome do anúncio, cliente, 
data de início, data de término e investimento por dia. Exemplo abaixo:

Anuncio anuncio = new Anuncio("Aula de Matemática", "José", dataDeInicio, dataDeTermino, 1500);
		BancoDeAnuncios banco = new BancoDeAnuncios();
		banco.adiciona(anuncio);

Com isso, um novo anúncio é adicionado ao banco de anúncios que tem a função de guardar todos os anúncios adicionados ao sistema.

4- Como filtrar os anúncios pelo Cliente:
 
Deve-se utilizar o System.out.println para imprimir no console e dentro dele deve utilizar o método do banco de anúncios buscaAnuncioPeloCliente, passando como parâmetro para esse método
o cliente do anúncio que se deseja filtrar. Exemplo:

System.out.println(banco.buscaAnuncioPeloCliente("José") + "\n");

5- Como filtrar os anúncios  pelo intervalo de dias:

Deve-se utilizar o System.out.println para imprimir no console e dentro dele deve utilizar o método do banco de anúncios banco.buscaAnuncioPeloIntervaloDeTempo, passando como parâmetro para esse método
as datas de início e de término do anúncio que se deseja filtrar. Exemplo:

System.out.println(banco.buscaAnuncioPeloIntervaloDeTempo(dataDeInicio, dataDeTermino) + "\n\n");

6- Após, isso deve-se compilar, para isso, clique no botão direito do mouse e em seguida em Run As, depois em
1 Java Application. Logo após a execução, aparecerá no console o resultado do relatório, conforme exemplo abaixo:

Relatório: 

Valor investido: 1500.0

Quantidade máxima de Visualizações: 129617.0

Quantidade máxima de Cliques: 15554.0

Quantidade máxima de Compartilhamentos: 2115.0





