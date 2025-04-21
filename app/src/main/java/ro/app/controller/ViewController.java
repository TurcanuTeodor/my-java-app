package ro.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import ro.app.model.Client;
import ro.app.model.Cont;
import ro.app.model.Tranzactie;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.util.List;

@Controller
public class ViewController {

    @PersistenceContext
    private EntityManager entityManager;

    @GetMapping("/clients")
    @ResponseBody
    public List<Client> getClients() {
        return entityManager.createQuery("SELECT c FROM Client c", Client.class).getResultList();
    }

    @GetMapping("/accounts")
    @ResponseBody
    public List<Cont> getAccounts() {
        return entityManager.createQuery("SELECT a FROM Cont a", Cont.class).getResultList();
    }

    @GetMapping("/transactions")
    @ResponseBody
    public List<Tranzactie> getTransactions() {
        return entityManager.createQuery("SELECT t FROM Tranzactie t", Tranzactie.class).getResultList();
    }
}
