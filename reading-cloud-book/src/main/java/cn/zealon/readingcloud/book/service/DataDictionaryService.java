package cn.zealon.readingcloud.book.service;

import cn.zealon.readingcloud.common.pojo.book.DataDictionary;
import java.util.Map;

/**
 * 字典服务
 */
public interface DataDictionaryService {
    Map<String, DataDictionary> getDictionarys(String dicType, String field);
}
