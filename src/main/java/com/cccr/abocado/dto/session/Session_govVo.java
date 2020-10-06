package com.cccr.abocado.dto.session;


//로그인시 세션에 저장할 보건복지부vo 정보입니다
public class Session_govVo {
    private String gov_idx; //보건부 고유키
    private String gov_id;  //보건부 아이디
   


    public Session_govVo(){}

    public Session_govVo(String gov_idx, String gov_id){

        super();
        
        this.gov_idx = gov_idx;
        this.gov_id = gov_id;
    }

    //getter setter method
    public String getGov_idx() {
        return this.gov_idx;
    }

    public void setGov_idx(String gov_idx) {
        this.gov_idx = gov_idx;
    }

    public String getGov_id() {
        return this.gov_id;
    }

    public void setGov_id(String gov_id) {
        this.gov_id = gov_id;
    }

   
}
