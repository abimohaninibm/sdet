class car:
    def __init__(self,manufacturer,model,make,transmission,color):
        self.manufacturer=manufacturer
        self.model=model
        self.make=make
        self.transmission=transmission
        self.color=color

    def accelerate(self):
        print(self.manufacturer,self.model,"is moving >>>>")

    def stop(self):
        print(self.manufacturer,self.model,"is stopping <<<<")

a=car("Hyundai","Verna","2017","Manual","While")
b=car("Dodge","Viper","1990","Manual","Black")
c=car("Ferrari","Enzo","2017","Automatic","Red")

a.accelerate()
a.stop()
print("****************************")
b.accelerate()
b.stop()
print("****************************")
c.accelerate()
c.stop()
print("****************************")