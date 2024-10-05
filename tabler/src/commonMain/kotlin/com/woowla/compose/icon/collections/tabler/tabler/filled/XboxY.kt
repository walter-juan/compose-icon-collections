package com.woowla.compose.icon.collections.tabler.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.tabler.tabler.FilledGroup

public val FilledGroup.XboxY: ImageVector
    get() {
        if (_xboxY != null) {
            return _xboxY!!
        }
        _xboxY = Builder(name = "XboxY", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveToRelative(5.523f, 0.0f, 10.0f, 4.477f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.477f, 10.0f, -10.0f, 10.0f)
                reflectiveCurveToRelative(-10.0f, -4.477f, -10.0f, -10.0f)
                reflectiveCurveToRelative(4.477f, -10.0f, 10.0f, -10.0f)
                moveToRelative(3.6f, 5.2f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.4f, 0.2f)
                lineToRelative(-2.2f, 2.933f)
                lineToRelative(-2.2f, -2.933f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.6f, 1.2f)
                lineToRelative(2.81f, 3.748f)
                lineToRelative(-0.01f, 3.649f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.997f, 1.003f)
                lineToRelative(0.117f, -0.006f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.886f, -0.991f)
                lineToRelative(0.01f, -3.683f)
                lineToRelative(2.79f, -3.72f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.2f, -1.4f)
            }
        }
        .build()
        return _xboxY!!
    }

private var _xboxY: ImageVector? = null
