package com.woowla.compose.icon.collections.devicons.devicons.backbonejs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.BackbonejsGroup

public val BackbonejsGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF002A41)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 31.12f)
                lineTo(15.0f, 3.24f)
                verticalLineToRelative(121.52f)
                lineToRelative(49.0f, -27.89f)
                lineToRelative(49.0f, 27.89f)
                lineTo(113.0f, 3.24f)
                lineTo(64.0f, 31.12f)
                close()
                moveTo(40.71f, 64.0f)
                lineToRelative(24.37f, -13.89f)
                lineToRelative(24.37f, 13.89f)
                lineToRelative(-24.37f, 13.89f)
                lineToRelative(-24.37f, -13.89f)
                close()
                moveTo(32.0f, 29.93f)
                lineToRelative(17.43f, 9.94f)
                lineTo(32.0f, 49.81f)
                lineTo(32.0f, 29.93f)
                close()
                moveTo(32.0f, 78.19f)
                lineToRelative(16.13f, 9.19f)
                lineTo(32.0f, 96.57f)
                lineTo(32.0f, 78.19f)
                close()
                moveTo(97.0f, 96.58f)
                lineToRelative(-16.13f, -9.19f)
                lineTo(97.0f, 78.19f)
                verticalLineToRelative(18.38f)
                close()
                moveTo(79.57f, 39.87f)
                lineTo(97.0f, 29.93f)
                verticalLineToRelative(19.88f)
                lineTo(79.57f, 39.87f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
