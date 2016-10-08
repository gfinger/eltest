package eltest;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Customer {

    @Id
    private Integer id;

    private String name;
}
