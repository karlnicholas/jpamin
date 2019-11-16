package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "existing_entity")
public class ExistingEntity {
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

    @OneToMany(mappedBy = "existingEntity", 
            cascade = CascadeType.ALL, 
            fetch = FetchType.EAGER)
    private List<NewEntity> newEntities = new ArrayList<>();


    public List<NewEntity> getNewEntities() {
        return newEntities;
    }

    public void setNewEntities(List<NewEntity> newEntities) {
        newEntities.forEach(newEntity -> 
        newEntity.setExistingEntity(this)
        );
        this.newEntities = newEntities;
    }

    public void addNewEntities(NewEntity newEntity) {
        if (newEntity != null) {
            newEntity.setExistingEntity(this);
            newEntities.add(newEntity);
        }
    }
}