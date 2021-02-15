import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Inmte {
	static DadosMetereologicos oDadosMetereologicos = new DadosMetereologicos();

	public void GeraDadosJaneiro2020Random() {
		int ano = 2020;
		int mes = 1;
		Random geradorDeTemperaturas = new Random(); // gera as temperaturas do mês de janeiro
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
				System.out.println("Obrigada por acessar o INMTE! Até a próxima!");
				System.exit(0);
				break;
			default:
				System.out.print("Ops! Opção inválida! Tente outra vez: ");
				opcao = ler.nextInt();
			}
		}
	}
	public int EntradaDeTemperaturas() { 
		boolean repetirProcesso = true;
		int mes, ano, temperatura;
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
			while (!DataTemperatura.mesAnoValidos(mes, ano)) {
				while(mes < 1 || mes > 12) {
					System.out.print("Mês Inválido! Digite outro: ");
					mes = ler.nextInt();
					System.out.println();
				}
				while(ano < 2011 || ano > 2020) {
					System.out.print("Ano Inválido! Digite outro: ");
					ano = ler.nextInt();
					System.out.println();
				}
			}
			System.out.println();
			for (int dia = 1; dia <= DataTemperatura.getQtdDiasMes(mes,ano); dia++) {
				System.out.print("Entre com a média da temperatura do dia " + dia + ": ");
				temperatura = ler.nextInt();
				System.out.println();
				DataTemperatura oDataTemperatura = new DataTemperatura(dia, mes, ano, temperatura);
				oDadosMetereologicos.adicionarDataTemp(oDataTemperatura);
			}
			System.out.print("Você deseja voltar ao menu principal? (Digite um caracter - s/n - simbolizando sua resposta) ");
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
				System.out.print("Ops! Opção inválida! Tente outra vez: ");
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
		System.out.println("Aqui, você poderá descobrir as médias aritméticas das temperaturas desejadas correspondentes a seus dias.");
		System.out.println();
		while(repetirProcesso) {
			System.out.print("Agora digite a data desejada: - Mês: ");
			mes = ler.nextInt();
			System.out.println();
			System.out.print("- Ano: ");
			ano = ler.nextInt();
			while (!DataTemperatura.mesAnoValidos(mes, ano)) {
				while(mes < 1 || mes > 12) {
					System.out.print("Mês Inválido! Digite outro: ");
					mes = ler.nextInt();
					System.out.println();
				}
				while(ano < 2011 || ano > 2020) {
					System.out.print("Ano Inválido! Digite outro: ");
					ano = ler.nextInt();
					System.out.println();
				}
			}
			System.out.println();
			
			System.out.println("A média aritmética da temperatura da data " + mes + "/" + ano + " é: " + oDadosMetereologicos.calcularMediaTempMesAno(mes, ano)+ "."); 
			System.out.print("Você deseja voltar ao menu principal? (Digite um caracter - s/n - simbolizando sua resposta) ");
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
				System.out.print("Ops! Opção inválida! Tente outra vez: ");
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
		System.out.println("Aqui, você poderá descobrir o dia que teve a menor temperatura dentro de um mês.");
		System.out.println();
		while(repetirProcesso) {
			System.out.print("Agora digite a data desejada: - Mês: ");
			mes = ler.nextInt();
			System.out.println();
			System.out.print("- Ano: ");
			ano = ler.nextInt();
			while (!DataTemperatura.mesAnoValidos(mes, ano)) {
				while(mes < 1 || mes > 12) {
					System.out.print("Mês Inválido! Digite outro: ");
					mes = ler.nextInt();
					System.out.println();
				}
				while(ano < 2011 || ano > 2020) {
					System.out.print("Ano Inválido! Digite outro: ");
					ano = ler.nextInt();
					System.out.println();
				}
			} 
			System.out.println();
			System.out.println("A temperatura mínima da data " + mes + "/" + ano + ",  correspondeu à: " + oDadosMetereologicos.calcularTempMinimaMesAno(mes, ano)+ " graus Celsius.");
			System.out.println();
			System.out.print("Você deseja voltar ao menu principal? (Digite um caracter - s/n - simbolizando sua resposta) ");
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
				System.out.print("Ops! Opção inválida! Tente outra vez: ");
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
		System.out.println("Aqui, você poderá descobrir o dia que teve a maior temperatura dentro de um mês.");
		System.out.println();
		while(repetirProcesso) {
			System.out.print("Agora digite a data desejada: - Mês: ");
			mes = ler.nextInt();
			System.out.println();
			System.out.print("- Ano: ");
			ano = ler.nextInt();
			while (!DataTemperatura.mesAnoValidos(mes, ano)) {
				while(mes < 1 || mes > 12) {
					System.out.print("Mês Inválido! Digite outro: ");
					mes = ler.nextInt();
					System.out.println();
				}
				while(ano < 2011 || ano > 2020) {
					System.out.print("Ano Inválido! Digite outro: ");
					ano = ler.nextInt();
					System.out.println();
				}
			}
			System.out.println();
			System.out.println("A temperatura máxima da data " + mes + "/" + ano + ",  correspondeu à: " + oDadosMetereologicos.calcularTempMaximaMesAno(mes, ano) + " graus Celsius.");
			System.out.println();
			System.out.print("Você deseja voltar ao menu principal? (Digite um caracter - s/n - simbolizando sua resposta) ");
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
				System.out.print("Ops! Opção inválida! Tente outra vez: ");
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
		System.out.println("Aqui, você receberá um relatório meteorológico contendo todas as informações sobre a temperatura da data desejada.");
		System.out.println();
		while(repetirProcesso) {
			System.out.print("Agora digite a data desejada: - Mês: ");
			mes = ler.nextInt();
			System.out.println();
			System.out.print("- Ano: ");
			ano = ler.nextInt();
			while (!DataTemperatura.mesAnoValidos(mes, ano)) {
				while(mes < 1 || mes > 12) {
					System.out.print("Mês Inválido! Digite outro: ");
					mes = ler.nextInt();
					System.out.println();
				}
				while(ano < 2011 || ano > 2020) {
					System.out.print("Ano Inválido! Digite outro: ");
					ano = ler.nextInt();
					System.out.println();
				}
			}
			System.out.println();
			System.out.println("Relatório Meteorológico:");
			System.out.println("1 - Temperaturas médias de cada dia do mês:");
			
			ArrayList<DataTemperatura> listaDataTemperatura = oDadosMetereologicos.getListaDataTemperaturaMesAno(mes, ano);
			
			for(DataTemperatura oDataTemperatura : listaDataTemperatura){
				System.out.println("Dia " + oDataTemperatura.dia + " Temperatura média: " + oDataTemperatura.temperatura);
			}
			
			System.out.println();
			System.out.println("2 - Temperatura média do mês: " + oDadosMetereologicos.calcularMediaTempMesAno(mes, ano) + " grausCelsius."); 
			System.out.println();
			System.out.println("3 - Temperatura mínima do mês: " + oDadosMetereologicos.calcularTempMinimaMesAno(mes, ano) + " grauCelsius."); 
			System.out.println();
			System.out.println("4 - Temperatura máxima do mês: " + oDadosMetereologicos.calcularTempMaximaMesAno(mes, ano) + " grauCelsius."); 
			System.out.print("Você deseja ver outro relatório? (Digite um caracter - s/n - simbolizando sua resposta) ");
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
}
