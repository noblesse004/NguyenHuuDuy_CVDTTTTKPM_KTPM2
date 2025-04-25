package ThanhToan;

public class Main {
    public static void main(String[] args) {
        IThanhToan tienMat = new ThanhToanTienMat();
        IThanhToan theTinDung = new ThanhToanTheTinDung();

        double soTien = 500000; 
        System.out.println("Mô phỏng thanh toán:");
        tienMat.ThanhToan(soTien);
        theTinDung.ThanhToan(soTien);
    }
}