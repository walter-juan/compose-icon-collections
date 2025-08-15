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

public val SolidGroup.MicrophoneSlash: ImageVector
    get() {
        if (_microphoneSlash != null) {
            return _microphoneSlash!!
        }
        _microphoneSlash = Builder(name = "MicrophoneSlash", defaultWidth = 576.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(41.0f, -24.9f)
                curveToRelative(-9.4f, -9.4f, -24.6f, -9.4f, -33.9f, 0.0f)
                reflectiveCurveTo(-2.3f, -0.3f, 7.0f, 9.1f)
                lineToRelative(528.0f, 528.0f)
                curveToRelative(9.4f, 9.4f, 24.6f, 9.4f, 33.9f, 0.0f)
                reflectiveCurveToRelative(9.4f, -24.6f, 0.0f, -33.9f)
                lineTo(424.7f, 358.8f)
                curveTo(458.9f, 324.2f, 480.0f, 276.6f, 480.0f, 224.0f)
                lineToRelative(0.0f, -40.0f)
                curveToRelative(0.0f, -13.3f, -10.7f, -24.0f, -24.0f, -24.0f)
                reflectiveCurveToRelative(-24.0f, 10.7f, -24.0f, 24.0f)
                lineToRelative(0.0f, 40.0f)
                curveToRelative(0.0f, 39.3f, -15.7f, 74.9f, -41.3f, 100.9f)
                lineTo(356.8f, 291.0f)
                curveTo(373.6f, 273.7f, 384.0f, 250.0f, 384.0f, 224.0f)
                lineToRelative(0.0f, -128.0f)
                curveToRelative(0.0f, -53.0f, -43.0f, -96.0f, -96.0f, -96.0f)
                reflectiveCurveToRelative(-96.0f, 43.0f, -96.0f, 96.0f)
                lineToRelative(0.0f, 30.2f)
                lineToRelative(-151.0f, -151.0f)
                close()
                moveTo(339.3f, 409.1f)
                lineToRelative(-41.4f, -41.4f)
                curveToRelative(-3.3f, 0.2f, -6.5f, 0.3f, -9.8f, 0.3f)
                curveToRelative(-79.5f, 0.0f, -144.0f, -64.5f, -144.0f, -144.0f)
                lineToRelative(0.0f, -10.2f)
                lineToRelative(-43.6f, -43.6f)
                curveToRelative(-2.8f, 3.9f, -4.4f, 8.7f, -4.4f, 13.8f)
                lineToRelative(0.0f, 40.0f)
                curveToRelative(0.0f, 97.9f, 73.3f, 178.7f, 168.0f, 190.5f)
                lineToRelative(0.0f, 49.5f)
                lineToRelative(-48.0f, 0.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, 10.7f, -24.0f, 24.0f)
                reflectiveCurveToRelative(10.7f, 24.0f, 24.0f, 24.0f)
                lineToRelative(144.0f, 0.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, -10.7f, 24.0f, -24.0f)
                reflectiveCurveToRelative(-10.7f, -24.0f, -24.0f, -24.0f)
                lineToRelative(-48.0f, 0.0f)
                lineToRelative(0.0f, -49.5f)
                curveToRelative(9.3f, -1.2f, 18.4f, -3.0f, 27.3f, -5.4f)
                close()
            }
        }
        .build()
        return _microphoneSlash!!
    }

private var _microphoneSlash: ImageVector? = null
