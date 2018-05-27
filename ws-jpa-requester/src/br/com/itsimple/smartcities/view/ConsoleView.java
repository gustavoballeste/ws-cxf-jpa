package br.com.itsimple.smartcities.view;

import br.com.itsimple.smartcities.service.Cliente;
import br.com.itsimple.smartcities.service.ClienteServiceImplService;
import br.com.itsimple.smartcities.service.Exception_Exception;

public class ConsoleView {

    public static void main(String[] args) {

        ClienteServiceImplService service = new ClienteServiceImplService();
        
        Cliente cliente = new Cliente();
        cliente.setNome("Gustavo");
        cliente.setEmail("gustavo@gmail.com");
        cliente.setSobrenome("Prado");

        try {
            service.getClienteServiceImplPort().cadastrar(cliente);
            System.out.println("Cadastro efetuado com sucesso!");
        } catch (Exception_Exception e) {
            e.printStackTrace();
            System.out.println("Erro ao cadastrar...");
        }        
    }
}
