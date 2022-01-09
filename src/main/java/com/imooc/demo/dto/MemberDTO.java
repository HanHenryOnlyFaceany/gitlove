package com.imooc.demo.dto;

import java.util.Objects;

public class MemberDTO {
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String id;

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("MemberDTO{");
        sb.append("id='").append(id).append('\'');
        sb.append(", loginName='").append(loginName).append('\'');
        sb.append(", logintest='").append(logintest).append('\'');
        sb.append('}');
        return sb.toString();
    }

    private String loginName;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MemberDTO memberDTO = (MemberDTO) o;
        return id.equals(memberDTO.id) &&
                loginName.equals(memberDTO.loginName) &&
                logintest.equals(memberDTO.logintest);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, loginName, logintest);
    }

    public MemberDTO(String id, String loginName, String logintest) {
        this.id = id;
        this.loginName = loginName;
        this.logintest = logintest;
    }

    public String getLogintest() {
        return logintest;
    }

    public void setLogintest(String logintest) {
        this.logintest = logintest;
    }

    private String logintest;


}
