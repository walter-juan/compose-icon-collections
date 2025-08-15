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

public val SolidGroup.FileAudio: ImageVector
    get() {
        if (_fileAudio != null) {
            return _fileAudio!!
        }
        _fileAudio = Builder(name = "FileAudio", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
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
                lineTo(0.0f, 64.0f)
                close()
                moveTo(208.0f, 58.5f)
                lineToRelative(0.0f, 93.5f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                lineTo(325.5f, 176.0f)
                lineTo(208.0f, 58.5f)
                close()
                moveTo(261.8f, 243.7f)
                curveToRelative(-9.1f, -6.3f, -21.5f, -4.1f, -27.8f, 5.0f)
                reflectiveCurveToRelative(-4.1f, 21.5f, 5.0f, 27.8f)
                curveToRelative(23.9f, 16.7f, 39.4f, 44.3f, 39.4f, 75.5f)
                reflectiveCurveToRelative(-15.6f, 58.9f, -39.4f, 75.5f)
                curveToRelative(-9.1f, 6.3f, -11.3f, 18.8f, -5.0f, 27.8f)
                reflectiveCurveToRelative(18.8f, 11.3f, 27.8f, 5.0f)
                curveToRelative(34.1f, -23.8f, 56.6f, -63.5f, 56.6f, -108.3f)
                reflectiveCurveTo(296.0f, 267.5f, 261.8f, 243.7f)
                close()
                moveTo(80.0f, 312.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                lineToRelative(0.0f, 48.0f)
                curveToRelative(0.0f, 8.8f, 7.2f, 16.0f, 16.0f, 16.0f)
                lineToRelative(24.0f, 0.0f)
                lineToRelative(27.2f, 34.0f)
                curveToRelative(3.0f, 3.8f, 7.6f, 6.0f, 12.5f, 6.0f)
                lineToRelative(0.3f, 0.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                lineToRelative(0.0f, -128.0f)
                curveToRelative(0.0f, -8.8f, -7.2f, -16.0f, -16.0f, -16.0f)
                lineToRelative(-0.3f, 0.0f)
                curveToRelative(-4.9f, 0.0f, -9.5f, 2.2f, -12.5f, 6.0f)
                lineToRelative(-27.2f, 34.0f)
                lineToRelative(-24.0f, 0.0f)
                close()
                moveTo(208.0f, 384.2f)
                curveToRelative(0.0f, 10.7f, 10.5f, 18.2f, 18.9f, 11.6f)
                curveToRelative(12.9f, -10.3f, 21.1f, -26.1f, 21.1f, -43.8f)
                reflectiveCurveToRelative(-8.2f, -33.5f, -21.1f, -43.8f)
                curveToRelative(-8.4f, -6.7f, -18.9f, 0.9f, -18.9f, 11.6f)
                lineToRelative(0.0f, 64.5f)
                close()
            }
        }
        .build()
        return _fileAudio!!
    }

private var _fileAudio: ImageVector? = null
