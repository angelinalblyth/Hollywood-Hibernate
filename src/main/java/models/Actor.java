package models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "actors")
public class Actor extends Star{

    public Actor() {
    }

    public Actor(String name, int pay) {
        super(name, pay);
    }
}
