import java.util.Scanner;
public class DataTemperatura {
	int dia, mes, ano, temperatura, quantidadeDias;
	Scanner ler = new Scanner(System.in);
	public DataTemperatura(int dia, int mes, int ano) {	
		this.ano = ano;
		this.mes = mes;
		this.dia = dia;
	}
	public DataTemperatura(int mes, int ano) {
		this.ano = ano;
		this.mes = mes;
	}
	public DataTemperatura(int dia, int mes, int ano, int temperatura) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		this.temperatura = temperatura;
	}
	public int getQtdDiasMes() {
		if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
			quantidadeDias = 31;
		}
		else if(mes == 4 || mes == 6 || mes == 9 || mes == 11) {
			quantidadeDias = 30;
		}
		else if (mes == 2) {
			if(((ano%4 == 0) && (ano%100 != 0)) || (ano%400 == 0)) {
				quantidadeDias = 29;
			}
			else {
				quantidadeDias = 28;
			}
		}
		return quantidadeDias;
	}
	public void validaData(int mes, int ano) {
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
	public void validaDia(int dia) {
		if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
			while (dia  < 1 || dia > 31){
				System.out.print("Dia Inválido! Digite outro: ");
				dia = ler.nextInt();
				System.out.println();
			}
		}
		else if(mes == 4 || mes == 6 || mes == 9 || mes == 11) {
			while (dia  < 1 || dia > 30){
				System.out.print("Dia Inválido! Digite outro: ");
				dia = ler.nextInt();
				System.out.println();
			}
		}
		else if(mes == 2) {
			if(((ano%4 == 0) && (ano%100 != 0)) || (ano%400 == 0)) {
				while (dia  < 1 || dia > 29){
					System.out.print("Dia Inválido! Digite outro: ");
					dia = ler.nextInt();
					System.out.println();
				}
			}
			else {
				while (dia  < 1 || dia > 28){
					System.out.print("Dia Inválido! Digite outro: ");
					dia = ler.nextInt();
					System.out.println();
				}
			}
		}
	}
	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}
}
