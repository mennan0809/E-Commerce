package com.ecommerce.UserService.services.factory;

import com.ecommerce.UserService.models.CustomerProfile;
import com.ecommerce.UserService.models.User;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CustomerFactory extends UserFactory {
    @Override
    public User create(Object userData) {
        ObjectMapper mapper = new ObjectMapper();
        CustomerProfile profile = mapper.convertValue(userData, CustomerProfile.class);
        return CustomerProfile.create(profile);
    }
}

