import java.util.*;

public class App {

	public static void main(String[] args) {

	    Scanner scan = new Scanner(System.in);

        System.out.println("Digite o custo da fábrica: ");
        int custoFabrica = scan.nextInt();

        System.err.println("Digite a % do distribuidor: ");
	    int porcentagemDistribuidor = scan.nextInt();

        System.out.println("Digite o % de impostos: ");
	    int percentualImpostos = scan.nextInt();

        int custoDistribuidor;
        int valorImpostos; 
        int custoConsumidor;
         
        custoDistribuidor = (custoFabrica * porcentagemDistribuidor) / 100;
        valorImpostos = (custoFabrica * percentualImpostos) / 100;
        custoConsumidor = custoFabrica + custoDistribuidor + valorImpostos;
      
        System.out.println("O custo final para o cliente será de: " + custoConsumidor);

        scan.close();

	}
}