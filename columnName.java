package codeing;

public class ColumnName {
	public void printString(int num) {
		StringBuilder colName = new StringBuilder();
		while(num>0) {
			int rem = num % 26;
			if(rem == 0) {
				colName.append('Z');
				num = (num/26)-1;
			}
			else {
				colName.append((char)((rem-1) + 'A'));
				num = num/26;
			}
		}
		System.out.println(colName.reverse());
	}
	public static void main(String[] args)
    {
		ColumnName col = new ColumnName();
        col.printString(26);
        col.printString(51);
        col.printString(52);
        col.printString(80);
        col.printString(676);
        col.printString(702);
        col.printString(705);
    }
}
