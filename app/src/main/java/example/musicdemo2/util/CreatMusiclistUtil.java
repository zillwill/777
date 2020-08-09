package example.musicdemo2.util;

import java.util.ArrayList;
import java.util.List;

import example.musicdemo2.bean.CreatMusiclist;

/**
 * Created by Administrator on 2020/8/5.
 */

public class CreatMusiclistUtil {
    public List<CreatMusiclist> cmlist;

    public List<CreatMusiclist> getcreatemusiclistdata(){
        cmlist=new ArrayList<CreatMusiclist>();

        cmlist.add(new CreatMusiclist(1,"测试歌单1"));
        cmlist.add(new CreatMusiclist(2,"测试歌单2"));

        return cmlist;

    }
}
