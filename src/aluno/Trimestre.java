package aluno;

import java.util.Locale;
import java.util.Scanner;

import atividades.ResultadoFinal;

public class Trimestre {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
       
        ResultadoFinal cont = new ResultadoFinal ();
       
     System.out.println("Digite o nome do aluno:");
   
     cont.setNome(sc.nextLine());
        
        
     System.out.println("Digite as notas trimestrais do aluno :"); 
     
     System.out.print("Primeiro trimestre:");
       cont.setTri1(sc.nextDouble());
       
     System.out.print("Segundo trimestre:");
       cont.setTri2 (sc.nextDouble());
      
       System.out.print("Terceiro trimestre:");
       cont.setTri3 (sc.nextDouble());
       System.out.println();
     System.out.println(" A nota final deste aluno é :" +(cont.notafinal())  ); 
       
        if (cont.notafinal()<60)  {System.out.println(cont.getNome()+" você foi reprovado" +" falta " +(100 - cont.notafinal() )+(" pontos"));
        }
        
        else if (cont.notafinal()>100){System.out.print(cont.getNome()+" você superou as espectativas:"+ (" teve ")+ (  cont.notafinal())+ (" pontos"));
        	
        }
        else { System.out.println(cont.getNome()+" você foi aprovado");
        
        
        sc.close();
	}

	}
	
}
