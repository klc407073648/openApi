package com.klc.openapi.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.klc.openapicommon.model.entity.UserInterfaceInfo;

/**
* @author Jason
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Service
* @createDate 2022-12-13 05:58:42
*/
public interface UserInterfaceInfoService extends IService<UserInterfaceInfo> {

    void validUserInterfaceInfo(UserInterfaceInfo userInterfaceInfo, boolean add);

    /**
     * 调用接口统计
     * @param interfaceInfoId
     * @param userId
     * @return
     */
    boolean invokeCount(long interfaceInfoId, long userId);

}
