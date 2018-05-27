package br.com.itsimple.smartcities.service;

import javax.jws.WebService;

import br.com.itsimple.smartcities.entity.Cliente;

@WebService(name = "ClienteService", targetNamespace = "http://service.smartcities.itsimple.com.br/")
public interface ClienteService {

    void cadastrar(Cliente cliente) throws Exception;

    Cliente buscar(int codigo);

}