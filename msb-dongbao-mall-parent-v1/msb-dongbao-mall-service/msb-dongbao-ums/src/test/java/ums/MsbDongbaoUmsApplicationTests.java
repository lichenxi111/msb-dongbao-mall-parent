package ums;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.msb.dongbaoums.entity.UmsMember;
import com.msb.dongbaoums.mapper.UmsMemberMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;

@SpringBootTest(classes = com.msb.dongbaoums.MsbDongbaoUmsApplication.class)
class MsbDongbaoUmsApplicationTests {
	@Autowired
	UmsMemberMapper umsMemberMapper;
	@Test
	public void testInsert(){
		UmsMember umsMember = new UmsMember();
		umsMember.setUsername("d333ppt");
		umsMember.setPassword("dddqqw");
		/*umsMember.setCreateTime(new Date());
		umsMember.setLoginTime(new Date());*/
		umsMemberMapper.insert(umsMember);
	}



}
