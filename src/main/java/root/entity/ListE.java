package root.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class ListE {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

    public ListE() {}

    public ListE(String name) {
        this (null, name);
    }

    public ListE(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setId(Long id){
        this.id = id;
    }

    public Long getId(){
        return id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "list")
    private Set<TaskE> tasks;

    public Set<TaskE> getTask() {
        return tasks;
    }

    public void setTask(Set<TaskE> tasks) {
        this.tasks = tasks;
    }
}
