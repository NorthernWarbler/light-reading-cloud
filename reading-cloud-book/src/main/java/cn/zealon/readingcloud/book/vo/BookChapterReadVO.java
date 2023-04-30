package cn.zealon.readingcloud.book.vo;

import lombok.Data;

/**
 * 章节阅读VO
 */
@Data
public class BookChapterReadVO {
    private BookChapterVO current;
    private BookChapterVO pre;
    private BookChapterVO next;
}
