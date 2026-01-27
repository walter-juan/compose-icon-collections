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

public val SolidGroup.Lemon: ImageVector
    get() {
        if (_lemon != null) {
            return _lemon!!
        }
        _lemon = Builder(name = "Lemon", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(448.0f, 96.0f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                curveToRelative(-6.6f, 0.0f, -13.0f, 1.0f, -19.0f, 2.9f)
                curveToRelative(-22.5f, 7.0f, -48.1f, 14.9f, -71.0f, 9.0f)
                curveToRelative(-75.2f, -19.1f, -156.4f, 11.0f, -213.7f, 68.3f)
                reflectiveCurveTo(-7.2f, 250.8f, 11.9f, 326.0f)
                curveToRelative(5.8f, 22.9f, -2.0f, 48.4f, -9.0f, 71.0f)
                curveToRelative(-1.9f, 6.0f, -2.9f, 12.4f, -2.9f, 19.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                curveToRelative(6.6f, 0.0f, 13.0f, -1.0f, 19.1f, -2.9f)
                curveToRelative(22.5f, -7.0f, 48.1f, -14.9f, 71.0f, -9.0f)
                curveToRelative(75.2f, 19.1f, 156.4f, -11.0f, 213.7f, -68.3f)
                reflectiveCurveTo(455.2f, 261.2f, 436.1f, 186.0f)
                curveToRelative(-5.8f, -22.9f, 2.0f, -48.4f, 9.0f, -71.0f)
                curveToRelative(1.9f, -6.0f, 2.9f, -12.4f, 2.9f, -19.1f)
                close()
                moveTo(222.7f, 143.0f)
                curveToRelative(-52.0f, 15.2f, -96.5f, 59.7f, -111.7f, 111.7f)
                curveToRelative(-3.7f, 12.7f, -17.1f, 20.0f, -29.8f, 16.3f)
                reflectiveCurveTo(61.2f, 254.0f, 65.0f, 241.3f)
                curveToRelative(19.8f, -67.7f, 76.6f, -124.5f, 144.3f, -144.3f)
                curveToRelative(12.7f, -3.7f, 26.1f, 3.6f, 29.8f, 16.3f)
                reflectiveCurveToRelative(-3.6f, 26.1f, -16.3f, 29.8f)
                close()
            }
        }
        .build()
        return _lemon!!
    }

private var _lemon: ImageVector? = null
