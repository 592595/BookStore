package com.pan.service.Impl;

import com.pan.mapper.BooksMesMapper;
import com.pan.mapper.OrdersMesMapper;
import com.pan.mapper.ShoppingcartMesMapper;
import com.pan.mapper.UserMapper;
import com.pan.model.BooksMes;
import com.pan.model.OrdersMes;
import com.pan.model.ShoppingcartMes;
import com.pan.model.User;
import com.pan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper usersMapper;
    @Autowired
    private OrdersMesMapper ordersmesmapper;

    @Autowired
    private ShoppingcartMesMapper shoppingcartMesMapper;

    @Autowired
    BooksMesMapper booksMesMapper;


    @Override
    public List<Object> findAllUsers() {
        return null;
    }

    @Override
    public User findUserById(Integer id) {
        return null;
    }

    @Override
    public void insertSelective(User user) {
        usersMapper.insertSelective(user);
    }

    @Override
    public List<User> findUserByNameL(String username) {
        List<User> list = null;
        list =(List<User>) usersMapper.findUserByNameL(username);
        return list;

    }

    @Override
    public String findIdByUsername(String username) {
        String id=usersMapper.findIdByUsername(username);
        return id;
    }

    @Override
    public void insertuser(User user) {
        usersMapper.insertSelective(user);
    }

    @Override
    public List<OrdersMes> findUserOrderMesL(String idBuyer) {
        List<OrdersMes> list = null;
        list =(List<OrdersMes>) ordersmesmapper.selectByPrimaryKeyL(idBuyer);
        return list;
    }

    @Override
    public User checkLogin(String username, String password) {

        User user = usersMapper.findUserByName(username);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }

    @Override
    public User findUserByusername(String username) {
        User user =usersMapper.findUserByName(username);
        return user;
    }

    @Override
    public void insertAddress(String addressBuyer,String username ) {

        usersMapper.insertAddress(addressBuyer,username);
    }

    @Override
    public void updateUserPwd(String username, String password) {
        usersMapper.updateUserPwd(username,password);
    }

    @Override
    public Boolean addShappingCart(String userid, String bookid) {
        ShoppingcartMes shoppingcartMes = new ShoppingcartMes();
        shoppingcartMes.setIdBook(bookid);
        shoppingcartMes.setIdBuyer(userid);
        try {
            shoppingcartMesMapper.insert(shoppingcartMes);
            return true;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public List<BooksMes> getBooklist(String userid) {
        List<ShoppingcartMes> shoppingcartMesList = shoppingcartMesMapper.selectByPrimaryKey(userid);
        List<BooksMes> list = new ArrayList<>();
        for (ShoppingcartMes shop :
                shoppingcartMesList) {
            BooksMes booksMes = booksMesMapper.selectByPrimaryKey(shop.getIdBook());
            list.add(booksMes);
        }
      //  System.out.println(shoppingcartMes);
        return list;
    }

    @Override
    public Boolean addOrder(String userid, String bookid) {
        OrdersMes order = new OrdersMes();
        order.setIdBook(bookid);
        BooksMes booksMes = booksMesMapper.selectByPrimaryKey(bookid);
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
        java.util.Date date = new java.util.Date(System.currentTimeMillis());
        order.setIdSeller(userid);
        order.setIdBuyer(userid);
        order.setIdOrder(formatter.format(date));
        order.setSumBook(1);
        order.setPriceBook(booksMes.getPriceBook());
        order.setPriceOrder(booksMes.getPriceBook());
        order.setNameBook(booksMes.getNameBook());
        order.setAddressBuyer("内蒙古大学");
        order.setTimeOrder(new Date(System.currentTimeMillis()));
        try{
            ordersmesmapper.insert(order);
            return true;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return false;
        }

    }
}
