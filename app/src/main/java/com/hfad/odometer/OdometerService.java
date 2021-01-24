package com.hfad.odometer;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

import java.util.Random;

public class OdometerService extends Service {

    private final IBinder BINDER = new OdometerBinder();
    private final Random RANDOM = new Random();

    public class OdometerBinder extends Binder {
        OdometerService getOdometer() {
            return OdometerService.this;
        }
    }

    @Override
    public IBinder onBind(Intent intent) {
        return BINDER;
    }

    public double getDistance() {
        return RANDOM.nextDouble();
    }
}