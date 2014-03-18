import java.util.Scanner;


public class exam2 {

	public static void main(String[] args) {
	Scanner  mi_scanner=new Scanner(System.in);
	        int nota1,nota2,nota3;
	        System.out.print("alumno1:");
	        System.out.print("Ingrese primer nota:");
	        nota1= mi_scanner.nextInt();
	        System.out.print("Ingrese segunda nota:");
	        nota2= mi_scanner.nextInt();
	        System.out.print("Ingrese tercer nota:");
	        nota3= mi_scanner.nextInt();
	        int promedio=(nota1 + nota2 + nota3) / 3;
	        if (promedio>=60) {
	            System.out.print("aprobado");    
	        } else 
	                System.out.print("Reprobado");
	                System.out.print("alumno2:");
	    	        System.out.print("Ingrese primer nota:");
	    	        nota1= mi_scanner.nextInt();
	    	        System.out.print("Ingrese segunda nota:");
	    	        nota2= mi_scanner.nextInt();
	    	        System.out.print("Ingrese tercer nota:");
	    	        nota3= mi_scanner.nextInt();
	    	        int promedio1=(nota1 + nota2 + nota3) / 3;
	    	        if (promedio1>=60) {
	    	            System.out.print("aprobado");    
	    	        } else 
	    	           
	    	                System.out.print("Reprobado");          
	    	                System.out.print("alumno3:");
	    	    	        System.out.print("Ingrese primer nota:");
	    	    	        nota1= mi_scanner.nextInt();
	    	    	        System.out.print("Ingrese segunda nota:");
	    	    	        nota2= mi_scanner.nextInt();
	    	    	        System.out.print("Ingrese tercer nota:");
	    	    	        nota3= mi_scanner.nextInt();
	    	    	        int promedio2=(nota1 + nota2 + nota3) / 3;
	    	    	        if (promedio2>=60) {
	    	    	            System.out.print("aprobado");    
	    	    	        } else 
	    	    	           
	    	    	                System.out.print("Reprobado");          
	    	                
	            }
	        }

	
