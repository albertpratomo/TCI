package BasicStatistic;

import java.util.ArrayList;

/**
 * very simple implementation of the BasicStatistic.BasicStatisticInterface
 */
public class BasicStatistic implements BasicStatisticInterface {

    private ArrayList<Double> data = new ArrayList<Double>();

    @Override
    public void addDoubleToData(Double valueToAdd){
        data.add(valueToAdd);
    }

    @Override
    public void clearData(){
        data.clear();
    };
	
    @Override
    public int numberOfDataItems(){
        return data.size();
    }

    @Override
    public Double sum(){
        Double sum = 0.0;

        for (int i = 0; i < data.size(); i++) {
            sum += data.get(i);
        }

        return sum;
    }

    @Override
    public Double highestValue() throws NoDataItemsException {
        double max = 0.0;

        for (int i = 0; i < data.size(); i++) {
            if (data.get(i) > max){
                max = data.get(i);
            }
        }

        return max;
    }

    @Override
    public Double getMean() throws NoDataItemsException {
        return sum()/numberOfDataItems();
    }

    @Override
    public double getMedian() throws NoDataItemsException {
        int index = numberOfDataItems()/2;

        //if odd number of data items
        if (numberOfDataItems()%2 != 0){
            return data.get(index);
        }
        //if even number of data items
        else{
            return (data.get(index)+data.get(index+1))/2;
        }
    }

    @Override
    public double getStandardDeviation() throws NoDataItemsException {
        Double mean = getMean();
        Double temp = 0.0;

        for (int i = 0; i < data.size(); i++)
        {
            Double val = data.get(i);

            Double squrDiffToMean = Math.pow(val - mean, 2);

            temp += squrDiffToMean;
        }

        Double meanOfDiffs = (Double) temp / (double) (data.size());

        return Math.sqrt(meanOfDiffs);
    }
}
