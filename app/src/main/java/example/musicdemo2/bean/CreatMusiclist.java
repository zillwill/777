package example.musicdemo2.bean;

import java.io.Serializable;

/**
 * Created by Administrator on 2020/8/5.
 */

public class CreatMusiclist implements Serializable {


    private  int createrid;
    private String listname;

    public CreatMusiclist(int createrid, String listname) {
        this.createrid = createrid;
        this.listname = listname;
    }

    public void setCreater(int createrid) {
        this.createrid = createrid;
    }

    public void setListname(String listname) {
        this.listname = listname;
    }

    public int getCreaterid() {
        return createrid;
    }

    public String getListname() {
        return listname;
    }
}
