
package br.com.itsimple.smartcities.service.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 3.2.4
 * Sun May 27 17:21:48 BRT 2018
 * Generated source version: 3.2.4
 */

@XmlRootElement(name = "buscarResponse", namespace = "http://service.smartcities.itsimple.com.br/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "buscarResponse", namespace = "http://service.smartcities.itsimple.com.br/")

public class BuscarResponse {

    @XmlElement(name = "return")
    private br.com.itsimple.smartcities.entity.Cliente _return;

    public br.com.itsimple.smartcities.entity.Cliente getReturn() {
        return this._return;
    }

    public void setReturn(br.com.itsimple.smartcities.entity.Cliente new_return)  {
        this._return = new_return;
    }

}

