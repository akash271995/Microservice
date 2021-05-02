package com.user.service;

import com.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    //fake user list
	//jdk 11

//    List<User> list = List.of(
//            new User(1311L, "Durgesh Tiwari", "23525625"),
//            new User(1312L, "Ankit Tiwari", "99999"),
//            new User(1314L, "Ravi Tiwari", "888")
//    );

    @Override
    public User getUser(Long id) {
    	//akash
    	User u=new User(1311L, "Durgesh Tiwari", "23525625");
    	User u1=new User(1312L, "Ankit Tiwari", "99999");
    	User u2=new User(1314L, "Ravi Tiwari", "888");
    	
    	List<User> list=new ArrayList<User>();
    	list.add(u);
    	list.add(u1);
    	list.add(u2);
    	
    	
    	
    	
        return list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }
}
