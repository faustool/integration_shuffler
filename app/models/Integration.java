package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import play.db.ebean.Model;

@SuppressWarnings("serial")
@Entity
public class Integration extends Model {
    @Id
    private Integer id;

    @Column
    private String name;

    @Column(length = 100)
    private String complexityDescription;

    @Column(length = 50)
    private String priorityDescription;

    public Integer getId() {
	return id;
    }

    public void setId(Integer id) {
	this.id = id;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getComplexityDescription() {
	return complexityDescription;
    }

    public void setComplexityDescription(String complexityDescription) {
	this.complexityDescription = complexityDescription;
    }

    public String getPriorityDescription() {
	return priorityDescription;
    }

    public void setPriorityDescription(String priorityDescription) {
	this.priorityDescription = priorityDescription;
    }

}
