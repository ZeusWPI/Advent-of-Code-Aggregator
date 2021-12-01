
def read(inputData):
    with open(inputData, "r") as infile:
        data = infile.readlines()
    return data


def strArrToIntArray(inputData):
    return [int(value.replace("\n","").replace(" ","")) for value in inputData]


def readAsIntArray(inputData):
    return strArrToIntArray(read(inputData))

def keepEven(inputData):
    return [d for d in inputData if d % 2 == 0]

def keepUneven(inputData):
    return [d for d in inputData if d % 2 == 1]

def keepIfContaint(inputData, toContain):
    return [d for d in inputData if toContain in d]

def removeIfContains(inputData, toContain):
    return [d for d in inputData if not toContain in d]

def keepIfDevisor(inputData, toDiv):
    return [d for d in inputData if toDiv % d == 0]

def keepIfDivisibleBy(inputData, toDiv):
    return [d for d in inputData if d % toDiv == 0]

def get_primelist(lower, upper):
    result = []
    for cp in range ( lower, upper + 1 ):
        for i in range ( lower, cp ):
            if ( cp % i == 0 ):
                break
        else:
            result.append(cp)
    return result