package in.learncodewithrk.moviesrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView mainCategoryRecycler;
    MainRecyclerAdapter mainRecyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // here we will add some dummy data to our model class

        // here we will add data to category item model class

        // added in first category
        List<CategoryItem> categoryItemList = new ArrayList<>();
        categoryItemList.add(new CategoryItem(1, R.drawable.moviess1));
        categoryItemList.add(new CategoryItem(1, R.drawable.moviess2));
        categoryItemList.add(new CategoryItem(1, R.drawable.movies3));
        categoryItemList.add(new CategoryItem(1, R.drawable.movies4));
        categoryItemList.add(new CategoryItem(1, R.drawable.moviess5));
        categoryItemList.add(new CategoryItem(1, R.drawable.moviess1));

        // added in second category
        List<CategoryItem> categoryItemList2 = new ArrayList<>();
        categoryItemList2.add(new CategoryItem(1, R.drawable.moviess2));
        categoryItemList2.add(new CategoryItem(1, R.drawable.moviess1));
        categoryItemList2.add(new CategoryItem(1, R.drawable.movies3));
        categoryItemList2.add(new CategoryItem(1, R.drawable.movies4));
        categoryItemList2.add(new CategoryItem(1, R.drawable.moviess5));
        categoryItemList2.add(new CategoryItem(1, R.drawable.moviess1));

        // added in 3rd category
        List<CategoryItem> categoryItemList3 = new ArrayList<>();
        categoryItemList3.add(new CategoryItem(1, R.drawable.movies3));
        categoryItemList3.add(new CategoryItem(1, R.drawable.moviess2));
        categoryItemList3.add(new CategoryItem(1, R.drawable.movies3));
        categoryItemList3.add(new CategoryItem(1, R.drawable.movies4));
        categoryItemList3.add(new CategoryItem(1, R.drawable.moviess5));
        categoryItemList3.add(new CategoryItem(1, R.drawable.moviess1));

        // added in 4th category
        List<CategoryItem> categoryItemList4 = new ArrayList<>();
        categoryItemList4.add(new CategoryItem(1, R.drawable.movies4));
        categoryItemList4.add(new CategoryItem(1, R.drawable.moviess2));
        categoryItemList4.add(new CategoryItem(1, R.drawable.movies3));
        categoryItemList4.add(new CategoryItem(1, R.drawable.moviess1));
        categoryItemList4.add(new CategoryItem(1, R.drawable.moviess5));
        categoryItemList4.add(new CategoryItem(1, R.drawable.moviess1));


        // added in 5th category
        List<CategoryItem> categoryItemList5 = new ArrayList<>();
        categoryItemList5.add(new CategoryItem(1, R.drawable.moviess5));
        categoryItemList5.add(new CategoryItem(1, R.drawable.moviess2));
        categoryItemList5.add(new CategoryItem(1, R.drawable.movies3));
        categoryItemList5.add(new CategoryItem(1, R.drawable.movies4));
        categoryItemList5.add(new CategoryItem(1, R.drawable.moviess1));
        categoryItemList5.add(new CategoryItem(1, R.drawable.movies3));
        List<AllCategory> allCategoryList = new ArrayList<>();
        allCategoryList.add(new AllCategory("Category 1st", categoryItemList));
        allCategoryList.add(new AllCategory("Category 2nd", categoryItemList2));
        allCategoryList.add(new AllCategory("Category 3rd", categoryItemList3));
        allCategoryList.add(new AllCategory("Category 4th", categoryItemList4));
        allCategoryList.add(new AllCategory("Category 5th", categoryItemList5));

        setMainCategoryRecycler(allCategoryList);

    }

    private void setMainCategoryRecycler(List<AllCategory> allCategoryList){

        mainCategoryRecycler = findViewById(R.id.main_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        mainCategoryRecycler.setLayoutManager(layoutManager);
        mainRecyclerAdapter = new MainRecyclerAdapter(this, allCategoryList);
        mainCategoryRecycler.setAdapter(mainRecyclerAdapter);

    }


}