package br.com.divulgatudo.sistemadecadastrodeanuncios.modelo;


import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.joda.time.DateTime;
import org.joda.time.Days;

/**
 * Classe que representa um Anuncio no Sistema de Cadastros
 * 
 * @author Samuel Cardoso de Oliveira
 * @version 0.0
 */
public class Anuncio {

	private String nomeDoAnuncio;
	private String cliente;
	private Date dataDeInicio;
	private Date dataDeTermino;
	private double investimentoPorDia;
	private Calculadora calculoDoAnuncio;

	/**
	 * Construtor para inicializar o objeto conta a partir do nome de anuncio e do
	 * cliente, as datas de inicio e de termino, e os investimentos por dia
	 * 
	 * @param nomeDoAnuncio
	 * @param cliente
	 * @param dataDeInicio
	 * @param dataDeTermino
	 * @param investimentoPorDia
	 */
	public Anuncio(String nomeDoAnuncio, String cliente, Date dataDeInicio, Date dataDeTermino, double investimentoPorDia) {

		this.nomeDoAnuncio = nomeDoAnuncio;
		this.cliente = cliente;
		this.dataDeInicio = dataDeInicio;
		this.dataDeTermino = dataDeTermino;
		this.investimentoPorDia = investimentoPorDia;
	}

	public String getCliente() {
		return cliente;
	}

	public Date getDataDeInicio() {
		return dataDeInicio;
	}

	public Date getDataDeTermino() {
		return dataDeTermino;
	}

	/**
	 * Metodo que instancia o objeto calculadora para obter o valor total investido
	 * e a quantidade aproximada de: visiualizacoes, cliques e compartilhamentos.
	 * 
	 * @return
	 */
	public String calculadoraDeAnuncio() {

		DateTime dataInicial = new DateTime(this.dataDeInicio);
		DateTime dataFinal = new DateTime(this.dataDeTermino);
		Days intervaloDeDias = Days.daysBetween(dataInicial, dataFinal); // obtencao do intervalo de dias entre as datas
																			// de inicio e de termino
		int quantidadeDeDias = intervaloDeDias.getDays();
		double valorInvestido = Math.round(this.investimentoPorDia * quantidadeDeDias);
		Calculadora calculadora = new Calculadora();
		return calculadora.execucaoDoCalculo(valorInvestido);

	}

	/**
	 * Retorna o relatório completo, quando Anuncio é filtrado no Banco de Anuncios
	 * 
	 */
	@Override
	public String toString() {

		return "Relatório: " + "\n" + this.calculadoraDeAnuncio(); // retorno do relatório completo.
	}
}
