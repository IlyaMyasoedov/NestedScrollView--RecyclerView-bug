package ex.issue.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import ex.issue.R;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ilya on 15.04.2017.
 */

public class ItemsAdapter extends RecyclerView.Adapter<ItemsAdapter.ViewHolder> {

  private final List<String> tiles = new ArrayList<>();

  private Context context;

  public ItemsAdapter(List<String> tiles) {
    this.tiles.clear();
    this.tiles.addAll(tiles);
  }

  @Override public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    context = parent.getContext();
    final View view = LayoutInflater.from(context).inflate(R.layout.item_squared, parent, false);
    return new ViewHolder(view);
  }



  @Override public void onBindViewHolder(final ViewHolder holder, int position) {
    holder.tvText.setText(tiles.get(position));
  }

  @Override public int getItemCount() {
    return tiles.size();
  }

  public class ViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.tvText) protected TextView tvText;

    public ViewHolder(View view) {
      super(view);
      ButterKnife.bind(this, view);
    }

  }


}

