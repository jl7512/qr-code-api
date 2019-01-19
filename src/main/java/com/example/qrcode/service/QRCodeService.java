package com.example.qrcode.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.qrcode.domain.QRCodeDTO;
import com.example.qrcode.generator.QRCodeGenerator;
import com.google.zxing.WriterException;

@Service
public class QRCodeService {
	
	@Autowired
	private QRCodeGenerator qrCodeGenerator;

	public byte[] generate(QRCodeDTO qrCode) throws WriterException, IOException {
		return qrCodeGenerator.generate(qrCode.getUrl(), qrCode.getWidth(), qrCode.getHeight());
	}
	
}
