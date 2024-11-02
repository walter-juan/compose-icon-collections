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

public val SolidGroup.MicrophoneLines: ImageVector
    get() {
        if (_microphoneLines != null) {
            return _microphoneLines!!
        }
        _microphoneLines = Builder(name = "MicrophoneLines", defaultWidth = 384.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(96.0f, 96.0f)
                lineToRelative(0.0f, 160.0f)
                curveToRelative(0.0f, 53.0f, 43.0f, 96.0f, 96.0f, 96.0f)
                reflectiveCurveToRelative(96.0f, -43.0f, 96.0f, -96.0f)
                lineToRelative(-80.0f, 0.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, -7.2f, -16.0f, -16.0f)
                reflectiveCurveToRelative(7.2f, -16.0f, 16.0f, -16.0f)
                lineToRelative(80.0f, 0.0f)
                lineToRelative(0.0f, -32.0f)
                lineToRelative(-80.0f, 0.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, -7.2f, -16.0f, -16.0f)
                reflectiveCurveToRelative(7.2f, -16.0f, 16.0f, -16.0f)
                lineToRelative(80.0f, 0.0f)
                lineToRelative(0.0f, -32.0f)
                lineToRelative(-80.0f, 0.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, -7.2f, -16.0f, -16.0f)
                reflectiveCurveToRelative(7.2f, -16.0f, 16.0f, -16.0f)
                lineToRelative(80.0f, 0.0f)
                curveToRelative(0.0f, -53.0f, -43.0f, -96.0f, -96.0f, -96.0f)
                reflectiveCurveTo(96.0f, 43.0f, 96.0f, 96.0f)
                close()
                moveTo(320.0f, 240.0f)
                lineToRelative(0.0f, 16.0f)
                curveToRelative(0.0f, 70.7f, -57.3f, 128.0f, -128.0f, 128.0f)
                reflectiveCurveToRelative(-128.0f, -57.3f, -128.0f, -128.0f)
                lineToRelative(0.0f, -40.0f)
                curveToRelative(0.0f, -13.3f, -10.7f, -24.0f, -24.0f, -24.0f)
                reflectiveCurveToRelative(-24.0f, 10.7f, -24.0f, 24.0f)
                lineToRelative(0.0f, 40.0f)
                curveToRelative(0.0f, 89.1f, 66.2f, 162.7f, 152.0f, 174.4f)
                lineToRelative(0.0f, 33.6f)
                lineToRelative(-48.0f, 0.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, 10.7f, -24.0f, 24.0f)
                reflectiveCurveToRelative(10.7f, 24.0f, 24.0f, 24.0f)
                lineToRelative(72.0f, 0.0f)
                lineToRelative(72.0f, 0.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, -10.7f, 24.0f, -24.0f)
                reflectiveCurveToRelative(-10.7f, -24.0f, -24.0f, -24.0f)
                lineToRelative(-48.0f, 0.0f)
                lineToRelative(0.0f, -33.6f)
                curveToRelative(85.8f, -11.7f, 152.0f, -85.3f, 152.0f, -174.4f)
                lineToRelative(0.0f, -40.0f)
                curveToRelative(0.0f, -13.3f, -10.7f, -24.0f, -24.0f, -24.0f)
                reflectiveCurveToRelative(-24.0f, 10.7f, -24.0f, 24.0f)
                lineToRelative(0.0f, 24.0f)
                close()
            }
        }
        .build()
        return _microphoneLines!!
    }

private var _microphoneLines: ImageVector? = null
