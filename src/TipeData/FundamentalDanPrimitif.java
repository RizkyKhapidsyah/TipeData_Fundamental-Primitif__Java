/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TipeData;

/**
 *
 * @author RizkyKhapidsyah
 */
public class FundamentalDanPrimitif {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //  Tipe Data di Java: int, byte, short, long, double, float, char, boolean 

        int i = 0; //Integer | Nilai Maksimum = 2147483647

        System.out.println("-------------------------------------------");
        System.out.println("TIPE DATA: INTEGER (int)");
        System.out.println("-------------------------------------------");
        System.out.println("Nilai Integer: i          = " + i);                               //Nilai sesuai dengan yang di masukkan (assignment)
        System.out.println("Nilai Maksimum: Integer   = " + Integer.MAX_VALUE);               //Rentang nilai Maksimum tipe data Integer
        System.out.println("Nilai Minimum: Integer    = " + Integer.MIN_VALUE);               //Rentang nilai Minimum tipe data Integer
        System.out.println("Jumlah Memori: Integer    = " + Integer.BYTES + " Bytes");        //Jumlah Ukuran Penempatan Memori dari Tipe Data Integer
        System.out.println("Size/Ukuran: Integer      = " + Integer.SIZE + " Bit \n");        //1 Byte = 8 Bit, maka 4 Bytes = 32 Bi

        byte b = 0; //Byte | Nilai Maksimum = 127
        System.out.println("-------------------------------------------");
        System.out.println("TIPE DATA: Byte (byte)");
        System.out.println("-------------------------------------------");
        System.out.println("Nilai Byte: b          = " + b);                                    //Nilai sesuai dengan yang di masukkan (assignment)
        System.out.println("Nilai Maksimum: Byte   = " + Byte.MAX_VALUE);                       //Rentang nilai Maksimum tipe data Byte
        System.out.println("Nilai Minimum: Byte    = " + Byte.MIN_VALUE);                       //Rentang nilai Minimum tipe data Byte
        System.out.println("Jumlah Memori: Byte    = " + Byte.BYTES + " Byte");                 //Jumlah Ukuran Penempatan Memori dari Tipe Data Byte
        System.out.println("Size/Ukuran: Byte      = " + Byte.SIZE + " Bit \n");                //1 Byte = 8 Bit

        short s = 0; //Short | Nilai Maksimum = 127
        System.out.println("-------------------------------------------");
        System.out.println("TIPE DATA: Short (short)");
        System.out.println("-------------------------------------------");
        System.out.println("Nilai Short: s          = " + s);                                   //Nilai sesuai dengan yang di masukkan (assignment)
        System.out.println("Nilai Maksimum: Short   = " + Short.MAX_VALUE);                     //Rentang nilai Maksimum tipe data Short
        System.out.println("Nilai Minimum: Short    = " + Short.MIN_VALUE);                     //Rentang nilai Minimum tipe data Short
        System.out.println("Jumlah Memori: Short    = " + Short.BYTES + " Bytes");              //Jumlah Ukuran Penempatan Memori dari Tipe Data Short
        System.out.println("Size/Ukuran: Short      = " + Short.SIZE + " Bit \n");              //1 Byte = 8 Bit, maka 2 Bytes = 16 Bit

        float f = 2.5f; //Float | Nilai Maksimum = 3.4028235E38, 'f' menandakan tipe data 'float' pada nilai
        System.out.println("-------------------------------------------");
        System.out.println("TIPE DATA: Float (float)");
        System.out.println("-------------------------------------------");
        System.out.println("Nilai Float: f          = " + f);                                    //Nilai sesuai dengan yang di masukkan (assignment)
        System.out.println("Nilai Maksimum: Float  = " + Float.MAX_VALUE);                       //Rentang nilai Maksimum tipe data Float
        System.out.println("Nilai Minimum: Float   = " + Float.MIN_VALUE);                       //Rentang nilai Minimum tipe data Float
        System.out.println("Jumlah Memori: Float   = " + Float.BYTES + " Bytes");                //Jumlah Ukuran Penempatan Memori dari Tipe Data Float
        System.out.println("Size/Ukuran: Float     = " + Float.SIZE + " Bit \n");                //1 Byte = 8 Bit, maka 4 Bytes = 32 Bit

