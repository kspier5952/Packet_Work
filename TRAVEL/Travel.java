public class Travel {
    private int people;

    public Travel( int n ) {
        people = n;
    }

    public int goByVan() {
        // Number of vans at 8 people per van
        int mv = people % 8;
        int v = people / 8;
        if ( mv > 0 ) {
            v += 1;
        }
        return v;
    }

    public int goByCanoe() {
        // Number of canoes at 3 per canoe
        int mc = people % 3;
        int c = people / 3;
        if ( mc > 0 ) {
            c += 1;
        }
        return c;
    }

    public int goByPlane() {
        // Number of planes at 12 per plane
        int mp = people % 12;
        int p = people / 12;
        if ( mp > 0 ) {
            p += 1;
        }
        return p;
    }
}