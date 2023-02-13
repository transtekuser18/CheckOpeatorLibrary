package com.tmenforce.checkopeator;

import android.app.Activity;
import android.widget.Toast;

public class CheckOpeator {

    public static Boolean CheckOpeatorValidation(Activity context, String OperatorNumber, String OperatorPin) {
        boolean validation = false;

        if (!OperatorNumber.isEmpty() && !OperatorPin.isEmpty()) {
            if (OperatorNumber.equals("740516") && OperatorPin.equals("159875635")) {
                validation = true;
                Toast.makeText(context, "Operator id and password match", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(context, "Operator id and password not match", Toast.LENGTH_SHORT).show();
                validation = false;
            }

        } else {
            validation = false;
            if (OperatorNumber.isEmpty()) {
                Toast.makeText(context, "Please enter Operator ID", Toast.LENGTH_SHORT).show();
            } else if (OperatorPin.isEmpty()) {
                Toast.makeText(context, "Please enter Password ID", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(context, "Please enter Operator ID & Password", Toast.LENGTH_SHORT).show();
            }
        }

        return validation;
    }

}
