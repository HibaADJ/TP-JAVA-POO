import dao.impl.ClientDao;
import models.Client;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ClientDao clientDAO=new ClientDao();

        List<Client> clients=clientDAO.getAll();

        for(Client c:clients){
            System.out.println(c);
        }

       // clients.forEach(element->{
          //  System.out.println(element);
        //});
    }
    //        Get by id
    Client client=ClientDao.getById(1);
        System.out.println("ID 1 : "+client);
}
