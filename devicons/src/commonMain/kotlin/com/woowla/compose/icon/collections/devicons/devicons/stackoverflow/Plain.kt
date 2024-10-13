package com.woowla.compose.icon.collections.devicons.devicons.stackoverflow

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.StackoverflowGroup

public val StackoverflowGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(83.87f, 0.0f)
                lineToRelative(-9.17f, 6.81f)
                lineToRelative(34.08f, 45.8f)
                lineToRelative(9.16f, -6.81f)
                lineTo(83.87f, 0.0f)
                close()
                moveTo(62.85f, 18.23f)
                lineToRelative(-7.31f, 8.77f)
                lineToRelative(43.88f, 36.53f)
                lineToRelative(7.31f, -8.77f)
                lineToRelative(-43.88f, -36.53f)
                close()
                moveTo(46.04f, 42.03f)
                lineToRelative(-4.82f, 10.35f)
                lineToRelative(51.76f, 24.1f)
                lineToRelative(4.82f, -10.35f)
                lineToRelative(-51.77f, -24.1f)
                close()
                moveTo(36.18f, 67.96f)
                lineTo(33.83f, 79.13f)
                lineTo(89.71f, 90.87f)
                lineTo(92.05f, 79.7f)
                lineTo(36.18f, 67.96f)
                close()
                moveTo(10.05f, 82.51f)
                lineTo(10.05f, 128.0f)
                lineTo(112.45f, 128.0f)
                lineTo(112.45f, 82.51f)
                horizontalLineToRelative(-11.38f)
                lineToRelative(-0.0f, 34.12f)
                lineTo(21.43f, 116.63f)
                lineTo(21.43f, 82.51f)
                horizontalLineToRelative(-11.38f)
                close()
                moveTo(32.81f, 93.88f)
                verticalLineToRelative(11.37f)
                horizontalLineToRelative(56.89f)
                lineTo(89.69f, 93.88f)
                lineTo(32.81f, 93.88f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
