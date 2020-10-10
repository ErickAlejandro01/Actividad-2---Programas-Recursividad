import java.util.Scanner;
	public class Recursividad {
		public static void main(String[] args) {
			Scanner sn = new Scanner(System.in);
			boolean salir = false;
			int opcion;
			while(!salir){
	            
		           System.out.println("1. Factorial de un numero");
		           System.out.println("2. Divisores de un numero");
		           System.out.println("3. Cocietes enteros de dos numeros");
		           System.out.println("4. Cantidad de divisores de dos numeros");
		           System.out.println("5. Conversion decimal a binaria");
		           System.out.println("6. Vocales de una cadena");
		           System.out.println("7. Cadena Invertida");
		           System.out.println("8. Salir");
		            
		           System.out.println("Escribe una de las opciones");
		           opcion = sn.nextInt();
		           
		           switch(opcion){
	               case 1:
	                   System.out.println("Has seleccionado la opcion 1");
	                   class Factorial{
	               		int facR(int N) {
	               			int resultado;
	               		 System.out.println("Introduce el Numero:");
	               			N=sn.nextInt();
	               	        if (N==1) return 1;
	               	        resultado=facR(N-1)*N;
	               	     System.out.println("El factorial del numero es:"+resultado);
	               	        return resultado;
	               		}
	               	}
	                   break;
	               case 2:
	                   System.out.println("Has seleccionado la opcion 2");
	               	class Divisores{
	            		int divR(int N1) {
	            			 System.out.println("Introduce el Numero:");
		               			N1=sn.nextInt();
	            			if(N1<N1)
	            				return 0;
	            			else 
	            				System.out.println("Los divisores del numero es:"+  divR(N1-N1));
	            				return 1 + divR(N1-N1);
	            		}
	            	}
	                   break;
	                case 3:
	                   System.out.println("Has seleccionado la opcion 3");
	               	class CosientesEnterosDeLaDivicionDe2Numeros{
	            		int CosR(int N1,int N2) {
	            			 System.out.println("Introduce el Numero 1:");
		               			N1=sn.nextInt();
		               		 System.out.println("Introduce el Numero 2:");
		               			N2=sn.nextInt();
	            			if (N1%N2==0)
	            				System.out.println("Los Cosietes de los numeros son:"+  N1%N2);
	            				return 0;
	            		}
	            	}
	                   break;
	                case 4:
		                   System.out.println("Has seleccionado la opcion 4");
		               	class CantidadDeDivisoresEnterosDeDosNumeros{
		            		int CDDR(int N1,int N2) {
		            			 System.out.println("Introduce el Numero 1:");
			               			N1=sn.nextInt();
			               		 System.out.println("Introduce el Numero 1:");
			               			N2=sn.nextInt();
		            			if(N1<N2)
		            				return 0;
		            			else 
		            				System.out.println("La cantidad de divisores de los numeros son:"+  CDDR(N1-N2, N2));
		            				return 1 + CDDR(N1-N2, N2);
		            		}
		            	}
		                   break;
	                case 5:
		                   System.out.println("Has seleccionado la opcion 5");
		               	class ConvercionDecimalABinario{
		            		int Conv(int N) {
		            			 System.out.println("Introduce el Numero:");
			               			N=sn.nextInt();
		            			if(N<2)
		            				return N;
		            			else {
		            				Conv(N/2);
		            				System.out.println(N % 2);
		            			}
		            			return 0;
		            			
		            		}
		            	}
		                   break;
	                case 6:
		                   System.out.println("Has seleccionado la opcion 6");
		               	class VocalesEnUnaCadena{
		            		int Nvocal(String Cadena,int i) {
		            			 System.out.println("Introduce la cadena:");
			               			Cadena=sn.next();
		            			if(i == Cadena.length())
		            				return 0;
		            			else {
		            				char c = Cadena.charAt(i);
		            				System.out.println("Las Vocales De la cadena son :"+  Nvocal(Cadena,i+1));
		            				return ("AEIOUaeiou".indexOf(c) >= 0 ? 1 : 0) + Nvocal(Cadena,i+1);
		            			}
		            		}
		            	}
		                   break;
	                case 7:
	                    System.out.println("Has seleccionado la opcion 7");
		               	class CadenaEnFormaInversa{
		            		int Nvocal(String Cadena,int i) {
		            			System.out.println("Introduce la cadena:");
		            			if(i == Cadena.length())
		            				return 0;
		            			else {
		            				char c = Cadena.charAt(i);
		            				return ("AEIOUaeiou".indexOf(c) >= 0 ? 1 : 0) + Nvocal(Cadena,i+1);
		            			
		            			String reverse (String C){
		            				 if (C.length() == 1)
		            				   return C;
		            				 else 
		            					 System.out.println("La Cadena invertida es :"+  (C.substring(1)) + Cadena.charAt(i))
		            					   return reverse(C.substring(1)) + Cadena.charAt(i);
		            			}
		            			}
		            		}

		            		int reverse(String substring) {
		            			return;
		            		}
		            	}
	                	
		                   break;
	                case (int) 8:
	                salir=true;
	                   break;
	                default:
	                   System.out.println("Solo números entre 1 y 8");
	           }
	            
			}
		}
	}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	