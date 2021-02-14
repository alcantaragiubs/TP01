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
			//if(mes = )
			somaTemperaturas += oDataTemperatura.getTemperatura();
			qtdDias++;			
		}
		media = somaTemperaturas/DataTemperatura.getQtdDiasMes(mes, ano); 
		return media;
	}
	public int calcularTempMinima(DataTemperatura oDataTemp){
		for (DataTemperatura oDataTemperatura : listaDataTemperatura) {
			if(oDataTemp.temperatura <= temperaturaMinima) {
				temperaturaMinima = oDataTemp.temperatura;
			}
			else {
				temperaturaMinima = temperaturaMinima;
			}
		}
		return temperaturaMinima;
	}
	public int calcularTempMaxima(DataTemperatura oDataTemp) {
		for (DataTemperatura oDataTemperatura : listaDataTemperatura) {
			if(oDataTemp.temperatura >= temperaturaMaxima) {
				temperaturaMaxima = oDataTemp.temperatura;
			}
			else {
				temperaturaMaxima = temperaturaMaxima;
			}
		}
		return temperaturaMaxima;
	}
}
