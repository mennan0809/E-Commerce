package com.ecommerce.UserService.services.factory;

import com.ecommerce.UserService.models.MerchantProfile;
import com.ecommerce.UserService.models.User;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MerchantFactory extends UserFactory {
    @Override
    public User create(Object userData) {
        ObjectMapper mapper = new ObjectMapper();
        MerchantProfile profile = mapper.convertValue(userData, MerchantProfile.class);
        return MerchantProfile.create(profile);
    }
}

