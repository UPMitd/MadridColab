package org.xcolab.service.members.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.xcolab.model.tables.pojos.DataCompany;
import org.xcolab.service.members.service.member.UserService;
import org.xcolab.service.members.util.email.AccountDetailsEmmaAPI;

@RestController
@RequestMapping("/dataCompany")
public class DataCompanyController {

    private final UserService memberService;
    private static final Logger log = LoggerFactory.getLogger(AccountDetailsEmmaAPI.class);


    @Autowired
    public DataCompanyController(UserService memberService) {
        Assert.notNull(memberService, "UserService bean is required");
        this.memberService = memberService;
    }

    @PostMapping
    public DataCompany createDataCompany(@RequestBody DataCompany dataCompany) {
        return memberService.createDataCompany(dataCompany);
    }
}
