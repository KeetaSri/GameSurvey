package com.example.keetawatsrichompoo.itsale;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import org.w3c.dom.Text;

public class ResultActivity extends AppCompatActivity {

    private TextView choiceText;
    private ImageView img;
    private Database game_data = new Database();
    String genre, genre_sub, type, type_sub, player;
    String nameOutput;
    int gameIndex;
    String[] list_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        choiceText = (TextView) findViewById(R.id.choiceTextView);
        img = (ImageView) findViewById(R.id.image);

        if ( savedInstanceState == null ) {

            Bundle extras = getIntent().getExtras();

            if( extras == null ) {

                genre = null;
                genre_sub = null;
                type = null;
                type_sub = null;
                player = null;


            } else {

                genre = extras.getString( "genre" );
                genre_sub = extras.getString( "genreSub" );
                type = extras.getString( "type" );
                type_sub = extras.getString( "typeSub" );
                player = extras.getString( "player" );

            }

        } else {

            genre = (String) savedInstanceState.getSerializable( "genre" );
            genre_sub = (String) savedInstanceState.getSerializable( "genreSub" );
            type = (String) savedInstanceState.getSerializable( "type" );
            type_sub = (String) savedInstanceState.getSerializable( "typeSub" );
            player = (String) savedInstanceState.getSerializable( "player" );

        }

        gameIndex = game_data.getGameId(genre, genre_sub, type, type_sub, player);
        nameOutput = game_data.displayName(gameIndex);

        if(nameOutput.equals("???")) {
            img.setImageResource(R.drawable.what);
            img.setVisibility(View.VISIBLE);
        } else { displayImg(gameIndex); }

        Log.d("test_index", "game_id: " + gameIndex );
        Log.d("test_name", "game_name: " + nameOutput );

        choiceText.setText( nameOutput );

    }

    public void displayImg( int index ){
        if(index == 10) {
            img.setImageResource(R.drawable.cojg);
        }

        if(index == 11) {
            img.setImageResource(R.drawable.cod5);
        }

        if(index == 12) {
            img.setImageResource(R.drawable.huntd);
        }

        if(index == 14) {
            img.setImageResource(R.drawable.mine);
        }
        img.setVisibility(View.VISIBLE);
    }
}
