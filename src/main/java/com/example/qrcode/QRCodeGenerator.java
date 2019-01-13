package com.example.qrcode;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.springframework.stereotype.Component;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

@Component
public class QRCodeGenerator {
	private QRCodeWriter qrCodeWriter;
	private BitMatrix bitMatrix;
	private ByteArrayOutputStream outputStream;
	private String PNG_IMAGE_FORMAT = "PNG";
	private int width = 1000;
	private int height = 1000;

	public byte[] generate(String text, int width, int height) throws WriterException, IOException {
		if (width == 0) {
			width = this.width;
		}		
		if (height == 0) {
			height = this.height;
		}
		qrCodeWriter = new QRCodeWriter();
		bitMatrix = qrCodeWriter.encode(text, BarcodeFormat.QR_CODE, width, height);
		outputStream = new ByteArrayOutputStream();
		MatrixToImageWriter.writeToStream(bitMatrix, PNG_IMAGE_FORMAT, outputStream);
		// Flush all the bytes to stream
		outputStream.flush();
		return outputStream.toByteArray();
	}
	
}
