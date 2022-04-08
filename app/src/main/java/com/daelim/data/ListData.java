package com.daelim.data;

public class ListData {
    String tv_1, tv_2;
    Boolean bl;

    public ListData(String str, String str2, Boolean b){
        tv_1 = str;
        tv_2 = str2;
        bl = b;
    }

    public String getTv_1(){
        return tv_1;
    }
    public String getTv_2(){
        return tv_2;
    }
    public Boolean getBle(){
        return bl;
    }

}
