package com.soft1851.music.admin.service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * @Author xuyuan
 * @Date 2020/4/26 19:00
 * @Version 1.0
 */
@SpringBootTest
class SongListServiceTest {
    @Resource
    private SongListService songListService;
    @Test
    void getByType() {
        System.out.println(songListService.getByType());
    }

    @Test
    void blurSelect() {
        System.out.println(songListService.blurSelect("林俊杰"));
    }

    @Test
    void getByPage() {
        int current = 10;
        int size = 10;
        System.out.println(songListService.getByPage(current,size));
    }

    @Test
    void selectAll() {
        System.out.println(songListService.selectAll());
    }
}