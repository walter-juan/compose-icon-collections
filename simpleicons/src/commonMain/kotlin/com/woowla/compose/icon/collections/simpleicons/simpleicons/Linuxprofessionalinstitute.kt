package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Linuxprofessionalinstitute: ImageVector
    get() {
        if (_linuxprofessionalinstitute != null) {
            return _linuxprofessionalinstitute!!
        }
        _linuxprofessionalinstitute = Builder(name = "Linuxprofessionalinstitute", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, -0.0f)
                curveToRelative(-6.627f, 0.0f, -12.0f, 5.373f, -12.0f, 12.0f)
                curveToRelative(0.0f, 6.627f, 5.373f, 12.001f, 12.0f, 12.001f)
                reflectiveCurveToRelative(12.0f, -5.373f, 12.0f, -12.001f)
                reflectiveCurveTo(18.627f, -0.0f, 12.0f, -0.0f)
                close()
                moveTo(12.0f, 20.987f)
                curveToRelative(-4.963f, 0.0f, -8.987f, -4.023f, -8.987f, -8.987f)
                curveToRelative(0.0f, -4.964f, 4.024f, -8.987f, 8.987f, -8.987f)
                curveToRelative(4.963f, 0.0f, 8.987f, 4.023f, 8.987f, 8.987f)
                curveToRelative(0.0f, 4.963f, -4.024f, 8.987f, -8.987f, 8.987f)
                close()
                moveTo(17.104f, 17.984f)
                lineTo(17.904f, 14.986f)
                horizontalLineToRelative(-7.163f)
                lineTo(13.506f, 4.495f)
                horizontalLineToRelative(-2.998f)
                lineTo(6.912f, 17.984f)
                close()
                moveTo(17.394f, 7.49f)
                curveToRelative(0.0f, 0.822f, -0.67f, 1.494f, -1.494f, 1.494f)
                reflectiveCurveToRelative(-1.49f, -0.672f, -1.49f, -1.494f)
                curveToRelative(0.0f, -0.822f, 0.668f, -1.491f, 1.49f, -1.491f)
                reflectiveCurveToRelative(1.494f, 0.669f, 1.494f, 1.491f)
            }
        }
        .build()
        return _linuxprofessionalinstitute!!
    }

private var _linuxprofessionalinstitute: ImageVector? = null
