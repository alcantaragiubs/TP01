import java.util.Scanner;
import java.util.ArrayList;

public class DadosMetereologicos {
	private ArrayList<DataTemperatura> listaDataTemperatura = new ArrayList<>();
	int media = 0, temperaturaMinima = 500, temperaturaMaxima = -273, somaTemperaturas = 0;
	
	public void adicionarDataTemp(DataTemperatura oDataTemp) {
		listaDataTemperatura.add(oDataTemp);
		listaDataTemperatura.contains(oDataTemp);//Verifica se um elemento est� dentro da lista
	}
	public void calcularMediaTemp(DataTemperatura oDataTemp) {
		media = oDataTemp.temperatura/oDataTemp.getQtdDiasMes(); //soma das temperaturas???
	}
	public void calcularTempMinima(DataTemperatura oDataTemp){
		for (oDataTemp.dia = 1; oDataTemp.dia <= oDataTemp.getQtdDiasMes(); oDataTemp.dia++) {
			if(oDataTemp.temperatura <= temperaturaMinima) {
				temperaturaMinima = oDataTemp.temperatura;
			}
			else {
				temperaturaMinima = temperaturaMinima;
			}
		}
	}
	public void calcularTempMaxima(DataTemperatura oDataTemp) {
		for (oDataTemp.dia = 1; oDataTemp.dia <= oDataTemp.getQtdDiasMes(); oDataTemp.dia++) {
			if(oDataTemp.temperatura >= temperaturaMaxima) {
				temperaturaMaxima = oDataTemp.temperatura;
			}
			else {
				temperaturaMaxima = temperaturaMaxima;
			}
		}
	}
}
