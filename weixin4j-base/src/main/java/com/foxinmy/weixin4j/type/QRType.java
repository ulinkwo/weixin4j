package com.foxinmy.weixin4j.type;

/**
 * 二维码类型
 *
 * @author jinyu(foxinmy@gmail.com)
 * @className QRType
 * @date 2014年11月4日
 * @see
 * @since JDK 1.6
 */
public enum QRType {
    /**
     * 临时二维码(场景值为数字范围在1-100000之间)
     */
    QR_SCENE,
    /**
     * 临时二维码(场景值为数字范围在1-100000之间)
     */
    QR_STR_SCENE,
    /**
     * 永久二维码(场景值为数字范围在1-100000之间)
     */
    QR_LIMIT_SCENE,
    /**
     * 永久二维码(场景值为数字范围在1-100000之间)
     */
    QR_LIMIT_STR_SCENE,
    /**
     * 卡券二维码：单个卡券
     */
    QR_CARD,
    /**
     * 卡券二维码：多个卡券
     */
    QR_MULTIPLE_CARD
}
