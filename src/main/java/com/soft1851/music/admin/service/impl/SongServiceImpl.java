package com.soft1851.music.admin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.soft1851.music.admin.entity.Song;
import com.soft1851.music.admin.mapper.SongMapper;
import com.soft1851.music.admin.service.SongService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author mq_xu
 * @since 2020-04-22
 */
@Service
public class SongServiceImpl extends ServiceImpl<SongMapper, Song> implements SongService {
    @Resource
    private SongMapper songMapper;

    @Override
    public List<Song> selectAll() {
        QueryWrapper<Song> wrapper = new QueryWrapper<>();
        return songMapper.selectList(wrapper);
    }

    @Override
    public List<Song> getSongBy(String field) {
        QueryWrapper<Song> wrapper = new QueryWrapper<>();
        //根据歌手名称或歌名模糊查询，根据播放量降序排列
        wrapper.like("singer", field)
                .or()
                .like("song_name", field)
                .or()
                .eq("song_id", field)
                .orderByDesc("play_count");
        return songMapper.selectList(wrapper);
    }

    @Override
    public List<Song> getPage(int current, int size) {
        Page<Song> page = new Page<>(current, size);
        QueryWrapper<Song> wrapper = new QueryWrapper<>();
        IPage<Song> iPage = songMapper.selectPage(page, wrapper);
        return iPage.getRecords();
    }
}
