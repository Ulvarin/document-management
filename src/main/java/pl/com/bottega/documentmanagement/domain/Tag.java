package pl.com.bottega.documentmanagement.domain;

/**
 * Created by ulvar on 30.07.2016.
 */

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Tag {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private Tag() {}

    public Tag(String name) {
        this.name = name;
    }

}