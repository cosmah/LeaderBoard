package backend.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
@Document(collection = "performance")
public class Performance {
    @Id
    private String id;
    private String uname;
    private String credits;
    private String rank;

    public Performance() {
    }

    public Performance(String uname, String credits, String rank){
        this.uname = uname;
        this.credits = credits;
        this.rank = rank;
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

    public String getCredits(){
        return credits;
    }

    public void setCredits(String credits){
        this.credits = credits;
    }

    public String getRank(){
        return rank;
    }

    public void setRank(String rank){
        this.rank = rank;
    }

    
}
