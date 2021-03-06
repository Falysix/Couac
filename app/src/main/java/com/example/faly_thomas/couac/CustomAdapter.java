package com.example.faly_thomas.couac;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.github.library.bubbleview.BubbleTextView;

import java.util.List;

/**
 * Created by Faly-Thomas on 18/11/2017.
 */

public class CustomAdapter extends BaseAdapter {
    private List<ChatModel> lstChat;
    private Context context;
    private LayoutInflater inflater;

    public CustomAdapter(List<ChatModel> lstChat, Context context) {
        this.lstChat = lstChat;
        this.context = context;
        inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public int getCount() {
        return lstChat.size();
    }

    @Override
    public Object getItem(int position) {
        return lstChat.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View vi = convertView;
        if (convertView == null) {
            Log.d(lstChat.get(position).getCharMessage(), String.valueOf(lstChat.get(position).isSend()));
            if (lstChat.get(position).isSend())
                vi = inflater.inflate(R.layout.list_send, null);
            else
                vi = inflater.inflate(R.layout.list_recv, null);
        }

        BubbleTextView bubbleTextView = (BubbleTextView)vi.findViewById((R.id.bubbleChat));
        bubbleTextView.setText(lstChat.get(position).charMessage);

        return vi;
    }
}
