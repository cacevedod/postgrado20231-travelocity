package com.travelocity.page;

import net.serenitybdd.screenplay.targets.Target;

public class BusquedaPrincipalPage {
    public static Target BUT_DESTINO = Target.the("busqueda button destino de hopedaje").locatedBy("//button[@data-stid='location-field-destination-menu-trigger']");
    public static Target DESTINO = Target.the("busqueda input destino de hopedaje").locatedBy("//input[@id='location-field-destination']");
    public static Target BUT_FECHA = Target.the("boton fecha in").locatedBy("//button[@id='d1-btn']");
    public static Target FECHA_1 = Target.the("fecha in seleccion").locatedBy("//button[@aria-label='{0} de {1} de 2023']");
    public static Target FECHA_2 = Target.the("fecha out seleccion").locatedBy("//button[@aria-label='{0} de abril de 2023']");
    public static Target FECHA_LISTO = Target.the("listo fecha").locatedBy("//button[@data-stid='apply-date-picker']");
    public static Target BUSCAR = Target.the("boton hospedaje buscar").locatedBy("//button[@data-testid='submit-button']");
    public static Target BUSQUEDA_PAQUETES = Target.the("boton buscar paquetes").locatedBy("//span[text()='Paquetes']/..");
    public static Target BUT_ORIGEN = Target.the("boton origen").locatedBy("//button[@data-stid='location-field-origin-menu-trigger']");
    public static Target ORIGEN = Target.the("origen").locatedBy("//input[@id='location-field-origin']");


}
