package com.example.databasejpamysql.controller;

import com.example.databasejpamysql.entity.request.AuthenticationRequest;
import com.example.databasejpamysql.entity.response.AuthenticationResponse;
import com.example.databasejpamysql.services.MyUserDetailsService;
import com.example.databasejpamysql.utility.JwtUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@Transactional
@Api(tags = "Home Controller", description = "Home Controller for SWAGGER documentation")
public class HomeResourceController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private MyUserDetailsService userDetailsService;

    @Autowired
    private CacheManager cacheManager;

    @GetMapping("/")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "Authorization", value = "Bearer {token}", required = true, paramType = "header"),
    })
    public String home() {
        return ("<h1>Welcome</h1>");
    }

    @GetMapping("/user")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "Authorization", value = "Bearer {token}", required = true, paramType = "header"),
    })
    public String user() {
        return ("<h1>Welcome User</h1>");
    }

    @GetMapping("/admin")
    @Cacheable(value = "admin", key = "'admin'")
    @ApiOperation("admin data")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "Authorization", value = "Bearer {token}", required = true, paramType = "header"),
    })
    public String admin() {
        return ("<h1>Welcome Admin</h1>");
    }

}
