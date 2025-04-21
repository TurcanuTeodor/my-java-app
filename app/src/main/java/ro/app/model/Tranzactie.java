package ro.app.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "view_tranzactii")
public class Tranzactie {

    @Id
    @Column(name = "transaction_id")
    private Long transactionId;

    @Column(name = "cont_iban")
    private String contIban;

    @Column(name = "tip_tranzactie_denumire")
    private String tipTranzactieDenumire;

    @Column(name = "tranzactie_suma")
    private Double tranzactieSuma;

    @Column(name = "tranzactie_semn")
    private String tranzactieSemn; // Changed to String to match the view definition

    @Column(name = "valuta_cod")
    private String valutaCod;

    @Column(name = "tranzactie_data")
    private LocalDateTime tranzactieData;

    // Getters and setters
    public Long getTransactionId() { return transactionId; }
    public void setTransactionId(Long transactionId) { this.transactionId = transactionId; }

    public String getContIban() { return contIban; }
    public void setContIban(String contIban) { this.contIban = contIban; }

    public String getTipTranzactieDenumire() { return tipTranzactieDenumire; }
    public void setTipTranzactieDenumire(String tipTranzactieDenumire) { this.tipTranzactieDenumire = tipTranzactieDenumire; }

    public Double getTranzactieSuma() { return tranzactieSuma; }
    public void setTranzactieSuma(Double tranzactieSuma) { this.tranzactieSuma = tranzactieSuma; }

    public String getTranzactieSemn() { return tranzactieSemn; }
    public void setTranzactieSemn(String tranzactieSemn) { this.tranzactieSemn = tranzactieSemn; }

    public String getValutaCod() { return valutaCod; }
    public void setValutaCod(String valutaCod) { this.valutaCod = valutaCod; }

    public LocalDateTime getTranzactieData() { return tranzactieData; }
    public void setTranzactieData(LocalDateTime tranzactieData) { this.tranzactieData = tranzactieData; }
}
