package com.xuecheng.base.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

/**
 * 分页查询结果
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
//实现 Serializable 接口表明该类的对象可以被转换为字节流，从而支持对象的序列化和反序列化操作。具体含义如下：
//序列化：将对象的状态信息转换为字节流，便于在网络中传输或保存到持久化存储（如文件、数据库）中。
//反序列化：将字节流还原为对象，恢复其状态信息。
public class PageResult<T> implements Serializable {
    // 数据列表
    private List<T> items;

    //总记录数
    private long counts;

    //当前页码
    private long page;

    //每页记录数
    private long pageSize;
}
