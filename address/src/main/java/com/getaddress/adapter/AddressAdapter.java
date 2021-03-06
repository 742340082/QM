package com.getaddress.adapter;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.amap.api.services.core.PoiItem;
import com.baselibrary.utils.ViewUtil;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.getaddress.R;

import java.util.List;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

/**
 * Created by 74234 on 2017/4/26.
 */

public class AddressAdapter extends BaseQuickAdapter<PoiItem, BaseViewHolder> {
    public AddressAdapter(int layoutResId, List<PoiItem> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, PoiItem item) {
        ViewUtil.initCutOff(helper,helper.getLayoutPosition());
        TextView tv_current = helper.getView(R.id.tv_address_current);
        RelativeLayout rl_address = helper.getView(R.id.rl_address);
        TextView tv_address_title = helper.getView(R.id.tv_address_title);
        TextView tv_address_detail = helper.getView(R.id.tv_address_detail);
        if (helper.getAdapterPosition() == 0) {
            tv_current.setVisibility(View.VISIBLE);
        } else {
            tv_current.setVisibility(View.GONE);
        }
        tv_address_title.setText(item.getTitle());
        if (item.getProvinceName().equals(item.getCityName())) {
            if (item.getCityName().equals(item.getAdName())) {
                if (item.getAdName().equals(item.getSnippet())) {
                    tv_address_detail.setText(item.getProvinceName() + item.getSnippet());
                } else {
                    tv_address_detail.setText(item.getProvinceName() + item.getAdName() + item.getSnippet());
                }
            } else {
                if (item.getAdName().equals(item.getSnippet())) {
                    tv_address_detail.setText(item.getProvinceName() + item.getSnippet());
                } else {
                    tv_address_detail.setText(item.getCityName() + item.getAdName() + item.getSnippet());
                }

            }
        } else {
            if (item.getCityName().equals(item.getAdName())) {
                if (item.getAdName().equals(item.getSnippet())) {
                    tv_address_detail.setText(item.getProvinceName() + item.getSnippet());
                } else {
                    tv_address_detail.setText(item.getProvinceName() + item.getAdName() + item.getSnippet());
                }
            } else {
                if (item.getAdName().equals(item.getSnippet())) {
                    tv_address_detail.setText(item.getProvinceName() + item.getCityName() + item.getSnippet());
                } else {
                    tv_address_detail.setText(item.getProvinceName() + item.getCityName() + item.getAdName() + item.getSnippet());
                }

            }
        }
    }
}
