package org.bridgelabz;

import com.opencsv.bean.CsvBindByName;

public class CSVState {
    @CsvBindByName
    private int srNo;

    @CsvBindByName
    private String stateName;

    @CsvBindByName
    private String TIN;

    @CsvBindByName
    private String stateCode;

    public CSVState() {
    }

    public CSVState(int srNo, String stateName, String TIN, String stateCode) {
        this.srNo = srNo;
        this.stateName = stateName;
        this.TIN = TIN;
        this.stateCode = stateCode;
    }

    public int getSrNo() {
        return srNo;
    }

    public String getStateName() {
        return stateName;
    }

    public String getTIN() {
        return TIN;
    }

    public String getStateCode() {
        return stateCode;
    }

    @Override
    public String toString() {
        return "CSVUser{" +
                "srNo=" + srNo +
                ", stateName='" + stateName + '\'' +
                ", TIN='" + TIN + '\'' +
                ", stateCode='" + stateCode + '\'' +
                '}';
    }
}
