package br.com.scardofax.scfxfutebolapi.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name="t_entrys")
public class Entry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    private Date date;

    @ManyToOne
    private Player player;

    @ManyToOne
    @NotNull
    private TypeExpenseIncome typeExpenseIncome;

    @NotNull
    private Float value;

    @NotNull
    private Boolean isPaid = false;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public TypeExpenseIncome getTypeExpenseIncome() {
        return typeExpenseIncome;
    }

    public void setTypeExpenseIncome(TypeExpenseIncome typeExpenseIncome) {
        this.typeExpenseIncome = typeExpenseIncome;
    }

    public Float getValue() {
        return value;
    }

    public void setValue(Float value) {
        this.value = value;
    }

    public Boolean getPaid() {
        return isPaid;
    }

    public void setPaid(Boolean paid) {
        isPaid = paid;
    }
}
