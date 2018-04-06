package ru.mephi.onlineplatform.repository.domain;

import ru.mephi.onlineplatform.entities.SystemRole;
import ru.mephi.onlineplatform.entities.User;
import ru.mephi.onlineplatform.repository.dao.UserDao;

import java.util.*;
import java.util.stream.Collectors;

public class UserDaoImpl implements UserDao {
    private Map<Long, User> userMap;
    private Long counterId = 0L;

    public UserDaoImpl() {
        this.userMap = new HashMap<>();
    }

    public User save(User user){
        user.setId(counterId++);
        userMap.put(user.getId(), user);
        return user;
    }

    public User edit(Long id, User user){
        if(userMap.containsKey(id)){
            userMap.put(id, user);
        }
        return user;
    }

    public User findById(Long id){
        return userMap.get(id);
    }

    public void delete(Long id){
        if(userMap.containsKey(id)) {
            userMap.remove(id);
        }
    }

    public List<User> selectByRole(SystemRole systemRole){
        return userMap
                .values()
                .stream()
                .filter(user -> Objects.equals(user.getUserRole(), systemRole))
                .collect(Collectors.toList());
    }
}
