package net.sevakolobov.repository;

import net.sevakolobov.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author sevakolobov on 16.07.2022.
 */
public interface CustomerRepository extends JpaRepository<CustomerEntity, Integer> {

}
