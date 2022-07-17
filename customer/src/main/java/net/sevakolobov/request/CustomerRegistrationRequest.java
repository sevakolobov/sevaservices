package net.sevakolobov.request;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author sevakolobov on 01.06.2022.
 */
@Data
@NoArgsConstructor
public class CustomerRegistrationRequest {
        Integer id;
        String firstName;
        String lastName;
        String email;
}
