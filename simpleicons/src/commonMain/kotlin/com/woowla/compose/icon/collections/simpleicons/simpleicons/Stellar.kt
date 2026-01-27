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

public val Simpleicons.Stellar: ImageVector
    get() {
        if (_stellar != null) {
            return _stellar!!
        }
        _stellar = Builder(name = "Stellar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.003f, 1.716f)
                curveToRelative(-1.37f, 0.0f, -2.7f, 0.27f, -3.948f, 0.78f)
                arcTo(10.18f, 10.18f, 0.0f, false, false, 2.66f, 7.901f)
                arcToRelative(10.136f, 10.136f, 0.0f, false, false, -0.797f, 3.954f)
                curveToRelative(0.0f, 0.258f, 0.01f, 0.516f, 0.027f, 0.775f)
                arcToRelative(1.942f, 1.942f, 0.0f, false, true, -1.055f, 1.88f)
                lineTo(0.0f, 14.934f)
                verticalLineToRelative(1.902f)
                lineToRelative(2.463f, -1.26f)
                lineToRelative(0.072f, -0.032f)
                verticalLineToRelative(0.005f)
                lineToRelative(0.77f, -0.39f)
                lineToRelative(0.758f, -0.385f)
                lineToRelative(0.066f, -0.039f)
                lineToRelative(14.807f, -7.56f)
                lineToRelative(1.666f, -0.847f)
                lineToRelative(3.392f, -1.732f)
                verticalLineTo(2.694f)
                lineTo(17.792f, 5.86f)
                lineTo(3.744f, 13.025f)
                lineToRelative(-0.104f, 0.055f)
                lineToRelative(-0.017f, -0.115f)
                arcToRelative(8.286f, 8.286f, 0.0f, false, true, -0.071f, -1.105f)
                curveToRelative(0.0f, -2.255f, 0.88f, -4.377f, 2.474f, -5.977f)
                arcToRelative(8.462f, 8.462f, 0.0f, false, true, 2.71f, -1.82f)
                arcToRelative(8.513f, 8.513f, 0.0f, false, true, 3.2f, -0.654f)
                horizontalLineToRelative(0.067f)
                arcToRelative(8.41f, 8.41f, 0.0f, false, true, 4.09f, 1.055f)
                lineToRelative(1.628f, -0.83f)
                lineToRelative(0.126f, -0.066f)
                arcToRelative(10.11f, 10.11f, 0.0f, false, false, -5.845f, -1.853f)
                close()
                moveTo(24.0f, 7.143f)
                lineTo(5.047f, 16.808f)
                lineToRelative(-1.666f, 0.847f)
                lineTo(0.0f, 19.382f)
                verticalLineToRelative(1.902f)
                lineToRelative(3.282f, -1.671f)
                lineToRelative(2.91f, -1.485f)
                lineToRelative(14.058f, -7.153f)
                lineToRelative(0.105f, -0.055f)
                lineToRelative(0.016f, 0.115f)
                curveToRelative(0.05f, 0.369f, 0.072f, 0.743f, 0.072f, 1.11f)
                curveToRelative(0.0f, 2.255f, -0.88f, 4.383f, -2.475f, 5.978f)
                arcToRelative(8.461f, 8.461f, 0.0f, false, true, -2.71f, 1.82f)
                arcToRelative(8.305f, 8.305f, 0.0f, false, true, -3.2f, 0.654f)
                horizontalLineToRelative(-0.06f)
                curveToRelative(-1.441f, 0.0f, -2.86f, -0.369f, -4.102f, -1.061f)
                lineToRelative(-0.066f, 0.033f)
                lineToRelative(-1.683f, 0.857f)
                curveToRelative(0.594f, 0.418f, 1.232f, 0.776f, 1.903f, 1.062f)
                arcToRelative(10.11f, 10.11f, 0.0f, false, false, 3.947f, 0.797f)
                arcToRelative(10.09f, 10.09f, 0.0f, false, false, 7.17f, -2.975f)
                arcToRelative(10.136f, 10.136f, 0.0f, false, false, 2.969f, -7.18f)
                curveToRelative(0.0f, -0.259f, -0.005f, -0.523f, -0.027f, -0.781f)
                arcToRelative(1.942f, 1.942f, 0.0f, false, true, 1.055f, -1.88f)
                lineTo(24.0f, 9.044f)
                close()
            }
        }
        .build()
        return _stellar!!
    }

private var _stellar: ImageVector? = null
