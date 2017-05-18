/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Artista extends Usuario{

    private ArrayList <Obra> obrasArtista = new ArrayList <Obra>();
    private String infoCurriculum;
    private String distinciones; 

    public Artista(String infoCurriculum, String distinciones, String nombre, String apellido) {
        super(nombre, apellido);
        this.infoCurriculum = infoCurriculum;
        this.distinciones = distinciones;        
    }
    
    public void agregarObra(Obra obra){
        obrasArtista.add(obra);
    }

    public ArrayList<Obra> getObrasArtista() {
        return obrasArtista;
    }

    public void setObrasArtista(ArrayList<Obra> obrasArtista) {
        this.obrasArtista = obrasArtista;
    }

    public String getInfoCurriculum() {
        return infoCurriculum;
    }

    public void setInfoCurriculum(String infoCurriculum) {
        this.infoCurriculum = infoCurriculum;
    }

    public String getDistinciones() {
        return distinciones;
    }

    public void setDistinciones(String distinciones) {
        this.distinciones = distinciones;
    }
        
    
}
