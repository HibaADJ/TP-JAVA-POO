package dao.impl;

import Service.DatabaseConnection;
import dao.interfaces.IclientDAO;
import dao.interfaces.ItelephoneDAO;
import models.Client;
import models.telephone;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ClientDao implements IclientDAO {

    @Override
    public List<Client> getAll() {
        List<Client> clients = new ArrayList<>();
        Connection connexion = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            connexion = DatabaseConnection.getInstance();
            statement = connexion.createStatement();
            resultSet = statement.executeQuery("select * from clients");
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nom = resultSet.getString("nom");
                String prenom = resultSet.getString("prenom");
                String email = resultSet.getString("email");
                char genre = resultSet.getString("genre").charAt(0);
                Date dateInscription = resultSet.getDate("dateInscription");
                Date dateNaissance = resultSet.getDate("dateNaissance");
                clients.add(new Client(id, nom, prenom, email, genre, dateInscription, dateNaissance));
            }

        } catch (SQLException err) {
            err.printStackTrace();

        }
        return clients;
    }
    public Client getById(int id) {
        Client client = null;
        try {
            Connection connexion = DatabaseConnection.getInstance();
            PreparedStatement statement = connexion.prepareStatement("SELECT * FROM clients WHERE id=?");
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int clientId = resultSet.getInt("id");
                String nom = resultSet.getString("nom");
                String prenom = resultSet.getString("prenom");
                String email = resultSet.getString("email");
                char genre = resultSet.getString("genre").charAt(0);
                Date dateInscription = resultSet.getDate("dateInscription");
                Date dateNaissance = resultSet.getDate("dateNaissance");
                client = new Client(clientId, nom, prenom, email, genre, dateInscription, dateNaissance);
            }
        } catch (SQLException err) {
            err.printStackTrace();
        }
        return client;
    }
    @Override
    public void save(Client client) {

    }

    @Override
    public void update(Client client) {

    }

    @Override
    public void delete(int id) {

    }
}
