package eltest;

import javax.persistence.Entity;
import javax.persistence.Id;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@SuppressFBWarnings(justification="Lombok", value="ES_COMPARING_PARAMETER_STRING_WITH_EQ")
public class Customer {

    @Id
    private Integer id;

    private String name;
}
                