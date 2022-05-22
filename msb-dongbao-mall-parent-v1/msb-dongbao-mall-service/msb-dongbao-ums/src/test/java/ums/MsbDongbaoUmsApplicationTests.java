package ums;

import com.msb.dongbaoums.entity.UmsMember;
import com.msb.dongbaoums.entity.dto.UmsMemberDto;
import com.msb.dongbaoums.mapper.UmsMemberMapper;
import com.msb.dongbaoums.service.UmsMemberService;
import com.msb.dongbaoums.service.impl.UmsMemberServiceImpl;
import com.msb.dongbaoums.util.MyEntityConvert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootTest(classes = com.msb.dongbaoums.MsbDongbaoUmsApplication.class)
class MsbDongbaoUmsApplicationTests {
	@Autowired
	UmsMemberMapper umsMemberMapper;
	@Autowired
	MyEntityConvert myEntityConvert;
	@Autowired
	PasswordEncoder passwordEncoder;
	@Autowired
	UmsMemberService umsMemberService;
	@Test
	public void testInsert(){
		UmsMember umsMember = new UmsMember();
		UmsMemberDto umsMemberDto =new UmsMemberDto();
		umsMemberDto.setUsername("d1010qw");
		umsMemberDto.setPassword("444444");
		umsMember = myEntityConvert.umsMemberDtoToUmsMember(umsMemberDto);
//		String encode = passwordEncoder.encode(umsMember.getPassword());
//		System.out.println(encode);
//		umsMember.setPassword(encode);
		/*umsMember.setCreateTime(new Date());
		umsMember.setLoginTime(new Date());*/
		umsMemberMapper.insert(umsMember);
	}

	@Test
	public void testlogin(){
		UmsMemberDto umsMemberDto = new UmsMemberDto();
		umsMemberDto.setUsername("username3");
		umsMemberDto.setPassword("1111122");
		boolean login = umsMemberService.login(umsMemberDto);
		System.out.println(login);
	}



}
