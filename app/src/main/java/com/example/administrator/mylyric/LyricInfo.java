package com.example.administrator.mylyric;

import java.util.List;

/**
 * Created by Administrator on 2017/9/1 0001.
 */

public class LyricInfo {
    List<LineInfo> song_lines;

    String song_artist;  // 歌手
    String song_title;  // 标题
    String song_album;  // 专辑
    long song_offset;  // 偏移量
}
