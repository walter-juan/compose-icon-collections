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

public val Simpleicons.Number2K: ImageVector
    get() {
        if (_number2K != null) {
            return _number2K!!
        }
        _number2K = Builder(name = "Number2K", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.002f)
                verticalLineToRelative(23.997f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 0.002f)
                lineTo(0.0f, 0.002f)
                close()
                moveTo(10.962f, 5.594f)
                curveToRelative(2.36f, 0.0f, 4.443f, 0.416f, 3.799f, 2.423f)
                curveToRelative(-0.434f, 1.365f, -2.017f, 1.918f, -3.114f, 2.109f)
                lineToRelative(-2.757f, 0.489f)
                curveToRelative(-0.655f, 0.114f, -1.039f, 0.277f, -1.3f, 0.549f)
                horizontalLineToRelative(6.012f)
                lineToRelative(-0.818f, 2.529f)
                lineToRelative(3.446f, -2.529f)
                horizontalLineToRelative(3.755f)
                lineToRelative(-4.091f, 2.772f)
                lineToRelative(2.07f, 4.402f)
                horizontalLineToRelative(-3.766f)
                lineToRelative(-1.082f, -2.754f)
                lineToRelative(-1.197f, 0.826f)
                lineToRelative(-0.619f, 1.928f)
                lineTo(8.471f, 18.338f)
                lineToRelative(1.718f, -5.374f)
                horizontalLineToRelative(-6.25f)
                curveTo(4.874f, 10.2f, 6.891f, 9.36f, 8.731f, 8.989f)
                lineToRelative(2.264f, -0.457f)
                curveToRelative(0.387f, -0.07f, 0.64f, -0.259f, 0.736f, -0.557f)
                curveToRelative(0.136f, -0.416f, -0.32f, -0.581f, -0.994f, -0.581f)
                curveToRelative(-0.784f, 0.0f, -1.604f, 0.074f, -1.984f, 1.005f)
                lineTo(5.646f, 8.399f)
                curveToRelative(1.009f, -2.474f, 3.483f, -2.805f, 5.316f, -2.805f)
                close()
            }
        }
        .build()
        return _number2K!!
    }

private var _number2K: ImageVector? = null
