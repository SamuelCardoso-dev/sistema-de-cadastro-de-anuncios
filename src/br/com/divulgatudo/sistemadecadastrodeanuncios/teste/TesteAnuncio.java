package br.com.divulgatudo.sistemadecadastrodeanuncios.teste;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import br.com.divulgatudo.sistemadecadastrodeanuncios.modelo.Anuncio;
import br.com.divulgatudo.sistemadecadastrodeanuncios.modelo.BancoDeAnuncios;

/**
 * Classe que testa o cadastramento e a busca de anuncios
 * 
 * @author Samuel Cardoso de Oliveira
 *
 */
public class TesteAnuncio {

	public static void main(String[] args) {

		Date dataDeInicio = null;
		Date dataDeTermino = null;
		Date dataDeInicio2 = null;
		Date dataDeTermino2 = null;
		Date dataDeInicio3 = null;
		Date dataDeTermino3 = null;
		Date dataDeInicio4 = null;
		Date dataDeTermino4 = null;

		/**
		 * Cadastro das datas de inicio e de termino do primeiro anuncio
		 * 
		 */
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

		/**
		 * Cadastro das datas de inicio e de termino do segundo anuncio
		 * 
		 */
		String dataInicial2 = "08/06/2021";

		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			dataDeInicio2 = sdf.parse(dataInicial2);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		String dataFinal2 = "10/07/2021";

		try {
			SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
			dataDeTermino2 = sdf1.parse(dataFinal2);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		/**
		 * Cadastro das datas de inicio e de termino do terceiro anuncio
		 * 
		 */
		String dataInicial3 = "20/07/2021";

		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			dataDeInicio3 = sdf.parse(dataInicial3);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		String dataFinal3 = "30/08/2021";

		try {
			SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
			dataDeTermino3 = sdf1.parse(dataFinal3);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		/**
		 * Cadastro das datas de inicio e de termino do quarto anuncio
		 * 
		 */
		String dataInicial4 = "02/08/2021";

		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			dataDeInicio4 = sdf.parse(dataInicial4);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		String dataFinal4 = "02/10/2021";

		try {
			SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
			dataDeTermino4 = sdf1.parse(dataFinal4);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		/**
		 * Cadastro do primeiro anuncio (nome do anuncio, cliente, data de inicio, data de termino,
		 * investimento por dia)
		 * 
		 */
		Anuncio anuncio = new Anuncio("Aula de Matemática", "José", dataDeInicio, dataDeTermino, 1500);
		BancoDeAnuncios banco = new BancoDeAnuncios();
		banco.adiciona(anuncio);

		/**
		 * Filtrando o primeiro anuncio pelo cliente
		 */
		System.out.println(banco.buscaAnuncioPeloCliente("José") + "\n");

		/**
		 * Filtrando o primeiro anuncio pelo intervalo de tempo
		 */
		System.out.println(banco.buscaAnuncioPeloIntervaloDeTempo(dataDeInicio, dataDeTermino) + "\n\n");

		/**
		 * Cadastro do segundo anuncio (nome do anuncio, cliente, data de inicio, data de termino,
		 * investimento por dia)
		 * 
		 */
		Anuncio anuncio2 = new Anuncio("Venda de um Xbox", "João", dataDeInicio2, dataDeTermino2, 2000);
		BancoDeAnuncios banco2 = new BancoDeAnuncios();
		banco.adiciona(anuncio2);
		/**
		 * Filtrando o segundo anuncio pelo cliente
		 */
		System.out.println(banco2.buscaAnuncioPeloCliente("João") + "\n");

		/**
		 * Filtrando o segundo anuncio pelo intervalo de tempo
		 */
		System.out.println(banco2.buscaAnuncioPeloIntervaloDeTempo(dataDeInicio2, dataDeTermino2) + "\n\n");

		/**
		 * Cadastro do terceiro anuncio (nome do anuncio, cliente, data de inicio, data de termino,
		 * investimento por dia)
		 * 
		 */
		Anuncio anuncio3 = new Anuncio("Venda de um carro Gol", "Maria", dataDeInicio3, dataDeTermino3, 5000);
		BancoDeAnuncios banco3 = new BancoDeAnuncios();
		banco.adiciona(anuncio3);

		/**
		 * Filtrando o terceiro anuncio pelo cliente
		 */
		System.out.println(banco3.buscaAnuncioPeloCliente("Maria") + "\n");

		/**
		 * Filtrando o terceiro anuncio pelo intervalo de tempo
		 */
		System.out.println(banco3.buscaAnuncioPeloIntervaloDeTempo(dataDeInicio3, dataDeTermino3) + "\n\n");

		/**
		 * Cadastro do quarto anuncio (nome do anuncio, cliente, data de inicio, data de termino,
		 * investimento por dia)
		 * 
		 */
		Anuncio anuncio4 = new Anuncio("Venda de uma casa de praia", "Laura", dataDeInicio4, dataDeTermino4, 1000);
		BancoDeAnuncios banco4 = new BancoDeAnuncios();
		banco.adiciona(anuncio4);

		/**
		 * Filtrando o quarto anuncio pelo cliente
		 */
		System.out.println(banco4.buscaAnuncioPeloCliente("Laura") + "\n");

		/**
		 * Filtrando o quarto anuncio pelo intervalo de tempo
		 */
		System.out.println(banco4.buscaAnuncioPeloIntervaloDeTempo(dataDeInicio4, dataDeTermino4) + "\n\n");

	}

}
