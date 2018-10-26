package com.ganinfo.controller;

import com.ganinfo.face.detection.FaceResult;
import com.ganinfo.face.detection.impl.FaceDetection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author XingWL
 * @package:com.ganinfo.controller
 * @className:
 * @description:
 * @date 2018-07-13 15:21
 * 注意：本内容仅限于新疆感知科技有限公司内部传阅,禁止外泄以及用于其他的商业目
 * Copyright © 2017-ganinfo. All rights reserved.
 **/
@RestController
@RequestMapping("/test")
public class TestFaceController {

    @Autowired
    FaceDetection faceDetection;


    @ResponseBody
    @RequestMapping(value = "/gettt",method = RequestMethod.GET)
    public FaceResult gettt(@RequestParam(value = "filePath",required = true)String filePath){
       FaceResult faceResult= faceDetection.faceDetectionResult(filePath,5,"nUMgqYx9R36xof5k2VDPiqcs14L3qj6cRpcFYdDiUXa","D6rVNDznPZwHmmo2r97iEtB89QvBSMkQ1ZZ1pR23sLs9","D:/fileupload/insureUnit/carinfo");
        return faceResult;
    }
}
