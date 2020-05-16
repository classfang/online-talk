package com.junki.onlinetalk.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

/**
 * websocket配置
 * @author junki
 * @date 2020/5/15 15:53
 */
@Slf4j
@Configuration
public class WebSocketConfig {
 
	/**
	 * 服务器节点
	 * 如果使用独立的servlet容器，而不是直接使用springboot 的内置容器，就不要注入ServerEndPoint
	 */
	@Bean
	public ServerEndpointExporter serverEndpointExporter() {
		log.info("启动 WebSocket ...");
		return new ServerEndpointExporter();
	}
 
}