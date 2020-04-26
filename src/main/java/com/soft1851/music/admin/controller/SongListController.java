package com.soft1851.music.admin.controller;


import com.soft1851.music.admin.entity.SongList;
import com.soft1851.music.admin.service.SongListService;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author mq_xu
 * @since 2020-04-22
 */
@RestController
@Slf4j
@RequestMapping("/songList")
public class SongListController {
    @Resource
    private SongListService songListService;

    @GetMapping("/list")
    public List<Map<String, Object>> selectAll() {
        return songListService.selectAll();
    }

    @GetMapping("/page")
    public List<SongList> getByPage(@Param("currentPage") int currentPage, @Param("size") int size) {
        return songListService.getByPage(currentPage, size);
    }

    @GetMapping("/blur")
    public List<SongList> blurSelectSongList(@Param("field") String field) {
        return songListService.blurSelect(field);
    }

    @GetMapping("/type")
    public List<Map<String, Object>> getByType(){
        return songListService.getByType();
    }
//
//    /**
//     * 根绝歌单id删除歌单数据
//     * @param id
//     * @return
//     */
//    @DeleteMapping("/delete")
//    ResponseResult deleteSongListById(@Param("id") String id){
//        return songListService.deleteSongList(id);
//    }
//
//    /**
//     * 修改歌单信息
//     * @param songList
//     * @return
//     */
//    @PutMapping("/update")
//    ResponseResult updateSongList(@RequestBody SongList songList){
//        return songListService.updateSongList(songList);
//    }
//
//    @DeleteMapping("/batchDelete")
//    ResponseResult batchDeleteById(@Param("ids") String ids){
//        return songListService.batchDeleteById(ids);
//    }
}
