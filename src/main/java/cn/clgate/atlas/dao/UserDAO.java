package cn.clgate.atlas.dao;

import cn.clgate.atlas.domain.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by zhangbin on 17/2/15.
 */
public interface UserDAO {
    User getUser (int userId);
}
