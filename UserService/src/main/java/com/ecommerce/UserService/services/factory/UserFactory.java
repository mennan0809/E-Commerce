package com.ecommerce.UserService.services.factory;

import com.ecommerce.UserService.models.User;

public abstract class UserFactory {
    public abstract User create(Object userData);
}
