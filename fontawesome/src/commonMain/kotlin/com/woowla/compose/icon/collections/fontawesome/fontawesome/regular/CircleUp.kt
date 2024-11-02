package com.woowla.compose.icon.collections.fontawesome.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.RegularGroup

public val RegularGroup.CircleUp: ImageVector
    get() {
        if (_circleUp != null) {
            return _circleUp!!
        }
        _circleUp = Builder(name = "CircleUp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 48.0f)
                arcToRelative(208.0f, 208.0f, 0.0f, true, true, 0.0f, 416.0f)
                arcToRelative(208.0f, 208.0f, 0.0f, true, true, 0.0f, -416.0f)
                close()
                moveTo(256.0f, 512.0f)
                arcTo(256.0f, 256.0f, 0.0f, true, false, 256.0f, 0.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, false, 0.0f, 512.0f)
                close()
                moveTo(151.2f, 217.4f)
                curveToRelative(-4.6f, 4.2f, -7.2f, 10.1f, -7.2f, 16.4f)
                curveToRelative(0.0f, 12.3f, 10.0f, 22.3f, 22.3f, 22.3f)
                lineToRelative(41.7f, 0.0f)
                lineToRelative(0.0f, 96.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(32.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                lineToRelative(0.0f, -96.0f)
                lineToRelative(41.7f, 0.0f)
                curveToRelative(12.3f, 0.0f, 22.3f, -10.0f, 22.3f, -22.3f)
                curveToRelative(0.0f, -6.2f, -2.6f, -12.1f, -7.2f, -16.4f)
                lineToRelative(-91.0f, -84.0f)
                curveToRelative(-3.8f, -3.5f, -8.7f, -5.4f, -13.9f, -5.4f)
                reflectiveCurveToRelative(-10.1f, 1.9f, -13.9f, 5.4f)
                lineToRelative(-91.0f, 84.0f)
                close()
            }
        }
        .build()
        return _circleUp!!
    }

private var _circleUp: ImageVector? = null
