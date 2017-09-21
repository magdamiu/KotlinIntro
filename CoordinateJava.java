// CoordinateJavaJava.java
package magdamiu.com.kotlinintro;

import org.jetbrains.annotations.NotNull;

public final class CoordinateJava {
    private double lat;
    private double lon;

    public final double getLat() {
        return this.lat;
    }

    public final void setLat(double var1) {
        this.lat = var1;
    }

    public final double getLon() {
        return this.lon;
    }

    public final void setLon(double var1) {
        this.lon = var1;
    }

    public CoordinateJava(double lat, double lon) {
        this.lat = lat;
        this.lon = lon;
    }

    public final double component1() {
        return this.lat;
    }

    public final double component2() {
        return this.lon;
    }

    @NotNull
    public final CoordinateJava copy(double lat, double lon) {
        return new CoordinateJava(lat, lon);
    }

    // $FF: synthetic method
    // $FF: bridge method
    @NotNull
    public static CoordinateJava copy$default(CoordinateJava var0, double var1, double var3, int var5, Object var6) {
        if ((var5 & 1) != 0) {
            var1 = var0.lat;
        }

        if ((var5 & 2) != 0) {
            var3 = var0.lon;
        }

        return var0.copy(var1, var3);
    }

    public String toString() {
        return "CoordinateJava(lat=" + this.lat + ", lon=" + this.lon + ")";
    }

    public int hashCode() {
        long var10000 = Double.doubleToLongBits(this.lat);
        int var1 = (int) (var10000 ^ var10000 >>> 32) * 31;
        long var10001 = Double.doubleToLongBits(this.lon);
        return var1 + (int) (var10001 ^ var10001 >>> 32);
    }

    public boolean equals(Object var1) {
        if (this != var1) {
            if (var1 instanceof CoordinateJava) {
                CoordinateJava var2 = (CoordinateJava) var1;
                if (Double.compare(this.lat, var2.lat) == 0 && Double.compare(this.lon, var2.lon) == 0) {
                    return true;
                }
            }

            return false;
        } else {
            return true;
        }
    }
}
