package com.sics.controller;

import com.sics.pojo.BasePojoImpl;
import com.sics.pojo.EncryptionToDisPatchCiphertextAndPassword;
import com.sics.service.ReceiveEncryptionService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


/**
 * receive encryption
 *
 * @author liangjc
 * @version 2022/07/27
 */
@RestController
public class ReceiveEncryptionController {
    @Resource
    ReceiveEncryptionService receiveEncryptionService;
    @PostMapping("/encryption/dispatch")
    public BasePojoImpl dispatch(@RequestBody EncryptionToDisPatchCiphertextAndPassword encryptionToDisPatchCiphertextAndPassword){
        return receiveEncryptionService.dispatch(encryptionToDisPatchCiphertextAndPassword);
    }
}
