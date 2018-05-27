package br.com.itsimple.smartcities.service;

import javax.jws.WebService;
import javax.persistence.EntityManager;

import br.com.itsimple.smartcities.dao.ClienteDAO;
import br.com.itsimple.smartcities.dao.impl.ClienteDAOImpl;
import br.com.itsimple.smartcities.entity.Cliente;
import br.com.itsimple.smartcities.singleton.EntityManagerFactorySingleton;

@WebService(targetNamespace = "http://service.smartcities.itsimple.com.br/", endpointInterface = "br.com.itsimple.smartcities.service.ClienteService", portName = "ClienteServiceImplPort", serviceName = "ClienteServiceImplService")
public class ClienteServiceImpl implements ClienteService {

    private ClienteDAO dao;
    
    public ClienteServiceImpl() {
        EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
        dao = new ClienteDAOImpl(em);
     }

    @Override
    public void cadastrar(Cliente cliente) throws Exception {
        dao.cadastrar(cliente);
        dao.commit();        
    }

    @Override
    public Cliente buscar(int codigo) {
        return dao.buscar(codigo);
    }
    
}
