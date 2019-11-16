package model;

import javax.persistence.*;

@Entity
@Table(name = "new_entity")
public class NewEntity {
   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "existing_tbl_id")
    private ExistingEntity existingEntity;

    public ExistingEntity getExistingEntity() {
        return existingEntity;
    }

    public void setExistingEntity(ExistingEntity existingEntity) {
        this.existingEntity = existingEntity;
    }

}