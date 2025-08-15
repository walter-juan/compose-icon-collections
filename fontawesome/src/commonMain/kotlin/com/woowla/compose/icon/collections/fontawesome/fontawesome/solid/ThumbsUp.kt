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

public val SolidGroup.ThumbsUp: ImageVector
    get() {
        if (_thumbsUp != null) {
            return _thumbsUp!!
        }
        _thumbsUp = Builder(name = "ThumbsUp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(80.0f, 160.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                lineToRelative(0.0f, 256.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                lineToRelative(-48.0f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                lineTo(0.0f, 192.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                lineToRelative(48.0f, 0.0f)
                close()
                moveTo(270.6f, 16.0f)
                curveTo(297.9f, 16.0f, 320.0f, 38.1f, 320.0f, 65.4f)
                lineToRelative(0.0f, 4.2f)
                curveToRelative(0.0f, 6.8f, -1.3f, 13.6f, -3.8f, 19.9f)
                lineTo(288.0f, 160.0f)
                lineTo(448.0f, 160.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, 21.5f, 48.0f, 48.0f)
                curveToRelative(0.0f, 19.7f, -11.9f, 36.6f, -28.9f, 44.0f)
                curveToRelative(17.0f, 7.4f, 28.9f, 24.3f, 28.9f, 44.0f)
                curveToRelative(0.0f, 23.4f, -16.8f, 42.9f, -39.0f, 47.1f)
                curveToRelative(4.4f, 7.3f, 7.0f, 15.8f, 7.0f, 24.9f)
                curveToRelative(0.0f, 22.2f, -15.0f, 40.8f, -35.4f, 46.3f)
                curveToRelative(2.2f, 5.5f, 3.4f, 11.5f, 3.4f, 17.7f)
                curveToRelative(0.0f, 26.5f, -21.5f, 48.0f, -48.0f, 48.0f)
                lineToRelative(-87.9f, 0.0f)
                curveToRelative(-36.3f, 0.0f, -71.6f, -12.4f, -99.9f, -35.1f)
                lineTo(184.0f, 435.2f)
                curveToRelative(-15.2f, -12.1f, -24.0f, -30.5f, -24.0f, -50.0f)
                lineToRelative(0.0f, -186.6f)
                curveToRelative(0.0f, -14.9f, 3.5f, -29.6f, 10.1f, -42.9f)
                lineTo(226.3f, 43.3f)
                curveTo(234.7f, 26.6f, 251.8f, 16.0f, 270.6f, 16.0f)
                close()
            }
        }
        .build()
        return _thumbsUp!!
    }

private var _thumbsUp: ImageVector? = null
