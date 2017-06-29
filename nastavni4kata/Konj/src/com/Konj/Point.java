package com.Konj;

public class Point {

	// x predstavuva horezuntalna pozicija
	// pocnuva od 1 do 8
	// 1 e najlevo 8 e najdesno
	int x;
	// vertikalna od 1 do 8
	// 1 najgore 8 e najdolu
	int y;

	public Point(int x, int y) {
		if (x > 0 && x < 9) {
			this.x = x;
		} else {
			throw new RuntimeException("mora interval od [1,8]");
		}
		if (y > 0 && y < 9) {
			this.y = y;
		} else {
			throw new RuntimeException("mora interval od [1,8]");
		}

	}

	@Override
	public String toString() {
		return x + " , " + y;
	}
}
