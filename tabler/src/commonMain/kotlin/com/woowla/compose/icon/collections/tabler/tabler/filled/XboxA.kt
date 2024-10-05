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

public val FilledGroup.XboxA: ImageVector
    get() {
        if (_xboxA != null) {
            return _xboxA!!
        }
        _xboxA = Builder(name = "XboxA", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveToRelative(5.523f, 0.0f, 10.0f, 4.477f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.477f, 10.0f, -10.0f, 10.0f)
                reflectiveCurveToRelative(-10.0f, -4.477f, -10.0f, -10.0f)
                reflectiveCurveToRelative(4.477f, -10.0f, 10.0f, -10.0f)
                moveToRelative(0.936f, 5.649f)
                curveToRelative(-0.324f, -0.865f, -1.548f, -0.865f, -1.872f, 0.0f)
                lineToRelative(-3.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.585f, 1.287f)
                lineToRelative(0.111f, 0.035f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.176f, -0.62f)
                lineToRelative(0.507f, -1.351f)
                horizontalLineToRelative(3.114f)
                lineToRelative(0.507f, 1.351f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.872f, -0.702f)
                close()
                moveTo(12.0f, 10.848f)
                lineToRelative(0.807f, 2.152f)
                horizontalLineToRelative(-1.614f)
                close()
            }
        }
        .build()
        return _xboxA!!
    }

private var _xboxA: ImageVector? = null
