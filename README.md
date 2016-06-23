#Observer

##结构
1. Observer + Observable
    ```java
    interface Observer {
      update(Observable obs, Object arg):void
    }
    class Observable {
      changed: boolean
      observers: Vector<Observer>
      addObserver(Observer):void
      deleteObserver(Observer):void
      deleteObservers():void
      notifyObserver(Object): void
      notifyObservers():void
      hasChanged(): boolean
      countObservers(): int
    }
    ```
2. call form
```
  observer.add(observerable);
```
3. 从增删改查的角度分析Observable
    * add
      Observable.add(Observer)
    * remove
      Observable.deleteObserver
    * update
      Observable.setChanged/.notifyobservers
    * find
# degin-patterns
