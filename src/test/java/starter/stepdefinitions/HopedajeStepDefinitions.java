package starter.stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import starter.task.SeleccionarHospedaje;

public class HopedajeStepDefinitions {

    @Cuando("{actor} busca un hospedaje para {string}")
    public void busca_un_hospedaje_para(Actor actor, String destino) {
        actor.attemptsTo(
                SeleccionarHospedaje.simple(destino)
        );

    }
    @Entonces("debe encontrar al menos una opción disponible")
    public void debe_encontrar_al_menos_una_opción_disponible() {

    }

}
