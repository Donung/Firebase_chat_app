package com.jirawat.chatapp.Fragments;

import com.jirawat.chatapp.Notifications.MyResponse;
import com.jirawat.chatapp.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAA-7LM12s:APA91bG7-teylQCdFFYl1Fs5Dv7gZgjseD7PgPgCZd_5ncFWcOTtTMtHmFdPcVCXjVRa59_Jz5vdoRJkfVDurA_gRbVPXkluymONKcPWVwbknq-qYKOqB207gz4ruMHcREg9Ceq5fpGi"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}

