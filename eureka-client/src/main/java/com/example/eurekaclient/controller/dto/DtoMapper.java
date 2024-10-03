package com.example.eurekaclient.controller.dto;

import com.example.eurekaclient.controller.dto.req.ReqUser;
import com.example.eurekaclient.controller.dto.res.ResUser;
import com.example.eurekaclient.model.User;
import org.mapstruct.Mapper;

@Mapper
public interface DtoMapper {

    User toUser(ReqUser req);

    ResUser toResUser(User user);
}
