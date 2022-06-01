package net.sevakolobov.controller;

import lombok.extern.slf4j.Slf4j;
import net.sevakolobov.request.CustomerRegistrationRequest;
import net.sevakolobov.service.CustomerService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sevakolobov on 01.06.2022.
 */
@Slf4j
@RestController
@RequestMapping("api/v1/customers")
public record CustomerController(CustomerService customerService) {

    public void registerCustomer(@RequestBody CustomerRegistrationRequest customerRequest) {
        log.info("new customer registration {} ", customerRequest);
    }

}
