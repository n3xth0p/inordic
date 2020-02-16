package com.cloud.study.nordic.services.impl;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;
import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import com.cloud.study.nordic.services.FileService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class FileServiceImpl implements FileService {
  private Map<String, String> files = new ConcurrentHashMap<String, String>();

  @Value("${uploaded.files.path}")
  private String uploadedFilesPath;

  @PostConstruct
  public void init() {
    log.info(uploadedFilesPath);
  }

@Override
  public List<String> getList() {
	  
	  var listCloudFiles = new File (uploadedFilesPath).listFiles();
	  
	  for ( File file : listCloudFiles) {
		  files.put(file.getName(), file.getAbsolutePath());
	  }
	  
	  log.debug("list directory is  - " + files);
	  
	  return files.keySet()
        .stream()
        .sorted()
        .collect(Collectors.toList());

  }

  @Override
  public void addFile(MultipartFile file) {
    var ext = FilenameUtils.getExtension(file.getOriginalFilename());
    try {
      var tempFile = File.createTempFile(
          "inordic_", "_temp." + ext, new File(uploadedFilesPath)
      );
      log.debug("File upload to: {}", tempFile);
      file.transferTo(tempFile);

      files.put(FilenameUtils.getName(file.getOriginalFilename()), tempFile.getAbsolutePath());
    } catch (IOException e) {
      log.error("addFile", e);
    }
  }
}
