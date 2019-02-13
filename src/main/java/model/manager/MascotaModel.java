
package model.manager;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import model.manager.entities.Mascota;

@Stateless
public class MascotaModel {
    
     private EntityManager em;
     
     List<Mascota> listaMascotas = new ArrayList<Mascota>(); 
     
    public Mascota insertarMascota(String id, String tipo, String nombres, String edad, String raza, String dueño) {
        Mascota m = new Mascota(id, tipo, nombres, edad, raza, dueño );
        listaMascotas.add(m);
        return m;
    }
     
     public  List<Mascota> listarMascotas(){
         if(listaMascotas.isEmpty()){
             listaMascotas.add(new Mascota("1","Perro","Firulais","5","Pitbull", "Juan Rojas"));
             listaMascotas.add(new Mascota("2","Gato","Misifus","3","Oriental", "Hugo Jimenez"));
             listaMascotas.add(new Mascota("3","Cuy","Rafael","1","No especificada", "Galo Galindez"));
             return listaMascotas;
         }else{
             return listaMascotas;
         }
     }

     public int buscarMascota(String id){
         //listaMascotas.forEach(id);
         return -1;  // retornar posicion si lo encuentra, -1 si no
     }
     
      public boolean editarMascota(String id, String tipo, String nombres, String edad, String raza, String dueño) {
        
        if(buscarMascota(id)!=-1){
            Mascota m = new Mascota(id, tipo, nombres, edad, raza, dueño );
            listaMascotas.add(buscarMascota(id), m);
            return true;
        }else{
            return false;
        }
    }
      
      public boolean borrarMascota(String id, String tipo, String nombres, String edad, String raza, String dueño) {
        
        if(buscarMascota(id)!=-1){
            return true;
        }else{
            return false;
        }
    }
    
       public String prueba(){
         return listaMascotas.size()+"";
         //return "aaa";
     }
}
