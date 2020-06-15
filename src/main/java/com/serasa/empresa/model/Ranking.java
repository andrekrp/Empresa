package com.serasa.empresa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Ranking implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    private Integer Ranking;

    public  Ranking (){

    }

    public Ranking(long id, Integer ranking) {
       super();
        this.id = id;
        Ranking = ranking;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Integer getRanking() {
        return Ranking;
    }

    public void setRanking(Integer ranking) {
        Ranking = ranking;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ranking)) return false;

        Ranking ranking = (Ranking) o;

        return getId() == ranking.getId();
    }

    @Override
    public int hashCode() {
        return (int) (getId() ^ (getId() >>> 32));
    }

    @Override
    public String toString() {
        return "Ranking{" +
                "id=" + id +
                ", Ranking=" + Ranking +
                '}';
    }
}
