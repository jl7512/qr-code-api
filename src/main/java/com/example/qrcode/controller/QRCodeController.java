package com.example.qrcode.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.qrcode.service.QRCodeService;
import com.google.zxing.WriterException;

@RestController
@RequestMapping(value = "/qrcode")
public class QRCodeController {

	@Autowired
	private QRCodeService service;
	  
	@PostMapping(value = "/generate/image", produces = MediaType.IMAGE_PNG_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public byte[] generateImage(@RequestBody String url, @RequestBody(required = false) Integer width, @RequestBody(required = false) Integer height) throws WriterException, IOException {
		return service.generate(url, width, height);
	}
	
}
