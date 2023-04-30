package cn.zealon.readingcloud.homepage.dao;

import cn.zealon.readingcloud.common.pojo.index.IndexBooklist;

/**
 * 书单配置
 */
public interface IndexBooklistMapper {

    IndexBooklist selectById(Integer id);
}
