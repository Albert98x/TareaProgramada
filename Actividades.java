public class Actividades
{
    int identificaci�n;
    String nombre;
    String fechaInicio;
    String fechaFinal;
    String responsable;
    String estimaci�n;
    String esfuerzo;

   
    public Actividades(int id, String n,String fi,String ff, String r,String est,String esf)
    {
        identificaci�n=id;
        nombre=n;
        fechaInicio=fi;
        fechaFinal=ff;
        responsable=r;
        estimaci�n=est;
        esfuerzo=esf;
    }

    public String deDatos(){
        return "Actividad "+identificaci�n+"->" +nombre+ " responsable "+responsable+" fecha de inicio "+fechaInicio+ " fecha final "+fechaFinal+
        " estimaci�n "+ estimaci�n+ " esfuerzo " + esfuerzo;
    }       

}