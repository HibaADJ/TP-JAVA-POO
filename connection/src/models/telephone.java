package models;

public class telephone extends ModelDeBase{
    private int idClient;
    private String numero;


    public telephone(int id, int idClient, String numero) {
        super(id);
        this.idClient = idClient;
        this.numero = numero;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
