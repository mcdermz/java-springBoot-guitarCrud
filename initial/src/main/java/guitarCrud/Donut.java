package guitarCrud;


import javax.persistence.*;

/**
 * Created by seanmcdermott on 5/23/17.
 */
@Entity
@Table(name = "donuts")
public class Donut {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String flavor;
    private String mouthfeel;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getMouthfeel() {
        return mouthfeel;
    }

    public void setMouthfeel(String mouthfeel) {
        this.mouthfeel = mouthfeel;
    }
}
