import java.util.Random;

public class DadoJaneiro2020 {

	public static void main(String[] args) {
		
		Random geradorDeTemperaturas = new Random(); // gera as temperaturas do mês de janeiro
		
		for (int i = 1; i <= 31; i++) {
            System.out.println("Dia: " + i + "/01/2020; Temperatura:  " + geradorDeTemperaturas.nextInt(30) + " graus Celsius");
        }
	}

}
