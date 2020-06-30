package root.entity;

import javax.persistence.*;
import  java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

@Entity
public class Task {
    @Id
    @GeneratedValue
    private Long id;
    private Long parentId;
    private String title;
    private String description;
    private  Date date;
    private  Boolean done;

    public Task(){
    }


    public  Task(Long id, Long parentId, String title,String description, Date date, Boolean done){
        this.id = id;
        this.parentId = parentId;
        this.title = title;
        this.description = description;
        this.date = date;
        this.done = done;
    }


    public void setId(Long id){
        this.id = id;
    }

    public long getId(){
        return id;
    }

    public void setParentId(Long parentId){
        this.parentId = parentId;
    }

    public long getParentId(){
        return parentId;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }

    public void setDone(Boolean done){
        this.done = done;
    }

    public Boolean getDone(){
        return done;
    }

    public void setDate(Date date){
        this.date = date;
    }

    public Date getDate(){
        return date;
    }


}
