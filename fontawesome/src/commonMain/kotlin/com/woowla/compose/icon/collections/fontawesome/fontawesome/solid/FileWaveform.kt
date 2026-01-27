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
        _fileWaveform = Builder(name = "FileWaveform", defaultWidth = 384.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 64.0f)
                curveTo(0.0f, 28.7f, 28.7f, 0.0f, 64.0f, 0.0f)
                lineTo(213.5f, 0.0f)
                curveToRelative(17.0f, 0.0f, 33.3f, 6.7f, 45.3f, 18.7f)
                lineTo(365.3f, 125.3f)
                curveToRelative(12.0f, 12.0f, 18.7f, 28.3f, 18.7f, 45.3f)
                lineTo(384.0f, 448.0f)
                curveToRelative(0.0f, 35.3f, -28.7f, 64.0f, -64.0f, 64.0f)
                lineTo(64.0f, 512.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                lineToRelative(0.0f, -96.0f)
                lineToRelative(60.3f, 0.0f)
                lineToRelative(48.8f, 62.7f)
                curveToRelative(5.1f, 6.6f, 13.3f, 10.0f, 21.6f, 9.1f)
                reflectiveCurveToRelative(15.5f, -6.1f, 19.1f, -13.6f)
                lineToRelative(42.9f, -91.2f)
                lineToRelative(9.9f, 19.8f)
                curveToRelative(4.1f, 8.1f, 12.4f, 13.3f, 21.5f, 13.3f)
                lineToRelative(72.0f, 0.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, -10.7f, 24.0f, -24.0f)
                reflectiveCurveToRelative(-10.7f, -24.0f, -24.0f, -24.0f)
                lineToRelative(-57.2f, 0.0f)
                lineToRelative(-25.4f, -50.7f)
                curveToRelative(-4.1f, -8.2f, -12.6f, -13.4f, -21.8f, -13.3f)
                reflectiveCurveToRelative(-17.5f, 5.5f, -21.4f, 13.8f)
                lineToRelative(-47.3f, 100.6f)
                lineToRelative(-32.0f, -41.1f)
                curveTo(86.4f, 307.4f, 79.4f, 304.0f, 72.0f, 304.0f)
                lineTo(0.0f, 304.0f)
                lineTo(0.0f, 64.0f)
                close()
                moveTo(208.0f, 58.5f)
                lineToRelative(0.0f, 93.5f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                lineTo(325.5f, 176.0f)
                lineTo(208.0f, 58.5f)
                close()
            }
        }
        .build()
        return _fileWaveform!!
    }

private var _fileWaveform: ImageVector? = null
