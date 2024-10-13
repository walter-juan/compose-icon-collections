package com.woowla.compose.icon.collections.devicons.devicons.cmake

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.CmakeGroup

public val CmakeGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF172C36)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(62.8f, 0.4f)
                lineTo(0.3f, 123.8f)
                lineToRelative(68.1f, -57.9f)
                close()
                moveTo(123.8f, 127.7f)
                lineToRelative(-84.0f, -33.9f)
                lineTo(0.0f, 127.7f)
                close()
                moveTo(128.0f, 126.6f)
                lineTo(65.6f, 2.5f)
                lineToRelative(9.2f, 102.6f)
                close()
                moveTo(71.9f, 104.0f)
                lineToRelative(-3.1f, -34.9f)
                lineTo(42.0f, 92.0f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
