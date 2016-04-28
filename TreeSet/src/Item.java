import java.util.Objects;

/**
 * Created by mavis on 4/21/16.
 * Item with a description and a part number.
 */
public class Item implements Comparable<Item>{
    private String description;
    private int partNumber;

    public Item(String description, int partNumber)
    {
        this.description = description;
        this.partNumber = partNumber;
    }

    /**
     * Get description of item.
     * @return the description
     */
    public String getDescription(){ return description;}
    public String toString()
    {
        return "[description = " + description + " partNumber = " + partNumber + "]";
    }
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o== null) return false;
        if (getClass() != o.getClass()) return false;
        Item otherObject = (Item)o;
        return this.getDescription().equals(otherObject.getDescription())
                && this.partNumber == otherObject.partNumber;
    }
    public int hashCode(){ return Objects.hash(description, partNumber);}
    public int compareTo(Item o) {
        return Integer.compare(this.partNumber, o.partNumber);
    }
}
