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
