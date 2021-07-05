package org.zerock.controller.lecture.upload;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import lombok.extern.log4j.Log4j;
import software.amazon.awssdk.auth.credentials.ProfileCredentialsProvider;
import software.amazon.awssdk.core.sync.RequestBody;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.ObjectCannedACL;
import software.amazon.awssdk.services.s3.model.PutObjectRequest;

@Controller
@RequestMapping("/uploadex02")
@Log4j
public class Ex02UploadController {

	@RequestMapping("/sub01")
	// aws에 업로드 하는 과정
	public void method02(MultipartFile file) throws Exception {
		log.info(file.getOriginalFilename());
		
		String bucketName = "choongang-mezzang"; // 내 버킷 이름
		String profileName = "spring1"; // condential에 spring1로 개인내용 저장돼있음
		S3Client s3 = S3Client.builder()
				.credentialsProvider(ProfileCredentialsProvider.create(profileName))
				.build();
		
		PutObjectRequest objectRequest = PutObjectRequest.builder()
				.bucket(bucketName)
				.key(file.getOriginalFilename())
				.contentType(file.getContentType())
				.acl(ObjectCannedACL.PUBLIC_READ)
				.build();
		
		s3.putObject(objectRequest, 
				RequestBody.fromInputStream(file.getInputStream(), file.getSize()));
	}
}
