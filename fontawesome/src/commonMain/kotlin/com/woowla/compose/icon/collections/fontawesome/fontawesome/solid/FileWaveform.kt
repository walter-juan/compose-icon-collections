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

public val SolidGroup.FileWaveform: ImageVector
    get() {
        if (_fileWaveform != null) {
            return _fileWaveform!!
        }
        _fileWaveform = Builder(name = "FileWaveform", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(96.0f, 0.0f)
                curveTo(60.7f, 0.0f, 32.0f, 28.7f, 32.0f, 64.0f)
                lineToRelative(0.0f, 224.0f)
                lineToRelative(112.0f, 0.0f)
                curveToRelative(6.1f, 0.0f, 11.6f, 3.4f, 14.3f, 8.8f)
                lineTo(176.0f, 332.2f)
                lineToRelative(49.7f, -99.4f)
                curveToRelative(2.7f, -5.4f, 8.3f, -8.8f, 14.3f, -8.8f)
                reflectiveCurveToRelative(11.6f, 3.4f, 14.3f, 8.8f)
                lineTo(281.9f, 288.0f)
                lineToRelative(70.1f, 0.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, 7.2f, 16.0f, 16.0f)
                reflectiveCurveToRelative(-7.2f, 16.0f, -16.0f, 16.0f)
                lineToRelative(-80.0f, 0.0f)
                curveToRelative(-6.1f, 0.0f, -11.6f, -3.4f, -14.3f, -8.8f)
                lineTo(240.0f, 275.8f)
                lineToRelative(-49.7f, 99.4f)
                curveToRelative(-2.7f, 5.4f, -8.3f, 8.8f, -14.3f, 8.8f)
                reflectiveCurveToRelative(-11.6f, -3.4f, -14.3f, -8.8f)
                lineTo(134.1f, 320.0f)
                lineTo(32.0f, 320.0f)
                lineToRelative(0.0f, 128.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                lineToRelative(256.0f, 0.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                lineToRelative(0.0f, -288.0f)
                lineToRelative(-128.0f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                lineTo(256.0f, 0.0f)
                lineTo(96.0f, 0.0f)
                close()
                moveTo(288.0f, 0.0f)
                lineToRelative(0.0f, 128.0f)
                lineToRelative(128.0f, 0.0f)
                lineTo(288.0f, 0.0f)
                close()
            }
        }
        .build()
        return _fileWaveform!!
    }

private var _fileWaveform: ImageVector? = null
