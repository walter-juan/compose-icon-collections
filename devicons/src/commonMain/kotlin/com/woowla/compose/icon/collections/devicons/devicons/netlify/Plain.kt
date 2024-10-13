package com.woowla.compose.icon.collections.devicons.devicons.netlify

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.NetlifyGroup

public val NetlifyGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(58.94f, 119.9f)
                verticalLineToRelative(-26.33f)
                lineToRelative(0.73f, -0.73f)
                horizontalLineToRelative(8.8f)
                lineToRelative(0.73f, 0.73f)
                verticalLineToRelative(26.33f)
                lineToRelative(-0.73f, 0.73f)
                horizontalLineToRelative(-8.8f)
                close()
                moveTo(58.94f, 35.06f)
                lineTo(58.94f, 8.73f)
                lineTo(59.67f, 8.0f)
                horizontalLineToRelative(8.8f)
                lineToRelative(0.73f, 0.73f)
                verticalLineToRelative(26.33f)
                lineToRelative(-0.73f, 0.73f)
                horizontalLineToRelative(-8.8f)
                close()
                moveTo(127.28f, 69.45f)
                lineTo(92.17f, 69.45f)
                lineToRelative(-0.73f, -0.73f)
                lineTo(91.44f, 59.92f)
                lineToRelative(0.73f, -0.73f)
                horizontalLineToRelative(35.11f)
                lineToRelative(0.73f, 0.73f)
                verticalLineToRelative(8.8f)
                close()
                moveTo(35.84f, 69.45f)
                lineTo(0.73f, 69.45f)
                lineTo(0.0f, 68.72f)
                lineTo(0.0f, 59.92f)
                lineToRelative(0.73f, -0.73f)
                horizontalLineToRelative(35.11f)
                lineToRelative(0.73f, 0.73f)
                verticalLineToRelative(8.8f)
                close()
                moveTo(80.46f, 82.61f)
                horizontalLineToRelative(-8.78f)
                lineToRelative(-0.73f, -0.73f)
                lineTo(70.95f, 61.33f)
                curveToRelative(0.0f, -3.66f, -1.44f, -6.49f, -5.84f, -6.59f)
                curveToRelative(-2.27f, -0.06f, -4.86f, 0.0f, -7.64f, 0.11f)
                lineToRelative(-0.42f, 0.43f)
                verticalLineToRelative(26.59f)
                lineToRelative(-0.73f, 0.73f)
                lineTo(47.54f, 82.6f)
                lineToRelative(-0.73f, -0.73f)
                lineTo(46.81f, 46.76f)
                lineToRelative(0.73f, -0.73f)
                horizontalLineToRelative(19.75f)
                curveToRelative(7.68f, 0.0f, 13.9f, 6.22f, 13.9f, 13.9f)
                verticalLineToRelative(21.94f)
                close()
                moveTo(27.35f, 33.82f)
                verticalLineToRelative(-1.21f)
                lineToRelative(6.03f, -6.03f)
                horizontalLineToRelative(1.21f)
                lineToRelative(9.22f, 9.22f)
                verticalLineToRelative(6.39f)
                lineToRelative(-0.85f, 0.85f)
                horizontalLineToRelative(-6.39f)
                close()
                moveTo(34.59f, 102.05f)
                horizontalLineToRelative(-1.21f)
                lineToRelative(-6.03f, -6.03f)
                verticalLineToRelative(-1.21f)
                lineToRelative(9.22f, -9.22f)
                horizontalLineToRelative(6.39f)
                lineToRelative(0.85f, 0.85f)
                verticalLineToRelative(6.39f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
