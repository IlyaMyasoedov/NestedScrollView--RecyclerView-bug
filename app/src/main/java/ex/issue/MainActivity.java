package ex.issue;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import ex.issue.adapter.ItemsAdapter;
import ex.issue.R;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

  @BindView(R.id.rvItems) protected RecyclerView rvItems;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    ButterKnife.bind(this);

    initList();
  }


  private void initList(){
    ItemsAdapter adapter = new ItemsAdapter(tiles());
    rvItems.setHasFixedSize(true);
    rvItems.setNestedScrollingEnabled(false);
    rvItems.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
    rvItems.setAdapter(adapter);
  }

  private List<String> tiles(){
    List<String> tiles = new ArrayList<>();
    for (int index = 0; index < 100; index++){
      tiles.add("Text" + index);
    }

    return tiles;
  }
}
