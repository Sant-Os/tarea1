/* @author (Sn_efa) 
* @version (1.0.1)
*/
public class Perro
{
    // Atributos
    private String Nombre;
    private String Color;
    private double Tamaño;
    private int Edad;
    
    // Constructor
    public Perro( String Nombre, double Tamaño, int Edad, String Color ){
        this.Nombre = Nombre;
        this.Color = Color;
        this.Tamaño = Tamaño;
        this.Edad = Edad;
    }
    
    // Metodo 1
    public  String Jugar(){
        String Jugar;
        Jugar = "Perro"+Nombre+Color+Tamaño+Edad+" esta jugando con un hueso";
        return Jugar;    
    }
    
    // Metodo 2
    public String Dormir(){
        String Dormir;
        Dormir = "Perro"+Nombre+Color+Tamaño+Edad+"esta durmiendo en su casa";
        return Dormir;
    }
    
    // Metodos get, set.
    public String getNombre(){
        return Nombre;
    }

    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }

    public String getColor(){
        return Color;
    }

    public void setColor(String Color){
        this.Color = Color;
    }
    
    public double getTamaño(){
        return Tamaño;
    }

    public void setTamaño(int Tamaño){
        this.Tamaño = Tamaño;
    }

    public int getEdad(){
        return Edad;
    }

    public void setEdad(int Edad){
        this.Edad = Edad;
    }
}