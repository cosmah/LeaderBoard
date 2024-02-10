package backend.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
@Document(collection = "tasks")
public class Tasks {
    @Id
    private String id;
    private String uname;
    private int number;

    public Tasks() {
    }

    public Tasks(String uname, int number){
        this.uname = uname;
        this.number = number;
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getuName(){
        return uname;
    }

    public void setUname(String uname){
        this.uname = uname;
    }

    public int getNumber(){
        return number;
    }

    public void setNumber(int number){
        this.number = number;
    }

    
}
