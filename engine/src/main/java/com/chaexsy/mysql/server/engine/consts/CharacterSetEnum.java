package com.chaexsy.mysql.server.engine.consts;

/**
 * 支持的字符集
 *
 * @author Chaexsy 2019-09-16 0:09
 */
public enum CharacterSetEnum {
    UTF8("utf-8");


    private String code;

    CharacterSetEnum(String code){
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
