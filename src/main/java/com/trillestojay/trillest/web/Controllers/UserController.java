package com.trillestojay.trillest.web.Controllers;

import com.trillestojay.trillest.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    @Autowired
    UserServices userServices;


}
