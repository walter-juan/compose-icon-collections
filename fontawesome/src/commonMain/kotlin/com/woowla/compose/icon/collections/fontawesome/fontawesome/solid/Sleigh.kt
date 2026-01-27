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

public val SolidGroup.Sleigh: ImageVector
    get() {
        if (_sleigh != null) {
            return _sleigh!!
        }
        _sleigh = Builder(name = "Sleigh", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 32.0f)
                curveTo(46.3f, 32.0f, 32.0f, 46.3f, 32.0f, 64.0f)
                reflectiveCurveTo(46.3f, 96.0f, 64.0f, 96.0f)
                lineToRelative(0.0f, 160.0f)
                curveToRelative(0.0f, 41.8f, 26.7f, 77.4f, 64.0f, 90.5f)
                lineToRelative(0.0f, 69.5f)
                lineToRelative(-72.0f, 0.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, 10.7f, -24.0f, 24.0f)
                reflectiveCurveToRelative(10.7f, 24.0f, 24.0f, 24.0f)
                lineToRelative(504.0f, 0.0f)
                curveToRelative(44.2f, 0.0f, 80.0f, -35.8f, 80.0f, -80.0f)
                lineToRelative(0.0f, -8.0f)
                curveToRelative(0.0f, -13.3f, -10.7f, -24.0f, -24.0f, -24.0f)
                reflectiveCurveToRelative(-24.0f, 10.7f, -24.0f, 24.0f)
                lineToRelative(0.0f, 8.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                lineToRelative(-80.0f, 0.0f)
                lineToRelative(0.0f, -64.0f)
                curveToRelative(53.0f, 0.0f, 96.0f, -43.0f, 96.0f, -96.0f)
                lineToRelative(0.0f, -96.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                lineToRelative(-32.0f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                lineToRelative(0.0f, 32.0f)
                curveToRelative(0.0f, 35.3f, -28.7f, 64.0f, -64.0f, 64.0f)
                lineToRelative(-48.9f, 0.0f)
                curveToRelative(-48.5f, 0.0f, -92.8f, -27.4f, -114.5f, -70.8f)
                lineToRelative(-25.2f, -50.5f)
                curveTo(237.7f, 59.4f, 193.4f, 32.0f, 144.9f, 32.0f)
                lineTo(64.0f, 32.0f)
                close()
                moveTo(432.0f, 416.0f)
                lineToRelative(-256.0f, 0.0f)
                lineToRelative(0.0f, -64.0f)
                lineToRelative(256.0f, 0.0f)
                lineToRelative(0.0f, 64.0f)
                close()
            }
        }
        .build()
        return _sleigh!!
    }

private var _sleigh: ImageVector? = null
