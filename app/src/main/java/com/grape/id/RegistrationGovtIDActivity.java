package com.grape.id;
/**
 * Copyright Google Inc. All Rights Reserved.
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Created June 02, 2020 by GrapeID.com.
 * Written by Steve Stansbury, for GrapeID.com
 *
 */
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.text.HtmlCompat;

public class RegistrationGovtIDActivity extends AppCompatActivity {

    boolean bTermChecked = true;
    TextView mGovtIDTitle;
    Button mNextBtn;
    ImageView mTermConditions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_reggovtid);
        //Toolbar toolbar = findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        mTermConditions = (ImageView) findViewById(R.id.termsConditions);
        mTermConditions.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

               if (bTermChecked) {
                   bTermChecked = false;
                   mTermConditions.setImageResource(R.drawable.termsandcondunchecked);
               } else {
                   bTermChecked = true;
                   mTermConditions.setImageResource(R.drawable.termsandcondchecked);
               }
            }
        });

        mNextBtn = (Button) findViewById(R.id.next_button);
        mNextBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent();
                intent.setComponent(new ComponentName("com.grape.id", "com.grape.id.RegistrationPhotoSelfieActivity"));
                startActivity(intent);
            }
        });

    }
}
