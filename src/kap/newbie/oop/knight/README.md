Рыцарь. Определить иерархию амуниции рыцаря. Операции с рыцарем:

Вывести характеристики рыцаря
Вывести список амуниции рыцаря
Экипировать рыцаря, что должно отразиться на его характеристиках (например вес, сила атаки и т.д.)
Провести сортировку амуниции на основе одного из параметров
Найти элементы амуниции, соответствующие заданному диапазону параметров.

Пример ввода/вывода
Main menu:
1. Print knight stats
2. Show ammunition
3. Equip ammunition
4. Sort ammunition
5. Search ammunition
6. Exit
Choose option:
2
Sword{damage=10, weight=20, cost=30}
Helmet{protection=30, weight=10, cost=20}
Main menu:
1. Print knight stats
2. Show ammunition
3. Equip ammunition
4. Sort ammunition
5. Search ammunition
6. Exit
Choose option:
3
What kind of ammunition do you want to equip?
1. Sword
2. Helmet
Choose option:
1
Input sword weight:
100
Input sword cost:
2
Input sword damage:
30
Main menu:
1. Print knight stats
2. Show ammunition
3. Equip ammunition
4. Sort ammunition
5. Search ammunition
6. Exit
Choose option:
2
Sword{damage=10, weight=20, cost=30}
Helmet{protection=30, weight=10, cost=20}
Sword{damage=30, weight=100, cost=2}
Main menu:
1. Print knight stats
2. Show ammunition
3. Equip ammunition
4. Sort ammunition
5. Search ammunition
6. Exit
Choose option:
1
Ammunition cost: 52
Ammunition weight: 130
Ammunition damage: 40
Ammunition protection: 30
Main menu:
1. Print knight stats
2. Show ammunition
3. Equip ammunition
4. Sort ammunition
5. Search ammunition
6. Exit
Choose option:
4
Choose sort type:
1. Cost
2. Weight
Choose option:
2
Helmet{protection=30, weight=10, cost=20}
Sword{damage=10, weight=20, cost=30}
Sword{damage=30, weight=100, cost=2}
Main menu:
1. Print knight stats
2. Show ammunition
3. Equip ammunition
4. Sort ammunition
5. Search ammunition
6. Exit
Choose option:
5
Choose search field:
1. Cost
2. Weight
Choose option:
1
Input minimum cost: 
0
Input maximum cost: 
5
Sword{damage=30, weight=100, cost=2}
Main menu:
1. Print knight stats
2. Show ammunition
3. Equip ammunition
4. Sort ammunition
5. Search ammunition
6. Exit
Choose option:
6
Bye!
Общие требования
Использовать возможности ООП: классы, наследование, полиморфизм, инкапсуляция.
Каждый класс должен иметь исчерпывающее смысл название и информативный состав.
Наследование должно применяться только тогда, когда это имеет смысл - не стоит создавать иерархию классов, изменяя в каждом классе какое-либо поле. Наследование должно менять поведение класса.
Код должен соответствовать Java Code Convention.
Классы должны быть грамотно разложены по пакетам.
Для хранения параметров инициализации можно использовать файлы.
При сортировке использовать встроенные средства Java
Сортировку производить при помощи класса Comparator или интерфейса Comparable
Использование Java Collection Framework (за исключением java.util.Arrays) запрещено