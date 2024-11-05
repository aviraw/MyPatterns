def generate_spiral_pattern(n):
    # Initialize an empty matrix
    spiral_matrix = [[0] * n for _ in range(n)]
    
    # Define directions for right, down, left, and up movements
    directions = [(0, 1), (1, 0), (0, -1), (-1, 0)]
    current_direction = 0
    
    row, col = 0, 0  # Start from the top-left corner
    for num in range(1, n * n + 1):
        # Assign the current number to the matrix
        spiral_matrix[row][col] = num
        
        # Calculate the next position
        next_row = row + directions[current_direction][0]
        next_col = col + directions[current_direction][1]
        
        # Check if we need to change direction
        if not (0 <= next_row < n and 0 <= next_col < n and spiral_matrix[next_row][next_col] == 0):
            # Change direction
            current_direction = (current_direction + 1) % 4
            next_row = row + directions[current_direction][0]
            next_col = col + directions[current_direction][1]
        
        # Move to the next cell
        row, col = next_row, next_col
    
    # Print the spiral pattern
    for row in spiral_matrix:
        print(" ".join(f"{x:02}" for x in row))

# Set the size of the spiral matrix
n = 5  # Change this to any size you like
generate_spiral_pattern(n)
