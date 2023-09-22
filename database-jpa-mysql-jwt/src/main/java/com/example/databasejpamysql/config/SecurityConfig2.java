//package com.example.databasejpamysql.security;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//@EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//    @Autowired
//    UserDetailsService userDetailsService;
//
//    //    // Method 1: directly configures in-memory users using the AuthenticationManagerBuilder.
////    @Override
////    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
////        // set your configuration on the auth object
////        // Configure in-memory user credentials (you can use a different user provider)
////        auth.inMemoryAuthentication()
////                .withUser(username1)
////                .password(password1)
////                .roles("ADMIN")
////                .and()
////                .withUser(username2)
////                .password(password2)
////                .roles("USER");
////    }
////
////    // Method 2: allows you to create a custom UserDetailsService bean, which can be more flexible
////    // if you need to load user details from a custom data source (e.g., a database)
//////    @Bean
//////    public UserDetailsService userDetailsService() {
//////        UserDetails user = User.withUsername(username)
//////                .passwordEncoder(passwordEncoder()::encode)
//////                .password(password)
//////                .roles(roles)
//////                .build();
//////
//////        return new InMemoryUserDetailsManager(user);
//////    }
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(userDetailsService).passwordEncoder(getPasswordEncoder());
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests()
//                .antMatchers("/admin").hasRole("ADMIN")
//                .antMatchers("/user").hasAnyRole("USER", "ADMIN")
//                .antMatchers("/").hasRole("ADMIN")
//                .and().formLogin();
//    }
//
//    @Bean
//    public PasswordEncoder getPasswordEncoder() {
////        return NoOpPasswordEncoder.getInstance();
//        return new BCryptPasswordEncoder();
//    }
//
//}
