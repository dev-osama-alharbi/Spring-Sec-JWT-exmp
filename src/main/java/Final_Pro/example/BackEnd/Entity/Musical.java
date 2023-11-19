package Final_Pro.example.BackEnd.Entity;


import jakarta.persistence.*;
@Entity
@Table(name = "Musical")
public class Musical {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int mu_id;


    private String nameTools;

    private String dataCrate;

    private String describeText;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    public Musical() {
    }

    public int getMu_id() {
        return mu_id;
    }

    public void setMu_id(int mu_id) {
        this.mu_id = mu_id;
    }

    public String getNameTools() {
        return nameTools;
    }

    public void setNameTools(String nameTools) {
        this.nameTools = nameTools;
    }

    public String getDataCrate() {
        return dataCrate;
    }

    public void setDataCrate(String dataCrate) {
        this.dataCrate = dataCrate;
    }

    public String getDescribe() {
        return describeText;
    }

    public void setDescribe(String describe) {
        this.describeText = describe;
    }





    public Musical(int mu_id, String nameTools, String dataCrate, String describeText) {
        this.mu_id = mu_id;
        this.nameTools = nameTools;
        this.dataCrate = dataCrate;
        this.describeText = describeText;
    }
}
