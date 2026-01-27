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

public val SolidGroup.MarsStrokeUp: ImageVector
    get() {
        if (_marsStrokeUp != null) {
            return _marsStrokeUp!!
        }
        _marsStrokeUp = Builder(name = "MarsStrokeUp", defaultWidth = 384.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 256.0f)
                arcToRelative(112.0f, 112.0f, 0.0f, true, false, 0.0f, 224.0f)
                arcToRelative(112.0f, 112.0f, 0.0f, true, false, 0.0f, -224.0f)
                close()
                moveTo(16.0f, 368.0f)
                curveToRelative(0.0f, -86.3f, 62.1f, -158.1f, 144.1f, -173.1f)
                curveToRelative(-0.1f, -0.9f, -0.1f, -1.9f, -0.1f, -2.9f)
                lineToRelative(0.0f, -16.0f)
                lineToRelative(-32.0f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                lineToRelative(32.0f, 0.0f)
                lineToRelative(0.0f, -61.4f)
                lineToRelative(-28.0f, 22.4f)
                curveToRelative(-13.8f, 11.0f, -33.9f, 8.8f, -45.0f, -5.0f)
                reflectiveCurveToRelative(-8.8f, -33.9f, 5.0f, -45.0f)
                lineToRelative(80.0f, -64.0f)
                curveToRelative(11.7f, -9.3f, 28.3f, -9.3f, 40.0f, 0.0f)
                lineToRelative(80.0f, 64.0f)
                curveToRelative(13.8f, 11.0f, 16.0f, 31.2f, 5.0f, 45.0f)
                reflectiveCurveToRelative(-31.2f, 16.0f, -45.0f, 5.0f)
                lineToRelative(-28.0f, -22.4f)
                lineToRelative(0.0f, 61.4f)
                lineToRelative(32.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                lineToRelative(-32.0f, 0.0f)
                lineToRelative(0.0f, 16.0f)
                curveToRelative(0.0f, 1.0f, 0.0f, 1.9f, -0.1f, 2.9f)
                curveToRelative(82.0f, 15.0f, 144.1f, 86.8f, 144.1f, 173.1f)
                curveToRelative(0.0f, 97.2f, -78.8f, 176.0f, -176.0f, 176.0f)
                reflectiveCurveTo(16.0f, 465.2f, 16.0f, 368.0f)
                close()
            }
        }
        .build()
        return _marsStrokeUp!!
    }

private var _marsStrokeUp: ImageVector? = null
