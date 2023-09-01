public class PrimitiveToWrapperInteger {
    public Integer xValue = 227882;
    public Integer yValue = 270283;
    public Integer pIntegerValue = 3789673;
    public String sIntegerValue = "74839929";

    public Integer getIntegerWrapperFromPrimitive(){
        return Integer.valueOf(pIntegerValue);
    }
    public Integer getIntegerFromStringValue(){
        return Integer.valueOf(sIntegerValue);
    }
    public Integer getIntegerBitFromIntegerValue(){
        return Integer.bitCount(pIntegerValue);

    }
    /*
        This method returns the value zero if (x==y), if (x < y) then it returns a value less than zero and
        if (x > y) then it returns a value greater than zero.
    */
    public Integer compareTwoValue(){
        return Integer.compare(xValue,yValue);
    }
}