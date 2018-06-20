package com.example.keetawatsrichompoo.itsale;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {

    private Button hitMe;
//    private FirebaseDatabase database;
//    private DatabaseReference dataRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hitMe = (Button) findViewById(R.id.introButton);

        hitMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent( getApplicationContext(), SurveyActivity.class ) );

            }
        });

//        initFirebase();
//        addFirebaseListener();
    }

//    private void initFirebase() {
//        FirebaseApp.initializeApp(this);
//        database = FirebaseDatabase.getInstance();
//        dataRef = database.getReference();
//    }

//    private void addFirebaseListener() {
//        dataRef.child("user").addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(DataSnapshot dataSnapshot) {
//
//            }
//
//            @Override
//            public void onCancelled(DatabaseError databaseError) {
//
//            }
//        });
//    }
}
