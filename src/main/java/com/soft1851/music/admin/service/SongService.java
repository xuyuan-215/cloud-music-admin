package com.soft1851.music.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.soft1851.music.admin.entity.Song;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author mq_xu
 * @since 2020-04-22
 */
public interface SongService extends IService<Song> {
    /**
     * 查询所有歌曲
     * @return
     */
    List<Song> selectAll();

    /**
     * 模糊查询歌曲
     * @return
     */
    List<Song> getSongBy(String filed);

    /**
     * 分页查询歌曲
     * @param current
     * @param size
     * @return
     */
    List<Song> getPage(int current,int size);

}
