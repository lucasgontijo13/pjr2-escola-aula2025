package br.edu.ifmg.escola.entities;


import br.edu.ifmg.escola.entities.pk.EnrollmentPk;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.grammars.hql.HqlParser;

import java.time.Instant;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name = "tb_enrollment")
@Entity
public class Enrollment {
    @EmbeddedId
    private EnrollmentPk id = new EnrollmentPk();
    private Instant enrollment;
    private Instant refundMoment;
    private boolean available;
    private boolean onlyUpdate;

    @ManyToMany(fetch = FetchType.LAZY)
    private Set<Lesson> lessonsDone = new HashSet<>();

    @OneToMany(mappedBy = "enrollment")
    private List<Deliver> deliveries = new ArrayList<>();

    public User getUser() {return id.getUser();}
    public void setUser(User user) {id.setUser(user);}

    public Offer getOffer() {return id.getOffer();}
    public void setOffer(Offer offer) {id.setOffer(offer);}

    public Enrollment(User user, Offer offer,Instant enrollment, Instant refundMoment, boolean available, boolean onlyUpdate) {
        this.id.setUser(user);
        this.id.setOffer(offer);
        this.enrollment = enrollment;
        this.refundMoment = refundMoment;
        this.available = available;
        this.onlyUpdate = onlyUpdate;
    }
}
