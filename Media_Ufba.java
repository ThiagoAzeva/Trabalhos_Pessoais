package Medias;
import java.util.Scanner;
public class Media_Ufba {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
double n1, n2, n3,extra, media;
int continuar;		
String materia; 
do {
	
	System.out.println("Digite A Materia Que Você Deseja");
		materia = sc.next(); 
	
	System.out.println("Digite A Primeira Nota:");
	n1 = sc.nextDouble();

	System.out.println("Digite A Segunda Nota:");
	n2 = sc.nextDouble();

	n1 = n1 * 0.4;
	n2 = n2 * 0.6;
	media = n1 + n2;

	System.out.println("Possui Pontos Extra? (1)Sim (2)Não");
	continuar = sc.nextInt();
	
	if(continuar ==1) {
		System.out.println("Quantos Pontos Extras?");
		n3 = sc.nextDouble();
	extra = media + n3;
		
		System.out.println("Sua Media Em " +materia+ " É: " +extra);
	}
	
	else {
			System.out.println("Sua Media Em " +materia+ " É: " +media);
	}	
	
	
	System.out.println("Continuar? (1)Sim (2)Não");
	continuar = sc.nextInt();
	}while(continuar ==1 );

	if(continuar == 2) {
	 System.out.println("Obrigado,Volte Sempre!");
		}
	
	}	
}