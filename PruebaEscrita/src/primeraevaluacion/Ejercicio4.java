package primeraevaluacion;
import java.util.ArrayList;
 
public class Ejercicio4{
 
    public static void main(String[] args) {

        Casilla[][] tablero = {
            {
                new Casilla(0, 0, new boolean[]{false, true, true, false}, false),
                new Casilla(0, 1, new boolean[]{false, true, false, true}, false),
                new Casilla(0, 2, new boolean[]{false, false, true, true}, false),
                new Casilla(0, 3, new boolean[]{false, false, true, false}, false)
            },
            {
                new Casilla(1, 0, new boolean[]{true, true, true, false}, false),
                new Casilla(1, 1, new boolean[]{false, false, false, true}, false),
                new Casilla(1, 2, new boolean[]{false, true, true, false}, false),
                new Casilla(1, 3, new boolean[]{true, false, false, true}, false)
            },
            {
                new Casilla(2, 0, new boolean[]{true, true, true, false}, false),
                new Casilla(2, 1, new boolean[]{false, true, false, true}, false),
                new Casilla(2, 2, new boolean[]{true, true, true, true}, false),
                new Casilla(2, 3, new boolean[]{false, false, false, true}, false)
            },
            {
                new Casilla(3, 0, new boolean[]{true, true, false, false}, false),
                new Casilla(3, 1, new boolean[]{false, true, false, true}, false),
                new Casilla(3, 2, new boolean[]{true, true, false, true}, false),
                new Casilla(3, 3, new boolean[]{false, false, false, true}, true)
            }
 
        };

        ArrayList<Casilla> camino = new ArrayList<>();
 

        Laberinto laberinto = new Laberinto(tablero);
        camino.add(tablero[0][0]);
 
        rellenarCaminos(laberinto, tablero[0][0], camino);

        laberinto.mostrarCaminos();
 
    }
 
    public static void rellenarCaminos(Laberinto laberinto, Casilla casillaActual, ArrayList<Casilla> camino) {

        if (casillaActual.isFin()) {
 

            laberinto.añadirCamino((ArrayList<Casilla>) camino.clone());
 
        } else {

            int[][] movimientos = {
                {-1, 0}, 
                {0, 1}, 
                {1, 0},  
                {0, -1} 
            };
 
            int posXnueva, posYnueva;
            Casilla aux;

            for (int i = 0; i < movimientos.length; i++) {
 
                posXnueva = casillaActual.getPosX() + movimientos[i][0];
                posYnueva = casillaActual.getPosY() + movimientos[i][1];
                aux = laberinto.getCasillaAt(posXnueva, posYnueva);
 
                switch (i) {
                    case 0: 
                        if (laberinto.arribaDisponible(casillaActual, aux)) {
                            
                            camino.add(aux);
                          
                            casillaActual.setVisitado(true);
                            rellenarCaminos(laberinto, aux, camino);
                           
                            casillaActual.setVisitado(false);
                        
                            camino.remove(aux);
                        }
                        break;
                    case 1: 
                        if (laberinto.derechaDisponible(casillaActual, aux)) {
                            
                            camino.add(aux);
                            
                            casillaActual.setVisitado(true);
                            rellenarCaminos(laberinto, aux, camino);
                           
                            casillaActual.setVisitado(false);
                            
                            camino.remove(aux);
                        }
                        break;
                    case 2:
                        if (laberinto.abajoDisponible(casillaActual, aux)) {
                   
                            camino.add(aux);
                    
                            casillaActual.setVisitado(true);
                            rellenarCaminos(laberinto, aux, camino);
                         
                            casillaActual.setVisitado(false);
                         
                            camino.remove(aux);
                        }
                        break;
                    case 3: 
                        if (laberinto.izquierdaDisponible(casillaActual, aux)) {
                       
                            camino.add(aux);
                       
                            casillaActual.setVisitado(true);
                            rellenarCaminos(laberinto, aux, camino);
                         
                            casillaActual.setVisitado(false);
                        
                            camino.remove(aux);
                        }
                        break;
                }
 
            }
 
        }
 
    }
}