package starter.page;

import net.serenitybdd.screenplay.targets.Target;

public class BusquedaPrincipalPage {
    public static Target HOSPEDAJE_DESTINO = Target.the("busqueda button destino de hopedaje").locatedBy("//button[@data-stid='location-field-destination-menu-trigger']");
    public static Target HOSPEDAJE_DESTINO_BUSQUEDA = Target.the("busqueda input destino de hopedaje").locatedBy("//input[@id='location-field-destination']");
    public static Target HOSPEDAJE_FECHA_IN = Target.the("boton fecha in").locatedBy("//button[@id='d1-btn']");
    public static Target HOSPEDAJE_FECHA_1 = Target.the("fecha in seleccion").locatedBy("//button[@aria-label='5 de abril de 2023']");
    public static Target HOSPEDAJE_FECHA_2 = Target.the("fecha out seleccion").locatedBy("//button[@aria-label='15 de abril de 2023']");
    public static Target HOSPEDAJE_FECHA_LISTO = Target.the("listo fecha").locatedBy("//button[@data-stid='apply-date-picker']");
    public static Target HOSPEDAJE_BUSCAR = Target.the("boton hospedaje buscar").locatedBy("//button[@data-testid='submit-button']");
}
