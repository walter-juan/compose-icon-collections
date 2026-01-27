package com.woowla.compose.icon.collections.fontawesome.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.SolidGroup

public val SolidGroup.Pen: ImageVector
    get() {
        if (_pen != null) {
            return _pen!!
        }
        _pen = Builder(name = "Pen", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(352.9f, 21.2f)
                lineTo(308.0f, 66.1f)
                lineTo(445.9f, 204.0f)
                lineTo(490.8f, 159.1f)
                curveTo(504.4f, 145.6f, 512.0f, 127.2f, 512.0f, 108.0f)
                reflectiveCurveToRelative(-7.6f, -37.6f, -21.2f, -51.1f)
                lineTo(455.1f, 21.2f)
                curveTo(441.6f, 7.6f, 423.2f, 0.0f, 404.0f, 0.0f)
                reflectiveCurveToRelative(-37.6f, 7.6f, -51.1f, 21.2f)
                close()
                moveTo(274.1f, 100.0f)
                lineTo(58.9f, 315.1f)
                curveToRelative(-10.7f, 10.7f, -18.5f, 24.1f, -22.6f, 38.7f)
                lineTo(0.9f, 481.6f)
                curveToRelative(-2.3f, 8.3f, 0.0f, 17.3f, 6.2f, 23.4f)
                reflectiveCurveToRelative(15.1f, 8.5f, 23.4f, 6.2f)
                lineToRelative(127.8f, -35.5f)
                curveToRelative(14.6f, -4.1f, 27.9f, -11.8f, 38.7f, -22.6f)
                lineTo(412.0f, 237.9f)
                lineTo(274.1f, 100.0f)
                close()
            }
        }
        .build()
        return _pen!!
    }

private var _pen: ImageVector? = null
