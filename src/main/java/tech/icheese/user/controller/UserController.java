package tech.icheese.user.controller;

import org.springframework.beans.factory.annotation.Value;
import tech.icheese.user.dto.UserInfoDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Value("${server.port}")
    private int serverPort;

    @GetMapping("/getUserName")
    @ResponseBody
    public UserInfoDTO getUserName(  @RequestParam(name = "id") Long id){
        return UserInfoDTO.builder().name(id.toString()).build();
    }

    @GetMapping("/getUserId")
    public String getUserId(  @RequestParam(name = "id") Long id){
        return id.toString()+serverPort;
    }
}
