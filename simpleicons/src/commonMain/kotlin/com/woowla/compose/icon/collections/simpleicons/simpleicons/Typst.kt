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

public val Simpleicons.Typst: ImageVector
    get() {
        if (_typst != null) {
            return _typst!!
        }
        _typst = Builder(name = "Typst", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.654f, 17.846f)
                curveToRelative(0.0f, 1.114f, 0.16f, 1.861f, 0.479f, 2.242f)
                curveToRelative(0.32f, 0.381f, 0.901f, 0.572f, 1.743f, 0.572f)
                curveToRelative(0.872f, 0.0f, 1.99f, -0.44f, 3.356f, -1.319f)
                lineToRelative(0.871f, 1.45f)
                curveTo(16.547f, 22.931f, 14.44f, 24.0f, 12.785f, 24.0f)
                curveToRelative(-1.656f, 0.0f, -2.964f, -0.395f, -3.922f, -1.187f)
                curveToRelative(-0.959f, -0.82f, -1.438f, -2.256f, -1.438f, -4.307f)
                verticalLineTo(6.989f)
                horizontalLineTo(5.246f)
                lineToRelative(-0.349f, -1.626f)
                lineToRelative(2.528f, -0.791f)
                verticalLineTo(2.418f)
                lineTo(12.654f, 0.0f)
                verticalLineToRelative(4.835f)
                lineToRelative(5.142f, -0.395f)
                lineToRelative(-0.48f, 2.857f)
                lineToRelative(-4.662f, -0.176f)
                verticalLineToRelative(10.725f)
                close()
            }
        }
        .build()
        return _typst!!
    }

private var _typst: ImageVector? = null
