package cn.clgate.atlas.service;

import cn.clgate.atlas.dao.UserDAO;
import cn.clgate.atlas.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zhangbin on 17/2/15.
 */
@Service
public class UserService {
    @Autowired
    private UserDAO userDAO;

    public User doSomeBusinessStuff(int userId) {
        return this.userDAO.getUser(userId);
    }

}
