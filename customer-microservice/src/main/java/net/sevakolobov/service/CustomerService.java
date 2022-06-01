package net.sevakolobov.service;

import net.sevakolobov.model.Customer;
import net.sevakolobov.request.CustomerRegistrationRequest;
import org.springframework.stereotype.Service;

/**
 * @author sevakolobov on 01.06.2022.
 */
@Service
public record CustomerService() {

    public void registerCustomer(CustomerRegistrationRequest request) {
        Customer customer = Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();
    }

}
