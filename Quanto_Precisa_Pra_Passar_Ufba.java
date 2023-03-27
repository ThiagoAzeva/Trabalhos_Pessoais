package Medias;
import java.util.Scanner;
public class Quanto_Precisa_Pra_Passar_Ufba {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);	
	int continuar;
	double n1, falta ;
	String materia;

do {
	System.out.println("Digite A Materia Que Você Deseja:");
	materia = sc.next();
	
	System.out.println("Sua Primeira nota:");
		n1 = sc.nextDouble();
		
		n1 = n1 * 0.4;
		
		falta = ( 5 - n1 )/ 0.6;
		falta = Math.round(falta);
		
	System.out.println("Você Precisa De " +falta+ " Na Segunda Prova De " +materia+".");
	
	System.out.println("Continuar? (1)Sim (2)Não");
	continuar = sc.nextInt();
	}while(continuar ==1 );

 	if (continuar == 2) {
 		System.out.println("Obrigado,Volte Sempre!");
 	}

	}

}
