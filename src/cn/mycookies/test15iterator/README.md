# 模式定义
提供一个方法顺序访问一个聚合对象中的各个元素，而又不暴露其内部的表示。

# 类图        
[](../../../../images/15_iterator.jpg)    

# Jdk中实现
各种集合类都有实现，如果想自己实现迭代器，被访问的类实现Iterable接口，具体迭代器实现Iterator接口即可。
Iterable
Iterator                                                               