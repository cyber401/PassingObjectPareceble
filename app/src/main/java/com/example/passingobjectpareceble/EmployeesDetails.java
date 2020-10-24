package com.example.passingobjectpareceble;

import android.os.Parcel;
import android.os.Parcelable;

public class EmployeesDetails implements Parcelable {
    private int phone;
    private String Name, Address, State;
    private float salary;
    private Boolean value;

    protected EmployeesDetails(Parcel in) {
        phone = in.readInt();
        Name = in.readString();
        Address = in.readString();
        State = in.readString();
        salary = in.readFloat();
        value = in.readInt() == 1;
       // byte tmpValue = in.readByte();//this is a great way to save some memory
       // value = tmpValue == 0 ? null : tmpValue == 1;  // }(a>b)?System.out.print(“a is greater”) : System.out.print(“b is greater”); its a ternery operator
    }


    public static final Creator<EmployeesDetails> CREATOR = new Creator<EmployeesDetails>() {
        @Override
        public EmployeesDetails createFromParcel(Parcel in) {
            return new EmployeesDetails(in);
        }

        @Override
        public EmployeesDetails[] newArray(int size) {
            return new EmployeesDetails[size];
        }
    };

    public int getPhone() {
        return phone;
    }

    public String getName() {
        return Name;
    }

    public String getAddress() {
        return Address;
    }

    public String getState() {
        return State;
    }

    public float getSalary() {
        return salary;
    }

    public Boolean getValue() {
        return value;
    }

    public EmployeesDetails(int phone, String name, String address, String state, float salary, Boolean value) {
        this.phone = phone;
        Name = name;
        Address = address;
        State = state;
        this.salary = salary;
        this.value = value;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(phone);
        dest.writeString(Name);
        dest.writeString(Address);
        dest.writeString(State);
        dest.writeFloat(salary);
        dest.writeInt(value ? 1:0);
        //dest.writeByte((byte) ((value == null) ? 0 : (value ? 1 : 2)));
    }
}
