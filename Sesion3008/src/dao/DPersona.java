/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelos.Persona;
import modelos.sexo;

/**
 *
 * @author labc205
 */
public class DPersona {
    private ArrayList<Persona> listpersona=new ArrayList<>();

    public DPersona(ArrayList<Persona> listpersona) {
        this.listpersona = listpersona;
    }

    public DPersona() {
    }

    public ArrayList<Persona> getListpersona() {
        return listpersona;
    }

    public void setListpersona(ArrayList<Persona> listpersona) {
        this.listpersona = listpersona;
    }
    
    /**
     * 
     * @param id
     * @param nom
     * @param ape
     * @param email
     * @param sex
     * @return 
     */
    
    public int agregarPersona(int id,
            String nom, String ape, 
            String email, sexo sex){
        int b = 0;
        Persona pers = new Persona(id, nom, ape, email, sex);
        listpersona.add(pers);
        b = 1;
        return b;
    }
    
    /**
     * Devuelve una tabla con los registros
     * almacenados en el listado de personas
     * 
     * @return 
     */
    
    public DefaultTableModel getListPers(){
        DefaultTableModel dtm = new DefaultTableModel();
        String titulo[] = {"ID", "NOMBRES", "APELLIDOS", "EMAIL", "SEXO"};
        dtm.setColumnIdentifiers(titulo);
        for (Persona per: listpersona){
            String reg[] = new String[5];
            reg[0] = ""+per.getId();
            reg[1] = per.getNombre();
            reg[2] = per.getApellido();
            reg[3] = per.getEmail();
            reg[4] = ""+per.getSexo();
            
            dtm.addRow(reg);
        }
        return dtm;
    }
}
