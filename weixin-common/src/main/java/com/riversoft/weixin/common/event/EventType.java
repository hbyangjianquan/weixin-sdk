package com.riversoft.weixin.common.event;

/**
 * Created by exizhai on 9/30/2015.
 */
public enum EventType {

    subscribe,
    unsubscribe,
    LOCATION,

    /**
     * 忍不住骂人
     */
    click,//企业号
    CLICK,//服务号，订阅号
    view,//企业号
    VIEW,//服务号，订阅号

    scancode_push,
    scancode_waitmsg,
    pic_sysphoto,
    pic_photo_or_album,
    pic_weixin,
    location_select,
    enter_agent,
    batch_job_result,
    media_id,
    view_limited,

    /**
     * 多客服接口特有
     */
    kf_create_session,
    kf_close_session,
    kf_switch_session
}
