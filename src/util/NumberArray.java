package util;

public class NumberArray
{
	private long[] longs;
	private double[] doubles;

	public NumberArray(int length)
	{
		longs = new long[length];
		doubles = new double[length];
	}
	
	public int length()
	{
		return longs.length;
	}

	public byte getByte(int i)
	{
		return (byte) longs[i];
	}

	public void setByte(int i, byte v)
	{
		longs[i] = v;
		doubles[i] = v;
	}

	public short getShort(int i)
	{
		return (short) longs[i];
	}

	public void setShort(int i, short v)
	{
		longs[i] = v;
		doubles[i] = v;
	}

	public int getInt(int i)
	{
		return (int) longs[i];
	}

	public void setInt(int i, int v)
	{
		longs[i] = v;
		doubles[i] = v;
	}

	public long getLong(int i)
	{
		return longs[i];
	}

	public void setLong(int i, long v)
	{
		longs[i] = v;
		doubles[i] = v;
	}

	public float getFloat(int i)
	{
		return (float) doubles[i];
	}

	public void setFloat(int i, float v)
	{
		longs[i] = (long) v;
		doubles[i] = v;
	}

	public double getDouble(int i)
	{
		return doubles[i];
	}

	public void setDouble(int i, double v)
	{
		longs[i] = (long) v;
		doubles[i] = v;
	}
}