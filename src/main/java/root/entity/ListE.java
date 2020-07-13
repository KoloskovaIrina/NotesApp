package root.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;
import java.util.*;

@Entity
public class ListE {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

    public ListE() {

    }

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

    public void setName(String name){
        this.name = name;
    }

    public Long getId(){
        return id;
    }

    public String getName(){
        return name;
    }



}
