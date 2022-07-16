package net.sevakolobov.service;

import net.sevakolobov.request.CustomerRegistrationRequest;

/**
 * @author sevakolobov on 16.07.2022.
 */
public interface CustomerService {

    void registerCustomer(CustomerRegistrationRequest request);

}
