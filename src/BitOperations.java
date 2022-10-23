public class BitOperations {

    public static void main(String[] args) {
        int varsta = 12; //7 bits
        int sex = 0; //1 bit
        int inaltime = 168; //8 bits
        short info_impachetata; // 16 bits

        // packing
        info_impachetata = (short) (varsta); // casting
        info_impachetata = (short) (info_impachetata << 1);
        info_impachetata = (short) (info_impachetata | sex);
        info_impachetata = (short) (info_impachetata << 8);
        info_impachetata = (short) (info_impachetata | inaltime);

        // unpacking
        // X & 1 = X
        int inaltime2 = info_impachetata & 0xff;
        int sex2 = (info_impachetata >>> 8) & 1;
        int varsta2 = (info_impachetata >>> 9) & 0x7f;

        System.out.println(inaltime2);
        System.out.println(sex2);
        System.out.println(varsta2);
    }
}
