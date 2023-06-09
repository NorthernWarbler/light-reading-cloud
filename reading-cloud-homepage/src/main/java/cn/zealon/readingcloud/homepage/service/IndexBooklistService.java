package cn.zealon.readingcloud.homepage.service;

import cn.zealon.readingcloud.common.pojo.index.IndexBooklist;
import cn.zealon.readingcloud.homepage.vo.IndexBooklistVO;

/**
 * 书单服务
 */
public interface IndexBooklistService {

    /**
     * 获取书单VO
     * @param booklistId
     * @param clientRandomNumber
     * @return
     */
    IndexBooklistVO getIndexBooklistVO(Integer booklistId, Integer clientRandomNumber);

    /**
     * 查询书单信息
     * @param booklistId
     * @return
     */
    IndexBooklist getIndexBooklistById(Integer booklistId);

    /**
     * 获取随机榜单VO
     * @param booklist
     * @param clientRandomNumber
     * @return
     */
    IndexBooklistVO getRandomIndexBooklistVO(IndexBooklist booklist, Integer clientRandomNumber);
}
