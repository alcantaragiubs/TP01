/*
 * Esse programa fará um menu onde a pessoa podera escolher a opção desejada do que quer verificar.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class TP1 {
	
	public static void main(String[] args) {
		Inmte oInmte = new Inmte(); 
		oInmte.GeraDadosJaneiro2020Random();
		//oInmte.GeraDadosJaneiro2020TudoTemp1(); - dados de janeiro que fazem a temperatura ser sempre 1
		oInmte.Menu();
	}
}
