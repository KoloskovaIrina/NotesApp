package root.entity;

import javax.persistence.*;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class TaskE {

    @Id
    @GeneratedValue
    private Long id;
    private Long parentId;
    private String title;
    private String description;
    private Boolean done;
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateDate;
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "listId", nullable = false)
    private ListE list;

    public TaskE(){
    }

    public TaskE(Long parentId, String title){
        this(null, parentId, title, null, false, null, null, null);
    }
    public TaskE(Long id, Long parentId, String title, String description, Boolean done, Date createDate, Date updateDate, Date date) {
        this.id = id;
        this.parentId = parentId;
        this.title = title;
        this.description = description;
        this.done = done;
        this.createDate = createDate;
        this.updateDate = updateDate;
        this.date = date;
    }

    public void setId(Long id){
        this.id = id;
    }

    public Long getId(){
        return id;
    }

    public void setParentId(Long parentId){
        this.parentId = parentId;
    }

    public Long getParentId(){
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

    @JsonIgnore
    public void setList(ListE list){
        this.list = list;
    }

    public Long getListId(){
        return list.getId();
    }

    public String getListName(){
        return list.getName();
    }


}