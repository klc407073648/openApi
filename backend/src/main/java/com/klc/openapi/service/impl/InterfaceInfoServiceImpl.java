package com.klc.openapi.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.klc.openapi.common.ErrorCode;
import com.klc.openapi.exception.BusinessException;
import com.klc.openapi.mapper.InterfaceInfoMapper;
import com.klc.openapi.model.entity.InterfaceInfo;
import com.klc.openapi.service.InterfaceInfoService;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

/**
 * @author Jason
 * @description 针对表【interface_info(接口信息)】的数据库操作Service实现
 * @createDate 2022-11-11 07:21:36
 */
@Service
public class InterfaceInfoServiceImpl extends ServiceImpl<InterfaceInfoMapper, InterfaceInfo> implements InterfaceInfoService {

    @Override
    public void validInterfaceInfo(InterfaceInfo inerfaceInfo, boolean add) {
        if (inerfaceInfo == null) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        String name = inerfaceInfo.getName();

        //校验名称是否为空，字段是否合理
        if(StringUtils.isNotBlank(name) && name.length() > 50){
            throw new BusinessException(ErrorCode.PARAMS_ERROR,"名称过长");
        }
        
    }
}




