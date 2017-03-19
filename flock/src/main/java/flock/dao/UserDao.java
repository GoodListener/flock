package flock.dao;

import java.util.List;

import flock.domain.User;

public interface UserDao {
  List<User> selectList();

  User selectOne(int seq);

}
