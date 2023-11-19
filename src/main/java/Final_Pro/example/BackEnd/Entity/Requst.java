package Final_Pro.example.BackEnd.Entity;
import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;

@Entity
@Table(name = "Requset")
public class Requst {

    public int getRe_id() {
        return re_id;
    }

    public void setRe_id(int re_id) {
        this.re_id = re_id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Musical getMusical() {
        return musical;
    }

    public void setMusical(Musical musical) {
        this.musical = musical;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int re_id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "musical_id", nullable = false)
    private Musical musical;
    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    private Date requestDate;

    public Requst() {
    }

    public Requst(User user, Musical musical) {
        this.user = user;
        this.musical = musical;
    }


}
