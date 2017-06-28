package comp3350.plantr.presentation;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.List;

import comp3350.plantr.R;
import comp3350.plantr.business.DatabaseAccess;
import comp3350.plantr.model.Plant;
import comp3350.plantr.persistence.DatabaseInterface;

/**
 * Created by KevinD on 6/5/2017.
 */

public class PlantListView extends AppCompatActivity {

	private static final String TAG = "PlantListView";

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {

		DatabaseInterface db;

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_plant_view);
		Log.d(TAG, "onCreate: started.");

		ListView list = (ListView) findViewById(R.id.plantipedia_listview);

		//initialize the database
		db = DatabaseAccess.open();

		List<Plant> plantList = db.getAllPlants();
		PlantListAdapter adapter = new PlantListAdapter(this, 1, plantList);

		list.setAdapter(adapter);
		list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				Intent intent = new Intent(PlantListView.this, PlantView.class);
				//store the plant ID with the intent to display
				intent.putExtra(getString(R.string.plant_id), position);
				startActivity(intent);
			}
		});

	}
}
