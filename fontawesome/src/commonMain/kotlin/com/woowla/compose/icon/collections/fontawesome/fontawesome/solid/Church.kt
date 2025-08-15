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

public val SolidGroup.Church: ImageVector
    get() {
        if (_church != null) {
            return _church!!
        }
        _church = Builder(name = "Church", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(280.0f, -8.0f)
                curveToRelative(0.0f, -13.3f, -10.7f, -24.0f, -24.0f, -24.0f)
                reflectiveCurveTo(232.0f, -21.3f, 232.0f, -8.0f)
                lineToRelative(0.0f, 24.0f)
                lineToRelative(-32.0f, 0.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, 10.7f, -24.0f, 24.0f)
                reflectiveCurveToRelative(10.7f, 24.0f, 24.0f, 24.0f)
                lineToRelative(32.0f, 0.0f)
                lineToRelative(0.0f, 48.0f)
                lineToRelative(-98.6f, 65.8f)
                curveTo(120.0f, 186.7f, 112.0f, 201.6f, 112.0f, 217.7f)
                lineToRelative(0.0f, 38.3f)
                lineToRelative(-79.8f, 45.6f)
                curveTo(12.3f, 313.0f, 0.0f, 334.2f, 0.0f, 357.1f)
                lineTo(0.0f, 448.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                curveToRelative(74.7f, 0.0f, 85.4f, 0.0f, 320.0f, 0.0f)
                lineToRelative(64.0f, 0.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                lineToRelative(0.0f, -90.9f)
                curveToRelative(0.0f, -23.0f, -12.3f, -44.2f, -32.2f, -55.6f)
                lineTo(400.0f, 256.0f)
                lineTo(400.0f, 217.7f)
                curveToRelative(0.0f, -16.0f, -8.0f, -31.0f, -21.4f, -39.9f)
                lineToRelative(-98.6f, -65.8f)
                lineToRelative(0.0f, -48.0f)
                lineToRelative(32.0f, 0.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, -10.7f, 24.0f, -24.0f)
                reflectiveCurveToRelative(-10.7f, -24.0f, -24.0f, -24.0f)
                lineToRelative(-32.0f, 0.0f)
                lineToRelative(0.0f, -24.0f)
                close()
                moveTo(256.0f, 320.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, 28.7f, 64.0f, 64.0f)
                lineToRelative(0.0f, 80.0f)
                lineToRelative(-128.0f, 0.0f)
                lineToRelative(0.0f, -80.0f)
                curveToRelative(0.0f, -35.3f, 28.7f, -64.0f, 64.0f, -64.0f)
                close()
            }
        }
        .build()
        return _church!!
    }

private var _church: ImageVector? = null
