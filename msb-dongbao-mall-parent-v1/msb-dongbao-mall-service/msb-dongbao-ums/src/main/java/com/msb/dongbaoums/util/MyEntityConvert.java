package com.msb.dongbaoums.util;



import com.msb.dongbaoums.entity.UmsMember;
import com.msb.dongbaoums.entity.dto.UmsMemberDto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @Auther: li
 * @Date: 2022/5/21 - 05 - 21 - 16:35
 * @Description: com.msb.dongbaoums.config
 * @version: 1.0
 */
public class MyEntityConvert {
    @Autowired
    private PasswordEncoder passwordEncoder;

    public UmsMember umsMemberDtoToUmsMember(UmsMemberDto umsMemberDto){
        UmsMember umsMember = new UmsMember();
        BeanUtils.copyProperties(umsMemberDto,umsMember);
        String encode = passwordEncoder.encode(umsMemberDto.getPassword());
        umsMember.setPassword(encode);
        return umsMember;
    }


}
