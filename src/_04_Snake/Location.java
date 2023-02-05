package _04_Snake;



public class Location {
			private int x;
		private int y;
		public Location(int x2, int y2) {
			// TODO Auto-generated constructor stub
			this.setX(x2);
			this.setY(y2);
					
		}
		public boolean equals(Location location) {
			if(getX() == location.getX() && getY() == location.getY()) {
				return true;
			} else {
				return false;
			}
		}
		public int getX() {
			return x;
		}
		public void setX(int x) {
			this.x = x;
		}
		public int getY() {
			return y;
		}
		public void setY(int y) {
			this.y = y;
		}
	}

