/*
 * 6. Design and implement a Java program that simulates the undo feature of a text editor using a stack. 
 * The program should support adding text to the editor and undoing changes. The stack should store strings,
 * each representing a version of the text. Implement methods for: adding text to the editor : addText(String text),
 * undoing changes : undo(), getting the current text : getCurrentText().
 */
    class StackArr{
        int top, size;
        String arr[];
        StackArr(int size){
            top = -1;
            this.size = size;
            arr = new String[size];
        }
    
        boolean isEmpty(){
            return top==-1;
    
        }
        boolean isFull(){
            return top == size-1;
        }
    
        void addText(String text){
            if(isFull()){
                System.out.println("stack overflow");
                return;
            }
            arr[++top] = text;
        }
        String undo(){
            if(isEmpty()){
                System.out.println("stack is empty");
                // return;
            }
            return arr[top--];
        }
        String getCurrentText(){
            return arr[top];
        }
    }
    public class SecD6 {
        public static void main(String[] args) {
            StackArr s = new StackArr(3);
            s.addText("vinayak");
            s.addText("ronaldo");
            s.addText("nunez");
            System.out.println(s.getCurrentText());
            s.undo();
            System.out.println(s.getCurrentText());
        }
}
