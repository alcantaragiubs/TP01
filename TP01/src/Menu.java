/*
 * Esse programa fará um menu onde a pessoa podera escolher a opção desejada do que quer verificar.
 */
import java.util.Scanner;
/*Coisas a fazer:
 * Criar a classe temperaturas - vai guardar as temperaturas digitadas e o calculo das medias
 * Criar a classe datas - vai armazenar as datas digitadas e a validaçao de datas
 * Criar a busca binaria como funçao
 * Passar as opcoes como funçoes.
 * Modificar para OO o trabalho: colocando herança, polimorfismo e encapsulamento (acoplamento?)
 * Fazer o programa voltar ao menu principal
 */

public class Menu {

	public static void main(String[] args) {
		
		int opcao, mes, ano, dia, temperatura, media, diasMes;
		int somaTemperaturas = 0, temperaturaMinima = 500, temperaturaMaxima = -273;
		char processo;
		boolean taDentro = false, repetirProcesso = true;
		
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
		
		Scanner ler = new Scanner(System.in);
		opcao = ler.nextInt();
		System.out.println("---------------------------------------------------------------------------------------");
		while(taDentro == false) {
			switch (opcao) {
			case 1:
				opcao = 1;
				taDentro = true;
				break;
			case 2:
				opcao = 2;
				taDentro = true;
				break;
			case 3:
				opcao = 3;
				taDentro = true;
				break;
			case 4:
				opcao = 4;
				taDentro = true;
				break;
			case 5:
				opcao = 5;
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
		System.out.print("Ótimo! Você escolheu a opção: ");
		System.out.println(opcao);
		System.out.println();
		if(opcao == 1) {//funcao entrada de temperaturas
			System.out.println("Aqui, você poderá entrar com os dados solicitados pelo programa.");
			System.out.println();
			while(repetirProcesso) {
				System.out.print("Agora digite a data desejada: - Mês: ");
				mes = ler.nextInt();
				System.out.println("- Ano: ");
				ano = ler.nextInt();
				// validar data
				System.out.println();
				//for (int i = 0; i < qtdDias; i++) {
					//System.out.print("Entre com o dia e a média da temperatura escolhidos: - Dia: ");
					//dia = ler.nextInt();
					//validar dia
				//	System.out.println("- Temperatura (em graus): ");
					//temperatura = ler.nextInt();
					//guardar em algum lugar os dados lidos
				//	System.out.println();
				//}
				System.out.print("Você deseja repetir o processo? (Digite um caracter - s/n - simbolizando sua resposta) ");
				processo = ler.next().charAt(0);
				if(processo == 's') {
					repetirProcesso = true;
				}
				else if(processo == 'n') {
					repetirProcesso = false;
				}
				else {
					System.out.print("Ops! Opção inválida! Tente outra vez: ");
					processo = ler.next().charAt(0);
				}
			}
		}
		else if(opcao == 2) {
			System.out.println("Aqui, você poderá descobrir as médias aritméticas das temperaturas desejadas correspondentes a seus dias.");
			System.out.println();
			while(repetirProcesso) {
				System.out.print("Agora digite a data desejada: - Mês: ");
				mes = ler.nextInt();
				System.out.println("- Ano: ");
				ano = ler.nextInt();
				//validar data
				// busca binaria para encontrar os dias e as temperaturas registradas
				// fazer a soma das temperaturas do mes
				// descobrir quantos dias tem o mes desejado
				//media = somaTemperaturas/diasMes;
				//System.out.println("A média aritmética da temperatura da data" + mes + "/" + ano + " é: " + media + "."); 
				System.out.print("Você deseja repetir o processo? (Digite um caracter - s/n - simbolizando sua resposta) ");
				processo = ler.next().charAt(0);
				if(processo == 's') {
					repetirProcesso = true;
				}
				else if(processo == 'n') {
					repetirProcesso = false;
				}
				else {
					System.out.print("Ops! Opção inválida! Tente outra vez: ");
					processo = ler.next().charAt(0);
				}
			}
		}
		else if (opcao == 3) {
			System.out.println("Aqui, você poderá descobrir o dia que teve a menor temperatura dentro de um mês.");
			System.out.println();
			while(repetirProcesso) {
				System.out.print("Agora digite a data desejada: - Mês: ");
				mes = ler.nextInt();
				System.out.println("- Ano: ");
				ano = ler.nextInt();
				//validar data
				//busca binaria para encontrar as temperaturas correspondentes ao mes e ano desejados
				//for de i que vai do dia 1 ao dia x (ultimo dia do mes)
				//se a temperatura do dia i for menor que temperaturaMinima -> temperaturaMinima = temperatura do dia i
				//se nao -> temperaturaMinima = temperaturaMinima
				//System.out.println("A temperatura mínima da data " + mes + "/" + ano + ", foi no dia " + dia + " e correspondeu à: " + temperatura + " graus Celsius.");
				//System.out.println();
				System.out.print("Você deseja repetir o processo? (Digite um caracter - s/n - simbolizando sua resposta) ");
				processo = ler.next().charAt(0);
				if(processo == 's') {
					repetirProcesso = true;
				}
				else if(processo == 'n') {
					repetirProcesso = false;
					//voltar ao Menu Principal
				}
				else {
					System.out.print("Ops! Opção inválida! Tente outra vez: ");
					processo = ler.next().charAt(0);
				}
			}
		}
		else if(opcao == 4) {
			System.out.println("Aqui, você poderá descobrir o dia que teve a maior temperatura dentro de um mês.");
			System.out.println();
			while(repetirProcesso) {
				System.out.print("Agora digite a data desejada: - Mês: ");
				mes = ler.nextInt();
				System.out.println("- Ano: ");
				ano = ler.nextInt();
				//validar data
				//busca binaria para encontrar as temperaturas correspondentes ao mes e ano desejados
				//for de i que vai do dia 1 ao dia x (ultimo dia do mes)
				//se a temperatura do dia i for maior que temperaturaMaxima -> temperaturaMaxima = temperatura do dia i
				//se nao -> temperaturaMaxima = temperaturaMaxima
				//System.out.println("A temperatura máxima da data " + mes + "/" + ano + ", foi no dia " + dia + " e correspondeu à: " + temperatura + " graus Celsius.");
				//System.out.println();
				System.out.print("Você deseja repetir o processo? (Digite um caracter - s/n - simbolizando sua resposta) ");
				processo = ler.next().charAt(0);
				if(processo == 's') {
					repetirProcesso = true;
				}
				else if(processo == 'n') {
					repetirProcesso = false;
					//voltar ao Menu Principal
				}
				else {
					System.out.print("Ops! Opção inválida! Tente outra vez: ");
					processo = ler.next().charAt(0);
				}
			}
		}
		else {
			System.out.println("Aqui, você receberá um relatório meteorológico contendo todas as informações sobre a temperatura da data desejada.");
			System.out.println();
			while(repetirProcesso) {
				System.out.print("Agora digite a data desejada: - Mês: ");
				mes = ler.nextInt();
				System.out.println("- Ano: ");
				ano = ler.nextInt();
				//validar data
				//System.out.println("Relatório Meteorológico:");
				//System.out.println("1 - Temperaturas médias de cada dia do mês:");
				//for i = 1 vai até o máximo de dias do mês:
					//System.out.println("Dia: " + i + "; Temperatura média: " + mediaDosDias + "grausCelsius.");
				//System.out.println(); - fora do looping
				//System.out.println("2 - Temperatura média do mês: " + mediaDoMes + "grausCelsius.");
				//System.out.println();
				//System.out.println("3 - Temperatura mínima do mês: " + temperaturaMinima + "grauCelsius.");
				//System.out.println("4 - Temperatura máxima do mês: " + temperaturaMáxima + "grauCelsius.");
				System.out.print("Você deseja ver outro reatório? (Digite um caracter - s/n - simbolizando sua resposta) ");
				processo = ler.next().charAt(0);
				if(processo == 's') {
					repetirProcesso = true;
				}
				else if(processo == 'n') {
					repetirProcesso = false;
					//voltar ao Menu Principal
				}
				else {
					System.out.print("Ops! Opção inválida! Tente outra vez: ");
					processo = ler.next().charAt(0);
				}
			}
		}
	}

}
