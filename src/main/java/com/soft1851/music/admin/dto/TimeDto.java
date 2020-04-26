package com.soft1851.music.admin.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author xuyuan
 * @Date 2020/4/26 17:23
 * @Version 1.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TimeDto {
    private String week;
    private String month;
    private String quarter;
    private String yesterday;

}
