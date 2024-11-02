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

public val SolidGroup.YenSign: ImageVector
    get() {
        if (_yenSign != null) {
            return _yenSign!!
        }
        _yenSign = Builder(name = "YenSign", defaultWidth = 320.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 320.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(58.6f, 46.3f)
                curveTo(48.8f, 31.5f, 29.0f, 27.6f, 14.2f, 37.4f)
                reflectiveCurveTo(-4.4f, 67.0f, 5.4f, 81.8f)
                lineTo(100.2f, 224.0f)
                lineTo(48.0f, 224.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(80.0f, 0.0f)
                lineToRelative(0.0f, 32.0f)
                lineToRelative(-80.0f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(80.0f, 0.0f)
                lineToRelative(0.0f, 64.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                lineToRelative(0.0f, -64.0f)
                lineToRelative(80.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                lineToRelative(-80.0f, 0.0f)
                lineToRelative(0.0f, -32.0f)
                lineToRelative(80.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                lineToRelative(-52.2f, 0.0f)
                lineTo(314.6f, 81.8f)
                curveToRelative(9.8f, -14.7f, 5.8f, -34.6f, -8.9f, -44.4f)
                reflectiveCurveToRelative(-34.6f, -5.8f, -44.4f, 8.9f)
                lineTo(160.0f, 198.3f)
                lineTo(58.6f, 46.3f)
                close()
            }
        }
        .build()
        return _yenSign!!
    }

private var _yenSign: ImageVector? = null
