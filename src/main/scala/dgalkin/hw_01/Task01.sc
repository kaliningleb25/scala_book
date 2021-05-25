/*
task_01
In the Scala REPL, type 3. followed by the Tab key. What methods can be applied?
*/
var x = 3
//x.


/*
В intellij idea при вводе 3. не подсвечиваются доступные методы
Поэтому, я завел переменную, которой присвоил 3.
Для данной переменной доступны универсальные методы, как у наследника типа Any,
методы арифметических операций, а также методы числовых типов данных

*/


/*
task_02
In the Scala REPL, compute the square root of 3, and then square that value.
By how much doesthe result differ from 3? (Hint: The res variables are your friend.)
*/


math.sqrt(3)
math.pow(res0,2)
/*
val res0: Double = 1.7320508075688772
val res1: Double = 2.9999999999999996

 */

/*
task_03
Are the res variables val or var?
answer:
В intellij idea при создание пересенных res есть приписка, что они являются val
Но даже если бы этого не было, можно было бы проверить, являются ли res константой,
попытвшись присвоить ей значение. В итоге мы получим исключение reassignment to val
*/

/*
task_04
Scala lets you multiply a string with a number—
try out "crazy" * 3 in the REPL. What does this operation do?
Where can you find it in Scaladoc?
*/

"crazy" * 3
//result: val res2: String = crazycrazycrazy

/*
Прочитать об этом можно в
https://www.scala-lang.org/api/2.12.9/scala/collection/immutable/StringOps.html
в разделе ValueMembers - def *
*/


/*
task_05
What does 10 max 2 mean? In which class is the max method defined?
*/
2 max 10

/*
Это выражение возвращает больший операнд, данный метод определяется отдельно для кажлого типа
*/

/*
task_05
What does 10 max 2 mean? In which class is the max method defined?
*/


/*
task_06
Using BigInt, compute 2^1024
*/

BigInt ( 2 ) pow 1024

/*
task_07
What do you need to import so that you can get a random prime as probablePrime(100,Random),
without any qualifiers before probablePrime and Random?
*/

/*
Импортируем
BigInt.probablePrime
util.Random
*/
import BigInt.probablePrime
import scala.util.Random

probablePrime(100,Random)


/*
task_08
One way to create random file or directory names is to produce a random BigInt and
convert it to base 36, yielding a string such as "qsnvbevtomcj38o06kul".
Poke around Scaladoc to find a way of doing this in Scala.
*/

val random_36 = probablePrime(100,Random).toString(36)
/*
probablePrime(100,Random ).toString (36)
Решение нашел тут: https://zyst.io/scala-produce-random-big-int-and-convert-to-base-36
В документации не разобрался
*/

/*
task_09
How do you get the first character of a string in Scala? The last character?
*/

var string = "Some string"
string(0)
string(string.length - 1)

/*
task_10
What do the take, drop, takeRight, and dropRight string functions do?
What advantage or disadvantage do they have over using substring?
*/

var some_string = "abracadabra"
some_string.take(2) // выводит первые n элементов строки
some_string.drop(2) // выводит все элементы, кроме первых n
some_string.takeRight(2) // выводит последние n элементов
some_string.dropRight(2) // выводит все кроме последних n элементов
/*
Вероятно удобнее в использовании, чем substring.
*/