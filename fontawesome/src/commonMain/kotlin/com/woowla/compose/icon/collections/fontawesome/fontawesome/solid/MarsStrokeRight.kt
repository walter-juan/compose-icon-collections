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

public val SolidGroup.MarsStrokeRight: ImageVector
    get() {
        if (_marsStrokeRight != null) {
            return _marsStrokeRight!!
        }
        _marsStrokeRight = Builder(name = "MarsStrokeRight", defaultWidth = 640.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(320.5f, 256.0f)
                arcToRelative(112.0f, 112.0f, 0.0f, true, false, -224.0f, 0.0f)
                arcToRelative(112.0f, 112.0f, 0.0f, true, false, 224.0f, 0.0f)
                close()
                moveTo(208.5f, 80.0f)
                curveToRelative(86.3f, 0.0f, 158.1f, 62.1f, 173.1f, 144.1f)
                curveToRelative(1.0f, -0.1f, 1.9f, -0.1f, 2.9f, -0.1f)
                lineToRelative(16.0f, 0.0f)
                lineToRelative(0.0f, -32.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                reflectiveCurveToRelative(32.0f, 14.3f, 32.0f, 32.0f)
                lineToRelative(0.0f, 32.0f)
                lineToRelative(61.4f, 0.0f)
                lineToRelative(-22.4f, -28.0f)
                curveToRelative(-11.0f, -13.8f, -8.8f, -33.9f, 5.0f, -45.0f)
                reflectiveCurveToRelative(33.9f, -8.8f, 45.0f, 5.0f)
                lineToRelative(64.0f, 80.0f)
                curveToRelative(9.3f, 11.7f, 9.3f, 28.3f, 0.0f, 40.0f)
                lineToRelative(-64.0f, 80.0f)
                curveToRelative(-11.0f, 13.8f, -31.2f, 16.0f, -45.0f, 5.0f)
                reflectiveCurveToRelative(-16.0f, -31.2f, -5.0f, -45.0f)
                lineToRelative(22.4f, -28.0f)
                lineToRelative(-61.4f, 0.0f)
                lineToRelative(0.0f, 32.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                lineToRelative(0.0f, -32.0f)
                lineToRelative(-16.0f, 0.0f)
                curveToRelative(-1.0f, 0.0f, -1.9f, 0.0f, -2.9f, -0.1f)
                curveToRelative(-15.0f, 82.0f, -86.8f, 144.1f, -173.1f, 144.1f)
                curveToRelative(-97.2f, 0.0f, -176.0f, -78.8f, -176.0f, -176.0f)
                reflectiveCurveToRelative(78.8f, -176.0f, 176.0f, -176.0f)
                close()
            }
        }
        .build()
        return _marsStrokeRight!!
    }

private var _marsStrokeRight: ImageVector? = null
