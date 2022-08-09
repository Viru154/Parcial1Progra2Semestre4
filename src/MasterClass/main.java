package MasterClass;
/* @author Viru154 */
abstract class Vehiculo {
    private String model, tipVeh, matricula, Propiedad;

    public String getModel() {
        return model;
    }

    public void setModel(String modelo) {
        this.model = modelo;
    }

    public String getTipVehi() {
        return tipVeh;
    }

    public void setTipVehi(String tipovehi) {
        this.tipVeh = tipovehi;
    }

    public String getID() {
        return matricula;
    }

    public String getPropiedad() {
        return Propiedad;
    }

    public void setPropiedad(String Propiedad) {
        this.Propiedad = Propiedad;
    }
    
    
}