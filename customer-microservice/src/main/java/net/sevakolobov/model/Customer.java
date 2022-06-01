package net.sevakolobov.model;

import lombok.Builder;
import lombok.Data;

/**
 * @author sevakolobov on 01.06.2022.
 */
@Builder
public record Customer(
        Integer id,
        String firstName,
        String lastName,
        String email) {
}
