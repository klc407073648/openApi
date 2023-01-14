package com.klc.openapi.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.klc.openapicommon.model.entity.UserInterfaceInfo;

import java.util.List;

/**
 * @author Jason
 * @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Mapper
 * @createDate 2022-12-13 05:58:42
 * @Entity com.klc.openapi.model.entity.UserInterfaceInfo
 */
public interface UserInterfaceInfoMapper extends BaseMapper<UserInterfaceInfo> {

    List<UserInterfaceInfo> listTopInvokeInterfaceInfo(int limit);
}




