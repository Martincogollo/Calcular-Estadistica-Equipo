package ejercio_practica;

import java.util.Scanner;

public class Ejercio_practica {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int opc,opc1,partidosJugados,partidosGanados,partidosPerdidos,partidosEmpatados,totalPuntos;
        partido vector[] = new partido [5];
        String nombreEquipo;
        
        do{
            System.out.println("[1]INGRESAR EQUIPO");
            System.out.println("[2]INGRESAR RESULTADOS");
            System.out.println("[3]IMPRIMIR ESTADISTICAS");
            System.out.println("[4]SALIR");
            opc=teclado.nextInt();          
            switch (opc){
                case 1:
                    for (int i = 0; i <5; i++) {
                        System.out.println("Digite el Nombre del Equipo");
                        nombreEquipo = teclado.next();
                        System.out.println("Digite los Partidos Jugados");
                        partidosJugados = teclado.nextInt();
                        System.out.println("Digite los Partidos Ganados");
                        partidosGanados = teclado.nextInt();
                        System.out.println("Digite los Partidos Perdidos");
                        partidosPerdidos = teclado.nextInt();
                        System.out.println("Digite los Partidos Empatados");
                        partidosEmpatados = teclado.nextInt();
                        System.out.println("Digite Total de puntos: ");
                        totalPuntos = teclado.nextInt();
                        
                        vector[i] = new partido(nombreEquipo,partidosGanados,partidosPerdidos,partidosEmpatados,partidosJugados,totalPuntos);
                    }
                    for (int i = 0; i < 5; i++) {
                        System.out.println(vector[i].getNombreEquipo());
                    }
                    break;
                case 2:
                    for (int i = 0; i < 5; i++) {
                        System.out.println("Ingrese el resultado para partidos Ganados, Digite 1 si Gano, digite 2 si Perdio, digite 3 si Empato: ");                     
                        opc1= teclado.nextInt();
                        switch(opc1){
                            case 1:
                                vector[i].sumarGanados();
                                break;
                            case 2:
                                vector[i].controlPerdidos();
                                break;
                            case 3:
                                vector[i].sumarEmpatados();
                                break;
                            default: 
                                throw new AssertionError();                       
                        }
                    }
                    break;
                case 3:
                    for (int i = 0; i < 5; i++) {
                        vector[i].verEstadistica();
                    }
                    break;
                case 4:
                    break;
                default: System.out.println("OPCION NO VALIDA!!");
            }
        }while(opc!=4);
        
    }
    
}
