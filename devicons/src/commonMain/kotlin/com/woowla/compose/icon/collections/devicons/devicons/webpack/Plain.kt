package com.woowla.compose.icon.collections.devicons.devicons.webpack

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.WebpackGroup

public val WebpackGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF1c78c0)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(117.29f, 98.1f)
                lineTo(66.24f, 127.0f)
                verticalLineToRelative(-22.51f)
                lineTo(98.0f, 87.0f)
                lineToRelative(19.29f, 11.1f)
                close()
                moveTo(120.79f, 94.94f)
                lineTo(120.79f, 34.55f)
                lineToRelative(-18.68f, 10.8f)
                verticalLineToRelative(38.81f)
                lineToRelative(18.67f, 10.77f)
                close()
                moveTo(10.71f, 98.1f)
                lineToRelative(51.0f, 28.88f)
                verticalLineToRelative(-22.49f)
                lineTo(29.94f, 87.0f)
                close()
                moveTo(7.21f, 94.94f)
                lineTo(7.21f, 34.55f)
                lineToRelative(18.68f, 10.8f)
                verticalLineToRelative(38.81f)
                close()
                moveTo(9.4f, 30.64f)
                lineTo(61.76f, 1.0f)
                verticalLineToRelative(21.76f)
                lineTo(28.21f, 41.21f)
                lineToRelative(-0.27f, 0.15f)
                close()
                moveTo(118.58f, 30.64f)
                lineTo(66.24f, 1.0f)
                verticalLineToRelative(21.76f)
                lineTo(99.79f, 41.2f)
                lineToRelative(0.27f, 0.15f)
                lineToRelative(18.54f, -10.71f)
                close()
                moveTo(61.76f, 99.37f)
                lineTo(30.37f, 82.1f)
                lineTo(30.37f, 47.92f)
                lineTo(61.76f, 66.0f)
                close()
                moveTo(66.24f, 99.37f)
                lineToRelative(31.39f, -17.25f)
                verticalLineToRelative(-34.2f)
                lineTo(66.24f, 66.0f)
                close()
                moveTo(32.5f, 44.0f)
                lineTo(64.0f, 26.66f)
                lineTo(95.5f, 44.0f)
                lineTo(64.0f, 62.16f)
                lineTo(32.5f, 44.0f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
