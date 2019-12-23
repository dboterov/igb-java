package co.igb.dto;

/**
 * @author dbotero
 */
public class SortedStockDTO implements Comparable<SortedStockDTO> {

    private long binAbs;
    private int availableQuantity;
    private int orderNumber;
    private int pendingQuantity;
    private int openQuantity;
    private int quantity;
    private String itemCode;
    private String itemName;
    private String binCode;
    private String velocity;
    private String binLocationType;
    private Integer sequence;
    private Integer lineNum;

    public SortedStockDTO(Object[] dbData) {
        itemCode = (String) dbData[0];
        openQuantity = (Integer) dbData[1];
        quantity = (Integer) dbData[2];
        binAbs = ((Integer) dbData[3]).longValue();
        availableQuantity = (Integer) dbData[4];
        binCode = (String) dbData[5];
        itemName = (String) dbData[6];
        orderNumber = (Integer) dbData[7];
        velocity = (String) dbData[8];
        sequence = (Integer) dbData[9];
        binLocationType = (String) dbData[10];
        lineNum = (Integer) dbData[11];
    }

    public int getPendingQuantity() {
        return pendingQuantity;
    }

    public void setPendingQuantity(int pendingQuantity) {
        this.pendingQuantity = pendingQuantity;
    }

    public String getItemCode() {
        return itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public int getOpenQuantity() {
        return openQuantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public long getBinAbs() {
        return binAbs;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public String getBinCode() {
        return binCode;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setVelocity(String velocity) {
        this.velocity = velocity;
    }

    public String getVelocity() {
        return velocity;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public String getBinLocationType() {
        return binLocationType;
    }

    public Integer getLineNum() {
        return lineNum;
    }

    public void setLineNum(Integer lineNum) {
        this.lineNum = lineNum;
    }

    @Override
    public int compareTo(SortedStockDTO o) {
        if (o == null || o.getBinCode() == null) {
            return 1;
        }

        if (this.velocity.equals(o.getVelocity())) {
            return this.sequence.compareTo(o.getSequence());
        }

        return this.velocity.compareTo(o.getVelocity());
    }

    @Override
    public String toString() {
        return "SortedStockDTO{" +
                "itemCode='" + itemCode + '\'' +
                ", itemName='" + itemName + '\'' +
                ", openQuantity=" + openQuantity +
                ", quantity=" + quantity +
                ", binAbs=" + binAbs +
                ", availableQuantity=" + availableQuantity +
                ", binCode='" + binCode + '\'' +
                ", orderNumber=" + orderNumber +
                ", pendingQuantity=" + pendingQuantity +
                ", velocity='" + velocity + '\'' +
                ", sequence=" + sequence +
                ", binLocationType='" + binLocationType + '\'' +
                ", lineNum=" + lineNum +
                '}';
    }
}