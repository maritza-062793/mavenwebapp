package mascota.controller;

import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import model.manager.MascotaModel;
import model.manager.entities.Mascota;

@ManagedBean
@SessionScoped
public class controllerMascota {
    
    private String id_mascota;
    private String tipo_mascota;
    private String nombres;
    private String edad;
    private String raza;
    private String duenio;
    private List<Mascota> listaMascotas;
    
    @EJB
    private MascotaModel modelmascota;
    
    public void actionListenerListarMascotas(){
        listaMascotas = modelmascota.listarMascotas();
    }
    
    public void actionListenerInsertarrMascota(){
        modelmascota.insertarMascota(id_mascota, tipo_mascota, nombres, edad, raza, duenio);
    }

    public void pruebas (){
       nombres= modelmascota.prueba();
       
    }
    
    public String getId_mascota() {
        return id_mascota;
    }

    public void setId_mascota(String id_mascota) {
        this.id_mascota = id_mascota;
    }

    public String getTipo_mascota() {
        return tipo_mascota;
    }

    public void setTipo_mascota(String tipo_mascota) {
        this.tipo_mascota = tipo_mascota;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getDuenio() {
        return duenio;
    }

    public void setDuenio(String duenio) {
        this.duenio = duenio;
    }

    public List<Mascota> getListaMascotas() {
        return listaMascotas;
    }

    public void setListaMascotas(List<Mascota> listaMascotas) {
        this.listaMascotas = listaMascotas;
    }
    
    
}

