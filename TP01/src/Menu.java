/*
 * Esse programa far� um menu onde a pessoa podera escolher a op��o desejada do que quer verificar.
 */
import java.util.Scanner;
/*Coisas a fazer:
 * Criar a classe temperaturas - vai guardar as temperaturas digitadas e o calculo das medias
 * Criar a classe datas - vai armazenar as datas digitadas e a valida�ao de datas
 * Criar a busca binaria como fun�ao
 * Passar as opcoes como fun�oes.
 * Modificar para OO o trabalho: colocando heran�a, polimorfismo e encapsulamento (acoplamento?)
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
				System.out.println("Obrigada por acessar o INMTE! At� a pr�xima!");
				System.exit(0);
				break;
			default:
				System.out.print("Ops! Op��o inv�lida! Tente outra vez: ");
				opcao = ler.nextInt();
			}
		}
		System.out.print("�timo! Voc� escolheu a op��o: ");
		System.out.println(opcao);
		System.out.println();
		if(opcao == 1) {//funcao entrada de temperaturas
			System.out.println("Aqui, voc� poder� entrar com os dados solicitados pelo programa.");
			System.out.println();
			while(repetirProcesso) {
				System.out.print("Agora digite a data desejada: - M�s: ");
				mes = ler.nextInt();
				System.out.println("- Ano: ");
				ano = ler.nextInt();
				// validar data
				System.out.println();
				//for (int i = 0; i < qtdDias; i++) {
					//System.out.print("Entre com o dia e a m�dia da temperatura escolhidos: - Dia: ");
					//dia = ler.nextInt();
					//validar dia
				//	System.out.println("- Temperatura (em graus): ");
					//temperatura = ler.nextInt();
					//guardar em algum lugar os dados lidos
				//	System.out.println();
				//}
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
		}
		else if(opcao == 2) {
			System.out.println("Aqui, voc� poder� descobrir as m�dias aritm�ticas das temperaturas desejadas correspondentes a seus dias.");
			System.out.println();
			while(repetirProcesso) {
				System.out.print("Agora digite a data desejada: - M�s: ");
				mes = ler.nextInt();
				System.out.println("- Ano: ");
				ano = ler.nextInt();
				//validar data
				// busca binaria para encontrar os dias e as temperaturas registradas
				// fazer a soma das temperaturas do mes
				// descobrir quantos dias tem o mes desejado
				//media = somaTemperaturas/diasMes;
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
		}
		else if (opcao == 3) {
			System.out.println("Aqui, voc� poder� descobrir o dia que teve a menor temperatura dentro de um m�s.");
			System.out.println();
			while(repetirProcesso) {
				System.out.print("Agora digite a data desejada: - M�s: ");
				mes = ler.nextInt();
				System.out.println("- Ano: ");
				ano = ler.nextInt();
				//validar data
				//busca binaria para encontrar as temperaturas correspondentes ao mes e ano desejados
				//for de i que vai do dia 1 ao dia x (ultimo dia do mes)
				//se a temperatura do dia i for menor que temperaturaMinima -> temperaturaMinima = temperatura do dia i
				//se nao -> temperaturaMinima = temperaturaMinima
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
		}
		else if(opcao == 4) {
			System.out.println("Aqui, voc� poder� descobrir o dia que teve a maior temperatura dentro de um m�s.");
			System.out.println();
			while(repetirProcesso) {
				System.out.print("Agora digite a data desejada: - M�s: ");
				mes = ler.nextInt();
				System.out.println("- Ano: ");
				ano = ler.nextInt();
				//validar data
				//busca binaria para encontrar as temperaturas correspondentes ao mes e ano desejados
				//for de i que vai do dia 1 ao dia x (ultimo dia do mes)
				//se a temperatura do dia i for maior que temperaturaMaxima -> temperaturaMaxima = temperatura do dia i
				//se nao -> temperaturaMaxima = temperaturaMaxima
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
		}
		else {
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
		}
	}

}
