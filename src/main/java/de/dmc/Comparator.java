package de.dmc;

public interface Comparator<T>
{

	public int compare(T a, T b);

	public default Comparator<T> reversed()
	{
		return new RC<T>(this);
	}


	static class RC<T> implements Comparator<T>
	{
		private final Comparator<T> cmp;

		public RC(Comparator<T> cmp)
		{
			this.cmp = cmp;
		}

		@Override
		public int compare(T a, T b)
		{
			return cmp.compare(b, a);
		}

	}
}
