package org.ecoding.limesiauth.service;

import org.ecoding.limesiauth.entity.po.TBUser;
import org.ecoding.limesiauth.entity.po.TBUserExample;
import org.ecoding.limesiauth.mapper.TBUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LimesiUserServiceDetail implements UserDetailsService {

    @Autowired
    private TBUserMapper userMapper;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        TBUserExample example = new TBUserExample();
        example.createCriteria().andLoginnameEqualTo(s);
        List<TBUser> userList = userMapper.selectByExample(example);
        if (null == userList || userList.size() < 1) {
            throw new UsernameNotFoundException("用户" + s +"不存在");
        }

        return new org.springframework.security.core.userdetails.User(s, passwordEncoder.encode(userList.get(0).getPassword()), AuthorityUtils.commaSeparatedStringToAuthorityList("ROLE_NORMAL,ROLE_MEDIUM"));
    }
}
