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

public val SolidGroup.SolarPanel: ImageVector
    get() {
        if (_solarPanel != null) {
            return _solarPanel!!
        }
        _solarPanel = Builder(name = "SolarPanel", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(121.8f, 32.0f)
                curveToRelative(-30.0f, 0.0f, -56.0f, 20.8f, -62.5f, 50.1f)
                lineTo(9.6f, 306.1f)
                curveTo(0.7f, 346.1f, 31.1f, 384.0f, 72.0f, 384.0f)
                lineToRelative(184.1f, 0.0f)
                lineToRelative(0.0f, 64.0f)
                lineToRelative(-64.0f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(192.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                lineToRelative(-64.0f, 0.0f)
                lineToRelative(0.0f, -64.0f)
                lineToRelative(184.1f, 0.0f)
                curveToRelative(40.9f, 0.0f, 71.4f, -37.9f, 62.5f, -77.9f)
                lineToRelative(-49.8f, -224.0f)
                curveTo(510.4f, 52.8f, 484.5f, 32.0f, 454.5f, 32.0f)
                lineTo(121.8f, 32.0f)
                close()
                moveTo(245.6f, 96.0f)
                lineToRelative(85.2f, 0.0f)
                lineToRelative(7.3f, 88.0f)
                lineToRelative(-99.8f, 0.0f)
                lineToRelative(7.3f, -88.0f)
                close()
                moveTo(190.1f, 184.0f)
                lineToRelative(-87.8f, 0.0f)
                lineToRelative(19.6f, -88.0f)
                lineToRelative(75.6f, 0.0f)
                lineToRelative(-7.3f, 88.0f)
                close()
                moveTo(91.6f, 232.0f)
                lineToRelative(94.5f, 0.0f)
                lineToRelative(-7.3f, 88.0f)
                lineToRelative(-106.7f, 0.0f)
                lineToRelative(19.6f, -88.0f)
                close()
                moveTo(234.2f, 232.0f)
                lineToRelative(107.8f, 0.0f)
                lineToRelative(7.3f, 88.0f)
                lineToRelative(-122.5f, 0.0f)
                lineToRelative(7.3f, -88.0f)
                close()
                moveTo(390.2f, 232.0f)
                lineToRelative(94.5f, 0.0f)
                lineToRelative(19.6f, 88.0f)
                lineToRelative(-106.7f, 0.0f)
                lineToRelative(-7.3f, -88.0f)
                close()
                moveTo(474.0f, 184.0f)
                lineToRelative(-87.8f, 0.0f)
                lineToRelative(-7.3f, -88.0f)
                lineToRelative(75.6f, 0.0f)
                lineToRelative(19.6f, 88.0f)
                close()
            }
        }
        .build()
        return _solarPanel!!
    }

private var _solarPanel: ImageVector? = null
