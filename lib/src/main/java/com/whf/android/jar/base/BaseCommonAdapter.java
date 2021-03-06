package com.whf.android.jar.base;

import android.content.Context;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * BaseAdapter
 *
 * @author : qf.
 * @author wang.hai.fang
 * @since 2.5.0
 */
public abstract class BaseCommonAdapter<T> extends BaseAdapter {

    protected List<T> mData;
    protected Context context;

    /**
     * @param mList:List Date
     */
    public BaseCommonAdapter(List<T> mList) {
        super();
        this.mData = mList;
    }

     /**
     * @param cont:Context 
     * @param mList:List Date
     */
    public BaseCommonAdapter(Context cont,List<T> mList) {
        super();
        this.context = cont;
        this.mData = mList;
    }
    
    /**
     * Total number
     */
    @Override
    public int getCount() {
        return mData == null ? 0 : mData.size();
    }

    @Override
    public T getItem(int position) {
        return mData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public List<T> getData() {
        return mData;
    }

    public boolean hasData() {
        return mData != null && mData.size() > 0;
    }

    public void addData(List<T> mList) {
        mData.addAll(mList);
        notifyDataSetChanged();
    }
    
}
