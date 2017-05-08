/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;


/**
 *
 * @author Alejandro Machaca Luna
 */
public class Personal {

    private int idPersonal;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String FechaNacimiento;
    private String celulaIdentidad;
    private String direccion;
    private int telefono;
    private String email;
    private float sueldo;
    private String fechaInicioActividades;
    private String fechaFinActividades;
    private int idTipoPersonal;

    public Personal() {

    }

    public void setIdPer(int idPer) {
        this.idPersonal = idPer;
    }

    public int getIdPer() {
        return this.idPersonal;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setAp(String ap) {
        this.apellidoPaterno = ap;
    }

    public String getAp() {
        return this.apellidoPaterno;
    }

    public void setAm(String am) {
        this.apellidoMaterno = am;
    }

    public String getAm() {
        return this.apellidoMaterno;
    }

    public void setFN(String fN) {
        this.FechaNacimiento = fN;
    }

    public String getFN() {
        return this.FechaNacimiento;
    }

    public void setCi(String ci) {
        this.celulaIdentidad = ci;
    }

    public String getCi() {
        return this.celulaIdentidad;
    }

    public void setDir(String dir) {
        this.direccion = dir;
    }

    public String getDir() {
        return this.direccion;
    }

    public void setTel(int tel) {
        this.telefono = tel;
    }

    public int getTel() {
        return this.telefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setSuel(float suel) {
        this.sueldo = suel;
    }

    public float getSuel() {
        return this.sueldo;
    }

    public void setFI(String fI) {
        this.fechaInicioActividades = fI;
    }

    public String getFI() {
        return this.fechaInicioActividades;
    }

    public void setFF(String fF) {
        this.fechaFinActividades = fF;
    }

    public String getFF() {
        return this.fechaFinActividades;
    }

    public void setIdTipPer(int idTipPer) {
        this.idTipoPersonal = idTipPer;
    }

    public int getIdTipPer() {
        return this.idTipoPersonal;
    }
}
