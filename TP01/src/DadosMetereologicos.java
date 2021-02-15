import java.util.ArrayList;

public class DadosMetereologicos {
	private ArrayList<DataTemperatura> listaDataTemperatura = new ArrayList<>();
	int temperaturaMinima = 500, temperaturaMaxima = -273;
	
	public ArrayList<DataTemperatura> getListaDataTemperaturaMesAno(int mes, int ano) {
		ArrayList<DataTemperatura> listaDataTemperaturaMesAno = new ArrayList<>();
		for (DataTemperatura oDataTemperatura : listaDataTemperatura) {
			if(mes == oDataTemperatura.mes) { // tem que comparar o ano tambem
				listaDataTemperaturaMesAno.add(oDataTemperatura);
			}
		}
		return listaDataTemperaturaMesAno;
	}
	public void adicionarDataTemp(DataTemperatura oDataTemp) {
		listaDataTemperatura.add(oDataTemp);
		listaDataTemperatura.contains(oDataTemp);
	}
	public double calcularMediaTempMesAno(int mes, int ano) {
		double media = 0;
		int somaTemperaturas = 0;
		int qtdDias = 0;
		for(DataTemperatura oDataTemperatura : listaDataTemperatura) {
			if(mes == oDataTemperatura.mes && ano == oDataTemperatura.ano) {
				somaTemperaturas += oDataTemperatura.getTemperatura();
				qtdDias++;
			}			
		}
		media = somaTemperaturas/qtdDias; 
		return media;
	}
	public DataTemperatura calcularTempMinimaMesAno(int mes, int ano){
		DataTemperatura oDataTemperaturaMinima = new DataTemperatura();
		for (DataTemperatura oDataTemperatura : listaDataTemperatura) {
			if(mes == oDataTemperatura.mes && ano == oDataTemperatura.ano) {
				if(oDataTemperatura.temperatura <= temperaturaMinima) {
					oDataTemperaturaMinima = oDataTemperatura;
				}
			}
		}
		return oDataTemperaturaMinima;
	}
	public int calcularTempMaximaMesAno(int mes, int ano) {
		for (DataTemperatura oDataTemperatura : listaDataTemperatura) {
			if(mes == oDataTemperatura.mes && ano == oDataTemperatura.ano) {
				if(oDataTemperatura.temperatura >= temperaturaMaxima) {
					temperaturaMaxima = oDataTemperatura.temperatura;
				}
			}
		}
		return temperaturaMaxima;
	}
}
