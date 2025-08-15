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

public val SolidGroup.Torah: ImageVector
    get() {
        if (_torah != null) {
            return _torah!!
        }
        _torah = Builder(name = "Torah", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 48.0f)
                curveTo(0.0f, 21.5f, 21.5f, 0.0f, 48.0f, 0.0f)
                curveTo(68.9f, 0.0f, 86.7f, 13.4f, 93.3f, 32.0f)
                lineToRelative(389.5f, 0.0f)
                curveToRelative(6.6f, -18.6f, 24.4f, -32.0f, 45.3f, -32.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, 21.5f, 48.0f, 48.0f)
                lineToRelative(0.0f, 416.0f)
                curveToRelative(0.0f, 26.5f, -21.5f, 48.0f, -48.0f, 48.0f)
                curveToRelative(-20.9f, 0.0f, -38.7f, -13.4f, -45.3f, -32.0f)
                lineTo(93.3f, 480.0f)
                curveToRelative(-6.6f, 18.6f, -24.4f, 32.0f, -45.3f, 32.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, -21.5f, -48.0f, -48.0f)
                lineTo(0.0f, 48.0f)
                close()
                moveTo(177.9f, 301.0f)
                curveToRelative(-1.2f, 2.0f, -1.9f, 4.2f, -1.9f, 6.6f)
                curveToRelative(0.0f, 6.9f, 5.6f, 12.5f, 12.5f, 12.5f)
                lineToRelative(56.9f, 0.0f)
                lineToRelative(30.5f, 49.2f)
                curveToRelative(2.6f, 4.2f, 7.2f, 6.8f, 12.2f, 6.8f)
                reflectiveCurveToRelative(9.6f, -2.6f, 12.2f, -6.8f)
                lineToRelative(30.5f, -49.2f)
                lineToRelative(56.9f, 0.0f)
                curveToRelative(6.9f, 0.0f, 12.5f, -5.6f, 12.5f, -12.5f)
                curveToRelative(0.0f, -2.3f, -0.6f, -4.6f, -1.9f, -6.6f)
                lineToRelative(-27.8f, -45.0f)
                lineToRelative(27.8f, -45.0f)
                curveToRelative(1.2f, -2.0f, 1.9f, -4.2f, 1.9f, -6.6f)
                curveToRelative(0.0f, -6.9f, -5.6f, -12.5f, -12.5f, -12.5f)
                lineToRelative(-56.9f, 0.0f)
                lineToRelative(-30.5f, -49.2f)
                curveToRelative(-2.6f, -4.2f, -7.2f, -6.8f, -12.2f, -6.8f)
                reflectiveCurveToRelative(-9.6f, 2.6f, -12.2f, 6.8f)
                lineToRelative(-30.5f, 49.2f)
                lineToRelative(-56.9f, 0.0f)
                curveToRelative(-6.9f, 0.0f, -12.5f, 5.6f, -12.5f, 12.5f)
                curveToRelative(0.0f, 2.3f, 0.6f, 4.6f, 1.9f, 6.6f)
                lineToRelative(27.8f, 45.0f)
                lineToRelative(-27.8f, 45.0f)
                close()
            }
        }
        .build()
        return _torah!!
    }

private var _torah: ImageVector? = null
