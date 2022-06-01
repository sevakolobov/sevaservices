package net.sevakolobov.request;

/**
 * @author sevakolobov on 01.06.2022.
 */
public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}
