import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Sensor temperatura = new SensorTemperatura("T001", "Zona Norte");
        Sensor humedad = new SensorHumedad("H001", "Zona Norte");
        Sensor calidadAire = new SensorCalidadAire("A001", "Zona Sur");
        Sensor luminosidad = new SensorLuminosidad("L001", "Zona Sur");

        Zona zonaNorte = new Zona("Zona Norte");
        zonaNorte.agregarSensor(temperatura);
        zonaNorte.agregarSensor(humedad);

        Zona zonaSur = new Zona("Zona Sur");
        zonaSur.agregarSensor(calidadAire);
        zonaSur.agregarSensor(luminosidad);

        List<Sensor> sensores = new ArrayList<>();
        sensores.add(temperatura);
        sensores.add(humedad);
        sensores.add(calidadAire);
        sensores.add(luminosidad);

        EstacionMonitoreo estacion = new EstacionMonitoreo("Estacion Central");
        ServicioEnvioDatos servicio = new ServicioEnvioDatos();

        for (Sensor sensor : sensores) {

            sensor.activar();

            System.out.println(sensor.getId() + " → " + sensor.leer());

            sensor.registrarLectura();
            estacion.monitorear(sensor);
            servicio.enviar(sensor.getId(), sensor.leer());
        }
    }
}
