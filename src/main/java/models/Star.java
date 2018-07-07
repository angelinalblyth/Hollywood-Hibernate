package models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "stars")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Star {

    private int id;
    private String name;
    private List<Film> films;
    private int wallet;
    private int pay;

    public Star() {
    }

    public Star(String name, int pay) {
        this.name = name;
        this.films = new ArrayList<Film>();
        this.wallet = 0;
        this.pay = pay;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "wallet")
    public int getWallet() {
        return wallet;
    }

    public void setWallet(int wallet) {
        this.wallet = wallet;
    }

    @Column(name = "pay")
    public int getPay() {
        return pay;
    }

    public void setPay(int pay) {
        this.pay = pay;
    }
}

