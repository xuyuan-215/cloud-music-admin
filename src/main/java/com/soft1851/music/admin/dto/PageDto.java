package com.soft1851.music.admin.dto;

import lombok.Builder;
import lombok.Data;

/**
 * @Author xuyuan
 * @Date 2020/4/25 9:32
 * @Version 1.0
 */
@Data
@Builder
public class PageDto {
    private Object field;
    private int currentPage;
    private int pageSize;
}
