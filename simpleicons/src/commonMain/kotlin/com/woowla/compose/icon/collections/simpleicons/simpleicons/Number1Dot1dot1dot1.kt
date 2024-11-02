package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Number1Dot1dot1dot1: ImageVector
    get() {
        if (_number1Dot1dot1dot1 != null) {
            return _number1Dot1dot1dot1!!
        }
        _number1Dot1dot1dot1 = Builder(name = "Number1Dot1dot1dot1", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.389f, 0.0f)
                arcTo(5.377f, 5.377f, 0.0f, false, false, 0.0f, 5.389f)
                lineTo(0.0f, 18.61f)
                arcTo(5.377f, 5.377f, 0.0f, false, false, 5.389f, 24.0f)
                lineTo(18.61f, 24.0f)
                arcTo(5.377f, 5.377f, 0.0f, false, false, 24.0f, 18.611f)
                lineTo(24.0f, 5.39f)
                arcTo(5.377f, 5.377f, 0.0f, false, false, 18.611f, 0.0f)
                close()
                moveTo(16.935f, 4.595f)
                horizontalLineToRelative(0.942f)
                verticalLineToRelative(3.122f)
                horizontalLineToRelative(0.69f)
                verticalLineToRelative(0.868f)
                horizontalLineToRelative(-0.69f)
                verticalLineToRelative(1.201f)
                horizontalLineToRelative(-1.001f)
                lineTo(16.876f, 8.585f)
                lineTo(14.68f, 8.585f)
                verticalLineToRelative(-0.964f)
                close()
                moveTo(10.865f, 5.184f)
                horizontalLineToRelative(2.523f)
                verticalLineToRelative(14.842f)
                horizontalLineToRelative(-3.094f)
                lineTo(10.294f, 9.79f)
                lineTo(6.68f, 9.79f)
                lineTo(6.68f, 7.805f)
                curveToRelative(0.95f, -0.042f, 1.616f, -0.103f, 1.997f, -0.184f)
                curveToRelative(0.606f, -0.13f, 1.1f, -0.39f, 1.48f, -0.779f)
                curveToRelative(0.26f, -0.266f, 0.457f, -0.62f, 0.592f, -1.064f)
                curveToRelative(0.077f, -0.267f, 0.116f, -0.464f, 0.116f, -0.594f)
                close()
                moveTo(16.854f, 5.914f)
                lineTo(15.513f, 7.72f)
                horizontalLineToRelative(1.365f)
                lineTo(16.878f, 5.915f)
                close()
            }
        }
        .build()
        return _number1Dot1dot1dot1!!
    }

private var _number1Dot1dot1dot1: ImageVector? = null
