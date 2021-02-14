import java.util.Scanner;

public class DataTemperatura {
	int dia, mes, ano, temperatura, quantidadeDias;
	Scanner ler = new Scanner(System.in);
	public DataTemperatura(int dia, int mes, int ano) {	
		this.ano = ano;
		this.mes = mes;
		if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
			if(dia  >= 1 && dia <= 31) {
				this.dia = dia;
			}
			else {
				System.out.print("Data Inválida! Selecione outro dia: ");
				dia = ler.nextInt();
			}
		}
		else if(mes == 4 || mes == 6 || mes == 9 || mes == 11) {
			if(dia >= 1 && dia <= 30){
				this.dia = dia;
			}
			else {
				System.out.print("Data Inválida! Selecione outro dia: ");
				dia = ler.nextInt();
			}
		}
		else if (mes == 2) {
			if(((ano%4 == 0) && (ano%100 != 0)) || (ano%400 == 0)) {
				if(dia >= 1 && dia <= 29) {
					this.dia = dia;
				}
				else {
					System.out.print("Data Inválida! Selecione outro dia: ");
					dia = ler.nextInt();
				}
			}
			else {
				if(dia >= 1 && dia <= 28) {
					this.dia = dia;
				}
			}
		}
	}
	public DataTemperatura(int mes, int ano) {
		if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
			this.mes = mes;
		}
		else if(mes == 4 || mes == 6 || mes == 9 || mes == 11) {
			this.mes = mes;
		}
		else if (mes == 2) {
			if(((ano%4 == 0) && (ano%100 != 0)) || (ano%400 == 0)) {
				this.mes = mes;
			}
			else {
				this.mes = mes;
			}
		}
		else {
			System.out.print("Data Inválida! Selecione outro mês: ");
			mes = ler.nextInt();
		}
		if(ano >= 2011 && ano <= 2020) {
			this.ano = ano;
		}
		else {
			System.out.print("Data Inválida! Selecione outro ano: ");
			ano = ler.nextInt();
		}
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
	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}
	// valida data - metodo na criaçao
}
