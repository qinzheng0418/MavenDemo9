package service;


import dao.UserDao;
import domain.User;

import java.util.List;

public class UserService {
    public List<User> findAllUser() throws Exception {
        UserDao dao = new UserDao();

       List<User> list=dao.findAllUser();
        return list;
    }
}
