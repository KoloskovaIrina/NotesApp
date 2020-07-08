package root.entity;

import javax.persistence.*;
import java.util.Date;



@Entity
public class TaskE {
    @Id
    @GeneratedValue
    private Long id;
    private Long parentId;
    private String title;
    private String description;
    private Boolean done;
    private Date date;

    public TaskE(){

    }

    public TaskE(Long parentId, String title){
        this(null, parentId, title, null, false, null);
    }
    public TaskE(Long id, Long parentId, String title, String description, Boolean done, Date date) {
        this.id = id;
        this.parentId = parentId;
        this.title = title;
        this.description = description;
        this.done = done;
        this.date = date;
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

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "listId", nullable = false)
    private ListE list;

    public ListE getList() {
        return list;
    }

    public void setList(ListE list) {
        this.list = list;
    }
}