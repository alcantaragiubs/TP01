import java.util.Scanner;
public class DataTemperatura {
	int dia, mes, ano;
	int temperatura;
	Scanner ler = new Scanner(System.in);
	public DataTemperatura() {	
		this.ano = 0;
		this.mes = 0;
		this.dia = 0;
	}
	
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
	public static int getQtdDiasMes(int mes, int ano) {	
		if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
			return 31;
		}
		else if(mes == 4 || mes == 6 || mes == 9 || mes == 11) {
			return 30;
		}
		else if (mes == 2) {
			if(((ano%4 == 0) && (ano%100 != 0)) || (ano%400 == 0)) {
				return 29;
			}
			else {
				return 28;
			}
		}
		return 0;
	}
	public static boolean mesAnoValidos(int mes, int ano) {
		return (mes >=1 && mes <= 12 && ano >= 2011 && ano <= 2020);
	}

	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}
	public int getTemperatura() {
		return temperatura;
	}
}
