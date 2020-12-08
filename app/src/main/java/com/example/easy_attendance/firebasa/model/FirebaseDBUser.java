package com.example.easy_attendance.firebasa.model;

import com.example.easy_attendance.firebase.model.dataObject.UserObj;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;

public class FirebaseDBUser extends FirebaseBaseModel
{
    public void addUserToDB(String orgKey, String keyID, String fName, String lName, String email, String password)
    {
        writeNewUser(orgKey, keyID, fName, lName, email, password);
    }

    private void writeNewUser(String orgKey, String keyID, String fName, String lName, String email, String password)
    {
        UserObj useRej = new UserObj(orgKey ,keyID, fName, lName, email, password);
        myRef.child("users").child(keyID).setValue(useRej);
    }

    public DatabaseReference getUserFromDB (String keyID)
    {
        return myRef.getRef().child("users").child(keyID);
    }

}
