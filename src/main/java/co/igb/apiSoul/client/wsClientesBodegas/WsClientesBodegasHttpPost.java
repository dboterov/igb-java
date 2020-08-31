
package co.igb.apiSoul.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.1
 * 
 */
@WebService(name = "wsClientesBodegasHttpPost", targetNamespace = "http://tempuri.org/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WsClientesBodegasHttpPost {


    /**
     * 
     * @param pContrasena
     * @param pUsuario
     * @return
     *     returns co.igb.apiSoul.client.RespConsultaInventario
     */
    @WebMethod(operationName = "ConsultaInventario")
    @WebResult(name = "RespConsultaInventario", targetNamespace = "http://tempuri.org/", partName = "Body")
    public RespConsultaInventario consultaInventario(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "pUsuario")
        String pUsuario,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "pContrasena")
        String pContrasena);

    /**
     * 
     * @param pContrasena
     * @param pUsuario
     * @return
     *     returns co.igb.apiSoul.client.RespConsultaInventarioBodega
     */
    @WebMethod(operationName = "ConsultaInventarioBodega")
    @WebResult(name = "RespConsultaInventarioBodega", targetNamespace = "http://tempuri.org/", partName = "Body")
    public RespConsultaInventarioBodega consultaInventarioBodega(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "pUsuario")
        String pUsuario,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "pContrasena")
        String pContrasena);

    /**
     * 
     * @param pContrasena
     * @param pDocTransporte
     * @param pUsuario
     * @return
     *     returns co.igb.apiSoul.client.RespConsultaConteo
     */
    @WebMethod(operationName = "ConsultaConteosxDocTransporte")
    @WebResult(name = "RespConsultaConteo", targetNamespace = "http://tempuri.org/", partName = "Body")
    public RespConsultaConteo consultaConteosxDocTransporte(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "pUsuario")
        String pUsuario,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "pContrasena")
        String pContrasena,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "pDocTransporte")
        String pDocTransporte);

    /**
     * 
     * @param pTipoConteo
     * @param pContrasena
     * @param pNroFactura
     * @param pUsuario
     * @return
     *     returns co.igb.apiSoul.client.RespReporteConteo
     */
    @WebMethod(operationName = "ReporteConteo")
    @WebResult(name = "RespReporteConteo", targetNamespace = "http://tempuri.org/", partName = "Body")
    public RespReporteConteo reporteConteo(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "pUsuario")
        String pUsuario,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "pContrasena")
        String pContrasena,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "pNroFactura")
        String pNroFactura,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "pTipoConteo")
        String pTipoConteo);

    /**
     * 
     * @param usuario
     * @param consecutivoSalida
     * @param contrasena
     * @return
     *     returns co.igb.apiSoul.client.RespConsultarEstadoPaquete
     */
    @WebMethod(operationName = "ConsultarEstadoPaquete")
    @WebResult(name = "RespConsultarEstadoPaquete", targetNamespace = "http://tempuri.org/", partName = "Body")
    public RespConsultarEstadoPaquete consultarEstadoPaquete(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "Usuario")
        String usuario,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "Contrasena")
        String contrasena,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "ConsecutivoSalida")
        String consecutivoSalida);

    /**
     * 
     * @param usuario
     * @param contrasena
     * @param consecutivoCaja
     * @return
     *     returns co.igb.apiSoul.client.RespConsultarEstadoPaquete
     */
    @WebMethod(operationName = "ConsultarEstadoPaquetexCaja")
    @WebResult(name = "RespConsultarEstadoPaquete", targetNamespace = "http://tempuri.org/", partName = "Body")
    public RespConsultarEstadoPaquete consultarEstadoPaquetexCaja(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "Usuario")
        String usuario,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "Contrasena")
        String contrasena,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "ConsecutivoCaja")
        String consecutivoCaja);

    /**
     * 
     * @param tramitada
     * @param usuario
     * @param ordenCompra
     * @param numeroBp
     * @param detalleOrden
     * @param fechaOrdenHasta
     * @param consecutivoSalida
     * @param contrasena
     * @param fechaOrdenDesde
     * @return
     *     returns co.igb.apiSoul.client.RespSalidasEverfit
     */
    @WebMethod(operationName = "ConsultarOrdenesSalidaEverfit")
    @WebResult(name = "RespSalidasEverfit", targetNamespace = "http://tempuri.org/", partName = "Body")
    public RespSalidasEverfit consultarOrdenesSalidaEverfit(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "usuario")
        String usuario,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "contrasena")
        String contrasena,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "fechaOrdenDesde")
        String fechaOrdenDesde,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "fechaOrdenHasta")
        String fechaOrdenHasta,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "numeroBp")
        String numeroBp,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "consecutivoSalida")
        String consecutivoSalida,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "ordenCompra")
        String ordenCompra,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "detalleOrden")
        String detalleOrden,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "tramitada")
        String tramitada);

}
