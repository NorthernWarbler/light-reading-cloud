package cn.zealon.readingcloud.homepage.vo;

import lombok.Data;
import java.io.Serializable;
import java.util.Date;

/**
 * 图书详情VO
 */
@Data
public class BookVO implements Serializable {

    private static final Long serialVersionUID = 1L;

    private String bookId;
    private String bookName;
    private String introduction;
    private String imgUrl;
    private Integer authorId;
    private String authorName;
    private Integer categoryId;
    private String categoryName;
    private String keyword;
    private Date lastUpdateChapterDate;
    private String lastUpdateChapterName;
    private Long lastUpdateChapterId;
    private Integer wordCount;
}
