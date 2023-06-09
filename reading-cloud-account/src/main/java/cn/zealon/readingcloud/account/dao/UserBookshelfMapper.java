package cn.zealon.readingcloud.account.dao;

import cn.zealon.readingcloud.common.pojo.account.UserBookshelf;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 用户书架
 */
public interface UserBookshelfMapper {

    int deleteById(Integer id);

    int insert(UserBookshelf userBookshelf);

    int updateByUserIdAndBookId(UserBookshelf userBookshelf);

    int selectCountByUserAndBookId(@Param("userId") Integer userId,
                                   @Param("bookId") String bookId);

    UserBookshelf selectById(Integer id);

    List<UserBookshelf> findPageWithResult(@Param("userId") Integer userId);
}
