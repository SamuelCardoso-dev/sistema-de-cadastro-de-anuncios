package br.com.divulgatudo.sistemadecadastrodeanuncios.modelo;

/**
 * Classe que irá realizar os cálculos do número de visualizações, cliques e
 * compartilhamentos.
 * 
 * @author Samuel Cardoso de Oliveira
 * @version 0.0
 */

public class Calculadora {

	/**
	 * Inicializacao das variaveis
	 */
	private double valorInvestido;
	private double pessoasQueVisualizam = 0;
	private double pessoasQueClicam = 0;
	private double pessoasQueCompartilham = 0;
	private double novasVisualizacoes = 0;
	private int qtdcompartilhamentos = 1;
	private double totalDeNovasVisualizacoes = 0;
	private double novosCliques;
	private double totalDeNovosCliques = 0;
	private double totalDeNovosCompartilhamentos;
	private double novosCompartilhamentos;
	private String valorTotal;
	private String visualizam;
	private String cliques;
	private String compartilham;
	
	/**
	 * O valor investido precisa ser maior do que zero.
	 * 
	 * @trows IllegalArgumentException
	 */

	public String execucaoDoCalculo(double valorInvestido) {

		this.valorInvestido = valorInvestido;

		if (valorInvestido < 0) {
			throw new IllegalArgumentException();
		}

		this.pessoasQueVisualizam = 30 * valorInvestido;

		/**
		 * A cada 100 pessoas que visualizam, 12 clicam.
		 * 
		 */
		if (this.pessoasQueVisualizam >= 100) {
			this.pessoasQueClicam = (this.pessoasQueVisualizam / 100) * 12;

			/**
			 * A cada 20 pessoas que clicam, 3 compartilham.
			 * 
			 */
			if (this.pessoasQueClicam >= 20) {
				this.pessoasQueCompartilham = (this.pessoasQueClicam / 20) * 3;
				this.qtdcompartilhamentos++;

				/**
				 * Cada pessoa que compartilha gera 40 novas visualizacoes.
				 * 
				 */
				this.novasVisualizacoes = this.pessoasQueCompartilham * 40;

				/**
				 * Um mesmo anuncio so pode ser compartilhado 4 vezes em sequencia.
				 * 
				 */
				while (this.qtdcompartilhamentos <= 4) {
					if (this.novasVisualizacoes >= 100) {
						this.novosCliques = (this.novasVisualizacoes / 100) * 12;
						this.totalDeNovosCliques += this.novosCliques;
						if (this.novosCliques >= 20) {
							this.totalDeNovasVisualizacoes += this.novasVisualizacoes;
							this.novasVisualizacoes = 0;
							this.novosCompartilhamentos = (this.novosCliques / 20) * 3;
							this.totalDeNovosCompartilhamentos += this.novosCompartilhamentos;
							this.qtdcompartilhamentos++;
							this.novasVisualizacoes = this.novosCompartilhamentos * 40;
						} else {

							/**
							 * Retorno do metodo relatorio com os resultados.
							 */
							return relatorio(this.valorInvestido, this.pessoasQueVisualizam, this.novasVisualizacoes,
									this.totalDeNovasVisualizacoes, this.pessoasQueClicam, this.novosCliques,
									this.totalDeNovosCliques, this.pessoasQueCompartilham,
									this.totalDeNovosCompartilhamentos);

						}

					} else {

						/**
						 * Retorno do metodo relatorio com os resultados.
						 */
						return relatorio(this.valorInvestido, this.pessoasQueVisualizam, this.novasVisualizacoes,
								this.totalDeNovasVisualizacoes, this.pessoasQueClicam, this.novosCliques,
								this.totalDeNovosCliques, this.pessoasQueCompartilham,
								this.totalDeNovosCompartilhamentos);

					}

				}

				/**
				 * Retorno do metodo relatorio com os resultados.
				 */
				return relatorio(this.valorInvestido, this.pessoasQueVisualizam, this.novasVisualizacoes,
						this.totalDeNovasVisualizacoes, this.pessoasQueClicam, this.novosCliques,
						this.totalDeNovosCliques, this.pessoasQueCompartilham, this.totalDeNovosCompartilhamentos);

			}

			/**
			 * 7 é a quantidade minima aproximada para gerar um compartilhamento, visto que
			 * a cada 20 que clicam, 3 compartilham.
			 * 
			 */
			if (this.pessoasQueClicam >= 7) {
				this.pessoasQueCompartilham = (this.pessoasQueClicam / 20) * 3;
				this.qtdcompartilhamentos++;
				this.novasVisualizacoes = this.pessoasQueCompartilham * 40;

				/**
				 * Um mesmo anuncio so pode ser compartilhado 4 vezes em sequencia.
				 * 
				 */
				while (this.qtdcompartilhamentos <= 4) {

					/**
					 * Se 7 pessoas clicarem, 41 será a quantidade aproximada de visualizacoes
					 * minima possivel.
					 * 
					 */
					if (this.novasVisualizacoes >= 41) {
						this.novosCliques = (this.novasVisualizacoes / 100) * 12;
						this.totalDeNovosCliques += this.novosCliques;
						if (this.novosCliques >= 5) {
							this.totalDeNovasVisualizacoes += this.novasVisualizacoes;
							this.novasVisualizacoes = 0;
							this.novosCompartilhamentos = (this.novosCliques / 20) * 3;
							this.totalDeNovosCompartilhamentos += this.novosCompartilhamentos;
							this.qtdcompartilhamentos++;
							this.novasVisualizacoes = this.novosCompartilhamentos * 40;
						} else {

							/**
							 * Retorno do metodo relatorio com os resultados.
							 */
							return relatorio(this.valorInvestido, this.pessoasQueVisualizam, this.novasVisualizacoes,
									this.totalDeNovasVisualizacoes, this.pessoasQueClicam, this.novosCliques,
									this.totalDeNovosCliques, this.pessoasQueCompartilham,
									this.totalDeNovosCompartilhamentos);

						}
					} else {

						/**
						 * Retorno do metodo relatorio com os resultados.
						 */
						return relatorio(this.valorInvestido, this.pessoasQueVisualizam, this.novasVisualizacoes,
								this.totalDeNovasVisualizacoes, this.pessoasQueClicam, this.novosCliques,
								this.totalDeNovosCliques, this.pessoasQueCompartilham,
								this.totalDeNovosCompartilhamentos);

					}
				}

				/**
				 * Retorno do metodo relatorio com os resultados.
				 */
				return relatorio(this.valorInvestido, this.pessoasQueVisualizam, this.novasVisualizacoes,
						this.totalDeNovasVisualizacoes, this.pessoasQueClicam, this.novosCliques,
						this.totalDeNovosCliques, this.pessoasQueCompartilham, this.totalDeNovosCompartilhamentos);

			}

			/**
			 * Retorno do metodo relatorio com os resultados.
			 */
			return relatorio(this.valorInvestido, this.pessoasQueVisualizam, this.novasVisualizacoes,
					this.totalDeNovasVisualizacoes, this.pessoasQueClicam, this.novosCliques, this.totalDeNovosCliques,
					this.pessoasQueCompartilham, this.totalDeNovosCompartilhamentos);

		}
		this.pessoasQueClicam = (this.pessoasQueVisualizam / 100) * 12;

		/**
		 * 7 é a quantidade minima aproximada para gerar um compartilhamento, visto que
		 * a cada 20 que clicam, 3 compartilham.
		 * 
		 */
		if (this.pessoasQueClicam >= 7) {
			this.pessoasQueCompartilham = (this.pessoasQueClicam / 20) * 3;
			this.qtdcompartilhamentos++;
			this.novasVisualizacoes = this.pessoasQueCompartilham * 40;

			/**
			 * Um mesmo anuncio so pode ser compartilhado 4 vezes em sequencia.
			 * 
			 */
			while (this.qtdcompartilhamentos <= 4) {

				/**
				 * Se 7 pessoas clicarem, 41 será a quantidade aproximada de visualizacoes
				 * minima possivel.
				 * 
				 */
				if (this.novasVisualizacoes >= 41) {
					this.novosCliques = (this.novasVisualizacoes / 100) * 12;
					this.totalDeNovosCliques += this.novosCliques;
					if (this.novosCliques >= 5) {
						this.totalDeNovasVisualizacoes += this.novasVisualizacoes;
						this.novasVisualizacoes = 0;
						this.novosCompartilhamentos = (this.novosCliques / 20) * 3;
						this.totalDeNovosCompartilhamentos += this.novosCompartilhamentos;
						this.qtdcompartilhamentos++;
						this.novasVisualizacoes = this.novosCompartilhamentos * 40;
					} else {

						/**
						 * Retorno do metodo relatorio com os resultados.
						 */
						return relatorio(this.valorInvestido, this.pessoasQueVisualizam, this.novasVisualizacoes,
								this.totalDeNovasVisualizacoes, this.pessoasQueClicam, this.novosCliques,
								this.totalDeNovosCliques, this.pessoasQueCompartilham,
								this.totalDeNovosCompartilhamentos);

					}
				} else {

					/**
					 * Retorno do metodo relatorio com os resultados.
					 */
					return relatorio(this.valorInvestido, this.pessoasQueVisualizam, this.novasVisualizacoes,
							this.totalDeNovasVisualizacoes, this.pessoasQueClicam, this.novosCliques,
							this.totalDeNovosCliques, this.pessoasQueCompartilham, this.totalDeNovosCompartilhamentos);

				}
			}

			/**
			 * Retorno do metodo relatorio com os resultados.
			 */
			return relatorio(this.valorInvestido, this.pessoasQueVisualizam, this.novasVisualizacoes,
					this.totalDeNovasVisualizacoes, this.pessoasQueClicam, this.novosCliques, this.totalDeNovosCliques,
					this.pessoasQueCompartilham, this.totalDeNovosCompartilhamentos);

		}

		/**
		 * Retorno do metodo relatorio com os resultados.
		 */
		return relatorio(this.valorInvestido, this.pessoasQueVisualizam, this.novasVisualizacoes,
				this.totalDeNovasVisualizacoes, this.pessoasQueClicam, this.novosCliques, this.totalDeNovosCliques,
				this.pessoasQueCompartilham, this.totalDeNovosCompartilhamentos);

	}

