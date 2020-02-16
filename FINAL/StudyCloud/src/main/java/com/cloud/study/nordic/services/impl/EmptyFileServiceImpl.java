package com.cloud.study.nordic.services.impl;

import java.util.Collections;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import com.cloud.study.nordic.services.FileService;

@Service
public class EmptyFileServiceImpl implements FileService {

  @Override
  public List<String> getList() {
    return Collections.emptyList();
  }

  @Override
  public void addFile(MultipartFile file) {
  }

}
