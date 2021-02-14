/*
 * Esse programa far� um menu onde a pessoa podera escolher a op��o desejada do que quer verificar.
 */
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
/*Coisas a fazer:
 * Modificar para OO o trabalho: colocando heran�a, polimorfismo ??
 */


public class TP1 {
	static DadosMetereologicos oDadosMetereologicos = new DadosMetereologicos();

	private static void GeraDadosJaneiro2020() {
		int ano = 2020;
		int mes = 1;
		Random geradorDeTemperaturas = new Random(); // gera as temperaturas do m�s de janeiro
		for (int dia = 1; dia<=31; dia++) {
			DataTemperatura oDataTemp = new DataTemperatura(dia, mes, ano, geradorDeTemperaturas.nextInt(30));
			oDadosMetereologicos.adicionarDataTemp( oDataTemp );
		}
	}
	
	public static void Menu() {
		int opcao;
		boolean taDentro = false;
		Scanner ler = new Scanner(System.in);
		System.out.println("Bem-vindo, Bem-vinda ou Bem-vinde ao Menu Principal do INMTE da Giulia!");
		System.out.println();
		System.out.println("Primeiro verifique as op��es dispon�veis para acesso:");
		System.out.println();
		System.out.println("1 -> Entrada de temperaturas");
		System.out.println("2 -> M�dia da temperatura de uma data");
		System.out.println("3 -> Temperatura m�nima de uma data");
		System.out.println("4 -> Temperatura m�xima de uma data");
		System.out.println("5 -> Relat�rio metereol�gico");
		System.out.println("6 -> Sair do programa");
		System.out.println();
		System.out.print("Agora escolha para onde voc� deseja ir: ");

		opcao = ler.nextInt();
		System.out.println("---------------------------------------------------------------------------------------");
		while(taDentro == false) {
			System.out.print("�timo! Voc� escolheu a op��o: ");
			System.out.println(opcao);
			System.out.println();
			switch (opcao) {
			case 1:
				opcao = EntradaDeTeperaturas();
				taDentro = true;
				break;
			case 2:
				opcao = MediaTemperaturas();
				taDentro = true;
				break;
			case 3:
				opcao = TempearturaMinima();
				taDentro = true;
				break;
			case 4:
				opcao = TemperaturaMaxima();
				taDentro = true;
				break;
			case 5:
				opcao = RelatorioMeteorologico();
				taDentro = true;
				break;
			case 6:
				System.out.println();
				System.out.println("Obrigada por acessar o INMTE! At� a pr�xima!");
				System.exit(0);
				break;
			default:
				System.out.print("Ops! Op��o inv�lida! Tente outra vez: ");
				opcao = ler.nextInt();
			}
		}
	}
	public static int EntradaDeTeperaturas() { 
		boolean repetirProcesso = true;
		int mes, ano, temperatura;
		Scanner ler = new Scanner(System.in);
		char processo;
		System.out.println("Aqui, voc� poder� entrar com os dados solicitados pelo programa.");
		System.out.println();
		while(repetirProcesso) {
			System.out.print("Agora digite a data desejada: - M�s: ");
			mes = ler.nextInt();
			System.out.println();
			System.out.print("- Ano: ");
			ano = ler.nextInt();
			while (!DataTemperatura.mesAnoValidos(mes, ano)) {
				while(mes < 1 || mes > 12) {
					System.out.print("M�s Inv�lido! Digite outro: ");
					mes = ler.nextInt();
					System.out.println();
				}
				while(ano < 2011 || ano > 2020) {
					System.out.print("Ano Inv�lido! Digite outro: ");
					ano = ler.nextInt();
					System.out.println();
				}
			}
			System.out.println();
			for (int dia = 1; dia <= DataTemperatura.getQtdDiasMes(mes,ano); dia++) {
				System.out.print("Entre com a m�dia da temperatura do dia " + dia + ": ");
				temperatura = ler.nextInt();
				System.out.println();
				DataTemperatura oDataTemperatura = new DataTemperatura(dia, mes, ano, temperatura);
				oDadosMetereologicos.adicionarDataTemp(oDataTemperatura);
			}
			System.out.print("Voc� deseja voltar ao menu principal? (Digite um caracter - s/n - simbolizando sua resposta) ");
			processo = ler.next().charAt(0);
			if(processo == 'n') {
				repetirProcesso = true;
			}
			else if(processo == 's') {
				repetirProcesso = false;
				System.out.println("---------------------------------------------------------------------------------------");
				Menu();
			}
			else {
				System.out.print("Ops! Op��o inv�lida! Tente outra vez: ");
				processo = ler.next().charAt(0);
			}
		}
		return 1;
	}
	public static int MediaTemperaturas() {
		boolean repetirProcesso = true;
		int dia, mes, ano;
		Scanner ler = new Scanner(System.in);
		char processo;
		System.out.println("Aqui, voc� poder� descobrir as m�dias aritm�ticas das temperaturas desejadas correspondentes a seus dias.");
		System.out.println();
		while(repetirProcesso) {
			System.out.print("Agora digite a data desejada: - M�s: ");
			mes = ler.nextInt();
			System.out.println();
			System.out.print("- Ano: ");
			ano = ler.nextInt();
			while (!DataTemperatura.mesAnoValidos(mes, ano)) {
				while(mes < 1 || mes > 12) {
					System.out.print("M�s Inv�lido! Digite outro: ");
					mes = ler.nextInt();
					System.out.println();
				}
				while(ano < 2011 || ano > 2020) {
					System.out.print("Ano Inv�lido! Digite outro: ");
					ano = ler.nextInt();
					System.out.println();
				}
			}
			System.out.println();
			DadosMetereologicos media = new DadosMetereologicos();
			System.out.println("A m�dia aritm�tica da temperatura da data " + mes + "/" + ano + " �: " + media.calcularMediaTempMesAno(mes, ano)+ "."); 
			System.out.print("Voc� deseja voltar ao menu principal? (Digite um caracter - s/n - simbolizando sua resposta) ");
			processo = ler.next().charAt(0);
			if(processo == 'n') {
				repetirProcesso = true;
			}
			else if(processo == 's') {
				repetirProcesso = false;
				System.out.println("---------------------------------------------------------------------------------------");
				Menu();
			}
			else {
				System.out.print("Ops! Op��o inv�lida! Tente outra vez: ");
				processo = ler.next().charAt(0);
			}
		}
		return 1;
	}
	public static int TempearturaMinima() {
		boolean repetirProcesso = true;
		int dia, mes, ano, temperatura;
		Scanner ler = new Scanner(System.in);
		char processo;
		System.out.println("Aqui, voc� poder� descobrir o dia que teve a menor temperatura dentro de um m�s.");
		System.out.println();
		while(repetirProcesso) {
			System.out.print("Agora digite a data desejada: - M�s: ");
			mes = ler.nextInt();
			System.out.println();
			System.out.print("- Ano: ");
			ano = ler.nextInt();
			while (!DataTemperatura.mesAnoValidos(mes, ano)) {
				while(mes < 1 || mes > 12) {
					System.out.print("M�s Inv�lido! Digite outro: ");
					mes = ler.nextInt();
					System.out.println();
				}
				while(ano < 2011 || ano > 2020) {
					System.out.print("Ano Inv�lido! Digite outro: ");
					ano = ler.nextInt();
					System.out.println();
				}
			}
			System.out.println();
			DadosMetereologicos tempMinima = new DadosMetereologicos();
	//		System.out.println("A temperatura m�nima da data " + mes + "/" + ano + ", foi no dia " + dia + " e correspondeu �: " + tempMinima.calcularTempMinima() + " graus Celsius.");
			System.out.println();
			System.out.print("Voc� deseja voltar ao menu principal? (Digite um caracter - s/n - simbolizando sua resposta) ");
			processo = ler.next().charAt(0);
			if(processo == 'n') {
				repetirProcesso = true;
			}
			else if(processo == 's') {
				repetirProcesso = false;
				System.out.println("---------------------------------------------------------------------------------------");
				Menu();
			}
			else {
				System.out.print("Ops! Op��o inv�lida! Tente outra vez: ");
				processo = ler.next().charAt(0);
			}
		}
		return 1;
	}
	public static int TemperaturaMaxima() {
		boolean repetirProcesso = true;
		int dia, mes, ano, temperatura;
		Scanner ler = new Scanner(System.in);
		char processo;
		System.out.println("Aqui, voc� poder� descobrir o dia que teve a maior temperatura dentro de um m�s.");
		System.out.println();
		while(repetirProcesso) {
			System.out.print("Agora digite a data desejada: - M�s: ");
			mes = ler.nextInt();
			System.out.println();
			System.out.print("- Ano: ");
			ano = ler.nextInt();
			while (!DataTemperatura.mesAnoValidos(mes, ano)) {
				while(mes < 1 || mes > 12) {
					System.out.print("M�s Inv�lido! Digite outro: ");
					mes = ler.nextInt();
					System.out.println();
				}
				while(ano < 2011 || ano > 2020) {
					System.out.print("Ano Inv�lido! Digite outro: ");
					ano = ler.nextInt();
					System.out.println();
				}
			}
			System.out.println();
			DadosMetereologicos tempMinima = new DadosMetereologicos();
	//		System.out.println("A temperatura m�xima da data " + mes + "/" + ano + ", foi no dia " + dia + " e correspondeu �: " + tempMinima.calcularTempMinima() + " graus Celsius.");
			System.out.println();
			System.out.print("Voc� deseja voltar ao menu principal? (Digite um caracter - s/n - simbolizando sua resposta) ");
			processo = ler.next().charAt(0);
			if(processo == 'n') {
				repetirProcesso = true;
			}
			else if(processo == 's') {
				repetirProcesso = false;
				System.out.println("---------------------------------------------------------------------------------------");
				Menu();
			}
			else {
				System.out.print("Ops! Op��o inv�lida! Tente outra vez: ");
				processo = ler.next().charAt(0);
			}
		}
		return 1;
	}
	public static int RelatorioMeteorologico() {
		boolean repetirProcesso = true;
		int dia, mes, ano, temperatura;
		Scanner ler = new Scanner(System.in);
		char processo;
		System.out.println("Aqui, voc� receber� um relat�rio meteorol�gico contendo todas as informa��es sobre a temperatura da data desejada.");
		System.out.println();
		while(repetirProcesso) {
			System.out.print("Agora digite a data desejada: - M�s: ");
			mes = ler.nextInt();
			System.out.println();
			System.out.print("- Ano: ");
			ano = ler.nextInt();
			while (!DataTemperatura.mesAnoValidos(mes, ano)) {
				while(mes < 1 || mes > 12) {
					System.out.print("M�s Inv�lido! Digite outro: ");
					mes = ler.nextInt();
					System.out.println();
				}
				while(ano < 2011 || ano > 2020) {
					System.out.print("Ano Inv�lido! Digite outro: ");
					ano = ler.nextInt();
					System.out.println();
				}
			}
			System.out.println();
			System.out.println("Relat�rio Meteorol�gico:");
			System.out.println("1 - Temperaturas m�dias de cada dia do m�s:");
		//	DataTemperatura media = new DataTemperatura(dia, mes, ano, temperatura);
	//		for(int i = 1; i <= DataTemperatura.getQtdDiasMes(mes,ano); i++){
	//			System.out.println("Dia " + i + "Temperatura m�dia: " + media.setTemperatura(temperatura));
	//		}
			System.out.println(); //- fora do looping
			//System.out.println("2 - Temperatura m�dia do m�s: " + .calcularMediaTemp + "grausCelsius."); - COMO COLOCAR AQUI O CALCULAR MEDIA
			System.out.println();
			//System.out.println("3 - Temperatura m�nima do m�s: " + .calcularTempMinima + "grauCelsius."); - COMO COLOCAR AQUI O TEMPERATURA MINIMA
			System.out.println();
			//System.out.println("4 - Temperatura m�xima do m�s: " + .calcularTempMaxima + "grauCelsius."); - COMO COLOCAR AQUI O TEMPERATURA MAXIMA
			System.out.print("Voc� deseja ver outro relat�rio? (Digite um caracter - s/n - simbolizando sua resposta) ");
			processo = ler.next().charAt(0);
			if(processo == 'n') {
				repetirProcesso = true;
			}
			else if(processo == 's') {
				repetirProcesso = false;
				System.out.println("---------------------------------------------------------------------------------------");
				Menu();
			}
			else {
				System.out.print("Ops! Op��o inv�lida! Tente outra vez: ");
				processo = ler.next().charAt(0);
			}
		}
		return 1;
	}
	
	public static void main(String[] args) {
		GeraDadosJaneiro2020();
		Menu();
	}

}
