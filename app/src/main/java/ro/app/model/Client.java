package ro.app.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "view_client")
public class Client {

    @Id
    @Column(name = "client_id")
    private Long clientId;

    @Column(name = "client_nume")
    private String clientNume;

    @Column(name = "client_prenume")
    private String clientPrenume;

    @Column(name = "tip_client_denumire")
    private String tipClientDenumire;

    @Column(name = "sex_denumire")
    private String sexDenumire;

    // Getters and setters
    public Long getClientId() { return clientId; }
    public void setClientId(Long clientId) { this.clientId = clientId; }

    public String getClientNume() { return clientNume; }
    public void setClientNume(String clientNume) { this.clientNume = clientNume; }

    public String getClientPrenume() { return clientPrenume; }
    public void setClientPrenume(String clientPrenume) { this.clientPrenume = clientPrenume; }

    public String getTipClientDenumire() { return tipClientDenumire; }
    public void setTipClientDenumire(String tipClientDenumire) { this.tipClientDenumire = tipClientDenumire; }

    public String getSexDenumire() { return sexDenumire; }
    public void setSexDenumire(String sexDenumire) { this.sexDenumire = sexDenumire; }
}
