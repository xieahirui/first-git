//栈，后进先出
public class Stack {
    //使用数组存储数据
    //栈可以存储多个引用类型的元素
    Object[] elements;
    //指向栈顶元素上方的一个帧
    int index;
    //栈默认的初始化容量是10
    //Constructor
    Stack(){
        this(10);
    }
    Stack(int max){
        elements = new Object[max];
    }
    //栈应该对外提供一个压栈的方法
    public void push(Object element) throws StackOperationException{
        /*
        elements[index] = element;
        index++;
         */
        if(index==elements.length){
            //异常
            throw new StackOperationException("栈已满");
        }

        elements[index++] = element;
    }
    //栈应该对外提供一个弹栈的方法。
    public Object pop() throws StackOperationException{//栈顶的元素往外弹
        /*
        index++;
        return elements[index];
         */
        if(index==0){
            throw new StackOperationException("栈已空！");
        }
        return elements[--index];
    }
}