        double d = 2.5d; //Double | Nilai Maksimum = 1.7976931348623157E308, 'd' menandakan tipe data 'double' pada nilai
        System.out.println("-------------------------------------------");
        System.out.println("TIPE DATA: Double (double)");
        System.out.println("-------------------------------------------");
        System.out.println("Nilai Double: d          = " + d);                                     //Nilai sesuai dengan yang di masukkan (assignment)
        System.out.println("Nilai Maksimum: Double  = " + Double.MAX_VALUE);                      //Rentang nilai Maksimum tipe data Double
        System.out.println("Nilai Minimum: Double   = " + Double.MIN_VALUE);                      //Rentang nilai Minimum tipe data Double
        System.out.println("Jumlah Memori: Double   = " + Double.BYTES + " Bytes");               //Jumlah Ukuran Penempatan Memori dari Tipe Data Double
        System.out.println("Size/Ukuran: Double     = " + Double.SIZE + " Bit \n");               //1 Byte = 8 Bit, maka 8 Bytes = 64 Bit

        long l = 25L; //Long | Nilai Maksimum = 9223372036854775807, 'L' menandakan tipe data 'long' pada nilai
        System.out.println("-------------------------------------------");
        System.out.println("TIPE DATA: Long (long)");
        System.out.println("-------------------------------------------");
        System.out.println("Nilai Long: l          = " + l);                                    //Nilai sesuai dengan yang di masukkan (assignment)
        System.out.println("Nilai Maksimum: Long   = " + Long.MAX_VALUE);                       //Rentang nilai Maksimum tipe data Long
        System.out.println("Nilai Minimum: Long    = " + Long.MIN_VALUE);                       //Rentang nilai Minimum tipe data Long
        System.out.println("Jumlah Memori: Long    = " + Long.BYTES + " Bytes");                //Jumlah Ukuran Penempatan Memori dari Tipe Data Long
        System.out.println("Size/Ukuran: Long      = " + Long.SIZE + " Bit \n");                //1 Byte = 8 Bit, maka 8 Bytes = 64 Bit

        char c = 'c';
        System.out.println("-------------------------------------------");
        System.out.println("TIPE DATA: Character (char)");
        System.out.println("-------------------------------------------");
        System.out.println("Nilai Char: c          = " + c);                                    //Nilai sesuai dengan yang di masukkan (assignment)
        System.out.println("Nilai Maksimum: Char   = " + Character.MAX_VALUE);                  //Rentang nilai Maksimum tipe data Char (berupa simbol)
        System.out.println("Nilai Minimum: Char    = " + Character.MIN_VALUE);                  //Rentang nilai Minimum tipe data Char (berupa simbol)
        System.out.println("Jumlah Memori: Char    = " + Character.BYTES + " Bytes");           //Jumlah Ukuran Penempatan Memori dari Tipe Data Long
        System.out.println("Size/Ukuran: Char      = " + Character.SIZE + " Bit \n");           //1 Byte = 8 Bit, maka 2 Bytes = 16 Bit

        boolean bool = true; //misalnya: true
        System.out.println("-------------------------------------------");
        System.out.println("TIPE DATA: Boolean. (boolean)");
        System.out.println("-------------------------------------------");
        System.out.println("Nilai Boolean: bool       = " + bool);                              //Nilai sesuai dengan yang di masukkan (assignment)
        System.out.println("Nilai Maksimum: Boolean   = " + Boolean.TRUE);                      //Rentang nilai Maksimum tipe data Char (berupa simbol)
        System.out.println("Nilai Minimum: Boolean    = " + Boolean.FALSE);                     //Rentang nilai Minimum tipe data Char (berupa simbol)

        // Peringatan Untuk tipedata Integer (berlaku juga untuk tipe data lainnya kecuali 'char' dan 'boolean'
        System.out.println("\n\nWarning:");
        System.out.println("-------------------------------------------------");
        System.out.println("Jika nilai i = " + Integer.MAX_VALUE + " (Nilai Maksimum) \nditambahkan dengan 1 atau [" + Integer.MAX_VALUE + " + 1],");
        System.out.printf("Maka hasilnya sebagai berikut:\n=> %d + %d = %d\n", Integer.MAX_VALUE, 1, (Integer.MAX_VALUE + 1));
        System.out.println("-------------------------------------------------");
        System.out.println("Jika nilai i = " + Integer.MIN_VALUE + " (Nilai Minimum) \ndikurangkan dengan 1 atau [" + Integer.MIN_VALUE + " - 1],");
        System.out.printf("Maka hasilnya sebagai berikut:\n=> %d - %d = %d\n\n\n", Integer.MIN_VALUE, 1, (Integer.MIN_VALUE - 1));
    }
}
