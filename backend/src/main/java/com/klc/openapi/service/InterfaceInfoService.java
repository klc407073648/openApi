package com.klc.openapi.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.klc.openapicommon.model.entity.InterfaceInfo;

/**
 * @author Jason
 * @description 针对表【interface_info(接口信息)】的数据库操作Service
 * @createDate 2022-11-11 07:21:36
 */
public interface InterfaceInfoService extends IService<InterfaceInfo> {
    /**
     * 校验
     *
     * @param post
     * @param add  是否为创建校验
     */
    void validInterfaceInfo(InterfaceInfo post, boolean add);
}
