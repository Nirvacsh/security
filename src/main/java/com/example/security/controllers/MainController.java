package com.example.security.controllers;

import com.example.security.domain.DocxContext;
import com.example.security.repos.DocxRepos;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.wickedsource.docxstamper.DocxStamper;
import org.wickedsource.docxstamper.DocxStamperConfiguration;

import java.io.*;
import java.util.Date;

@Controller
public class MainController {

    @Autowired
    private DocxRepos docxRepos;

    @PostMapping("/hello")
    @ResponseBody
    public HttpEntity<byte[]> add(@RequestParam String docNumber,
                                  @RequestParam Date docDate,
                                  @RequestParam String fopFio,
                                  @RequestParam String fopNumber,
                                  @RequestParam Date fopDate,
                                  @RequestParam String docWorks,
                                  @RequestParam String docService,
                                  @RequestParam Long docMoney,
                                  @RequestParam String docMoneyUa,
                                  @RequestParam String fopPassport,
                                  @RequestParam Long fopPassportNumber,
                                  @RequestParam String fopAddress,
                                  @RequestParam String fopMoneyNumber,
                                  @RequestParam String fopTelephone) throws IOException {

        DocxStamper stamper = new DocxStamper(new DocxStamperConfiguration());
        DocxContext context = new DocxContext();

        context.setDocNumber(docNumber);
        context.setDocDate(docDate);
        context.setFopFio(fopFio);
        context.setFopNumber(fopNumber);
        context.setFopDate(fopDate);
        context.setDocWorks(docWorks);
        context.setDocService(docService);
        context.setDocMoney(docMoney);
        context.setDocMoneyUa(docMoneyUa);
        context.setFopPassport(fopPassport);
        context.setFopPassportNumber(fopPassportNumber);
        context.setFopAddress(fopAddress);
        context.setFopMoneyNumber(fopMoneyNumber);
        context.setFopTelephone(fopTelephone);

        InputStream template = new FileInputStream(new File("template_new.docx"));
        OutputStream out = new FileOutputStream("output_template.docx");
        stamper.stamp(template, context, out);

        InputStream result = new FileInputStream(new File("output_template.docx"));
        byte[] documentBody = IOUtils.toByteArray(result);

        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.add("Content-Type", "application/octet-stream");
        responseHeaders.add("Content-Disposition", "attachment; filename=\"out.docx\"");

        out.close();
        template.close();
        result.close();
        return new HttpEntity<>(documentBody, responseHeaders);//IOUtils.toByteArray(result);//
    }





    @GetMapping("/hello")
    public String addMain() {
        return "hello";
    }
}
