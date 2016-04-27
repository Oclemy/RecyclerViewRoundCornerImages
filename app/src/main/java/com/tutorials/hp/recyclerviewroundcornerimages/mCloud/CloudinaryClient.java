package com.tutorials.hp.recyclerviewroundcornerimages.mCloud;

import com.cloudinary.Cloudinary;
import com.cloudinary.Transformation;

/**
 * Created by Oclemmy on 4/27/2016 for ProgrammingWizards Channel.
 */
public class CloudinaryClient {


    public static String getRoundedCornerImage(String imageName)
    {
        //PASS UR CONFIGS
        Cloudinary cloud=new Cloudinary(MyConfiguration.getMyConfigs());

        //MANIPULATE
        Transformation t=new Transformation();
        t.radius("max").crop("thumb");

        //URL
        String url=cloud.url().transformation(t).generate(imageName);

        return url;
    }

}
