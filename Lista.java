public class Lista
{
    
    int identificador;
    String descripci�n;
    String nombre;
   
    public Lista(int i,String n,String d)
    {
        identificador=i;
        nombre=n;
        descripci�n=d;
        
    }
     
    public String deDatos(){
        return "Lista="+identificador+"->" +nombre+" descripci�n:  "+descripci�n;
    }
}