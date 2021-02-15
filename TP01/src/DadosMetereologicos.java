import java.util.ArrayList;

public class DadosMetereologicos {
	private ArrayList<DataTemperatura> listaDataTemperatura = new ArrayList<>();
	int temperaturaMinima = 500, temperaturaMaxima = -273;
	
	public ArrayList<DataTemperatura> getListaDataTemperaturaMesAno(int mes, int ano) {
		ArrayList<DataTemperatura> listaDataTemperaturaMesAno = new ArrayList<>();
		for (DataTemperatura oDataTemperatura : listaDataTemperatura) {
			if(mes == oDataTemperatura.getMes()) { // tem que comparar o ano tambem
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
			if(mes == oDataTemperatura.getMes() && ano == oDataTemperatura.getAno()) {
				somaTemperaturas += oDataTemperatura.getTemperatura();
				qtdDias++;
			}			
		}
		media = somaTemperaturas/qtdDias; 
		return media;
	}
	public DataTemperatura calcularTempMinimaMesAno(int mes, int ano){
		DataTemperatura oDataTemperaturaMinima = new DataTemperatura(0,0,0,500);
		for (DataTemperatura oDataTemperatura : listaDataTemperatura) {
			if(mes == oDataTemperatura.getMes() && ano == oDataTemperatura.getAno() && oDataTemperatura.temperatura <= oDataTemperaturaMinima.getTemperatura()) {
					oDataTemperaturaMinima = oDataTemperatura;
			}
		}
		return oDataTemperaturaMinima;
	}
	public DataTemperatura calcularTempMaximaMesAno(int mes, int ano) {
		DataTemperatura oDataTemperaturaMaxima = new DataTemperatura(0,0,0,-273);
		for (DataTemperatura oDataTemperatura : listaDataTemperatura) {
			if(mes == oDataTemperatura.getMes() && ano == oDataTemperatura.getAno() && oDataTemperatura.temperatura >= oDataTemperaturaMaxima.getTemperatura()) {
				oDataTemperaturaMaxima = oDataTemperatura;
			}
		}
		return oDataTemperaturaMaxima;
	}
}
