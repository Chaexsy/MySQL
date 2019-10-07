package com.chaexsy.mysql.server.engine.basic.row;

import com.chaexsy.mysql.server.engine.basic.Field;

import java.io.Serializable;
import java.util.List;

/**
 * Compact格式的 行
 *
 * @author Chaexsy 2019-09-15 12:32
 */
public class Compact extends Row implements Serializable {
    private static final long serialVersionUID = -3769523711912096913L;

    /**
     * 变长字段长度列表
     *
     * 变长字段长度列表中只存储值为 非NULL 的列内容占用的长度，值为 NULL 的列的长度是不储存的
     */
    private byte[] variableFieldLengthList;

    /**
     * null 值列表
     */
    private byte[] nullFiledList;

    /**
     * 记录头信息
     */
    private byte[] header;

    /**
     * 字段列表
     */
    private List<Field> fieldList;


    public Compact(){

    }

    /**
     * 将 fieldList中的数据序列化成MySQL compact行格式
     */
    public void serialize(){
        int variableFieldNum = 0;
        int nullFieldNum = 0;

//        for(){
//
//        }
    }

    public byte[] getVariableFieldLengthList() {
        return variableFieldLengthList;
    }

    public void setVariableFieldLengthList(byte[] variableFieldLengthList) {
        this.variableFieldLengthList = variableFieldLengthList;
    }

    public byte[] getNullFiledList() {
        return nullFiledList;
    }

    public void setNullFiledList(byte[] nullFiledList) {
        this.nullFiledList = nullFiledList;
    }

    public byte[] getHeader() {
        return header;
    }

    public void setHeader(byte[] header) {
        this.header = header;
    }

    public List<Field> getFieldList() {
        return fieldList;
    }

    public void setFieldList(List<Field> fieldList) {
        this.fieldList = fieldList;
    }
}
