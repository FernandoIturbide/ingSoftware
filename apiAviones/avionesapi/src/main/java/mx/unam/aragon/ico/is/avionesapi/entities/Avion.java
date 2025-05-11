package mx.unam.aragon.ico.is.avionesapi.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name="aviones")
public class Avion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int clave;
    @Column(name = "modelo_avion",nullable = false, length = 50)
    private String modeloAvion;
    @Column(name = "fabricante_avion",nullable = false, length = 50)
    private String fabricanteAvion;
    @Column(name = "capacidad_avion",nullable = false)
    private int capacidadAvion;
    @Column(name = "URL_foto", nullable = true, insertable = false,columnDefinition="VARCHAR(250) DEFAULT 'https://www.uv.mx/uvnoticias/wp-content/uploads/2020/01/Computadora.jpg'")
    private String urlFoto;

    public Avion() {
    }

    public Avion(int clave, String modeloAvion, String fabricanteAvion, int capacidadAvion, String urlFoto) {
        this.clave = clave;
        this.modeloAvion = modeloAvion;
        this.fabricanteAvion = fabricanteAvion;
        this.capacidadAvion = capacidadAvion;
        this.urlFoto = urlFoto;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public String getModeloAvion() {
        return modeloAvion;
    }

    public void setModeloAvion(String modeloAvion) {
        this.modeloAvion = modeloAvion;
    }

    public String getFabricanteAvion() {
        return fabricanteAvion;
    }

    public void setFabricanteAvion(String fabricanteAvion) {
        this.fabricanteAvion = fabricanteAvion;
    }

    public int getCapacidadAvion() {
        return capacidadAvion;
    }

    public void setCapacidadAvion(int capacidadAvion) {
        this.capacidadAvion = capacidadAvion;
    }

    public String getUrlFoto() {
        return urlFoto;
    }

    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Avion avion = (Avion) o;
        return clave == avion.clave && capacidadAvion == avion.capacidadAvion && Objects.equals(modeloAvion, avion.modeloAvion) && Objects.equals(fabricanteAvion, avion.fabricanteAvion) && Objects.equals(urlFoto, avion.urlFoto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clave, modeloAvion, fabricanteAvion, capacidadAvion, urlFoto);
    }

    @Override
    public String toString() {
        return "Avion{" +
                "clave=" + clave +
                ", modeloAvion='" + modeloAvion + '\'' +
                ", fabricanteAvion='" + fabricanteAvion + '\'' +
                ", capacidadAvion=" + capacidadAvion +
                ", urlFoto='" + urlFoto + '\'' +
                '}';
    }
}
