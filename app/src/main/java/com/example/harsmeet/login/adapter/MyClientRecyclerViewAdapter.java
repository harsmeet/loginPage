//package com.example.harsmeet.login.adapter;
//
//import android.os.Bundle;
//
//import android.support.v7.widget.RecyclerView;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.TextView;
//
//import java.util.ArrayList;
//
//import butterknife.BindView;
//import butterknife.ButterKnife;
//
//public class MyClientRecyclerViewAdapter extends RecyclerView.Adapter<MyClientRecyclerViewAdapter.ViewHolder> {
//
//    private static final long CLICK_TIME_INTERVAL = 900;
//    private static final int DEFAULT_SIZE = 120;
//    private static final int ITEM_NEWS_LOAD = -1;
//    //    private final Activity host;
////    private final ArrayList<Datum> mItems;
//    private final OnListInteractionListener mListener;
//    com.homergize.backend.Utilities.Navigator navigator;
//    NavigationDrawerActivity mainActivity;
//    private ArrayList<MyClientsDataSets> myClientsDataSets = new ArrayList<>();
//    private LayoutInflater inflater;
//    private boolean isLoading, isLoadMoreAvailable = true;
//    private int size;
//
//    public MyClientRecyclerViewAdapter(NavigationDrawerActivity mainActivity, Navigator navigator, ArrayList<MyClientsDataSets> myClientsDataSets, OnListInteractionListener listener) {
//        inflater = mainActivity.getLayoutInflater();
//        this.size = myClientsDataSets.size();
//        this.myClientsDataSets = myClientsDataSets;
//        this.navigator = navigator;
//        this.mainActivity = mainActivity;
//        this.mListener = listener;
//        this.isLoading = false;
//    }
//
//    @Override
//    public MyClientRecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        View itemView = inflater.inflate(R.layout.my_clients_single_row, parent, false);
//        return new ViewHolder(itemView);
//    }
//
//    public void addItems(final ArrayList<MyClientsDataSets> items) {
//        int len = items.size();
//        size += len;
//        isLoading = false;
//        myClientsDataSets.addAll(items);
//        notifyDataSetChanged();
//    }
//
//    public void addItems() {
//        isLoading = false;
//        isLoadMoreAvailable = false;
//        notifyItemChanged(size - 1);
//    }
//
//    private int getStaticSize() {
//        if (size > 0) return size;
//        else size = getItemCount();
//        return size;
//    }
//
//    @Override
//    public void onBindViewHolder(MyClientRecyclerViewAdapter.ViewHolder holder, final int position) {
//
//        holder.tvEmail.setText(myClientsDataSets.get(position).getEmail());
//        holder.tvName.setText(myClientsDataSets.get(position).getUser_name());
//        holder.tvNumber.setText(myClientsDataSets.get(position).getContact_no());
//
//        holder.cvMyClients.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                Bundle bundle = new Bundle();
//                bundle.putString("myClient", new Gson().toJson(myClientsDataSets.get(position)));
//
//                ClientDetails clientDetails = new ClientDetails();
//                clientDetails.setArguments(bundle);
//                navigator.goTo(clientDetails);
//
//
////                MyClientDetails myClientDetails = new MyClientDetails();
////                myClientDetails.setArguments(bundle);
////                navigator.goTo(myClientDetails);
//
//
//            }
//        });
//
//        // Load more News
//        if (position >= getStaticSize() - 1 && !isLoading && isLoadMoreAvailable) {
//            isLoading = true;
//            if (mListener != null)
//                mListener.onLoadMore();
//        }
//    }
//
//    private MyClientsDataSets getItem(final int position) {
//        if (position < 0 || position >= myClientsDataSets.size()) return null;
//        return myClientsDataSets.get(position);
//    }
//
//    @Override
//    public int getItemCount() {
//        return myClientsDataSets == null ? 0 : myClientsDataSets.size();
//    }
//
////    public void setNewData(ArrayList<MyClientsDataSets> bulkOrderHistoryArrayList) {
////        this.myClientsDataSets = bulkOrderHistoryArrayList;
////    }
//
//    public static class ViewHolder extends RecyclerView.ViewHolder {
//
//        @BindView(R.id.tv_name)
//        protected TextView tvName;
//
//        @BindView(R.id.tv_email)
//        protected TextView tvEmail;
//
//        public ViewHolder(View itemView) {
//            super(itemView);
//            ButterKnife.bind(this, itemView);
//        }
//    }
//}