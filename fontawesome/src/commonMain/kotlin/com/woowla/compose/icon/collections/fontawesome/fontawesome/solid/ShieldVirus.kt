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

public val SolidGroup.ShieldVirus: ImageVector
    get() {
        if (_shieldVirus != null) {
            return _shieldVirus!!
        }
        _shieldVirus = Builder(name = "ShieldVirus", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(253.4f, 2.9f)
                curveTo(249.2f, 1.0f, 244.7f, 0.0f, 240.0f, 0.0f)
                reflectiveCurveToRelative(-9.2f, 1.0f, -13.4f, 2.9f)
                lineTo(38.3f, 82.8f)
                curveToRelative(-22.0f, 9.3f, -38.4f, 31.0f, -38.3f, 57.2f)
                curveToRelative(0.5f, 99.2f, 41.3f, 280.7f, 213.6f, 363.2f)
                curveToRelative(16.7f, 8.0f, 36.1f, 8.0f, 52.8f, 0.0f)
                curveToRelative(172.4f, -82.5f, 213.2f, -264.0f, 213.6f, -363.2f)
                curveToRelative(0.1f, -26.2f, -16.3f, -47.9f, -38.3f, -57.2f)
                lineTo(253.4f, 2.9f)
                close()
                moveTo(240.0f, 128.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, 10.7f, 24.0f, 24.0f)
                curveToRelative(0.0f, 22.9f, 27.7f, 34.4f, 43.9f, 18.2f)
                curveToRelative(9.4f, -9.4f, 24.6f, -9.4f, 33.9f, 0.0f)
                reflectiveCurveToRelative(9.4f, 24.6f, 0.0f, 33.9f)
                curveToRelative(-16.2f, 16.2f, -4.7f, 43.9f, 18.2f, 43.9f)
                curveToRelative(13.3f, 0.0f, 24.0f, 10.7f, 24.0f, 24.0f)
                reflectiveCurveToRelative(-10.7f, 24.0f, -24.0f, 24.0f)
                curveToRelative(-22.9f, 0.0f, -34.4f, 27.7f, -18.2f, 43.9f)
                curveToRelative(9.4f, 9.4f, 9.4f, 24.6f, 0.0f, 33.9f)
                reflectiveCurveToRelative(-24.6f, 9.4f, -33.9f, 0.0f)
                curveToRelative(-16.2f, -16.2f, -43.9f, -4.7f, -43.9f, 18.2f)
                curveToRelative(0.0f, 13.3f, -10.7f, 24.0f, -24.0f, 24.0f)
                reflectiveCurveToRelative(-24.0f, -10.7f, -24.0f, -24.0f)
                curveToRelative(0.0f, -22.9f, -27.7f, -34.4f, -43.9f, -18.2f)
                curveToRelative(-9.4f, 9.4f, -24.6f, 9.4f, -33.9f, 0.0f)
                reflectiveCurveToRelative(-9.4f, -24.6f, 0.0f, -33.9f)
                curveToRelative(16.2f, -16.2f, 4.7f, -43.9f, -18.2f, -43.9f)
                curveToRelative(-13.3f, 0.0f, -24.0f, -10.7f, -24.0f, -24.0f)
                reflectiveCurveToRelative(10.7f, -24.0f, 24.0f, -24.0f)
                curveToRelative(22.9f, 0.0f, 34.4f, -27.7f, 18.2f, -43.9f)
                curveToRelative(-9.4f, -9.4f, -9.4f, -24.6f, 0.0f, -33.9f)
                reflectiveCurveToRelative(24.6f, -9.4f, 33.9f, 0.0f)
                curveToRelative(16.2f, 16.2f, 43.9f, 4.7f, 43.9f, -18.2f)
                curveToRelative(0.0f, -13.3f, 10.7f, -24.0f, 24.0f, -24.0f)
                close()
                moveTo(208.0f, 264.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 0.0f, -48.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 0.0f, 48.0f)
                close()
                moveTo(296.0f, 304.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, -48.0f, 0.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 48.0f, 0.0f)
                close()
            }
        }
        .build()
        return _shieldVirus!!
    }

private var _shieldVirus: ImageVector? = null
