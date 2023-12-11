import java.util.List;

/**
 * 配送管理クラス
 */
public class DeliveryManager {
  /**
   * 配送料を返す。
   * @param products 配送対象の商品リスト
   * @return 配送料
   */
  public static int deliveryCharge(List<Product> products) {
    int charge = 0;
    int totalPrice = 0;
    for (Product each : products) {
      totalPrice += each.price;
    }
    if (totalPrice < 2000) {
      charge = 500;
    }
    else {
      charge = 0;
    }
    return charge;
  }
}
