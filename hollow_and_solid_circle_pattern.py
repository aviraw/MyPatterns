import math

def hollow_circle(radius):
    hollow = []
    for i in range((radius * 2) + 1):
        row = []
        for j in range((radius * 2) + 1):
            distance = math.sqrt((i - radius) ** 2 + (j - radius) ** 2)
            if radius - 0.5 < distance < radius + 0.5:
                row.append('*')
            else:
                row.append(' ')
        hollow.append(' '.join(row))
    return hollow

def solid_circle(radius):
    solid = []
    for i in range((radius * 2) + 1):
        row = []
        for j in range((radius * 2) + 1):
            distance = math.sqrt((i - radius) ** 2 + (j - radius) ** 2)
            if distance < radius:
                row.append('*')
            else:
                row.append(' ')
        solid.append(' '.join(row))
    return solid

def print_circles(radius):
    hollow = hollow_circle(radius)
    solid = solid_circle(radius)
    
    for h_row, s_row in zip(hollow, solid):
        print(h_row, "     ", s_row)

# Call the function to print both circles side by side
print_circles(5)
