package com.example.android.home_base;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int yanksRuns = 0;
    int yanksOuts = 0;
    int yanksStrikes = 0;
    int metsRuns = 0;
    int metsOuts = 0;
    int metsStrikes = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayYanksRuns(0);
        displayYanksOuts(0);
        displayYanksStrikes(0);
        displayMetsRuns(0);
        displayMetsOuts(0);
        displayMetsStrikes(0);
    }

    /**
     * Displays Runs for Yankees.
     */
    public void displayYanksRuns(int yRuns) {
        TextView yanksRunsView = findViewById(R.id.yanks_runs);
        yanksRunsView.setText(String.valueOf(yRuns));
    }

    /**
     * Displays Outs for Yankees.
     */
    public void displayYanksOuts(int yOuts) {
        TextView yanksOutsView = findViewById(R.id.yanks_outs);
        yanksOutsView.setText(String.valueOf(yOuts));
    }

    /**
     * Displays Strikes for Yankees.
     */
    public void displayYanksStrikes(int yStrikes) {
        TextView yanksStrikesView = findViewById(R.id.yanks_strikes);
        yanksStrikesView.setText(String.valueOf(yStrikes));
    }

    /**
     * Displays Runs for Mets.
     */
    public void displayMetsRuns(int mRuns) {
        TextView metsRunsView = findViewById(R.id.mets_runs);
        metsRunsView.setText(String.valueOf(mRuns));
    }

    /**
     * Displays Outs for Mets.
     */
    public void displayMetsOuts(int mOuts) {
        TextView metsOutsView = findViewById(R.id.mets_outs);
        metsOutsView.setText(String.valueOf(mOuts));
    }

    /**
     * Displays Strikes for Mets.
     */
    public void displayMetsStrikes(int mStrikes) {
        TextView metsStrikesView = findViewById(R.id.mets_strikes);
        metsStrikesView.setText(String.valueOf(mStrikes));
    }

    /**
     * Subtracts 1 run from Yankees.
     */
    public void minusYanksRuns(View view) {
        if (yanksRuns > 0) {
            yanksRuns -= 1;
            displayYanksRuns(yanksRuns);
        }
    }

    /**
     * Adds 1 run for Yankees.
     */
    public void plusYanksRuns(View view) {
        yanksRuns += 1;
        displayYanksRuns(yanksRuns);
    }

    /**
     * Subtracts 1 out from Yankees.
     */
    public void minusYanksOuts(View view) {
        if (yanksOuts > 0) {
            yanksOuts -= 1;
            displayYanksOuts(yanksOuts);
        }
    }

    /**
     * Adds 1 out for Yankees.
     */
    public void plusYanksOuts(View view) {
        if (yanksOuts < 3) {
            yanksOuts += 1;
            displayYanksOuts(yanksOuts);
        }
    }

    /**
     * Subtracts 1 strike from Yankees.
     */
    public void minusYanksStrikes(View view) {
        if (yanksStrikes > 0) {
            yanksStrikes -= 1;
            displayYanksStrikes(yanksStrikes);
        }
    }

    /**
     * Adds 1 strike for Yankees.
     */
    public void plusYanksStrikes(View view) {
        if (yanksStrikes < 3) {
            yanksStrikes += 1;
            displayYanksStrikes(yanksStrikes);
        }
    }

    /**
     * Subtracts 1 run from Mets.
     */
    public void minusMetsRuns(View view) {
        if (metsRuns > 0) {
            metsRuns -= 1;
            displayMetsRuns(metsRuns);
        }
    }

    /**
     * Adds 1 run for Mets.
     */
    public void plusMetsRuns(View view) {
        metsRuns += 1;
        displayMetsRuns(metsRuns);
    }

    /**
     * Subtracts 1 out from Mets.
     */
    public void minusMetsOuts(View view) {
        if (metsOuts > 0) {
            metsOuts -= 1;
            displayMetsOuts(metsOuts);
        }
    }

    /**
     * Adds 1 out for Mets.
     */
    public void plusMetsOuts(View view) {
        if (metsOuts < 3) {
            metsOuts += 1;
            displayMetsOuts(metsOuts);
        }
    }

    /**
     * Subtracts 1 strike from Mets.
     */
    public void minusMetsStrikes(View view) {
        if (metsStrikes > 0) {
            metsStrikes -= 1;
            displayMetsStrikes(metsStrikes);
        }
    }

    /**
     * Adds 1 strike for Mets.
     */
    public void plusMetsStrikes(View view) {
        if (metsStrikes < 3) {
            metsStrikes += 1;
            displayMetsStrikes(metsStrikes);
        }
    }

    /**
     * Resets all values for both teams.
     */
    public void resetAll(View view) {
        yanksRuns = 0;
        yanksOuts = 0;
        yanksStrikes = 0;
        metsRuns = 0;
        metsOuts = 0;
        metsStrikes = 0;
        displayYanksRuns(0);
        displayYanksOuts(0);
        displayYanksStrikes(0);
        displayMetsRuns(0);
        displayMetsOuts(0);
        displayMetsStrikes(0);
    }
}
