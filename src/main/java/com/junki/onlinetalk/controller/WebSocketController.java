package com.junki.onlinetalk.controller;

import com.junki.onlinetalk.server.WebSocketServer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * websocket控制器
 * @author junki
 * @date 2020/5/15 15:53
 */
@Slf4j
@Controller
@RequestMapping("socket")
public class WebSocketController {
 
	@RequestMapping("push")
	@ResponseBody
	public String push(String message) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			WebSocketServer.sendInfo(sdf.format(new Date()) + "-公告：" + message);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return message;
	}
 
}