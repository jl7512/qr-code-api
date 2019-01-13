package com.example.qrcode.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.qrcode.QRCodeGenerator;
import com.google.zxing.WriterException;

@Service
public class QRCodeService {
	
	@Autowired
	private QRCodeGenerator qrCode;

	public byte[] generate(String url, Integer width, Integer height) throws WriterException, IOException {
		return qrCode.generate(url, width, height);
	}
	
}
