/*
 * Esse programa fará um menu onde a pessoa podera escolher a opção desejada do que quer verificar.
 */
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
/*Coisas a fazer:
 * Modificar para OO o trabalho: colocando herança, polimorfismo ??
 * Fazer o programa voltar ao menu principal
 */


public class TP1 {
	static DadosMetereologicos oDadosMetereologicos = new DadosMetereologicos();

	private static void GeraDadosJaneiro2020() {
		int ano = 2020;
		int mes = 1;
		Random geradorDeTemperaturas = new Random(); // gera as temperaturas do mês de janeiro
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
		System.out.println("Primeiro verifique as opções disponíveis para acesso:");
		System.out.println();
		System.out.println("1 -> Entrada de temperaturas");
		System.out.println("2 -> Média da temperatura de uma data");
		System.out.println("3 -> Temperatura mínima de uma data");
		System.out.println("4 -> Temperatura máxima de uma data");
		System.out.println("5 -> Relatório metereológico");
		System.out.println("6 -> Sair do programa");
		System.out.println();
		System.out.print("Agora escolha para onde você deseja ir: ");

		opcao = ler.nextInt();
		System.out.println("---------------------------------------------------------------------------------------");
		while(taDentro == false) {
			System.out.print("Ótimo! Você escolheu a opção: ");
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
				System.out.println("Obrigada por acessar o INMTE! Até a próxima!");
				System.exit(0);
				break;
			default:
				System.out.print("Ops! Opção inválida! Tente outra vez: ");
				opcao = ler.nextInt();
			}
		}
	}
	public static int EntradaDeTeperaturas() { 
		boolean repetirProcesso = true;
		int dia, mes, ano, temperatura;
		Scanner ler = new Scanner(System.in);
		char processo;
		System.out.println("Aqui, você poderá entrar com os dados solicitados pelo programa.");
		System.out.println();
		while(repetirProcesso) {
			System.out.print("Agora digite a data desejada: - Mês: ");
			mes = ler.nextInt();
			System.out.println();
			System.out.print("- Ano: ");
			ano = ler.nextInt();
			DataTemperatura dataMesAno = new DataTemperatura(mes, ano);
			dataMesAno.validaData(mes, ano);
			System.out.println();
			for (int i = 0; i < dataMesAno.getQtdDiasMes(); i++) { //NAO ESTA ENTRANDO NO FOR - NAO CONSEGUI IDENTIFICAR O PORQUE
				System.out.print("Entre com o dia e a média da temperatura escolhidos: - Dia: ");
				dia = ler.nextInt();
				DataTemperatura dataCompleta = new DataTemperatura(dia, mes, ano);
				dataCompleta.validaDia(dia);
				System.out.println();
				System.out.print("- Temperatura (em graus): ");
				temperatura = ler.nextInt();
				DataTemperatura dataTemperatura = new DataTemperatura(dia, mes, ano, temperatura);
				dataTemperatura.setTemperatura(temperatura);
				System.out.println();
			}
			System.out.print("Você deseja repetir o processo? (Digite um caracter - s/n - simbolizando sua resposta) ");
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
				System.out.print("Ops! Opção inválida! Tente outra vez: ");
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
		System.out.println("Aqui, você poderá descobrir as médias aritméticas das temperaturas desejadas correspondentes a seus dias.");
		System.out.println();
		while(repetirProcesso) {
			System.out.print("Agora digite a data desejada: - Mês: ");
			mes = ler.nextInt();
			System.out.println("- Ano: ");
			ano = ler.nextInt();
			//DataTemperatura dataTemperatura = new DataTemperatura(dia, mes, ano, temperatura);
			//dataTemperatura.validaData(mes, ano);
			//System.out.println("A média aritmética da temperatura da data" + dataMesAno.mes + "/" + dataMesAno.ano + " é: " + media + "."); 
			System.out.print("Você deseja repetir o processo? (Digite um caracter - s/n - simbolizando sua resposta) ");
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
				System.out.print("Ops! Opção inválida! Tente outra vez: ");
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
		System.out.println("Aqui, você poderá descobrir o dia que teve a menor temperatura dentro de um mês.");
		System.out.println();
		while(repetirProcesso) {
			System.out.print("Agora digite a data desejada: - Mês: ");
			mes = ler.nextInt();
			System.out.println("- Ano: ");
			ano = ler.nextInt();
			//DataTemperatura dataTemperatura = new DataTemperatura(dia, mes, ano, temperatura);
			//dataTemperatura.validaData(mes, ano);
			//System.out.println("A temperatura mínima da data " + dataTemperatura.mes + "/" + dataTemperatura.ano + ", foi no dia " + dataTemperatura.dia + " e correspondeu à: " + temperatura + " graus Celsius.");
			//System.out.println();
			System.out.print("Você deseja repetir o processo? (Digite um caracter - s/n - simbolizando sua resposta) ");
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
				System.out.print("Ops! Opção inválida! Tente outra vez: ");
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
		System.out.println("Aqui, você poderá descobrir o dia que teve a maior temperatura dentro de um mês.");
		System.out.println();
		while(repetirProcesso) {
			System.out.print("Agora digite a data desejada: - Mês: ");
			mes = ler.nextInt();
			System.out.println("- Ano: ");
			ano = ler.nextInt();
			//DataTemperatura dataTemperatura = new DataTemperatura(dia, mes, ano, temperatura);
			//dataTemperatura.validaData(mes, ano);
			//System.out.println("A temperatura máxima da data " + dataTemperatura.mes + "/" + dataTemperatura.ano + ", foi no dia " + dataTemperatura.dia + " e correspondeu à: " + temperatura + " graus Celsius.");
			//System.out.println();
			System.out.print("Você deseja repetir o processo? (Digite um caracter - s/n - simbolizando sua resposta) ");
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
				System.out.print("Ops! Opção inválida! Tente outra vez: ");
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
		System.out.println("Aqui, você receberá um relatório meteorológico contendo todas as informações sobre a temperatura da data desejada.");
		System.out.println();
		while(repetirProcesso) {
			System.out.print("Agora digite a data desejada: - Mês: ");
			mes = ler.nextInt();
			System.out.println("- Ano: ");
			ano = ler.nextInt();
			DataTemperatura dataMesAno = new DataTemperatura(mes, ano);
			dataMesAno.validaData(mes, ano);
			System.out.println("Relatório Meteorológico:");
			System.out.println("1 - Temperaturas médias de cada dia do mês:");
			//for(i = 1; i <= dataMesAno.getQtdDiasMes(); i++){
				//System.out.println(System.out.println("Dia: " + i + "; Temperatura média: " + mediaDosDias + "grausCelsius.");
			//}
			System.out.println(); //- fora do looping
			//System.out.println("2 - Temperatura média do mês: " + .calcularMediaTemp + "grausCelsius."); - COMO COLOCAR AQUI O CALCULAR MEDIA
			System.out.println();
			//System.out.println("3 - Temperatura mínima do mês: " + .calcularTempMinima + "grauCelsius."); - COMO COLOCAR AQUI O TEMPERATURA MINIMA
			System.out.println();
			//System.out.println("4 - Temperatura máxima do mês: " + .calcularTempMaxima + "grauCelsius."); - COMO COLOCAR AQUI O TEMPERATURA MAXIMA
			System.out.print("Você deseja ver outro reatório? (Digite um caracter - s/n - simbolizando sua resposta) ");
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
				System.out.print("Ops! Opção inválida! Tente outra vez: ");
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
