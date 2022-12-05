package ejercio_practica;

public class partido {
    /// atributos
    private String nombreEquipo;
    private int partidoGanado,partidoPerdido,partidoEmpatado,partidoJugados,totalPuntos;
    private final int puntosGanados=3;
    /// contrustores
    public partido(String nombreEquipo, int partidoGanado, int partidoPerdido, int partidoEmpatado, int partidoJugados, int totalPuntos) {
        this.nombreEquipo = nombreEquipo;
        this.partidoGanado = partidoGanado;
        this.partidoPerdido = partidoPerdido;
        this.partidoEmpatado = partidoEmpatado;
        this.partidoJugados = partidoJugados;
        this.totalPuntos = totalPuntos;
    }

    public partido() {
    }
    
    /// getter and setter
    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public int getPartidoGanado() {
        return partidoGanado;
    }

    public void setPartidoGanado(int partidoGanado) {
        this.partidoGanado = partidoGanado;
    }

    public int getPartidoPerdido() {
        return partidoPerdido;
    }

    public void setPartidoPerdido(int partidoPerdido) {
        this.partidoPerdido = partidoPerdido;
    }

    public int getPartidoEmpatado() {
        return partidoEmpatado;
    }

    public void setPartidoEmpatado(int partidoEmpatado) {
        this.partidoEmpatado = partidoEmpatado;
    }

    public int getPartidoJugados() {
        return partidoJugados;
    }

    public void setPartidoJugados(int partidoJugados) {
        this.partidoJugados = partidoJugados;
    }

    public int getTotalPuntos() {
        return totalPuntos;
    }

    public void setTotalPuntos(int totalPuntos) {
        this.totalPuntos = totalPuntos;
    }
    
    /// metodos
   public void sumarGanados(){
   totalPuntos += puntosGanados;
   partidoGanado++;
   }
   public void sumarEmpatados(){
   totalPuntos++;
   }
   public void controlPerdidos(){
   partidoPerdido++;
   }
   public void verEstadistica(){
       System.out.println("Equipos: "+nombreEquipo);
       System.out.println("Partidos jugados: "+partidoJugados);
       System.out.println("Partidos Ganados: "+partidoGanado);
       System.out.println("Partidos Perdidos: "+partidoPerdido);
       System.out.println("Partidos Empatados: "+partidoEmpatado);
       System.out.println("Total de puntos: "+totalPuntos);
   }
    
}
