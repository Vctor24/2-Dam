import javax.swing.*;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Mapa implements Serializable {
    HashMap<String, Localidad> mapa = new HashMap<>();

    public HashMap<String, Localidad> getMapa() {
        return mapa;
    }

    public void setMapa(HashMap<String, Localidad> mapa) {
        this.mapa = mapa;
    }

    public void rellenaMapa(Localidad localidad){
        mapa.put(localidad.getId(), localidad);
    }

    public String[] recorreMapa(String nombr){
        String[] salida = new String[2];
        //Hacer que se acceda al nombre de la clase cuando la key es el id, debido a que se repiten nombres.
        for (Map.Entry<String, Localidad> en : mapa.entrySet()) {
            String key = en.getKey();
            Localidad val = en.getValue();
            if (val.getName().equalsIgnoreCase(nombr)){
                salida[0] = val.getLatitude();
                salida[1] = val.getLongitude();
            }

        }


        return salida;
    }

    @Override
    public String toString() {
        return "Mapa: \n " + mapa ;
    }
}
