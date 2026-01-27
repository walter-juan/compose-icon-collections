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

public val SolidGroup.PumpSoap: ImageVector
    get() {
        if (_pumpSoap != null) {
            return _pumpSoap!!
        }
        _pumpSoap = Builder(name = "PumpSoap", defaultWidth = 320.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 320.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(96.0f, 0.0f)
                lineToRelative(0.0f, 80.0f)
                lineToRelative(128.0f, 0.0f)
                lineToRelative(0.0f, -24.0f)
                lineToRelative(72.0f, 0.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, -10.7f, 24.0f, -24.0f)
                reflectiveCurveTo(309.3f, 8.0f, 296.0f, 8.0f)
                lineToRelative(-72.0f, 0.0f)
                lineToRelative(0.0f, -8.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                lineToRelative(-64.0f, 0.0f)
                curveTo(110.3f, -32.0f, 96.0f, -17.7f, 96.0f, 0.0f)
                close()
                moveTo(64.0f, 128.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, 28.7f, -64.0f, 64.0f)
                lineTo(0.0f, 448.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                lineToRelative(192.0f, 0.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                lineToRelative(0.0f, -256.0f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                lineTo(64.0f, 128.0f)
                close()
                moveTo(224.0f, 344.0f)
                curveToRelative(0.0f, 35.3f, -28.7f, 56.0f, -64.0f, 56.0f)
                reflectiveCurveToRelative(-64.0f, -20.7f, -64.0f, -56.0f)
                curveToRelative(0.0f, -32.5f, 37.0f, -80.9f, 50.9f, -97.9f)
                curveToRelative(3.2f, -3.9f, 8.1f, -6.1f, 13.1f, -6.1f)
                reflectiveCurveToRelative(9.9f, 2.2f, 13.1f, 6.1f)
                curveTo(187.0f, 263.1f, 224.0f, 311.5f, 224.0f, 344.0f)
                close()
            }
        }
        .build()
        return _pumpSoap!!
    }

private var _pumpSoap: ImageVector? = null
