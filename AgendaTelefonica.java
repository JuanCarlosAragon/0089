import java.util.HashMap;
/**
 * Write a description of class AgendaTelefonica here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AgendaTelefonica
{
    private HashMap<String,String> agenda;
    
    public AgendaTelefonica(){
        agenda = new HashMap<>();
    }
    
    /**
     * Introduce un número nuevo en la agenda
     * 
     * @param name nombre de la persona de contacto
     * @param number numero de la persona de contacto
     */
    public void enterNumber(String name, String number){
        agenda.put(name, number);
    }
    
    /**
     * Devuelve el número de la persona buscada
     * 
     * @param name nombre de la persona que queremos saber el número
     */
    public String lookupNumber(String name){
        return agenda.get(name);
    }
    
    /**
     * Print all keys
     */
    public void printAllNames(){
        System.out.println(agenda.keySet());
    }
}
