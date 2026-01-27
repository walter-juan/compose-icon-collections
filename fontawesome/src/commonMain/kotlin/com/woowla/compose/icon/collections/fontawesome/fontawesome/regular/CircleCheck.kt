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

public val RegularGroup.CircleCheck: ImageVector
    get() {
        if (_circleCheck != null) {
            return _circleCheck!!
        }
        _circleCheck = Builder(name = "CircleCheck", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 512.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, 0.0f, -512.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, 0.0f, 512.0f)
                close()
                moveTo(256.0f, 48.0f)
                arcToRelative(208.0f, 208.0f, 0.0f, true, false, 0.0f, 416.0f)
                arcToRelative(208.0f, 208.0f, 0.0f, true, false, 0.0f, -416.0f)
                close()
                moveTo(326.7f, 169.9f)
                curveToRelative(7.8f, -10.7f, 22.8f, -13.1f, 33.5f, -5.3f)
                curveToRelative(10.7f, 7.8f, 13.1f, 22.8f, 5.3f, 33.5f)
                lineTo(243.4f, 366.1f)
                curveToRelative(-4.1f, 5.7f, -10.5f, 9.3f, -17.5f, 9.8f)
                curveToRelative(-7.0f, 0.5f, -13.9f, -2.0f, -18.8f, -6.9f)
                lineToRelative(-55.9f, -55.9f)
                curveToRelative(-9.4f, -9.4f, -9.4f, -24.6f, 0.0f, -33.9f)
                reflectiveCurveToRelative(24.6f, -9.4f, 33.9f, 0.0f)
                lineToRelative(36.0f, 36.0f)
                lineToRelative(105.6f, -145.2f)
                close()
            }
        }
        .build()
        return _circleCheck!!
    }

private var _circleCheck: ImageVector? = null
