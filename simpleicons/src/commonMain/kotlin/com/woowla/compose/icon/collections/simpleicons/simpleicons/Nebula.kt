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

public val Simpleicons.Nebula: ImageVector
    get() {
        if (_nebula != null) {
            return _nebula!!
        }
        _nebula = Builder(name = "Nebula", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.417f, 9.307f)
                lineTo(0.0f, 14.693f)
                horizontalLineToRelative(9.167f)
                lineTo(12.0f, 23.413f)
                lineToRelative(2.833f, -8.72f)
                horizontalLineTo(24.0f)
                reflectiveCurveToRelative(-3.915f, -2.84f, -7.417f, -5.386f)
                lineToRelative(2.834f, -8.72f)
                lineTo(12.0f, 5.976f)
                curveTo(8.499f, 3.438f, 4.583f, 0.588f, 4.583f, 0.588f)
                close()
            }
        }
        .build()
        return _nebula!!
    }

private var _nebula: ImageVector? = null
