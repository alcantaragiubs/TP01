import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Inmte {
	static DadosMetereologicos oDadosMetereologicos = new DadosMetereologicos();

	public void GeraDadosJaneiro2020Random() {
		int ano = 2020;
		int mes = 1;
		Random geradorDeTemperaturas = new Random(); // gera as temperaturas do m�s de janeiro
		for (int dia = 1; dia<=31; dia++) {
			DataTemperatura oDataTemp = new DataTemperatura(dia, mes, ano, geradorDeTemperaturas.nextInt(30));
			oDadosMetereologicos.adicionarDataTemp( oDataTemp );
		}
	}
	
	public void GeraDadosJaneiro2020TudoTemp1() {
		int ano = 2020;
		int mes = 1;
		for (int dia = 1; dia<=31; dia++) {
			DataTemperatura oDataTemp = new DataTemperatura(dia, mes, ano, 1);
			oDadosMetereologicos.adicionarDataTemp( oDataTemp );
		}
	}
	
	public void Menu() {
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
				opcao = EntradaDeTemperaturas();
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
	public int EntradaDeTemperaturas() { 
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
	public int MediaTemperaturas() {
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
			
			System.out.println("A m�dia aritm�tica da temperatura da data " + mes + "/" + ano + " �: " + oDadosMetereologicos.calcularMediaTempMesAno(mes, ano)+ "."); 
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
	public int TempearturaMinima() {
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
			System.out.println("A temperatura m�nima da data " + mes + "/" + ano + ",  correspondeu �: " + oDadosMetereologicos.calcularTempMinimaMesAno(mes, ano)+ " graus Celsius.");
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
	public int TemperaturaMaxima() {
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
			System.out.println("A temperatura m�xima da data " + mes + "/" + ano + ",  correspondeu �: " + oDadosMetereologicos.calcularTempMaximaMesAno(mes, ano) + " graus Celsius.");
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
	public int RelatorioMeteorologico() {
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
			
			ArrayList<DataTemperatura> listaDataTemperatura = oDadosMetereologicos.getListaDataTemperaturaMesAno(mes, ano);
			
			for(DataTemperatura oDataTemperatura : listaDataTemperatura){
				System.out.println("Dia " + oDataTemperatura.dia + " Temperatura m�dia: " + oDataTemperatura.temperatura);
			}
			
			System.out.println();
			System.out.println("2 - Temperatura m�dia do m�s: " + oDadosMetereologicos.calcularMediaTempMesAno(mes, ano) + " grausCelsius."); 
			System.out.println();
			System.out.println("3 - Temperatura m�nima do m�s: " + oDadosMetereologicos.calcularTempMinimaMesAno(mes, ano) + " grauCelsius."); 
			System.out.println();
			System.out.println("4 - Temperatura m�xima do m�s: " + oDadosMetereologicos.calcularTempMaximaMesAno(mes, ano) + " grauCelsius."); 
			System.out.print("Voc� deseja ver outro relat�rio? (Digite um caracter - s/n - simbolizando sua resposta) ");
			processo = ler.next().charAt(0);
			if(processo == 's') {
				repetirProcesso = true;
			}
			else if(processo == 'n') {
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
}
