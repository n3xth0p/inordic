package com.cloud.study.nordic.services;

import java.util.List;
import org.springframework.web.multipart.MultipartFile;

public interface FileService {
  /**
   * Получить список всех файлов и папок
   * 
   * @return
   */
  List<String> getList();

  /**
   * Добавляет файл в систему
   * 
   * @param file
   */
  void addFile(MultipartFile file);
}
