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

public val SolidGroup.GuaraniSign: ImageVector
    get() {
        if (_guaraniSign != null) {
            return _guaraniSign!!
        }
        _guaraniSign = Builder(name = "GuaraniSign", defaultWidth = 384.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 0.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, 10.7f, -24.0f, 24.0f)
                lineToRelative(0.0f, 41.5f)
                curveTo(73.3f, 77.3f, 0.0f, 158.1f, 0.0f, 256.0f)
                reflectiveCurveTo(73.3f, 434.7f, 168.0f, 446.5f)
                lineToRelative(0.0f, 41.5f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                reflectiveCurveToRelative(24.0f, -10.7f, 24.0f, -24.0f)
                lineToRelative(0.0f, -41.5f)
                curveToRelative(94.7f, -11.8f, 168.0f, -92.6f, 168.0f, -190.5f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                lineToRelative(-136.0f, 0.0f)
                lineToRelative(0.0f, -93.8f)
                curveToRelative(25.3f, 4.8f, 47.9f, 17.0f, 65.6f, 34.3f)
                curveToRelative(12.6f, 12.4f, 32.9f, 12.2f, 45.3f, -0.4f)
                reflectiveCurveToRelative(12.2f, -32.9f, -0.5f, -45.3f)
                curveTo(297.2f, 90.2f, 258.8f, 70.8f, 216.0f, 65.5f)
                lineTo(216.0f, 24.0f)
                curveToRelative(0.0f, -13.3f, -10.7f, -24.0f, -24.0f, -24.0f)
                close()
                moveTo(168.0f, 130.2f)
                lineToRelative(0.0f, 251.5f)
                curveTo(108.8f, 370.5f, 64.0f, 318.5f, 64.0f, 256.0f)
                reflectiveCurveToRelative(44.8f, -114.5f, 104.0f, -125.8f)
                close()
                moveTo(216.0f, 381.7f)
                lineToRelative(0.0f, -93.8f)
                lineToRelative(100.0f, 0.0f)
                curveToRelative(-12.3f, 47.6f, -51.2f, 84.5f, -100.0f, 93.8f)
                close()
            }
        }
        .build()
        return _guaraniSign!!
    }

private var _guaraniSign: ImageVector? = null
