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

public val Simpleicons.Jetbrains: ImageVector
    get() {
        if (_jetbrains != null) {
            return _jetbrains!!
        }
        _jetbrains = Builder(name = "Jetbrains", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.345f, 23.997f)
                arcTo(2.347f, 2.347f, 0.0f, false, true, 0.0f, 21.652f)
                lineTo(0.0f, 10.988f)
                curveTo(0.0f, 9.665f, 0.535f, 8.37f, 1.473f, 7.433f)
                lineToRelative(5.965f, -5.961f)
                arcTo(5.01f, 5.01f, 0.0f, false, true, 10.989f, 0.0f)
                horizontalLineToRelative(10.666f)
                arcTo(2.347f, 2.347f, 0.0f, false, true, 24.0f, 2.345f)
                verticalLineToRelative(10.664f)
                arcToRelative(5.056f, 5.056f, 0.0f, false, true, -1.473f, 3.554f)
                lineToRelative(-5.965f, 5.965f)
                arcTo(5.017f, 5.017f, 0.0f, false, true, 13.007f, 24.0f)
                verticalLineToRelative(-0.003f)
                lineTo(2.345f, 23.997f)
                close()
                moveTo(11.314f, 17.143f)
                lineTo(5.486f, 17.143f)
                verticalLineToRelative(1.371f)
                horizontalLineToRelative(5.828f)
                verticalLineToRelative(-1.371f)
                close()
                moveTo(3.963f, 6.514f)
                horizontalLineToRelative(13.523f)
                verticalLineToRelative(13.519f)
                lineToRelative(4.257f, -4.257f)
                arcToRelative(3.936f, 3.936f, 0.0f, false, false, 1.146f, -2.767f)
                lineTo(22.889f, 2.345f)
                curveToRelative(0.0f, -0.678f, -0.552f, -1.234f, -1.234f, -1.234f)
                lineTo(10.989f, 1.111f)
                arcToRelative(3.897f, 3.897f, 0.0f, false, false, -2.767f, 1.145f)
                lineTo(3.963f, 6.514f)
                close()
                moveTo(3.771f, 6.706f)
                lineTo(2.256f, 8.22f)
                arcToRelative(3.944f, 3.944f, 0.0f, false, false, -1.145f, 2.768f)
                verticalLineToRelative(10.664f)
                curveToRelative(0.0f, 0.678f, 0.552f, 1.234f, 1.234f, 1.234f)
                horizontalLineToRelative(10.666f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 2.767f, -1.146f)
                lineToRelative(1.512f, -1.511f)
                lineTo(3.771f, 20.229f)
                lineTo(3.771f, 6.706f)
                close()
            }
        }
        .build()
        return _jetbrains!!
    }

private var _jetbrains: ImageVector? = null
