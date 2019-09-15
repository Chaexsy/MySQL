package com.chaexsy.practise.mysql.server.engines.basic.row;

import com.chaexsy.practise.mysql.server.engines.basic.Field;

import java.io.Serializable;
import java.util.List;

/**
 * Compact 行格式
 *
 * @author Chaexsy 2019-09-15 12:32
 */
public class Compact implements Serializable {
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
}
