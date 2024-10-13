package com.woowla.compose.icon.collections.devicons.devicons.vyper

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.VyperGroup

public val VyperGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.95f, 9.13f)
                lineToRelative(15.05f, 26.06f)
                lineToRelative(15.05f, -26.06f)
                horizontalLineToRelative(-30.09f)
                close()
                moveTo(96.95f, 9.13f)
                lineTo(112.0f, 35.19f)
                lineTo(127.05f, 9.13f)
                horizontalLineToRelative(-30.09f)
                close()
                moveTo(32.0f, 9.68f)
                lineTo(16.64f, 36.29f)
                lineTo(32.0f, 62.9f)
                lineTo(47.36f, 36.29f)
                lineTo(32.0f, 9.68f)
                close()
                moveTo(96.0f, 9.68f)
                lineTo(80.64f, 36.29f)
                lineTo(96.0f, 62.9f)
                lineTo(111.36f, 36.29f)
                lineTo(96.0f, 9.68f)
                close()
                moveTo(56.32f, 22.98f)
                lineTo(48.63f, 36.29f)
                lineTo(64.0f, 62.9f)
                lineTo(79.36f, 36.29f)
                lineTo(71.68f, 22.98f)
                horizontalLineToRelative(-15.36f)
                close()
                moveTo(48.0f, 37.39f)
                lineTo(40.29f, 50.74f)
                lineTo(32.63f, 64.0f)
                lineTo(48.0f, 90.61f)
                lineTo(63.36f, 64.0f)
                lineTo(48.0f, 37.39f)
                close()
                moveTo(80.0f, 37.39f)
                lineTo(64.64f, 64.0f)
                lineTo(80.0f, 90.61f)
                lineTo(95.36f, 64.0f)
                lineTo(80.0f, 37.39f)
                close()
                moveTo(64.0f, 65.1f)
                lineTo(48.64f, 91.71f)
                lineTo(64.0f, 118.32f)
                lineTo(79.36f, 91.71f)
                lineTo(64.0f, 65.1f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
