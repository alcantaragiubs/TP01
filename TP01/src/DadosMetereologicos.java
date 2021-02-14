import java.util.Scanner;
import java.util.ArrayList;

public class DadosMetereologicos {
	private ArrayList<DataTemperatura> listaDataTemperatura = new ArrayList<>();
	int media = 0, temperaturaMinima = 500, temperaturaMaxima = -273;
	
	public void adicionarDataTemp(DataTemperatura oDataTemp) {
		listaDataTemperatura.add(oDataTemp);
		listaDataTemperatura.contains(oDataTemp);
	}
	public int calcularMediaTempMesAno(int mes, int ano) {
		int somaTemperaturas = 0;
		int qtdDias = 0;
		for(DataTemperatura oDataTemperatura : listaDataTemperatura) {
			if(mes == oDataTemperatura.mes) {
				somaTemperaturas += oDataTemperatura.getTemperatura();
				qtdDias++;
			}			
		}
		media = somaTemperaturas/DataTemperatura.getQtdDiasMes(mes, ano); 
		return media;
	}
	public int calcularTempMinimaMesAno(int mes, int ano){
		for (DataTemperatura oDataTemperatura : listaDataTemperatura) {
			if(mes == oDataTemperatura.mes) {
				if(oDataTemperatura.temperatura <= temperaturaMinima) {
					temperaturaMinima = oDataTemperatura.temperatura;
				}
			}
		}
		return temperaturaMinima;
	}
	public int calcularTempMaximaMesAno(int mes, int ano) {
		for (DataTemperatura oDataTemperatura : listaDataTemperatura) {
			if(mes == oDataTemperatura.mes) {
				if(oDataTemperatura.temperatura >= temperaturaMaxima) {
					temperaturaMaxima = oDataTemperatura.temperatura;
				}
			}
		}
		return temperaturaMaxima;
	}
}
