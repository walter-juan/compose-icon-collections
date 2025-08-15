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

public val SolidGroup.TrainTram: ImageVector
    get() {
        if (_trainTram != null) {
            return _trainTram!!
        }
        _trainTram = Builder(name = "TrainTram", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 8.0f)
                curveTo(0.0f, -5.3f, 10.7f, -16.0f, 24.0f, -16.0f)
                lineToRelative(336.0f, 0.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, 10.7f, 24.0f, 24.0f)
                lineToRelative(0.0f, 32.0f)
                curveToRelative(0.0f, 13.3f, -10.7f, 24.0f, -24.0f, 24.0f)
                reflectiveCurveToRelative(-24.0f, -10.7f, -24.0f, -24.0f)
                lineToRelative(0.0f, -8.0f)
                lineToRelative(-120.0f, 0.0f)
                lineToRelative(0.0f, 64.0f)
                lineToRelative(40.0f, 0.0f)
                curveToRelative(53.0f, 0.0f, 96.0f, 43.0f, 96.0f, 96.0f)
                lineToRelative(0.0f, 160.0f)
                curveToRelative(0.0f, 31.2f, -14.9f, 59.0f, -38.0f, 76.5f)
                lineToRelative(64.3f, 76.0f)
                curveToRelative(8.6f, 10.1f, 7.3f, 25.3f, -2.8f, 33.8f)
                reflectiveCurveToRelative(-25.3f, 7.3f, -33.8f, -2.8f)
                lineToRelative(-74.6f, -88.1f)
                curveToRelative(-3.6f, 0.4f, -7.3f, 0.6f, -11.1f, 0.6f)
                lineToRelative(-128.0f, 0.0f)
                curveToRelative(-3.8f, 0.0f, -7.5f, -0.2f, -11.1f, -0.6f)
                lineTo(42.3f, 535.5f)
                curveToRelative(-8.6f, 10.1f, -23.7f, 11.4f, -33.8f, 2.8f)
                reflectiveCurveToRelative(-11.4f, -23.7f, -2.8f, -33.8f)
                lineToRelative(64.3f, -76.0f)
                curveTo(46.9f, 411.0f, 32.0f, 383.2f, 32.0f, 352.0f)
                lineToRelative(0.0f, -160.0f)
                curveToRelative(0.0f, -53.0f, 43.0f, -96.0f, 96.0f, -96.0f)
                lineToRelative(40.0f, 0.0f)
                lineToRelative(0.0f, -64.0f)
                lineToRelative(-120.0f, 0.0f)
                lineToRelative(0.0f, 8.0f)
                curveToRelative(0.0f, 13.3f, -10.7f, 24.0f, -24.0f, 24.0f)
                reflectiveCurveTo(0.0f, 53.3f, 0.0f, 40.0f)
                lineTo(0.0f, 8.0f)
                close()
                moveTo(128.0f, 160.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                lineToRelative(0.0f, 32.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(128.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                lineToRelative(0.0f, -32.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                lineToRelative(-128.0f, 0.0f)
                close()
                moveTo(160.0f, 352.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 64.0f, 0.0f)
                close()
                moveTo(256.0f, 384.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 0.0f, -64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 0.0f, 64.0f)
                close()
            }
        }
        .build()
        return _trainTram!!
    }

private var _trainTram: ImageVector? = null