	/**
	 * Metodo que retorna o valor total investido, as visualizacoes, os cliques e os
	 * compartilhamentos
	 * 
	 * @param valorInvestido2
	 * @param pessoasQueVisualizam2
	 * @param novasVisualizacoes2
	 * @param totalDeNovasVisualizacoes2
	 * @param pessoasQueClicam2
	 * @param novosCliques2
	 * @param totalDeNovosCliques2
	 * @param pessoasQueCompartilham2
	 * @param totalDeNovosCompartilhamentos2
	 * @return
	 */
	public String relatorio(double valorInvestido2, double pessoasQueVisualizam2, double novasVisualizacoes2,
			double totalDeNovasVisualizacoes2, double pessoasQueClicam2, double novosCliques2,
			double totalDeNovosCliques2, double pessoasQueCompartilham2, double totalDeNovosCompartilhamentos2) {

		this.valorInvestido = valorInvestido2;
		this.pessoasQueVisualizam = pessoasQueVisualizam2;
		this.novasVisualizacoes = novasVisualizacoes2;
		this.totalDeNovasVisualizacoes = totalDeNovasVisualizacoes2;
		this.pessoasQueClicam = pessoasQueClicam2;
		this.novosCliques = novosCliques2;
		this.totalDeNovosCliques = totalDeNovosCliques2;
		this.pessoasQueCompartilham = pessoasQueCompartilham2;
		this.totalDeNovosCompartilhamentos = totalDeNovosCompartilhamentos2;

		/**
		 * Transformando double em String.
		 */
		this.valorTotal = Double.toString(Math.round(this.valorInvestido));

		/**
		 * calculo maximo de pessoas que visualizam
		 */
		this.pessoasQueVisualizam += this.novasVisualizacoes;
		this.pessoasQueVisualizam += this.totalDeNovasVisualizacoes;

		/**
		 * Transformando double em String.
		 */
		this.visualizam = Double.toString(Math.round(this.pessoasQueVisualizam));

		/**
		 * calculo maximo de pessoas que clicam
		 */
		this.novosCliques = (this.novasVisualizacoes * 12) / 100;
		this.pessoasQueClicam += this.novosCliques;
		this.pessoasQueClicam += this.totalDeNovosCliques;

		/**
		 * Transformando double em String.
		 */
		this.cliques = Double.toString(Math.round(this.pessoasQueClicam));

		/**
		 * calculo maximo de pessoas que compartilham
		 */
		this.pessoasQueCompartilham += this.totalDeNovosCompartilhamentos;

		/**
		 * Transformando double em String.
		 */
		this.compartilham = Double.toString(Math.round(this.pessoasQueCompartilham));

		/**
		 * Retorna o relatorio completo.
		 */
		return "Valor investido: " + this.valorTotal + "\n" + "Quantidade máxima de Visualizações: " + this.visualizam
				+ "\n" + "Quantidade máxima de Cliques: " + this.cliques + "\n"
				+ "Quantidade máxima de Compartilhamentos: " + this.compartilham;

	}

}
