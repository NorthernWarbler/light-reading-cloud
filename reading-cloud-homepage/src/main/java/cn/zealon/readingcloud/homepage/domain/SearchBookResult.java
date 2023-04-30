package cn.zealon.readingcloud.homepage.domain;

import lombok.Data;
import java.util.List;

/**
 * ES查询结果
 */
@Data
public class SearchBookResult {
    /** 图书列表 */
    private List<SearchBookItem> bookList;
    /** 返回总数 */
    private Long total;
}
