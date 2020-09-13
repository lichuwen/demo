package com.example.demo;

import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.core.Size;

public class testSplit {
    public static void start(){
//        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
//        String path = System.getProperty("user.dir") + "/src/main/resources/opencv_java340-x64.dll";
//        System.load(path);
        String os = System.getProperty("os.name");
        String linkLibrary = (os.toLowerCase().indexOf("win") != -1 ) ? ".dll" : ".so";
        System.out.println(linkLibrary);
        String absolutePath = System.getProperty("user.dir");
        String relativePath = "/src/main/resources/cv2.so";
        System.out.println(absolutePath+relativePath);
        System.load(absolutePath+relativePath);
        System.out.println(creatOneMat());
    }

    public static Mat creatOneMat(){
        return Mat.ones(new Size(30,20), CvType.CV_8UC1);
    }

}
