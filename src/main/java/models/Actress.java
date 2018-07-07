package models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "actresses")
public class Actress extends Star{

    public Actress() {
    }

    public Actress(String name, int pay) {
        super(name, pay);
    }
}
