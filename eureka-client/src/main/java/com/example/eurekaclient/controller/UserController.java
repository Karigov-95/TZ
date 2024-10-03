package com.example.eurekaclient.controller;

import com.example.eurekaclient.controller.dto.DtoMapper;
import com.example.eurekaclient.controller.dto.req.ReqUser;
import com.example.eurekaclient.controller.dto.res.ResUser;
import com.example.eurekaclient.model.User;
import com.example.eurekaclient.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;


    private final DtoMapper mapper;


    @PostMapping("/create")
    public ResponseEntity<Void> createUser(@RequestBody ReqUser reqUser) {

        User user = mapper.toUser(reqUser);
        userService.create(user);
        return ResponseEntity.accepted().build();
    }

    @GetMapping("/find")
    public ResponseEntity<ResUser> findById(@RequestParam Long id) {
        User user = userService.findById(id);
        return ResponseEntity.ok(mapper.toResUser(user));
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<ResUser>> findAll() {
        List<User> users = userService.findAll();
        List<ResUser> resUsers = users.stream().map(mapper::toResUser).toList();
        return ResponseEntity.ok(resUsers);
    }

    @PatchMapping("/update")
    public ResponseEntity<Void> updateUser(@RequestBody ReqUser reqUser) {

        User user = mapper.toUser(reqUser);
        userService.update(user);
        return ResponseEntity.accepted().build();
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Void> deleteUser(@RequestParam Long id) {
        userService.delete(id);
        return ResponseEntity.accepted().build();
    }
}
