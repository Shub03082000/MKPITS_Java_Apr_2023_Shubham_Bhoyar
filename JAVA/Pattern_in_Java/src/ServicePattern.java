public class ServicePattern {
    public void Pattern(int Pattern, int number){
        switch (Pattern){
            case 1:
                UpperHalfStarPatternRightAngle upperHalfStarPatternRightAngle=new UpperHalfStarPatternRightAngle();
                upperHalfStarPatternRightAngle.starPattern(number);
                LowerHalfStarPatternRightAngle lowerHalfStarPatternRightAngle1 = new LowerHalfStarPatternRightAngle();
                lowerHalfStarPatternRightAngle1.starPattern(number);
                break;
            case 2:
                ReverseStarPyramidPattern reverseStarPyramidPattern = new ReverseStarPyramidPattern();
                reverseStarPyramidPattern.starPattern(number);
                break;
            case 3:
                MergeReverseRightAngleStarPattern mergeReverseRightAngleStarPattern = new MergeReverseRightAngleStarPattern();
                mergeReverseRightAngleStarPattern.starPattern(number);
                MergeStarRightAngleLowerHalf mergeStarRightAngleLowerHalf = new MergeStarRightAngleLowerHalf();
                mergeStarRightAngleLowerHalf.starPattern(number);
                break;
            case 4:
                ReverseNumberPyramidPattern reverseNumberPyramidPattern = new ReverseNumberPyramidPattern();
                reverseNumberPyramidPattern.starPattern(number);
                NumberPyramidLowerHalf numberPyramidLowerHalf = new NumberPyramidLowerHalf();
                numberPyramidLowerHalf.starPattern(number);
                break;
            case 5:
                LowerHalfStarPatternRightAngle lowerStarPatternRightAngle = new LowerHalfStarPatternRightAngle();
                lowerStarPatternRightAngle.starPattern(number);
                break;
            case 6:
                ReverseStarPyramidPattern reverseStarPyramidPattern1 = new ReverseStarPyramidPattern();
                reverseStarPyramidPattern1.starPattern(number);
                LowerHalfStarPyramid lowerHalfStarPyramid = new LowerHalfStarPyramid();
                lowerHalfStarPyramid.starPattern(number);
        }
    }
}
