package com.chaexsy.mysql.server.engine.consts;

/**
 * 数据类型枚举类
 *
 * 1~10 是数字类型
 * 21~25是时间类型
 * 30~39是字符串类型
 * Decimal类型的长度: 对DECIMAL(M,D) ，如果M>D，为M+2否则为D+2
 *
 * @author Chaexsy 2019-09-15 14:07
 */
public enum  DataTypeEnum {
    TINY_INT(1, "tinyint", 1),
    SMALL_INT(2, "smallint", 2),
    MEDIUM_INT(3, "mediumint", 3),
    INT(4, "int", 4),
    INTEGER(5, "integer", 4),
    BIG_INT(6, "bigint", 8),
    BIT(7, "bit", 0),
    FLOAT(8, "float", 4),
    DOUBLE(9, "double", 8),
    DECIMAL(10, "decimal", 0),
    DATE(21, "date", 3),
    TIME(22, "time", 3),
    YEAR(23, "year", 1),
    DATETIME(24, "datetime", 8),
    TIMESTAMP(25, "timestamp", 4),
    CHAR(30, "char", 0),
    VARCHAR(31, "varchar", 0),
    TINYBLOB(32, "tinyblob", 0),
    TINYTEXT(33, "tinytext", 0),
    BLOB(34, "blob", 0),
    TEXT(35, "text", 0),
    MEDIUMBLOB(36, "mediumblob", 0),
    MEDIUMTEXT(37, "mediumtext", 0),
    LONGBLOB(38, "longblob", 0),
    LONGTEXT(39, "longtext", 0);


    /**
     * 字段类型的编码
     */
    private int index;

    /**
     * 字段类型的编码
     */
    private String code;

    /**
     * 字段长度，字节数
     * 0 表示可变长度
     */
    private int length;



    DataTypeEnum(int index, String code, int length){
        this.index = index;
        this.code = code;
        this.length = length;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
