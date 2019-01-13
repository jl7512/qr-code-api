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
	private int defaultWidth = 150;
	private int defaultHeight = 150;

	public byte[] generate(String text, Integer width, Integer height) throws WriterException, IOException {
		if(width == null) {
			width = this.defaultWidth;
		}
		if(height == null) {
			height = this.defaultHeight;
		}
		qrCodeWriter = new QRCodeWriter();
		bitMatrix = qrCodeWriter.encode(text, BarcodeFormat.QR_CODE, width, height);
		outputStream = new ByteArrayOutputStream();
		MatrixToImageWriter.writeToStream(bitMatrix, PNG_IMAGE_FORMAT, outputStream);
		// Flush all the bytes to output stream
		outputStream.flush();
		return outputStream.toByteArray();
	}
	
}
