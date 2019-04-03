import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.TbItem;
import com.taotao.pojo.TbItemExample;

public class TestPageHelper {
	
	@Test
	public void testPageHelper(){
		//第一部初始化Applicationcontext
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-dao.xml");
		//获取mapper对象
		TbItemMapper bean = context.getBean(TbItemMapper.class);
		//pagehelper设置分页
		PageHelper.startPage(1, 3);
		//设置查询条件
		TbItemExample example = new TbItemExample();
		//执行查询获取结果集
		List<TbItem> tbItems = bean.selectByExample(example );
		
		System.out.println("第一次查询的条数：》》》"+tbItems.size());
		
		PageInfo<TbItem> pInfo = new PageInfo<>(tbItems);	
		
		List<TbItem> tbItems2 = bean.selectByExample(example );
		
		System.out.println("第二次查询的总条数：》》》》"+tbItems2.size());
	}
}
