
package br.com.itsimple.smartcities.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.itsimple.smartcities.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Cliente_QNAME = new QName("http://service.smartcities.itsimple.com.br/", "Cliente");
    private final static QName _Buscar_QNAME = new QName("http://service.smartcities.itsimple.com.br/", "buscar");
    private final static QName _BuscarResponse_QNAME = new QName("http://service.smartcities.itsimple.com.br/", "buscarResponse");
    private final static QName _Cadastrar_QNAME = new QName("http://service.smartcities.itsimple.com.br/", "cadastrar");
    private final static QName _CadastrarResponse_QNAME = new QName("http://service.smartcities.itsimple.com.br/", "cadastrarResponse");
    private final static QName _Exception_QNAME = new QName("http://service.smartcities.itsimple.com.br/", "Exception");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.itsimple.smartcities.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Cliente }
     * 
     */
    public Cliente createCliente() {
        return new Cliente();
    }

    /**
     * Create an instance of {@link Buscar }
     * 
     */
    public Buscar createBuscar() {
        return new Buscar();
    }

    /**
     * Create an instance of {@link BuscarResponse }
     * 
     */
    public BuscarResponse createBuscarResponse() {
        return new BuscarResponse();
    }

    /**
     * Create an instance of {@link Cadastrar }
     * 
     */
    public Cadastrar createCadastrar() {
        return new Cadastrar();
    }

    /**
     * Create an instance of {@link CadastrarResponse }
     * 
     */
    public CadastrarResponse createCadastrarResponse() {
        return new CadastrarResponse();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Cliente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.smartcities.itsimple.com.br/", name = "Cliente")
    public JAXBElement<Cliente> createCliente(Cliente value) {
        return new JAXBElement<Cliente>(_Cliente_QNAME, Cliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Buscar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.smartcities.itsimple.com.br/", name = "buscar")
    public JAXBElement<Buscar> createBuscar(Buscar value) {
        return new JAXBElement<Buscar>(_Buscar_QNAME, Buscar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.smartcities.itsimple.com.br/", name = "buscarResponse")
    public JAXBElement<BuscarResponse> createBuscarResponse(BuscarResponse value) {
        return new JAXBElement<BuscarResponse>(_BuscarResponse_QNAME, BuscarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Cadastrar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.smartcities.itsimple.com.br/", name = "cadastrar")
    public JAXBElement<Cadastrar> createCadastrar(Cadastrar value) {
        return new JAXBElement<Cadastrar>(_Cadastrar_QNAME, Cadastrar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.smartcities.itsimple.com.br/", name = "cadastrarResponse")
    public JAXBElement<CadastrarResponse> createCadastrarResponse(CadastrarResponse value) {
        return new JAXBElement<CadastrarResponse>(_CadastrarResponse_QNAME, CadastrarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.smartcities.itsimple.com.br/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

}
