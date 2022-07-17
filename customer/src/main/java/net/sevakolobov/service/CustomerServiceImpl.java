package net.sevakolobov.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.sevakolobov.entity.CustomerEntity;
//import net.sevakolobov.mapper.CustomerMapper;
import net.sevakolobov.repository.CustomerRepository;
import net.sevakolobov.request.CustomerRegistrationRequest;
import org.springframework.stereotype.Service;

/**
 * @author sevakolobov on 01.06.2022.
 */

@Slf4j
@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService  {

    private final CustomerRepository customerRepository;
//    private final CustomerMapper customerMapper;

    @Override
    public void registerCustomer(CustomerRegistrationRequest request) {
        var customerEntity = new CustomerEntity();
        customerEntity.setId(request.getId());
        customerEntity.setEmail(request.getEmail());
        customerEntity.setFirstName(request.getFirstName());
        customerEntity.setLastName(request.getLastName());
        customerRepository.saveAndFlush(customerEntity);
        log.info("new customer registration {} ", request);
    }

}
