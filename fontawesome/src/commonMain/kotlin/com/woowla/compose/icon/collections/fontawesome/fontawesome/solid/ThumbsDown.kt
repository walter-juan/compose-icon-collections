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

public val SolidGroup.ThumbsDown: ImageVector
    get() {
        if (_thumbsDown != null) {
            return _thumbsDown!!
        }
        _thumbsDown = Builder(name = "ThumbsDown", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(384.0f, 32.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, 21.5f, 48.0f, 48.0f)
                curveToRelative(0.0f, 6.3f, -1.3f, 12.2f, -3.4f, 17.7f)
                curveToRelative(20.4f, 5.5f, 35.4f, 24.1f, 35.4f, 46.3f)
                curveToRelative(0.0f, 9.1f, -2.6f, 17.6f, -7.0f, 24.9f)
                curveToRelative(22.2f, 4.2f, 39.0f, 23.7f, 39.0f, 47.1f)
                curveToRelative(0.0f, 19.7f, -11.9f, 36.6f, -28.9f, 44.0f)
                curveToRelative(17.0f, 7.4f, 28.9f, 24.3f, 28.9f, 44.0f)
                curveToRelative(0.0f, 26.5f, -21.5f, 48.0f, -48.0f, 48.0f)
                lineToRelative(-160.0f, 0.0f)
                lineToRelative(28.2f, 70.4f)
                curveToRelative(2.5f, 6.3f, 3.8f, 13.1f, 3.8f, 19.9f)
                lineToRelative(0.0f, 4.2f)
                curveToRelative(0.0f, 27.3f, -22.1f, 49.4f, -49.4f, 49.4f)
                curveToRelative(-18.7f, 0.0f, -35.8f, -10.6f, -44.2f, -27.3f)
                lineTo(170.1f, 356.3f)
                curveToRelative(-6.7f, -13.3f, -10.1f, -28.0f, -10.1f, -42.9f)
                lineToRelative(0.0f, -186.6f)
                curveToRelative(0.0f, -19.4f, 8.9f, -37.8f, 24.0f, -50.0f)
                lineToRelative(12.2f, -9.7f)
                curveTo(224.6f, 44.4f, 259.8f, 32.0f, 296.1f, 32.0f)
                lineTo(384.0f, 32.0f)
                close()
                moveTo(80.0f, 96.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                lineToRelative(0.0f, 256.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                lineToRelative(-48.0f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                lineTo(0.0f, 128.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                lineToRelative(48.0f, 0.0f)
                close()
            }
        }
        .build()
        return _thumbsDown!!
    }

private var _thumbsDown: ImageVector? = null
