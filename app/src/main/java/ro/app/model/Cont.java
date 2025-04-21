package ro.app.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "view_cont")
public class Cont {

    @Id
    @Column(name = "cont_id")
    private Long contId;

    @Column(name = "cont_iban")
    private String contIban;

    @Column(name = "cont_sold")
    private Double contSold;

    @Column(name = "valuta_cod")
    private String valutaCod;

    @Column(name = "client_id")
    private Long clientId;

    @Column(name = "client_nume")
    private String clientNume;

    @Column(name = "client_prenume")
    private String clientPrenume;

    // Getters and setters
    public Long getContId() { return contId; }
    public void setContId(Long contId) { this.contId = contId; }

    public String getContIban() { return contIban; }
    public void setContIban(String contIban) { this.contIban = contIban; }

    public Double getContSold() { return contSold; }
    public void setContSold(Double contSold) { this.contSold = contSold; }

    public String getValutaCod() { return valutaCod; }
    public void setValutaCod(String valutaCod) { this.valutaCod = valutaCod; }

    public Long getClientId() { return clientId; }
    public void setClientId(Long clientId) { this.clientId = clientId; }

    public String getClientNume() { return clientNume; }
    public void setClientNume(String clientNume) { this.clientNume = clientNume; }

    public String getClientPrenume() { return clientPrenume; }
    public void setClientPrenume(String clientPrenume) { this.clientPrenume = clientPrenume; }
}
