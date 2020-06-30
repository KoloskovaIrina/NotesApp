package root.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import  javax.persistence.Id;

@Entity
public class Category {
    @Id
    @GeneratedValue
    private  Long id;
    private  String name;

    public Category(){
    }

    public Category(String name){
        this(null, name);
    }

    public  Category(Long id, String name){
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
