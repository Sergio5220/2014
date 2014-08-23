import java.util.Scanner;
public class LoveLetter {

	public static void main(String[] args) {
		bienvenido();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int menu=0;
		menu=sc.nextInt();
		switch(menu){
		case 1:
			System.out.println("Jugar partida");
			break;
		case 2:
			System.out.println("tokens");
			tokens();
			bienvenido();
			break;
		case 3:
			System.out.println("Reglas");
			reglas();
			bienvenido();
			break;
		case 4:
			System.out.println("Salir");
			break;
		default:
			System.out.println("Salir");
			break;	
		}
		
		
	}
		public static void bienvenido(){
		System.out.println("Bienvenido a Love Letter");
		System.out.println("(1) Jugar una partida");
		System.out.println("(2) Seleccionar el numero de tokens a jugar");
		System.out.println("(3) Mostrar las reglas del juego");	
		System.out.println("(4) Salir");
	}
	
			public static void reglas() {
		System.out.println("-----------------------------------------------------------------------------------------------------");
		System.out.println("INICIO DE TURNO");
		System.out.println("Se le dara al jugador cuyo turno comienza una nueva carta del mazo");
		System.out.println("Si se encontraba protegido por la carta HandMaid el efecto de esta carta desaparecera.");
		System.out.println("-----------------------------------------------------------------------------------------------------");
		System.out.println("UTILIZAR UNA CARTA");
		System.out.println("Un jugador podra utilizar una sobre su rival siempre y cuando este no ");
		System.out.println("se encuentre protegido por la HandMaid.");
		System.out.println("Cada vez que el jugador use una carta su turno terminara.");
		System.out.println("-----------------------------------------------------------------------------------------------------");
		System.out.println("CARTAS");
		System.out.println("-----------------------------------------------------------------------------------------------------");
		System.out.println("Guard: Permite adivinar la mano del rival (cartas del 2-8)");
		System.out.println("si adivina, el jugador rival sale del juego. (5 en el mazo)");
		System.out.println("-----------------------------------------------------------------------------------------------------");
		System.out.println("Priest:Permite ver la mano del jugador rival");
		System.out.println("-----------------------------------------------------------------------------------------------------");
		System.out.println("Baron:Compara manos con el rival, el jugador con la carta mas baja sale del juego,");
		System.out.println("si es empate no pasa nada");
		System.out.println("-----------------------------------------------------------------------------------------------------");
		System.out.println("HandMaid: El jugador que utiliza esta carta es inmune a los ataques de los demas por un turno");
		System.out.println("-----------------------------------------------------------------------------------------------------");
		System.out.println("Prince: Permite botar la mano del jugador o la del rival y da una carta nueva del deck"); 
		System.out.println("-----------------------------------------------------------------------------------------------------");
		System.out.println("King: Intercambia manos entre jugadores");
		System.out.println("-----------------------------------------------------------------------------------------------------");
		System.out.println("Countess: Si el jugador tiene un Prince o King en su mano y la Countess.");
		System.out.println("-----------------------------------------------------------------------------------------------------");
		System.out.println("Princess: Si el jugador juega esta carta pierde el juego.");
		System.out.println("-----------------------------------------------------------------------------------------------------");
		System.out.println("FIN DE RONDA");
		System.out.println("-----------------------------------------------------------------------------------------------------");
		System.out.println("Si un jugador gana la ronda se le sumara un token y se verificara el total de tokens para ganar, ");
		System.out.println("si no se ha llegado al limite se procedera a jugar una ronda nueva.");
		System.out.println("-----------------------------------------------------------------------------------------------------");

		}

				public static int tokens() {
		int a=0 , b=0;
		while(b==0){
		System.out.println("¿A cuantos tokens desea jugar?");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
			if ((a==1)||(a==3)||(a==7)){
				System.out.println("Escogio jugar a: "+a);
				b=1;
				
			}
				else
					System.out.println("Solo puede jugar a 1,3, o 7 tokens");
		}
		return a;
				}
		


}
