package com.soft1851.music.admin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.soft1851.music.admin.dto.TimeDto;
import com.soft1851.music.admin.entity.Song;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author mq_xu
 * @since 2020-04-22
 */
public interface SongMapper extends BaseMapper<Song> {
    /**
     * 查询： 根据state状态查询用户列表，分页显示
     * @param page 分页对象,xml中可以从里面进行取值,传递参数 Page 即自动分页,必须放在第一位(你可以继承Page实现自己的分页对象)
     * @param state 状态
     * @return 分页对象
     */
    IPage<Song> selectSongsByPage(Page<?> page, Integer state);

    /**
     *
     * @return
     */
    List<Song> getSongByTimeParagraph(@Param("timeDto") TimeDto timeDto);

}
