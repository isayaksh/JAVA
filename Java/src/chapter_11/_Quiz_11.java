package chapter_11;

public class _Quiz_11 {
    public static void main(String[] args) {
        int errorCode = 1;

        try {
            if(errorCode == 0){
                System.out.println("상품 구매를 완료하였습니다.");
            } else if (errorCode == 1) {
                throw new ExceedingProductPurchaseTimeException("상품 구매 가능 시간이 아닙니다.");
            } else if (errorCode == 2) {
                throw new ProductSoldOutException("해당 상품은 매진되었습니다.");
            }
        } catch (ExceedingProductPurchaseTimeException e){
            System.out.println(e.getMessage());
            System.out.println("상품 구매는 20시부터 가능합니다.");
        } catch (ProductSoldOutException e){
            System.out.println(e.getMessage());
            System.out.println("다음 기회에 이용해주세요.");
        }

    }
}

// 상품 구매 가능 시간 초과
class ExceedingProductPurchaseTimeException extends Exception {
    public ExceedingProductPurchaseTimeException(String message) {
        super(message);
    }
}

// 상품 매진
class ProductSoldOutException extends Exception {
    public ProductSoldOutException(String message) {
        super(message);
    }
}