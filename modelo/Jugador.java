package modelo;

public class Jugador
{
    //Atributos
    public String nombre;
    public int goles;

    //Métodos
    public Jugador()
    {
        nombre = "";
        goles = 0;
    }

    public Jugador(String n, int g)
    {
        nombre = n;
        goles = g;
    }
    
    public void setGoles(int g)
    {
        goles = g;
    }

    public int getGoles()
    {
        return goles;
    }

    public void setNombre(String n)
    {
        nombre = n;
    }

    public String getNombre()
    {
        return nombre;
    }

    public String toString()
    {
        return nombre + " con " + goles + " goles.";
    }
}