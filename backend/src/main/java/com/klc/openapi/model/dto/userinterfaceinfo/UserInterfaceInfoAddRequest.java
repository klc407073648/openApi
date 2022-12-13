package com.klc.openapi.model.dto.userinterfaceinfo;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户创建请求
 *
 * @author yupi
 */
@Data
public class UserInterfaceInfoAddRequest implements Serializable {

    /**
     * 调用用户 id
     */
    private Long userId;

    /**
     * 接口 id
     */
    private Long interfaceInfoId;

    /**
     * 总调用次数
     */
    private Integer totalNum;

    /**
     * 剩余调用次数
     */
    private Integer leftNum;

    private static final long serialVersionUID = 1L;
}