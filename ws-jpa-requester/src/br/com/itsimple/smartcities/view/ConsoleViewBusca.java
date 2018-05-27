package br.com.itsimple.smartcities.view;

import br.com.itsimple.smartcities.service.Cliente;
import br.com.itsimple.smartcities.service.ClienteServiceImplService;

public class ConsoleViewBusca {

    public static void main(String[] args) {

        ClienteServiceImplService service = new ClienteServiceImplService();

        Cliente cliente = service.getClienteServiceImplPort().buscar(1);
        System.out.println(cliente.getNome());
        System.out.println(cliente.getSobrenome());
        System.out.println(cliente.getEmail());
    
    }
}
