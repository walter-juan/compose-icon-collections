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

public val RegularGroup.CircleRight: ImageVector
    get() {
        if (_circleRight != null) {
            return _circleRight!!
        }
        _circleRight = Builder(name = "CircleRight", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(464.0f, 256.0f)
                arcTo(208.0f, 208.0f, 0.0f, true, true, 48.0f, 256.0f)
                arcToRelative(208.0f, 208.0f, 0.0f, true, true, 416.0f, 0.0f)
                close()
                moveTo(0.0f, 256.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, false, 512.0f, 0.0f)
                arcTo(256.0f, 256.0f, 0.0f, true, false, 0.0f, 256.0f)
                close()
                moveTo(294.6f, 151.2f)
                curveToRelative(-4.2f, -4.6f, -10.1f, -7.2f, -16.4f, -7.2f)
                curveTo(266.0f, 144.0f, 256.0f, 154.0f, 256.0f, 166.3f)
                lineToRelative(0.0f, 41.7f)
                lineToRelative(-96.0f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                lineToRelative(0.0f, 32.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(96.0f, 0.0f)
                lineToRelative(0.0f, 41.7f)
                curveToRelative(0.0f, 12.3f, 10.0f, 22.3f, 22.3f, 22.3f)
                curveToRelative(6.2f, 0.0f, 12.1f, -2.6f, 16.4f, -7.2f)
                lineToRelative(84.0f, -91.0f)
                curveToRelative(3.5f, -3.8f, 5.4f, -8.7f, 5.4f, -13.9f)
                reflectiveCurveToRelative(-1.9f, -10.1f, -5.4f, -13.9f)
                lineToRelative(-84.0f, -91.0f)
                close()
            }
        }
        .build()
        return _circleRight!!
    }

private var _circleRight: ImageVector? = null
