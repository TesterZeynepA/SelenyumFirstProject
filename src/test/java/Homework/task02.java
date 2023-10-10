package Homework;

public class task02 {

/**Task02: //get () methodu ile navigate to()  methodu arasındaki farklar ?
 * */

/**
 * get() ve navigate.to() yöntemleri, web tarayıcı otomasyonunda kullanılan iki farklı işlevi ifade eder. Bu yöntemler, genellikle Selenium gibi otomasyon araçlarının veya tarayıcıların otomasyonu için kullanılır. İşte bu iki yöntem arasındaki farkları açıklayan açıklamalar:
 *
 * get() Yöntemi:
 *
 * get() yöntemi, belirtilen URL'yi açmak ve tarayıcıyı belirtilen URL'ye yönlendirmek için kullanılır.
 * Bu yöntem, tarayıcının mevcut oturumunu temizlemeden veya önceki geçmişi etkilemeden yeni bir sayfaya gitmek için kullanışlıdır.
 * Kullanımı örneği: driver.get("https://www.example.com")
 * navigate.to() Yöntemi:
 *
 * navigate.to() yöntemi, belirtilen URL'ye yönlendirme yapar, ancak bu yöntemle önceki tarayıcı geçmişi ve oturum etkilenebilir.
 * Bu yöntem, tarayıcı geçmişini ve oturumu yönetmek ve sayfa gezinimi sırasında geri veya ileri gitmek için kullanılır.
 * Kullanımı örneği: driver.navigate().to("https://www.example.com")
 *
 *
 *
 *
 *
 * Diyelim ki bir otomasyon senaryosunda, bir ana sayfada belirli bir işlemi
 * gerçekleştirdikten sonra başka bir sayfaya yönlendirmeniz gerekiyor. İlk
 * sayfada get() yöntemini kullanabilirsiniz. Ancak ardından bu sayfadaki işlemleri
 * tamamladıktan sonra, ikinci sayfaya navigate.to() yöntemiyle yönlendirebilirsiniz
 * ve bu şekilde tarayıcı geçmişi kaydedilir.

 Özetle, get() yöntemi yeni bir sayfa açmak için kullanılırken,
 navigate.to() yöntemi sayfa geçmişini yönetmek ve önceki sayfalara geri dönmek gibi işlemler için kullanılır.


 Bunu bir örnekle şöyle açıklayabilirim: Selenium da bir otomasyon senaryosu düşünelim.
 Bir ana sayfada belirli bir işlemi gerçekleştirdikten sonra başka bir sayfaya yönlendirme yapmak istiyoruz.
 İlk sayfada get() yöntemini kullanabiliriz. Ancak daha sonra bu sayfadaki işlemleri tamamlayınca, ikinci sayfaya
 navigate.to() ile yönlendirebiliriz. Bu şekilde yaptığımızda  tarayıcı geçmişi de kaydedilmiş olur.
 Yani, get()  yeni bir sayfa açmak için kullanılırken,
 navigate.to()  sayfa geçmişini yönetmek ve önceki sayfalara geri dönmek gibi işlemler için kullanılabiliyor.


 */




}
