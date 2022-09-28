package javas.oop;

public class ErrorMessage {
  public static void main(String[] args) {
    ErrorInfo err = new ErrorInfo();
    Err e;
    e = err.getErrorInfo(2);
    System.out.println(e.msg + " mức độ nghiêm trọng : " + e.serverity);

  }

}

class Err {
  String msg;      // thong bao loi
  int    serverity;// hien thi do nghiem trong

  Err(String m, int s) {
    msg = m;
    serverity = s;
  }
}

class ErrorInfo {
  String msgs[]   = { "lỗi xuất", "lỗi nhập", "ổ đĩa đầy", " chỉ số vượt quá giới hạn mảng" };
  int    howbad[] = { 3, 3, 2, 4 };

  Err getErrorInfo(int i) {
    if (i >= 0 & i < msgs.length)
      return new Err(msgs[i], howbad[i]);
    else {
      return new Err("mã lloixc không hợp lệ ", 0);
    }
  }
  
}