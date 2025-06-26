package br.edu.ifmg.escola.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CollectionIdJdbcTypeCode;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "tb_task")
public class Task  extends  Lesson {
    private String description;
    private Integer questionCount;
    private Integer aprovalCount;

    private Double weight;
    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private String dueDate;
}
