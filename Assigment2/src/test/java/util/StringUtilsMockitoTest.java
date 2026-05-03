/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class StringUtilsMockitoTest {

    @Mock
    PatternProvider mockProvider;

    @Test
    void testValidEmailWithMock() {
        // Definir comportamiento del mock
        when(mockProvider.getEmailRegex())
                .thenReturn("^[A-Za-z0-9+_.-]+@(.+)$");

        // Ejecutar método
        boolean result = StringUtils.isValidEmail("user@test.com", mockProvider);

        // Verificar resultado
        assertTrue(result);

        // Verificar que se llamó al mock
        verify(mockProvider).getEmailRegex();
    }
}