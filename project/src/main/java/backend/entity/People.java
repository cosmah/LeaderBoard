package backend.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
@Document(collection = "myCollection")
public class People {

    @Id
    private String id;
    private String uname;
    private short age;
    private String email;
    private String password;

    public People() {
    }

    public People(String uname, short age, String email, String password){
        this.uname = uname;
        this.age = age;
        this.email = email;
        this.password = password;
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

    public short getAge(){
        return age;
    }

    public void setAge(short age){
        this.age = age;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    

}



