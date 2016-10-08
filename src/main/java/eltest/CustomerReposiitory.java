package eltest;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerReposiitory extends JpaRepository<Customer, Integer> {

}
