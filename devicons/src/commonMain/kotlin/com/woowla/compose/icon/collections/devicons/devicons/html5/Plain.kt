package com.woowla.compose.icon.collections.devicons.devicons.html5

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.Html5Group

public val Html5Group.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFFE44D26)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.03f, 2.0f)
                lineToRelative(10.01f, 112.09f)
                lineToRelative(44.9f, 12.4f)
                lineToRelative(45.02f, -12.39f)
                lineTo(118.97f, 2.0f)
                lineTo(9.03f, 2.0f)
                close()
                moveTo(98.16f, 28.54f)
                lineToRelative(-0.63f, 7.17f)
                lineTo(97.25f, 39.0f)
                lineTo(44.59f, 39.0f)
                lineToRelative(1.26f, 14.0f)
                horizontalLineToRelative(50.16f)
                lineToRelative(-0.34f, 3.47f)
                lineToRelative(-3.23f, 36.12f)
                lineToRelative(-0.24f, 2.27f)
                lineTo(64.0f, 102.61f)
                verticalLineToRelative(0.0f)
                lineToRelative(-0.03f, 0.02f)
                lineToRelative(-28.18f, -7.42f)
                lineTo(33.88f, 74.0f)
                horizontalLineToRelative(13.81f)
                lineToRelative(0.98f, 10.92f)
                lineTo(63.96f, 89.0f)
                lineTo(64.0f, 89.0f)
                verticalLineToRelative(-0.55f)
                lineToRelative(15.35f, -3.88f)
                lineTo(80.96f, 67.0f)
                lineTo(33.26f, 67.0f)
                lineToRelative(-3.38f, -38.12f)
                lineTo(29.55f, 25.0f)
                horizontalLineToRelative(68.94f)
                lineToRelative(-0.33f, 3.54f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
