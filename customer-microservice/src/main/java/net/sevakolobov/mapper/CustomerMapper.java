package net.sevakolobov.mapper;

import net.sevakolobov.entity.CustomerEntity;
import net.sevakolobov.request.CustomerRegistrationRequest;
import org.mapstruct.*;

/**
 * @author sevakolobov on 16.07.2022.
 */
@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.WARN)
public interface CustomerMapper {

    @Mapping(source = "firstName", target = "firstName")
    @Mapping(source = "lastName", target = "lastName")
    @Mapping(source = "email", target = "email")
    CustomerEntity mapToEntity(CustomerRegistrationRequest request);

}
