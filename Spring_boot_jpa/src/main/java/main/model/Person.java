package main.model;


import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.io.Serializable;

@Entity
public class Person implements Serializable {

    @EmbeddedId
    PersonEmbeddedKey personEmbeddedKey;
    private Integer age;

    public PersonEmbeddedKey getPersonEmbeddedKey() {
        return personEmbeddedKey;
    }

    public Integer getAge() {
        return age;
    }

    public void setPersonEmbeddedKey(PersonEmbeddedKey personEmbeddedKey) {
        this.personEmbeddedKey = personEmbeddedKey;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
