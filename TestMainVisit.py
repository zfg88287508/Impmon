import unittest
from out.ImpmonListener import ImpmonListener
from out.ImpmonParser import ImpmonParser
from out.ImpmonLexer import ImpmonLexer
from antlr4 import InputStream
from antlr4 import CommonTokenStream
from antlr4 import ParseTreeWalker
from MainVisit import CodeGenerator
from Tools import resetTagNumber


class TestMainVisit(unittest.TestCase):
    def removeWhiteSpace(self, text):
        try:
            return "".join(text.split())
        except:
            print("text")

    def generateCode(self, text):
        input = InputStream(text)
        lexer = ImpmonLexer(input)
        stream = CommonTokenStream(lexer)
        parser = ImpmonParser(stream)
        tree = parser.compilation_unit()

        codeGenerator = CodeGenerator()
        return codeGenerator.visit(tree)

    def setUp(self):
        resetTagNumber()

    def testAddCode(self):
        text = """
            def main(){
                print 1 + 5;
            }
        """
        answer = """
            tag @main
                push 1
                push 5
                add
                print
        """

        self.assertEqual(
            self.removeWhiteSpace(self.generateCode(text)),
            self.removeWhiteSpace(answer))

    def testSubCode(self):
        text = """
            def main(){
                print 5 - 1;
            }
        """

        answer = """
            tag @main
                push 5
                push 1
                sub
                print
        """

        self.assertEqual(
            self.removeWhiteSpace(self.generateCode(text)),
            self.removeWhiteSpace(answer))

    def testAddAssign(self):
        text = """
            def main(){
                i = 15;
                i += 20;
                i -= 15;
                print i;
            }
        """

        answer = """
            tag @main
                push 15
                assign %i
                push %i
                push 20
                add
                assign %i
                push %i
                push 15
                sub
                assign %i
                push %i
                print
        """

        self.assertEqual(
            self.removeWhiteSpace(self.generateCode(text)),
            self.removeWhiteSpace(answer))

    def testMultExpression(self):
        text = """
            def main(){
                result = (1+1);
            }
        """

        answer = """
            tag @main
                push 1
                push 1
                add
                assign %result
        """

        self.assertEqual(
            self.removeWhiteSpace(self.generateCode(text)),
            self.removeWhiteSpace(answer))

    def testIf(self):
        text = """
            def main(){
                if(2>1){
                    print 1;
                }else{
                    ;
                }
            }
        """

        answer = """
            tag @main
            tag @IF_CONDITION_0
                push 2
                push 1
                gtn
                jz @ELSE_BODY_0
            tag @IF_BODY_0
                push 1
                print
                jmp @END_IF_0
            tag @ELSE_BODY_0
            tag @END_IF_0
        """

        self.assertEqual(
            self.removeWhiteSpace(self.generateCode(text)),
            self.removeWhiteSpace(answer))

    def testIfElse(self):
        text = """
            def main(){
                if(2>1){
                    print 1;
                }else{
                    print 2;
                }
            }

        """

        answer = """
            tag @main
            tag @IF_CONDITION_0
                push 2
                push 1
                gtn
                jz @ELSE_BODY_0
            tag @IF_BODY_0
                push 1
                print
                jmp @END_IF_0
            tag @ELSE_BODY_0
                push 2
                print
            tag @END_IF_0
        """

        self.assertEqual(
            self.removeWhiteSpace(self.generateCode(text)),
            self.removeWhiteSpace(answer))

    def testNestedIf(self):
        text = """
            def main(){
                if(2>1){
                    print 1;
                }else if(3<1){
                    print 2;
                }else{
                    print 3;
                }
            }
        """

        answer = """
            tag @main
            tag @IF_CONDITION_1
                push 2
                push 1
                gtn
                jz @ELSE_BODY_1
            tag @IF_BODY_1
                push 1
                print
                jmp @END_IF_1
            tag @ELSE_BODY_1
            tag @IF_CONDITION_0
                push 3
                push 1
                ltn
                jz @ELSE_BODY_0
            tag @IF_BODY_0
                push 2
                print
                jmp @END_IF_0
            tag @ELSE_BODY_0
                push 3
                print
            tag @END_IF_0
            tag @END_IF_1
        """

        self.assertEqual(
            self.removeWhiteSpace(self.generateCode(text)),
            self.removeWhiteSpace(answer))

    def testWhile(self):
        text = """
            def main(){
                len = 10;
                while(len > 0){
                    print 1;
                    len -= 1;
                }
            }
        """

        answer = """
            tag @main
                push 10
                assign %len
            tag @WHILE_CONDITION_0
                push %len
                push 0
                gtn
                jz @END_WHILE_0
            tag @WHILE_BODY_0
                push 1
                print
                push %len
                push 1
                sub
                assign %len
                jmp @WHILE_CONDITION_0
            tag @END_WHILE_0
        """

        self.assertEqual(
            self.removeWhiteSpace(self.generateCode(text)),
            self.removeWhiteSpace(answer))

    def testArray(self):
        text = """
            def main(){
                array = [1, 2, 3, 4, 5];
            }
        """

        answer = """
            tag @main
                push 5
                push 4
                push 3
                push 2
                push 1
                push 5
                array
                assign %array
        """

        self.assertEqual(
            self.removeWhiteSpace(self.generateCode(text)),
            self.removeWhiteSpace(answer))

    def testCallArray(self):
        text = """
            def main(){
                array = [1, 2, 3];
                print array[0];
            }
        """

        answer = """
            tag @main
                push 3
                push 2
                push 1
                push 3
                array
                assign %array
                push 0
                index
                push %array
                print
        """

        self.assertEqual(
            self.removeWhiteSpace(self.generateCode(text)),
            self.removeWhiteSpace(answer))

    def testAssignArray(self):
        text = """
            def main(){
                array = [1, 2, 3, 4, 5];
                array[0] = 25;
            }
        """

        answer = """
            tag @main
                push 5
                push 4
                push 3
                push 2
                push 1
                push 5
                array
                assign %array
                push 25
                push 0
                index
                assign %array
        """

        self.assertEqual(
            self.removeWhiteSpace(self.generateCode(text)),
            self.removeWhiteSpace(answer))

    def testOperationAssignArray(self):
        text = """
            def main(){
                array = [1, 2, 3, 4, 5];
                array[0] += 25;
            }
        """

        answer = """
            tag @main
                push 5
                push 4
                push 3
                push 2
                push 1
                push 5
                array
                assign %array
                push 0
                index
                push %array
                push 25
                add
                push 0
                index
                assign %array
        """

        self.assertEqual(
            self.removeWhiteSpace(self.generateCode(text)),
            self.removeWhiteSpace(answer))

    def testFor(self):
        text = """
            def main(){
                for(i = 0; i != 10; i+=1){
                    print i;
                }
            }
        """

        answer = """
            tag @main
            tag @FOR_INITIALIZATION_0
                push 0
                assign %i
            tag @FOR_CONDITION_0
                push %i
                push 10
                neq
                jz @END_FOR_0
            tag @FOR_BODY_0
                push %i
                print
            tag @FOR_INCREMENT_0
                push %i
                push 1
                add
                assign %i
                jmp @FOR_CONDITION_0
            tag @END_FOR_0
        """

        self.assertEqual(
            self.removeWhiteSpace(self.generateCode(text)),
            self.removeWhiteSpace(answer))

    def testFunction(self):
        text = """
            def func(){
                return 5;
            }

            def main(){
                print func();
            }
        """

        answer = """
            tag @func
                push 5
                ret
            tag @main
                call @func
                print
        """

        self.assertEqual(
            self.removeWhiteSpace(self.generateCode(text)),
            self.removeWhiteSpace(answer))

    def testFunction_1(self):
        text = """
            def add(lhs, rhs){
                return lhs + rhs;
            }

            def main(){
                print add(2, 3);
            }
        """

        answer = """
            tag @add
                assign %lhs
                assign %rhs
                push %lhs
                push %rhs
                add
                ret
            tag @main
                push 3
                push 2
                call @add
                print
        """

        self.assertEqual(
            self.removeWhiteSpace(self.generateCode(text)),
            self.removeWhiteSpace(answer))

    def testClass(self):
        text = """
            class Demo{
                id = 15;
            }

            def main(){
                Demo demo;
                print demo.id;
            }
        """

        answer = """
            tag @Demo
                push 15
                assign %id
                end_class
            tag @main
                create_class Demo demo
                push %demo.id
                print
        """

        self.assertEqual(
            self.removeWhiteSpace(self.generateCode(text)),
            self.removeWhiteSpace(answer))

    def testClass_1(self):
        text = """
            class Person{
                id = 15;
                def showID(){
                    print id;
                }
            }

            def main(){
                Person person;
                person.showID();
            }
        """

        answer = """
            tag @Person
                push 15
                assign %id
                bind @showID
                end_class
            tag @showID
                push %id
                print
                ret
            tag @main
                create_class Person person
                call @person.showID
            
        """

        self.assertEqual(
            self.removeWhiteSpace(self.generateCode(text)),
            self.removeWhiteSpace(answer))


if __name__ == '__main__':
    unittest.main()
