package net.sevakolobov.service;

import lombok.RequiredArgsConstructor;
import net.sevakolobov.mapper.CustomerMapper;
import net.sevakolobov.repository.CustomerRepository;
import net.sevakolobov.request.CustomerRegistrationRequest;
import org.springframework.stereotype.Service;

/**
 * @author sevakolobov on 01.06.2022.
 */
@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService  {

    private final CustomerRepository customerRepository;
    private final CustomerMapper customerMapper;

    @Override
    public void registerCustomer(CustomerRegistrationRequest request) {
        var customer = customerMapper.mapToEntity(request);
        customerRepository.save(customer);
    }

}
