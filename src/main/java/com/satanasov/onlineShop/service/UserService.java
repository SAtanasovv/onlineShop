package com.satanasov.onlineShop.service;

import com.satanasov.onlineShop.model.ShoppingCart;
import com.satanasov.onlineShop.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    void createUser(User user);
    void updateUser(User user);
    User getUserById(Long userId);
    List<User> getAllUsers();
    void deleteUserById(Long userId);
}
