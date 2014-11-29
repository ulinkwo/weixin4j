package com.foxinmy.weixin4j.msg;

import com.foxinmy.weixin4j.model.BaseMsg;
import com.foxinmy.weixin4j.type.MessageType;
import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 地理位置消息
 * 
 * @className LocationMessage
 * @author jy.hu
 * @date 2014年4月6日
 * @since JDK 1.7
 * @see <a
 *      href="http://mp.weixin.qq.com/wiki/index.php?title=%E6%8E%A5%E6%94%B6%E6%99%AE%E9%80%9A%E6%B6%88%E6%81%AF#.E5.9C.B0.E7.90.86.E4.BD.8D.E7.BD.AE.E6.B6.88.E6.81.AF">订阅号、服务号的地理位置消息</a>
 * @see <a
 *      href="http://qydev.weixin.qq.com/wiki/index.php?title=%E6%8E%A5%E6%94%B6%E6%99%AE%E9%80%9A%E6%B6%88%E6%81%AF#location.E6.B6.88.E6.81.AF">企业号的地理位置消息</a>
 */
public class LocationMessage extends BaseMsg {

	private static final long serialVersionUID = 2866021596599237334L;

	public LocationMessage() {
		super(MessageType.location.name());
	}

	@XStreamAlias("Location_X")
	private double x; // 地理位置维度
	@XStreamAlias("Location_Y")
	private double y; // 地理位置经度
	@XStreamAlias("Scale")
	private double scale; // 地图缩放大小
	@XStreamAlias("Label")
	private String label; // 地理位置信息

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double getScale() {
		return scale;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	@Override
	public String toString() {
		return "LocationMessage [x=" + x + ", y=" + y + ", scale=" + scale
				+ ", label=" + label + ", " + super.toString() + "]";
	}
}