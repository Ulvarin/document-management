package pl.com.bottega.documentmanagement.domain;

import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import java.io.Serializable;

/**
 * Created by Ulvarin on 12.06.16.
 */
@Embeddable
public class EmployeeId implements Serializable {

    @GeneratedValue
    private Long id;

    private EmployeeId() {
    }

    public EmployeeId(Long id) {
        this.id = id;
    }

}