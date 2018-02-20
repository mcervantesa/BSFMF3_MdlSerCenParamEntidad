package mx.appwhere.remittances.front.application.constants;

/**
 * @author Alejandro Martin
 * @version 1.0 - 2017/10/13
 */
public final class ApplicationConstants {
    public static final String VIEW_MESSAGE_NAME = "message";
    public static final String configurationFilesClasspath = "classpath:/config";

    //Mensajes de errores
    public static final String SERVER_ERROR_MESSAGE = "Error en el servidor";
    public static final String FOLIO_NOT_EXIST = "Folio no existe";
    public static final String BSFOPERADOR_ERROR = "Error con el bsfoperador";
    public static final String ABONOS_NOT_EXIST = "No existen registros para abono en cuenta";
    public static final String MOVIMIENTOS_NOT_EXIST = "No existen movimientos registrados";

    //View bsfOperador
    public static final String CONSULTA_BSFOPERADOR_VIEW = "general/consulta-bsfoperador";

    //Main
    public static final String MAIN_VIEW = "main/main.html";

    //Products
    public static final String PRODUCTS_LIST_VIEW = "products/products-list.html";
    public static final String PRODUCTS_ID_VIEW = "products/products-show.html";
    public static final String PRODUCTS_NEW_VIEW = "products/products-new.html";
    public static final String PRODUCTS_EDIT_VIEW = "products/products-edit.html";

    //Example
    public static final String EXAMPLE_VIEW = "example/example.html";
}
