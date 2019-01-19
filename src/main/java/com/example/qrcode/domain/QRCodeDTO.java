package com.example.qrcode.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "url", "width", "height" })
public class QRCodeDTO {
	
	@JsonProperty("url")
	private String url;
	
	@JsonProperty("width")
	private Integer width;
	
	@JsonProperty("height")
	private Integer height;

	@JsonProperty("url")
	public String getUrl() {
		return url;
	}

	@JsonProperty("url")
	public void setUrl(String url) {
		this.url = url;
	}

	@JsonProperty("width")
	public Integer getWidth() {
		return width;
	}

	@JsonProperty("width")
	public void setWidth(Integer width) {
		this.width = width;
	}

	@JsonProperty("height")
	public Integer getHeight() {
		return height;
	}

	@JsonProperty("height")
	public void setHeight(Integer height) {
		this.height = height;
	}

}