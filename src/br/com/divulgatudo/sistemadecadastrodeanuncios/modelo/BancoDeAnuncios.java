package br.com.divulgatudo.sistemadecadastrodeanuncios.modelo;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Classe que representa o Banco de Anuncios que ira guardar (cadastrar) os anuncios em uma lista.
 * 
 * @author Samuel Cardoso de Oliveira
 * @version 0.0
 */
public class BancoDeAnuncios { 

	private static List<Anuncio> lista = new ArrayList<Anuncio>();

	/**
	 * Metodo que adiciona um novo anuncio no banco de anuncios.
	 * 
	 * @param anuncio
	 */
	public void adiciona(Anuncio anuncio) { 
		BancoDeAnuncios.lista.add(anuncio);
	}
	 
	/**
	 * Metodo que busca(filtra) o anuncio pelo cliente.
	 * 
	 * @param cliente
	 * @return
	 */
	
	public Anuncio buscaAnuncioPeloCliente(String cliente) {
		for (Anuncio anuncio : lista) {
			if (anuncio.getCliente() == cliente) {
				return anuncio;
			}
		}
		return null;
	}
	
	/**
	 * Metodo que busca(filtra) o anuncio pelo intervalo de tempo
	 * 
	 * @param dataDeInicio
	 * @param dataDeTermino
	 * @return
	 */
	public Anuncio buscaAnuncioPeloIntervaloDeTempo(Date dataDeInicio, Date dataDeTermino) {
		for (Anuncio anuncio : lista) {
			if(anuncio.getDataDeInicio()== dataDeInicio && anuncio.getDataDeTermino()==dataDeTermino)
				return anuncio;
			
		}
		return null;
		
	}
	
}
