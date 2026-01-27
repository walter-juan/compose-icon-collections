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

public val SolidGroup.Anchor: ImageVector
    get() {
        if (_anchor != null) {
            return _anchor!!
        }
        _anchor = Builder(name = "Anchor", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(288.0f, 64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 0.0f, 64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 0.0f, -64.0f)
                close()
                moveTo(192.0f, 96.0f)
                curveToRelative(0.0f, -53.0f, 43.0f, -96.0f, 96.0f, -96.0f)
                reflectiveCurveToRelative(96.0f, 43.0f, 96.0f, 96.0f)
                curveToRelative(0.0f, 41.8f, -26.7f, 77.4f, -64.0f, 90.5f)
                lineToRelative(0.0f, 257.9f)
                curveToRelative(62.9f, -14.3f, 110.2f, -69.7f, 111.9f, -136.5f)
                lineToRelative(-16.1f, 14.1f)
                curveToRelative(-10.0f, 8.7f, -25.1f, 7.7f, -33.9f, -2.3f)
                reflectiveCurveToRelative(-7.7f, -25.1f, 2.3f, -33.9f)
                lineToRelative(64.0f, -56.0f)
                curveToRelative(9.0f, -7.9f, 22.6f, -7.9f, 31.6f, 0.0f)
                lineToRelative(64.0f, 56.0f)
                curveToRelative(10.0f, 8.7f, 11.0f, 23.9f, 2.3f, 33.9f)
                reflectiveCurveToRelative(-23.9f, 11.0f, -33.9f, 2.3f)
                lineTo(496.0f, 307.9f)
                curveTo(493.9f, 421.0f, 401.6f, 512.0f, 288.0f, 512.0f)
                reflectiveCurveTo(82.1f, 421.0f, 80.0f, 307.9f)
                lineTo(63.8f, 322.1f)
                curveToRelative(-10.0f, 8.7f, -25.1f, 7.7f, -33.9f, -2.3f)
                reflectiveCurveToRelative(-7.7f, -25.1f, 2.3f, -33.9f)
                lineToRelative(64.0f, -56.0f)
                curveToRelative(9.0f, -7.9f, 22.6f, -7.9f, 31.6f, 0.0f)
                lineToRelative(64.0f, 56.0f)
                curveToRelative(10.0f, 8.7f, 11.0f, 23.9f, 2.3f, 33.9f)
                reflectiveCurveToRelative(-23.9f, 11.0f, -33.9f, 2.3f)
                lineToRelative(-16.1f, -14.1f)
                curveToRelative(1.8f, 66.8f, 49.1f, 122.2f, 111.9f, 136.5f)
                lineToRelative(0.0f, -257.9f)
                curveToRelative(-37.3f, -13.2f, -64.0f, -48.7f, -64.0f, -90.5f)
                close()
            }
        }
        .build()
        return _anchor!!
    }

private var _anchor: ImageVector? = null
