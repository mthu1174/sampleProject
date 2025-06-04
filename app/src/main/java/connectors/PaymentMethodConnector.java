package connectors;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.models.PaymentMethod;
import com.example.models.ListPaymentMethod;

public class PaymentMethodConnector {
    ListPaymentMethod listPaymentMethod;

    public PaymentMethodConnector() {
        listPaymentMethod = new ListPaymentMethod();
    }

    public ListPaymentMethod getAllPaymentMethods(SQLiteDatabase db) {
        ListPaymentMethod list = new ListPaymentMethod();
        Cursor cursor = db.rawQuery("SELECT * FROM PaymentMethod", null);
        while (cursor.moveToNext()) {
            int id = cursor.getInt(0);
            String name = cursor.getString(1);
            String description = cursor.getString(2);
            list.add(new PaymentMethod(id, name, description));
        }
        cursor.close();
        return list;
    }


}
