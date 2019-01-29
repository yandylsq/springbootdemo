package springbootdemo.demo.domain;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import java.util.Date;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * 拼团活动列表页自定义 实体类
 * 
 * @author 2019-01-29 15:20:04 lishangqian
 */
@Entity
@DynamicInsert
@DynamicUpdate
@Table(name = "ui_custom_group_buying_list")
public class UiCustomGroupBuyingList implements Serializable{

	// ID主键
	private Long recordId;
	// 商家ID
	private Long tmallShopId;
	// 普通团-页面标题名称
	private String title;
	// 普通团-广告图片是否使用系统默认：1 是  0否（采用自定义）
	private Integer isUseDefault;
	// 普通团-广告图片url
	private String adPicUrl;
	// 新人团-页面标题名称
	private String titleNew;
	// 新人团-广告图片是否使用系统默认：1 是  0否（采用自定义）
	private Integer isUseDefaultNew;
	// 新人团-广告图片url
	private String adPicUrlNew;
	// 创建时间
	private Date created;
	// 渠道ID
	private Long easyChannelId;

	@Transient
	public Object getId() {
		return this.recordId;
	}

	/**
	 * Get ID主键
	 */
	@Id
	@GeneratedValue
	@Column(name = "record_id")
	public Long getRecordId() {
		return recordId;
	}

	/**
	 * Set ID主键
	 */
	public void setRecordId(Long recordId) {
		this.recordId = recordId;
	}

	/**
	 * Get 商家ID
	 */
	@Column(name = "tmall_shop_id")
	public Long getTmallShopId() {
		return tmallShopId;
	}

	/**
	 * Set 商家ID
	 */
	public void setTmallShopId(Long tmallShopId) {
		this.tmallShopId = tmallShopId;
	}

	/**
	 * Get 普通团-页面标题名称
	 */
	@Column(name = "title")
	public String getTitle() {
		return title;
	}

	/**
	 * Set 普通团-页面标题名称
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * Get 普通团-广告图片是否使用系统默认：1 是  0否（采用自定义）
	 */
	@Column(name = "is_use_default")
	public Integer getIsUseDefault() {
		return isUseDefault;
	}

	/**
	 * Set 普通团-广告图片是否使用系统默认：1 是  0否（采用自定义）
	 */
	public void setIsUseDefault(Integer isUseDefault) {
		this.isUseDefault = isUseDefault;
	}

	/**
	 * Get 普通团-广告图片url
	 */
	@Column(name = "ad_pic_url")
	public String getAdPicUrl() {
		return adPicUrl;
	}

	/**
	 * Set 普通团-广告图片url
	 */
	public void setAdPicUrl(String adPicUrl) {
		this.adPicUrl = adPicUrl;
	}

	/**
	 * Get 新人团-页面标题名称
	 */
	@Column(name = "title_new")
	public String getTitleNew() {
		return titleNew;
	}

	/**
	 * Set 新人团-页面标题名称
	 */
	public void setTitleNew(String titleNew) {
		this.titleNew = titleNew;
	}

	/**
	 * Get 新人团-广告图片是否使用系统默认：1 是  0否（采用自定义）
	 */
	@Column(name = "is_use_default_new")
	public Integer getIsUseDefaultNew() {
		return isUseDefaultNew;
	}

	/**
	 * Set 新人团-广告图片是否使用系统默认：1 是  0否（采用自定义）
	 */
	public void setIsUseDefaultNew(Integer isUseDefaultNew) {
		this.isUseDefaultNew = isUseDefaultNew;
	}

	/**
	 * Get 新人团-广告图片url
	 */
	@Column(name = "ad_pic_url_new")
	public String getAdPicUrlNew() {
		return adPicUrlNew;
	}

	/**
	 * Set 新人团-广告图片url
	 */
	public void setAdPicUrlNew(String adPicUrlNew) {
		this.adPicUrlNew = adPicUrlNew;
	}

	/**
	 * Get 创建时间
	 */
	@Column(name = "created")
	public Date getCreated() {
		return created;
	}

	/**
	 * Set 创建时间
	 */
	public void setCreated(Date created) {
		this.created = created;
	}

	/**
	 * Get 渠道ID
	 */
	@Column(name = "easy_channel_id")
	public Long getEasyChannelId() {
		return easyChannelId;
	}

	/**
	 * Set 渠道ID
	 */
	public void setEasyChannelId(Long easyChannelId) {
		this.easyChannelId = easyChannelId;
	}

}
