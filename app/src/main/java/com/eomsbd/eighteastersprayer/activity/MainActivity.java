package com.eomsbd.eighteastersprayer.activity;

import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.Toast;

import com.eomsbd.eighteastersprayer.ExpandableListAdapter;
import com.eomsbd.eighteastersprayer.R;
import com.eomsbd.eighteastersprayer.fragment.Resurrection;
import com.eomsbd.eighteastersprayer.fragment.Sunday;
import com.eomsbd.eighteastersprayer.fragment.When;
import com.eomsbd.eighteastersprayer.fragment.easter.Easter;
import com.eomsbd.eighteastersprayer.fragment.easter.Easter2;
import com.eomsbd.eighteastersprayer.fragment.easter.Easter3;
import com.eomsbd.eighteastersprayer.fragment.friday.Friday;
import com.eomsbd.eighteastersprayer.fragment.friday.Friday2;
import com.eomsbd.eighteastersprayer.fragment.lent.Lent;
import com.eomsbd.eighteastersprayer.fragment.lent.Lent2;
import com.eomsbd.eighteastersprayer.fragment.morning.Morning;
import com.eomsbd.eighteastersprayer.fragment.morning.Morning2;
import com.eomsbd.eighteastersprayer.fragment.morning.Morning3;
import com.eomsbd.eighteastersprayer.fragment.morning.Morning4;
import com.eomsbd.eighteastersprayer.fragment.victory.Victory;
import com.eomsbd.eighteastersprayer.fragment.victory.Victory2;
import com.eomsbd.eighteastersprayer.fragment.victory.Victory3;
import com.eomsbd.eighteastersprayer.fragment.victory.Victory4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;
    ConstraintLayout constraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        expListView = (ExpandableListView) findViewById(R.id.lvExp);
        constraintLayout = findViewById(R.id.container);

        // preparing list data
        prepareListData();


        listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);

        // setting list adapter
        expListView.setAdapter(listAdapter);
        // Listview Group click listener
        expListView.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {

            @Override
            public boolean onGroupClick(ExpandableListView parent, View v,
                                        int groupPosition, long id) {
                // Toast.makeText(getApplicationContext(),
                // "Group Clicked " + listDataHeader.get(groupPosition),
                // Toast.LENGTH_SHORT).show();
                return false;
            }
        });

        // Listview on child click listener
        expListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {

            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {

                final String selected = (String) listAdapter.getChild(
                        groupPosition, childPosition);

                FragmentManager manager = getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();

                switch(selected){
                    case "Jesus was raised from the grave....read more":
                        Resurrection fragment = new Resurrection();
                        transaction.replace(R.id.frame, fragment).commit();
                        constraintLayout.setVisibility(View.GONE);
                        break;

                    case "Easter is the celebration of the resurrection...read more":
                        Easter easter = new Easter();
                        transaction.replace(R.id.frame, easter).commit();
                        constraintLayout.setVisibility(View.GONE);
                        break;

                    case "Easter follows a period of fasting called Lent...read more":
                        Easter2 easter1 = new Easter2();
                        transaction.replace(R.id.frame, easter1).commit();
                        constraintLayout.setVisibility(View.GONE);
                        break;

                    case "The week leading up to Easter is called The Holy Week...read more":
                        Easter3 easter2 = new Easter3();
                        transaction.replace(R.id.frame, easter2).commit();
                        constraintLayout.setVisibility(View.GONE);
                        break;

                    case "You loved this world so much...read more":
                        Sunday sunday = new Sunday();
                        transaction.replace(R.id.frame, sunday).commit();
                        constraintLayout.setVisibility(View.GONE);
                        break;

                    case "Jesus cried out to you...read more":
                        Friday friday = new Friday();
                        transaction.replace(R.id.frame, friday).commit();
                        constraintLayout.setVisibility(View.GONE);
                        break;

                        case "We wait, on Friday...read more":
                            Friday2 friday2 = new Friday2();
                            transaction.replace(R.id.frame, friday2).commit();
                            constraintLayout.setVisibility(View.GONE);
                        break;
                        case "Thank you for the gift of this season...read more":
                            Lent lent = new Lent();
                            transaction.replace(R.id.frame, lent).commit();
                            constraintLayout.setVisibility(View.GONE);
                        break;
                        case "it can be disheartening to read...read more":
                            Lent2 lent2 = new Lent2();
                            transaction.replace(R.id.frame, lent2).commit();
                            constraintLayout.setVisibility(View.GONE);
                        break;
                        case "Thank You for the miracle of life...read more":
                            Victory victory = new Victory();
                            transaction.replace(R.id.frame, victory).commit();
                            constraintLayout.setVisibility(View.GONE);
                        break;
                        case "I rejoice and rejoice continually...read more":
                            Victory2 victory2 = new Victory2();
                            transaction.replace(R.id.frame, victory2).commit();
                            constraintLayout.setVisibility(View.GONE);
                        break;
                        case "death could not hold You...read more":
                            Victory3 victory3 = new Victory3();
                            transaction.replace(R.id.frame, victory3).commit();
                            constraintLayout.setVisibility(View.GONE);

                        break;
                        case "may I realize afresh today...read more":
                            Victory4 victory4 = new Victory4();
                            transaction.replace(R.id.frame, victory4).commit();
                            constraintLayout.setVisibility(View.GONE);
                        break;
                        case "The early Christians began ...read more":
                            When when = new When();
                            transaction.replace(R.id.frame, when).commit();
                            constraintLayout.setVisibility(View.GONE);
                        break;
                        case "we lift our hearts to you...read more":
                            Morning morning = new Morning();
                            transaction.replace(R.id.frame, morning).commit();
                            constraintLayout.setVisibility(View.GONE);

                        break; case "we lift our eyes to you...read more":
                        Morning2 morning2 = new Morning2();
                        transaction.replace(R.id.frame, morning2).commit();
                        constraintLayout.setVisibility(View.GONE);
                        break;
                        case "we lift our prayers to you...read more":
                            Morning3 morning3 = new Morning3();
                            transaction.replace(R.id.frame, morning3).commit();
                            constraintLayout.setVisibility(View.GONE);
                        break; case "we lift our voices to yo...read more":
                        Morning4 morning4 = new Morning4();
                        transaction.replace(R.id.frame, morning4).commit();
                        constraintLayout.setVisibility(View.GONE);
                        break;


                }

                return true;
            }
        });

    }

    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        // Adding child data
        listDataHeader.add("Resurrection Prayer");
        listDataHeader.add("What is Easter?");
        listDataHeader.add("Easter Sunday Prayer");
        listDataHeader.add("Good Friday Prayer");
        listDataHeader.add("Prayer for Lent");
        listDataHeader.add("Four Short Easter Prayers of Victory");
        listDataHeader.add("When is Easter?");
        listDataHeader.add("Prayer for an Easter Morning Sunrise Service");

        // Adding child data
        List<String> resurrection = new ArrayList<String>();
        resurrection.add("Jesus was raised from the grave....read more");

        List<String> Easter = new ArrayList<String>();
        Easter.add("Easter is the celebration of the resurrection...read more");
        Easter.add("Easter follows a period of fasting called Lent...read more");
        Easter.add("The week leading up to Easter is called The Holy Week...read more");


        List<String> Sunday = new ArrayList<String>();
        Sunday.add("You loved this world so much...read more");


        List<String> Friday = new ArrayList<String>();
        Friday.add("Jesus cried out to you...read more");
        Friday.add("We wait, on Friday...read more");


        List<String> Lent = new ArrayList<String>();
        Lent.add("Thank you for the gift of this season...read more");
        Lent.add("it can be disheartening to read...read more");

        List<String> Victory = new ArrayList<String>();
        Victory.add("Thank You for the miracle of life...read more");
        Victory.add("I rejoice and rejoice continually...read more");
        Victory.add("death could not hold You...read more");
        Victory.add("may I realize afresh today...read more");

        List<String> When = new ArrayList<String>();
        When.add("The early Christians began ...read more");

        List<String> Morning  = new ArrayList<String>();
        Morning .add("we lift our hearts to you...read more");
        Morning .add("we lift our eyes to you...read more");
        Morning .add("we lift our prayers to you...read more");
        Morning .add("we lift our voices to yo...read more");

        listDataChild.put(listDataHeader.get(0), resurrection); // Header, Child data
        listDataChild.put(listDataHeader.get(1), Easter);
        listDataChild.put(listDataHeader.get(2), Sunday);
        listDataChild.put(listDataHeader.get(3), Friday);
        listDataChild.put(listDataHeader.get(4), Lent);
        listDataChild.put(listDataHeader.get(5), Victory);
        listDataChild.put(listDataHeader.get(6), When);
        listDataChild.put(listDataHeader.get(7), Morning );
    }



    @Override
    public void onBackPressed() {
        tellFragments();
        finish();
        super.onBackPressed();

    }
    private void tellFragments() {
        List<Fragment> fragments = getSupportFragmentManager().getFragments();
        for (Fragment f : fragments) {
            if (f != null && f instanceof Easter) {
                ((Easter) f).onBackPressed();
            } else if (f != null && f instanceof Easter2) {
                ((Easter2) f).onBackPressed();
            } else if (f != null && f instanceof Easter3) {
                ((Easter3) f).onBackPressed();
            } else if (f != null && f instanceof Friday) {
                ((Friday) f).onBackPressed();
            } else if (f != null && f instanceof Friday2) {
                ((Friday2) f).onBackPressed();
            } else if (f != null && f instanceof Lent) {
                ((Lent) f).onBackPressed();
            } else if (f != null && f instanceof Lent2) {
                ((Lent2) f).onBackPressed();
            } else if (f != null && f instanceof Morning) {
                ((Morning) f).onBackPressed();
            } else if (f != null && f instanceof Morning2) {
                ((Morning2) f).onBackPressed();
            } else if (f != null && f instanceof Morning3) {
                ((Morning3) f).onBackPressed();
            } else if (f != null && f instanceof Morning4) {
                ((Morning4) f).onBackPressed();
            } else if (f != null && f instanceof Victory) {
                ((Victory) f).onBackPressed();
            }else if (f != null && f instanceof Victory2) {
                ((Victory2) f).onBackPressed();
            }else if (f != null && f instanceof Victory3) {
                ((Victory3) f).onBackPressed();
            }else if (f != null && f instanceof Resurrection) {
                ((Resurrection) f).onBackPressed();
            }else if (f != null && f instanceof Sunday) {
                ((Sunday) f).onBackPressed();
            }else if (f != null && f instanceof When) {
                ((When) f).onBackPressed();
            }

        }
    }
}
