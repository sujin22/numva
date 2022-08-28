package com.egongil.numva_android_app.src.qr_management;

import static com.egongil.numva_android_app.src.config.ApplicationClass.convertErrorResponse;
import static com.egongil.numva_android_app.src.config.ApplicationClass.getRetrofitService;

import android.util.Log;

import com.egongil.numva_android_app.src.config.models.base.ErrorResponse;
import com.egongil.numva_android_app.src.qr_management.interfaces.QrManagementActivityView;
import com.egongil.numva_android_app.src.config.models.request.DeleteQrRequest;
import com.egongil.numva_android_app.src.config.models.response.DeleteQrResponse;
import com.egongil.numva_android_app.src.config.models.response.GetSafetyInfoResponse;
import com.egongil.numva_android_app.src.config.models.request.RegisterQrRequest;
import com.egongil.numva_android_app.src.config.models.response.RegisterQrResponse;
import com.egongil.numva_android_app.src.config.models.request.SetQrNameRequest;
import com.egongil.numva_android_app.src.config.models.response.SetQrNameResponse;

import retrofit2.Call;
import retrofit2.Response;

public class QrManagementService {
    private final QrManagementActivityView qrManagementActivityView;

    public QrManagementService(QrManagementActivityView qrManagementActivityView){
        this.qrManagementActivityView = qrManagementActivityView;
    }

    void setQrName(SetQrNameRequest setQrNameRequest){
        getRetrofitService().setQrName(setQrNameRequest).enqueue(new retrofit2.Callback<SetQrNameResponse>(){
            @Override
            public void onResponse(Call<SetQrNameResponse> call, Response<SetQrNameResponse> response) {
                Log.e("response.code()", String.valueOf(response.code()));

                SetQrNameResponse setQrNameResponse = null;
                ErrorResponse errorResponse = null;
                if(response.body()!= null) {
                    setQrNameResponse = response.body();
                }
                else {
                    errorResponse = convertErrorResponse(response);
                }
                qrManagementActivityView.setQrNameSuccess(setQrNameResponse, errorResponse);
            }

            @Override
            public void onFailure(Call<SetQrNameResponse> call, Throwable t) {
                t.printStackTrace();
                qrManagementActivityView.setQrNameFailure();
            }
        });
    }

    void registerQr(RegisterQrRequest registerQrRequest){
        getRetrofitService().registerQr(registerQrRequest).enqueue(new retrofit2.Callback<RegisterQrResponse>(){
            @Override
            public void onResponse(Call<RegisterQrResponse> call, Response<RegisterQrResponse> response) {
                Log.e("response.code()", String.valueOf(response.code()));
                RegisterQrResponse registerQrResponse = null;
                ErrorResponse errorResponse = null;
                if(response.body()!=null){
                    registerQrResponse = response.body();
                }
                else{
                    errorResponse = convertErrorResponse(response);
                }
                qrManagementActivityView.registerQrSuccess(registerQrResponse, errorResponse);
            }

            @Override
            public void onFailure(Call<RegisterQrResponse> call, Throwable t) {
                t.printStackTrace();
                qrManagementActivityView.registerQrFailure();
            }
        });
    }

    void deleteQr(DeleteQrRequest deleteQrRequest){
        getRetrofitService().deleteQr(deleteQrRequest).enqueue(new retrofit2.Callback<DeleteQrResponse>(){
            @Override
            public void onResponse(Call<DeleteQrResponse> call, Response<DeleteQrResponse> response) {
                Log.e("response.code()", String.valueOf(response.code()));
                DeleteQrResponse deleteQrResponse = null;
                ErrorResponse errorResponse = null;
                if(response.body() != null){
                    deleteQrResponse = response.body();
                }else{
                    errorResponse = convertErrorResponse(response);
                }
                qrManagementActivityView.deleteQrSuccess(deleteQrResponse, errorResponse);
            }

            @Override
            public void onFailure(Call<DeleteQrResponse> call, Throwable t) {
                t.printStackTrace();
                qrManagementActivityView.deleteQrFailure();
            }
        });
    }
}
