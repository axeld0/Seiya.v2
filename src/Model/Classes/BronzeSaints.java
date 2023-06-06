package Model.Classes;

import java.util.Comparator;
import java.util.HashSet;

public class BronzeSaints <T>  {

    private HashSet<T> bronzesaints;

    public BronzeSaints(HashSet<T> bronzesaints) {
        this.bronzesaints = bronzesaints;
    }

    public BronzeSaints()
    {
        bronzesaints = new HashSet<T>();
    }

    public void addSaint(T element)
    {
        if(element instanceof AthenaSaint)
        {
            if(((AthenaSaint) element).getHp() > 0 && ((AthenaSaint) element).getPower()>=1) bronzesaints.add(element);
            else
            {
                throw new NoCosmosException("DANGER!");
            }
        }
        else {
            throw new IllegalArgumentException();
        }
    }

    public void deleteSaint (T element)
    {
        if(element instanceof AthenaSaint)
        {
            bronzesaints.remove(element);
        }
        else{
            throw  new IllegalArgumentException();
        }
    }

    public String seeSaints()
    {
        StringBuilder sb = new StringBuilder("Saints: \n");
        for( T element : bronzesaints)
        {
            if(element instanceof AthenaSaint)
            {
                sb.append(element.toString());
            }
        }
        return sb.toString();
    }


    public HashSet<T> getBronzesaints() {
        return bronzesaints;
    }

    public void setBronzesaints(HashSet<T> bronzesaints) {
        this.bronzesaints = bronzesaints;
    }
}
