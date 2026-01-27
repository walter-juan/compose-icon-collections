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

public val SolidGroup.LandMineOn: ImageVector
    get() {
        if (_landMineOn != null) {
            return _landMineOn!!
        }
        _landMineOn = Builder(name = "LandMineOn", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(312.0f, 0.0f)
                lineToRelative(0.0f, 128.0f)
                curveToRelative(0.0f, 13.3f, -10.7f, 24.0f, -24.0f, 24.0f)
                reflectiveCurveToRelative(-24.0f, -10.7f, -24.0f, -24.0f)
                lineTo(264.0f, 0.0f)
                curveToRelative(0.0f, -13.3f, 10.7f, -24.0f, 24.0f, -24.0f)
                reflectiveCurveToRelative(24.0f, 10.7f, 24.0f, 24.0f)
                close()
                moveTo(160.0f, 288.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                lineToRelative(192.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                lineToRelative(0.0f, 32.0f)
                lineToRelative(80.0f, 0.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, 21.5f, 48.0f, 48.0f)
                lineToRelative(0.0f, 96.0f)
                curveToRelative(0.0f, 26.5f, -21.5f, 48.0f, -48.0f, 48.0f)
                lineTo(80.0f, 512.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, -21.5f, -48.0f, -48.0f)
                lineToRelative(0.0f, -96.0f)
                curveToRelative(0.0f, -26.5f, 21.5f, -48.0f, 48.0f, -48.0f)
                lineToRelative(80.0f, 0.0f)
                lineToRelative(0.0f, -32.0f)
                close()
                moveTo(12.0f, 114.7f)
                curveToRelative(7.4f, -11.0f, 22.3f, -14.0f, 33.3f, -6.7f)
                lineToRelative(96.0f, 64.0f)
                curveToRelative(11.0f, 7.4f, 14.0f, 22.3f, 6.7f, 33.3f)
                reflectiveCurveToRelative(-22.3f, 14.0f, -33.3f, 6.7f)
                lineToRelative(-96.0f, -64.0f)
                curveToRelative(-11.0f, -7.4f, -14.0f, -22.3f, -6.7f, -33.3f)
                close()
                moveTo(530.7f, 108.0f)
                curveToRelative(11.0f, -7.4f, 25.9f, -4.4f, 33.3f, 6.7f)
                reflectiveCurveToRelative(4.4f, 25.9f, -6.7f, 33.3f)
                lineToRelative(-96.0f, 64.0f)
                curveToRelative(-11.0f, 7.4f, -25.9f, 4.4f, -33.3f, -6.7f)
                reflectiveCurveToRelative(-4.4f, -25.9f, 6.7f, -33.3f)
                lineToRelative(96.0f, -64.0f)
                close()
            }
        }
        .build()
        return _landMineOn!!
    }

private var _landMineOn: ImageVector? = null
