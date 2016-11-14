package com.droidaddiction.www.loginscreen;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.text.method.LinkMovementMethod;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Eric Echeverri on 11/9/16.
 */
public class AboutDialogFragment extends DialogFragment {
    private static final String tag = "AboutDialog";

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        final View view = inflater.inflate(R.layout.dialog_about, null);

        //make links clickable
        TextView copyright = (TextView) view.findViewById(R.id.msg_copyright);
        copyright.setMovementMethod(LinkMovementMethod.getInstance());
        TextView support = (TextView) view.findViewById(R.id.msg_support);
        support.setMovementMethod(LinkMovementMethod.getInstance());
        TextView phone = (TextView) view.findViewById(R.id.msg_phonenumber);
        phone.setMovementMethod(LinkMovementMethod.getInstance());
        TextView website = (TextView) view.findViewById(R.id.msg_website);
        website.setMovementMethod(LinkMovementMethod.getInstance());

        //fill in the app version
        TextView version = (TextView) view.findViewById(R.id.version);
        try{
            PackageInfo pInfo = getActivity().getPackageManager().getPackageInfo(getActivity().getPackageName(), 0);
            version.setText(getString(R.string.version, pInfo.versionName));

        } catch (PackageManager.NameNotFoundException e) {
            Log.d(tag,"Error getting version",e);
        }

        builder.setView(view)
                .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        AboutDialogFragment.this.getDialog().dismiss();
                    }
                });

        return builder.create();
    }
}
