/*
 * Esse programa far� um menu onde a pessoa podera escolher a op��o desejada do que quer verificar.
 */
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
/*Coisas a fazer:
 * Criar a classe temperaturas - vai guardar as temperaturas digitadas e o calculo das medias
 * Criar a classe datas - vai armazenar as datas digitadas e a valida�ao de datas
 * Criar a busca binaria como fun�ao
 * Passar as opcoes como fun�oes.
 * Modificar para OO o trabalho: colocando heran�a, polimorfismo e encapsulamento (acoplamento?)
 * Fazer o programa voltar ao menu principal
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

	public static int EntradaDeTeperaturas() { //problema na valida�ao
		boolean repetirProcesso = true;
		int dia, mes, ano, temperatura;
		Scanner ler = new Scanner(System.in);
		char processo;
		System.out.println("Aqui, voc� poder� entrar com os dados solicitados pelo programa.");
		System.out.println();
		while(repetirProcesso) {
			System.out.print("Agora digite a data desejada: - M�s: ");
			mes = ler.nextInt();
			System.out.print("- Ano: ");
			ano = ler.nextInt();
			DataTemperatura dataMesAno = new DataTemperatura(mes, ano);
			dataMesAno.validaData(mes, ano);
			System.out.println();
			for (int i = 1; i <= dataMesAno.getQtdDiasMes(); i++) {
				System.out.print("Entre com o dia e a m�dia da temperatura escolhidos: - Dia: ");
				dia = ler.nextInt();
				DataTemperatura dataCompleta = new DataTemperatura(dia, mes, ano);
				dataCompleta.validaDia(dia);
				System.out.print("- Temperatura (em graus): ");
				temperatura = ler.nextInt();
				DataTemperatura dataTemperatura = new DataTemperatura(dia, mes, ano, temperatura);
				dataTemperatura.setTemperatura(temperatura);
				System.out.println();
			}
			System.out.print("Voc� deseja repetir o processo? (Digite um caracter - s/n - simbolizando sua resposta) ");
			processo = ler.next().charAt(0);
			if(processo == 's') {
				repetirProcesso = true;
			}
			else if(processo == 'n') {
				repetirProcesso = false;
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
			System.out.println("- Ano: ");
			ano = ler.nextInt();
			//validar data
			//System.out.println("A m�dia aritm�tica da temperatura da data" + mes + "/" + ano + " �: " + media + "."); 
			System.out.print("Voc� deseja repetir o processo? (Digite um caracter - s/n - simbolizando sua resposta) ");
			processo = ler.next().charAt(0);
			if(processo == 's') {
				repetirProcesso = true;
			}
			else if(processo == 'n') {
				repetirProcesso = false;
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
		int dia, mes, ano;
		Scanner ler = new Scanner(System.in);
		char processo;
		System.out.println("Aqui, voc� poder� descobrir o dia que teve a menor temperatura dentro de um m�s.");
		System.out.println();
		while(repetirProcesso) {
			System.out.print("Agora digite a data desejada: - M�s: ");
			mes = ler.nextInt();
			System.out.println("- Ano: ");
			ano = ler.nextInt();
			
			//System.out.println("A temperatura m�nima da data " + mes + "/" + ano + ", foi no dia " + dia + " e correspondeu �: " + temperatura + " graus Celsius.");
			//System.out.println();
			System.out.print("Voc� deseja repetir o processo? (Digite um caracter - s/n - simbolizando sua resposta) ");
			processo = ler.next().charAt(0);
			if(processo == 's') {
				repetirProcesso = true;
			}
			else if(processo == 'n') {
				repetirProcesso = false;
				//voltar ao Menu Principal
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
		int dia, mes, ano;
		Scanner ler = new Scanner(System.in);
		char processo;
		System.out.println("Aqui, voc� poder� descobrir o dia que teve a maior temperatura dentro de um m�s.");
		System.out.println();
		while(repetirProcesso) {
			System.out.print("Agora digite a data desejada: - M�s: ");
			mes = ler.nextInt();
			System.out.println("- Ano: ");
			ano = ler.nextInt();
			//System.out.println("A temperatura m�xima da data " + mes + "/" + ano + ", foi no dia " + dia + " e correspondeu �: " + temperatura + " graus Celsius.");
			//System.out.println();
			System.out.print("Voc� deseja repetir o processo? (Digite um caracter - s/n - simbolizando sua resposta) ");
			processo = ler.next().charAt(0);
			if(processo == 's') {
				repetirProcesso = true;
			}
			else if(processo == 'n') {
				repetirProcesso = false;
				//voltar ao Menu Principal
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
		int dia, mes, ano;
		Scanner ler = new Scanner(System.in);
		char processo;
		System.out.println("Aqui, voc� receber� um relat�rio meteorol�gico contendo todas as informa��es sobre a temperatura da data desejada.");
		System.out.println();
		while(repetirProcesso) {
			System.out.print("Agora digite a data desejada: - M�s: ");
			mes = ler.nextInt();
			System.out.println("- Ano: ");
			ano = ler.nextInt();
			//validar data
			//System.out.println("Relat�rio Meteorol�gico:");
			//System.out.println("1 - Temperaturas m�dias de cada dia do m�s:");
			//for i = 1 vai at� o m�ximo de dias do m�s:
			//System.out.println("Dia: " + i + "; Temperatura m�dia: " + mediaDosDias + "grausCelsius.");
			//System.out.println(); - fora do looping
			//System.out.println("2 - Temperatura m�dia do m�s: " + mediaDoMes + "grausCelsius.");
			//System.out.println();
			//System.out.println("3 - Temperatura m�nima do m�s: " + temperaturaMinima + "grauCelsius.");
			//System.out.println("4 - Temperatura m�xima do m�s: " + temperaturaM�xima + "grauCelsius.");
			System.out.print("Voc� deseja ver outro reat�rio? (Digite um caracter - s/n - simbolizando sua resposta) ");
			processo = ler.next().charAt(0);
			if(processo == 's') {
				repetirProcesso = true;
			}
			else if(processo == 'n') {
				repetirProcesso = false;
				//voltar ao Menu Principal
			}
			else {
				System.out.print("Ops! Op��o inv�lida! Tente outra vez: ");
				processo = ler.next().charAt(0);
			}
		}
		return 1;
	}
	public static void main(String[] args) {

		int opcao;
		boolean taDentro = false;
		Scanner ler = new Scanner(System.in);

		GeraDadosJaneiro2020();

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

}
