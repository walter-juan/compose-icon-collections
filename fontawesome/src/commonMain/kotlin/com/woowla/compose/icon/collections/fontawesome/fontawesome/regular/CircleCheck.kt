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
                moveTo(256.0f, 48.0f)
                arcToRelative(208.0f, 208.0f, 0.0f, true, true, 0.0f, 416.0f)
                arcToRelative(208.0f, 208.0f, 0.0f, true, true, 0.0f, -416.0f)
                close()
                moveTo(256.0f, 512.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, false, 0.0f, -512.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, false, 0.0f, 512.0f)
                close()
                moveTo(340.4f, 212.7f)
                curveToRelative(7.0f, -11.2f, 3.6f, -26.0f, -7.6f, -33.1f)
                reflectiveCurveToRelative(-26.0f, -3.6f, -33.1f, 7.6f)
                lineToRelative(-61.4f, 98.3f)
                lineToRelative(-27.0f, -36.0f)
                curveToRelative(-8.0f, -10.6f, -23.0f, -12.8f, -33.6f, -4.8f)
                reflectiveCurveToRelative(-12.8f, 23.0f, -4.8f, 33.6f)
                lineToRelative(48.0f, 64.0f)
                curveToRelative(4.7f, 6.3f, 12.3f, 9.9f, 20.2f, 9.6f)
                reflectiveCurveToRelative(15.1f, -4.5f, 19.3f, -11.3f)
                lineToRelative(80.0f, -128.0f)
                close()
            }
        }
        .build()
        return _circleCheck!!
    }

private var _circleCheck: ImageVector? = null
