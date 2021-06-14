public class Actividades
{
    int identificación;
    String nombre;
    String fechaInicio;
    String fechaFinal;
    String responsable;
    String estimación;
    String esfuerzo;

   
    public Actividades(int id, String n,String fi,String ff, String r,String est,String esf)
    {
        identificación=id;
        nombre=n;
        fechaInicio=fi;
        fechaFinal=ff;
        responsable=r;
        estimación=est;
        esfuerzo=esf;
    }

    public String deDatos(){
        return "Actividad "+identificación+"->" +nombre+ " responsable "+responsable+" fecha de inicio "+fechaInicio+ " fecha final "+fechaFinal+
        " estimación "+ estimación+ " esfuerzo " + esfuerzo;
    }       

}