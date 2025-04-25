package ThanhToan;

public class ThanhToanTienMat implements IThanhToan {
    @Override
    public void ThanhToan(double soTien) {
        System.out.println("Thanh toán bằng tiền mặt: " + soTien + " VND");
    }
}
