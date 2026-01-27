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

public val SolidGroup.HockeyPuck: ImageVector
    get() {
        if (_hockeyPuck != null) {
            return _hockeyPuck!!
        }
        _hockeyPuck = Builder(name = "HockeyPuck", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 256.0f)
                curveTo(114.6f, 256.0f, 0.0f, 213.0f, 0.0f, 160.0f)
                reflectiveCurveToRelative(114.6f, -96.0f, 256.0f, -96.0f)
                reflectiveCurveToRelative(256.0f, 43.0f, 256.0f, 96.0f)
                reflectiveCurveToRelative(-114.6f, 96.0f, -256.0f, 96.0f)
                close()
                moveTo(0.0f, 352.0f)
                lineTo(0.0f, 242.7f)
                curveToRelative(16.9f, 12.3f, 37.0f, 22.2f, 58.1f, 30.1f)
                curveToRelative(53.0f, 19.9f, 123.0f, 31.2f, 197.9f, 31.2f)
                reflectiveCurveToRelative(144.9f, -11.3f, 197.9f, -31.2f)
                curveToRelative(21.2f, -7.9f, 41.2f, -17.8f, 58.1f, -30.1f)
                lineTo(512.0f, 352.0f)
                curveToRelative(0.0f, 53.0f, -114.6f, 96.0f, -256.0f, 96.0f)
                reflectiveCurveTo(0.0f, 405.0f, 0.0f, 352.0f)
                close()
            }
        }
        .build()
        return _hockeyPuck!!
    }

private var _hockeyPuck: ImageVector? = null
