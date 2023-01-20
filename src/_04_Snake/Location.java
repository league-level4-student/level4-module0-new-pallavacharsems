package _04_Snake;



public class Location {
			private int x;
		private int y;
		public boolean equals(Location location) {
			if(x == location.x && y == location.y) {
				return true;
			} else {
				return false;
			}
		}
	}

