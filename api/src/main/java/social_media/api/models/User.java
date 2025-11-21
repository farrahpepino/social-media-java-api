package social_media.api.models;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)

public abstract class User {
    @Id
    @GeneratedValue(generator = "UUID")
    @Column(updatable = false, nullable = false, length=36)
    private String id = UUID.randomUUID().toString();

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable=false, unique=true)
    private String email;

    @Column(nullable=false)
    private String password;

    public User(String id, String username, String email, String password){
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public String getId(){ return id;}
    public String getUsername(){ return username;}
    public String getEmail(){ return email;}
    public String getPassword(){ return password;}

    public void setUsername(String username){this.username=username;}
    public void setEmail(String email){this.email=email;}
    public void setPassword(String password){this.password=password;}


}
