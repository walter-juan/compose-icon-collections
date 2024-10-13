package com.woowla.compose.icon.collections.devicons.devicons.css3

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.Css3Group

public val Css3Group.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF1572B6)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.76f, 1.0f)
                lineToRelative(10.06f, 112.88f)
                lineToRelative(45.12f, 12.58f)
                lineToRelative(45.24f, -12.63f)
                lineTo(119.24f, 1.0f)
                lineTo(8.76f, 1.0f)
                close()
                moveTo(98.35f, 26.86f)
                lineToRelative(-3.35f, 37.6f)
                lineToRelative(0.01f, 0.2f)
                lineToRelative(-0.01f, 0.47f)
                verticalLineToRelative(-0.0f)
                lineToRelative(-2.38f, 26.29f)
                lineToRelative(-0.26f, 2.34f)
                lineTo(64.0f, 101.61f)
                verticalLineToRelative(0.0f)
                lineToRelative(-0.02f, 0.02f)
                lineToRelative(-28.31f, -7.89f)
                lineTo(33.75f, 72.0f)
                horizontalLineToRelative(13.88f)
                lineToRelative(0.99f, 11.05f)
                lineToRelative(15.39f, 4.17f)
                lineToRelative(-0.0f, 0.01f)
                verticalLineToRelative(-0.0f)
                lineToRelative(15.44f, -4.23f)
                lineTo(81.07f, 65.0f)
                lineTo(48.79f, 65.0f)
                lineToRelative(-0.28f, -3.04f)
                lineToRelative(-0.63f, -7.13f)
                lineTo(47.55f, 51.0f)
                horizontalLineToRelative(34.75f)
                lineToRelative(1.26f, -14.0f)
                lineTo(30.64f, 37.0f)
                lineToRelative(-0.28f, -3.04f)
                lineToRelative(-0.63f, -7.13f)
                lineTo(29.4f, 23.0f)
                horizontalLineToRelative(69.28f)
                lineToRelative(-0.33f, 3.86f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
