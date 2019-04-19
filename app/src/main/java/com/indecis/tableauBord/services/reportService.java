package com.indecis.tableauBord.services;

import com.google.gson.Gson;
import com.indecis.tableauBord.models.Report;
import android.util.Log;

import static android.content.ContentValues.TAG;

public class reportService {

    public reportService(){}

    public void buildReport(String message){
        Gson g = new Gson();
        Report r = g.fromJson(message, Report.class);
        Log.d(TAG,r.getCourse_number());
        Log.d(TAG,r.getCourse_duration());
        Log.d(TAG,r.getCourse_co2());
        Log.d(TAG,r.getCourse_km());
        Log.d(TAG,r.getCourse_price());
        buildPDF(r);
    }

    public void buildPDF(Report r){
        
    }
}
