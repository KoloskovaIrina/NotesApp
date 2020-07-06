package root.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class ListE {
    @Id
    @GeneratedValue
    private  Long id;
    private  String name;

    public ListE(){
    }

    public ListE(String name) {
        this (null, name);
    }

    public ListE(Long id, String name){
        this.id = id;
        this.name = name;
    }
    public  void  setId(Long uid){
        this.id = uid;
    }

    public Long getId(){
        return id;
    }

    public void setName(String name){
        this.name = name;
    }

    public  String getName(){
        return name;
    }


}
