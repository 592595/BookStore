package com.pan.service;

import com.pan.model.BooksMes;
import com.pan.model.OrdersMes;
import com.pan.model.User;

import java.util.List;

public interface UserService {
    public List<Object> findAllUsers();

    public User findUserById(Integer id);

    void insertSelective(User user);

    void insertuser(User user);

    List<User> findUserByNameL(String username);

    String findIdByUsername(String username);

    List<OrdersMes> findUserOrderMesL(String idBuyer);

    User checkLogin(String username, String password);

    User findUserByusername(String username);

    void insertAddress(String addressBuyer, String username);

    void updateUserPwd(String usernmae, String password);

    public Boolean addShappingCart(String userid, String bookid);

    public List<BooksMes> getBooklist(String userid);


    public Boolean addOrder(String userid, String bookid);
}
