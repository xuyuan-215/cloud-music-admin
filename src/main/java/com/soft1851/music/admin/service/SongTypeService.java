package com.soft1851.music.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.soft1851.music.admin.common.ResponseResult;
import com.soft1851.music.admin.entity.SongType;
import org.springframework.data.domain.jaxb.SpringDataJaxb;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author mq_xu
 * @since 2020-04-22
 */
public interface SongTypeService extends IService<SongType> {
    /**
     * 分页查询.
     * @param pageDto
     * @return
     */
    List<SongType> getSongTypeByPage(SpringDataJaxb.PageDto pageDto);

    /**
     * 模糊查询
     * @param filed
     * @return
     */
    List<SongType> fuzzySearch(String filed);
    /**
     * 批量删除
     * @param idLists
     * @return
     */
    ResponseResult batchDeleteById(String idLists);
}
