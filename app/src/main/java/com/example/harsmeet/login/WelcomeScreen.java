package com.example.harsmeet.login;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by harsmeet on 31-07-2018.
 */

public class WelcomeScreen extends AppCompatActivity {

//     implements WebAPIListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);


    }

    }



//    API IMPLEMENTATION:

//    private void fetchClients() {
//    private void fetchClients(int flag) {


//        if (flag == 1) {
//            currentPage = 1;
//        }
//
//
//        JSONObject jsonObject = new JSONObject();
//        JSONObject jsonHeader = new JSONObject();
//        try {
//            jsonHeader.put("id", Utils.getUserId(getContext()));
//            jsonHeader.put("token", Utils.getToken(getContext()));
//
//            jsonObject.put("header", jsonHeader);
//            jsonObject.put("page", currentPage);
//
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }
//
//        Utils.myMethod(BaseAsyncTask.METHOD_POST, "", jsonObject, getMainActivity(), MyClientsFragments.this, true);
//    }






//
//
//    @Override
//    public void getResponse(JSONObject jsonObject, boolean status) {
//
//        if (status) {
//            ArrayList<MyClientsDataSets> myClientsDataSets = new ArrayList<>();
//            try {
//                JSONArray data = jsonObject.getJSONArray("data");
//                Gson gson = new Gson();
//
//                if (data.length() > 0) {
//                    for (int i = 0; i < data.length(); i++) {
//                        MyClientsDataSets myClientsDataSets_ = gson.fromJson(data.getJSONObject(i).toString(), MyClientsDataSets.class);
//                        myClientsDataSets.add(myClientsDataSets_);
//                    }
//                }
////                myClientRecyclerViewAdapter.notifyDataSetChanged();
//                rvMyClients.removeAllViewsInLayout();
//                if (currentPage == 1) {
//                    try {
//
//                        if (myClientsDataSets.size() > 0) {
//                            myClientRecyclerViewAdapter = new MyClientRecyclerViewAdapter(getMainActivity(), getMainActivity().getNavigator(), myClientsDataSets, getListener());
//                            rvMyClients.setAdapter(myClientRecyclerViewAdapter);
//                        }
//                    } catch (Exception ignored) {
//
//                    }
//                } else {
//                    if (myClientsDataSets.size() > 0)
//                        myClientRecyclerViewAdapter.addItems(myClientsDataSets);
//                    else {
//                        myClientRecyclerViewAdapter.addItems();
//                        Toast.makeText(getMainActivity(), "No more data available", Toast.LENGTH_LONG).show();
//                    }
//                }
//
////                MyClientRecyclerViewAdapter myClientRecyclerViewAdapter = new MyClientRecyclerViewAdapter(getMainActivity(), getMainActivity().getNavigator(), myClientsDataSets);
////                LinearLayoutManager mLayoutManagerr = new LinearLayoutManager(getContext());
////                rvMyClients.setLayoutManager(mLayoutManagerr);
////                rvMyClients.setAdapter(myClientRecyclerViewAdapter);
//
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//    }


















