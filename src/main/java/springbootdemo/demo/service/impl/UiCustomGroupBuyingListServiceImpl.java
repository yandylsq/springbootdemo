package springbootdemo.demo.service.impl;

import springbootdemo.demo.domain.UiCustomGroupBuyingList;
import springbootdemo.demo.dao.UiCustomGroupBuyingListDao;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import springbootdemo.demo.service.UiCustomGroupBuyingListService;

/**
 * 拼团活动列表页自定义 Service实现类
 * 
 * @author 2019-01-29 15:20:04 lishangqian
 */

@Service
public class UiCustomGroupBuyingListServiceImpl  implements
		UiCustomGroupBuyingListService {

	private UiCustomGroupBuyingListDao uiCustomGroupBuyingListDao;


	@Autowired
	public void setUiCustomGroupBuyingListDao(UiCustomGroupBuyingListDao uiCustomGroupBuyingListDao) {
		this.uiCustomGroupBuyingListDao = uiCustomGroupBuyingListDao;
	}

}
