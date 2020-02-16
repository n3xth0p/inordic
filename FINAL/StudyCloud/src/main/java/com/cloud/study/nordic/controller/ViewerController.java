package com.cloud.study.nordic.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.cloud.study.nordic.services.FileService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class ViewerController {
  @Autowired @Qualifier("fileServiceImpl")
  private FileService fileService;

  @GetMapping(path = "/list")
  public String list(Model model) {
    var files = fileService.getList();
    
    model.addAttribute("files", files);
    log.debug(" list of file is : " +  files);
    
    return "list";
  }
}
