package data;

import model.ExcursionCultural;
import model.PaseoLacustre;
import model.RutaGastronomica;

public class GestorServicios {

    public void crearServicios() {

        RutaGastronomica ruta1 =
                new RutaGastronomica(
                        "Ruta de la Cerveza",
                        5,
                        6);

        RutaGastronomica ruta2 =
                new RutaGastronomica(
                        "Sabores del Sur",
                        4,
                        5);

        PaseoLacustre paseo1 =
                new PaseoLacustre(
                        "Lago Llanquihue",
                        3,
                        "Catamarán");

        PaseoLacustre paseo2 =
                new PaseoLacustre(
                        "Isla Maillen",
                        2,
                        "Lancha");

        ExcursionCultural excursion1 =
                new ExcursionCultural(
                        "Museo Colonial",
                        2,
                        "Museo Antonio Felmer");

        ExcursionCultural excursion2 =
                new ExcursionCultural(
                        "Puerto Varas Histórico",
                        3,
                        "Centro Histórico");

        System.out.println(ruta1);
        System.out.println(ruta2);

        System.out.println(paseo1);
        System.out.println(paseo2);

        System.out.println(excursion1);
        System.out.println(excursion2);
    }
}