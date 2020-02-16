package com.cloud.study.nordic.controller;

import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import com.cloud.study.nordic.services.FileService;

@Controller
public class UploadController {
  @Autowired @Qualifier("fileServiceImpl")
  private FileService fileService;

  @GetMapping("/upload")
  public String upload() {
    return "upload";
  }

  @PostMapping("/uploadFile")
  public String uploadFile(@RequestParam(name = "file") MultipartFile file) throws IOException {
    fileService.addFile(file);
    return "upload";
  }
}
