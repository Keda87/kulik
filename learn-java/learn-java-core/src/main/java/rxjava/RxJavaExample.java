package rxjava;

import rx.Observable;
import rx.Observer;

import java.util.Arrays;
import java.util.List;

/**
 * Created by adiyatmubarak on 10/22/16.
 */
public class RxJavaExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Android", "Ubuntu", "OSX");
        Observable<List<String>> listObservable = Observable.just(list);
        listObservable.subscribe(new Observer<List<String>>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onNext(List<String> strings) {
                System.out.println(strings);
            }
        });
    }
}
