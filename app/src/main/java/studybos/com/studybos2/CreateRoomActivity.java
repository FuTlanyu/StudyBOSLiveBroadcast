package studybos.com.studybos2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CreateRoomActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_room);

        //获取控件
        Button createRoomButton = (Button)findViewById(R.id.create_room_sure);
        Button createRoomBackButton = (Button) findViewById(R.id.create_room_back_button);

        EditText liveBroadCastSubject = (EditText) findViewById(R.id.live_broadcast_subject);
        EditText liveBroadcastRoomMaster = (EditText) findViewById(R.id.live_broadcast_roomMaster);
        EditText liveBroadCastTitle = (EditText) findViewById(R.id.live_broadcast_title);

        //创建房间
        createRoomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {





            }
        });

        createRoomBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CreateRoomActivity.this, LiveActivity.class);
                startActivity(intent);
                overridePendingTransition(0,0);
            }
        });












    }
}
