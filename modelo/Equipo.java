package modelo;

import javax.swing.JOptionPane;

public class Equipo
{
    //Atributos
    private String nombreEquipo;
    private int numJugadores;
    private Jugador[] jugadores;
    private int edadJugador;
    private int promedioEdades;
    private int maxGoles;
    private int nombreGoleador;

    //Metodos
    public Equipo(String nom, int n)
    {
        nombreEquipo = nom;
        numJugadores = n;
        jugadores = new Jugador[n];
    }

    public void cargar()
    {
        for(int i=0; i< numJugadores;i++)
        {
            jugadores[i] = crearJugador();
        }
    }

    public Jugador crearJugador()
    {
        String nom = "";
        int goles = 0;
        nom = JOptionPane.showInputDialog("Nombre del jugador: ");
        goles = Integer.parseInt(JOptionPane.showInputDialog("Goles del jugador: "));
        return new Jugador(nom, goles);
    }

    public int calcularTotalGoles()
    {
        int totalGolesEquipo = 0;
        for(int i=0; i<numJugadores; i++)
        {
            totalGolesEquipo = totalGolesEquipo + jugadores[i].getGoles();
            if(jugadores[i].getGoles() > maxGoles)
            {
                maxGoles = jugadores[i].getGoles();
                nombreGoleador = jugadores[i].getNombre();
            }
        }
        return totalGolesEquipo;
    }

    public int calcularJugadorConMasGoles()
    {
        int totalgolesjugador = 0;
        return totalgolesjugador;
    }

    public int calcularPromedioEdades()
    {
        for(int i=0; i<numJugadores; i++)
        {     
            promedioEdades += jugadores[i].getEdad();
        }
        promedioEdades= promedioEdades/numJugadores;
        return promedioEdades;
}