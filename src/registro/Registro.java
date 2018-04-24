/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registro;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author agustin
 */
public class Registro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Random rand = new Random();
        
        //personas a usar
        Persona tina = new Persona("Agustina","Nieto",true);
        Persona jose = new Persona("Jose","Beas",true);
        Persona santiago = new Persona("Santiago","Asef",true);
        Persona jb = new Persona("J","B",true);
        Persona edgar = new Persona("Edgar","Margonari",true);
        Persona agustin = new Persona("Agustin", "Ardizzone", true);
        Persona oder = new Persona("Oder", "Mangero", false);
        Persona alejandro = new Persona("Alejandro","Bigote",false);
        Persona daniel = new Persona("Daniel", "Fernandez", true);
        
        //listas a usar
        ArrayList <Persona> registro = new ArrayList();
        ArrayList <Persona> presentes = new ArrayList();
        ArrayList <Persona> ausentes = new ArrayList();
        ArrayList <Persona> sorteo = new ArrayList();
        
        //se agregan las personas al registro
        registro.add(tina);
        registro.add(santiago);
        registro.add(jose);
        registro.add(jb);
        registro.add(edgar);
        registro.add(agustin);
        registro.add(oder);
        registro.add(alejandro);
        registro.add(daniel);
        
        //Se completan las listas de presentes y ausentes
        for(Persona sigPersona : registro){
            if (sigPersona.isEstaPresente()== true){
                presentes.add(sigPersona);
            }else{
                ausentes.add(sigPersona);
            }
        }
        
        /*System.out.println("Los alumnos presentes son: ");
        
        for (Persona presente : presentes) {
            System.out.println(presente.getNombre()+""+presente.getApellido());
        }
        */
        
        //Se realiza un sorteo entre los presentes
        sorteo.addAll(presentes);
        for(int i=0;i<sorteo.size()/2;i++){
            int indice = rand.nextInt(sorteo.size());
            while(sorteo.get(indice).isFueSorteado()==true){
                indice = rand.nextInt(sorteo.size());
            }
            System.out.print("\n"+sorteo.get(indice).getNombre()+" "+sorteo.get(indice).getApellido());
            sorteo.get(indice).setFueSorteado(true);
            
            indice = rand.nextInt(sorteo.size());
            while(sorteo.get(indice).isFueSorteado()==true){
                indice = rand.nextInt(sorteo.size());
            }
            System.out.print(" con "+sorteo.get(indice).getNombre()+" "+sorteo.get(indice).getApellido());
            sorteo.get(indice).setFueSorteado(true);
            
            
        }
        if (sorteo.size()%2==1){
                int aux = 0;
                while(sorteo.get(aux).isFueSorteado()==true){
                    aux++;
                }
                System.out.print(" y "+sorteo.get(aux).getNombre()+" "+sorteo.get(aux).getApellido());
                sorteo.get(aux).setFueSorteado(true);
            }
    }
    
}
