package com.chaexsy.practise.mysql.server.engines.basic;

import com.chaexsy.practise.mysql.server.consts.DataTypeEnum;

/**
 * 字段
 *
 * @author Chaexsy 2019-09-15 14:03
 */
public class Field<T> {
    private DataTypeEnum type;
    private T value;

    /**
     * 字段长度
     */
    private int length;

    /**
     * 小数位长度
     */
    private int decimals;

    /**
     * 是否不允许为空
     */
    private boolean isNotNull;

    /**
     * 是否是主键
     */
    private boolean isPrimaryKey;



    public DataTypeEnum getType() {
        return type;
    }

    public void setType(DataTypeEnum type) {
        this.type = type;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getDecimals() {
        return decimals;
    }

    public void setDecimals(int decimals) {
        this.decimals = decimals;
    }

    public boolean isNotNull() {
        return isNotNull;
    }

    public void setNotNull(boolean notNull) {
        isNotNull = notNull;
    }

    public boolean isPrimaryKey() {
        return isPrimaryKey;
    }

    public void setPrimaryKey(boolean primaryKey) {
        isPrimaryKey = primaryKey;
    }
}
