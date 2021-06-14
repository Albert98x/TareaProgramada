public class Lista
{
    
    int identificador;
    String descripción;
    String nombre;
   
    public Lista(int i,String n,String d)
    {
        identificador=i;
        nombre=n;
        descripción=d;
        
    }
     
    public String deDatos(){
        return "Lista="+identificador+"->" +nombre+" descripción:  "+descripción;
    }
}