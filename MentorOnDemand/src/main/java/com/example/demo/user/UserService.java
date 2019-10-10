package com.example.demo.user;

import java.util.List;

public interface UserService {
  User create(User user);
  User delete(int id);
  List<User> findAll();
  User findById(int id);
  User update(User user);

  List<User> findByActive(Boolean active);
User validateuser(String userName, String password);
User updates(User user);
}
