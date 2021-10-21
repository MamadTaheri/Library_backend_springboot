package com.example.Library_backend_springboot.impl;

import com.example.Library_backend_springboot.model.userModel;
import com.example.Library_backend_springboot.service.userService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class userServiceImpl implements userService {
    @Override
    public ArrayList<userModel> getAllusers() {
        ArrayList<userModel> usersArray = new ArrayList<>();

        userModel user1 = new userModel(1, "محمد", "طاهری", 6532584885L);
        userModel user2 = new userModel(2, "علی ", "علوی", 9865324565L);
        userModel user3 = new userModel(3, "زهرا", "موسوی", 6589653256L);
        userModel user4 = new userModel(4, "قاسم", "محمودی", 5285321405L);
        userModel user5 = new userModel(5, "لیلا", "رنجبر", 3586549820L);
        userModel user6 = new userModel(6, "عسل", "ربیعی", 8659852365L);
        userModel user7 = new userModel(7, "سید محمود", "عباسی", 2548563251L);
        userModel user8 = new userModel(8, "محمدعلی", "رئوف نسب", 2568563215L);
        userModel user9 = new userModel(9, "هستی", "نوربخش", 7568532658L);
        userModel user10 = new userModel(10, "قاسم", "جوادی گورکانی", 6953265852L);
        userModel user11 = new userModel(11, "نازنین", "الماسی", 5485653265L);
        userModel user12 = new userModel(12, "محسن ", "انصاري", 1294465694L);
        userModel user13 = new userModel(13, "آناهيتا ", "خلج ", 3214314314L);
        userModel user14 = new userModel(14, "ايرج ", "خرازي", 6764324332L);
        userModel user15 = new userModel(15, "مهوش ", "تركاشوند", 4352233253L);
        userModel user16 = new userModel(16, "حسين ", "انتظام", 6432432438L);
        userModel user17 = new userModel(17, "الهه ", "معروفخاني", 6485432448L);
        userModel user18 = new userModel(18, "هوشنگ ", "فلاحتيان", 6482342334L);
        userModel user19 = new userModel(19, "عليرضا ", "باقرنژاد", 4843423468L);
        userModel user20 = new userModel(20, "رمضانعلي ", "محمودي", 1354384448L);
        userModel user21 = new userModel(21, "محمدجواد", "اسماعيلي", 8332483433L);
        userModel user22 = new userModel(22, "هوشنگ ", "رفيعي", 8634232483L);

        usersArray.add(user1);
        usersArray.add(user2);
        usersArray.add(user3);
        usersArray.add(user4);
        usersArray.add(user5);
        usersArray.add(user6);
        usersArray.add(user7);
        usersArray.add(user8);
        usersArray.add(user9);
        usersArray.add(user10);
        usersArray.add(user11);
        usersArray.add(user12);
        usersArray.add(user13);
        usersArray.add(user14);
        usersArray.add(user15);
        usersArray.add(user16);
        usersArray.add(user17);
        usersArray.add(user18);
        usersArray.add(user19);
        usersArray.add(user20);
        usersArray.add(user21);
        usersArray.add(user22);

        return usersArray;
    }

    @Override
    public userModel getSingleuser(String name, String family) {

        return new userModel(1, name, family, 6532584885L);
    }

    @Override
    public String checkAuthentication1(String name, String family) {
        if (name.equals("mohammad") && family.equals("taheri")) {
            return "Permission Granted!!!!";
        } else
            return "Wrong Credential Informations. Please Try again";
    }

    @Override
    public String checkAuthentication2(userModel user) {
        if ( user.getName().equals("mohammad") && user.getFamily().equals("taheri")) {
            return "Permission Granted!!!!";
        } else
            return "Wrong Credential Informations. Please Try again";
    }

}
