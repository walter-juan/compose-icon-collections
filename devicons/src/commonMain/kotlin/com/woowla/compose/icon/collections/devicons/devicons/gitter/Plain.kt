package com.woowla.compose.icon.collections.devicons.devicons.gitter

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.GitterGroup

public val GitterGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(96.8f, 25.6f)
                horizontalLineTo(107.0f)
                verticalLineToRelative(51.2f)
                horizontalLineTo(96.8f)
                close()
                moveTo(71.2f, 25.6f)
                horizontalLineToRelative(10.2f)
                verticalLineTo(128.0f)
                horizontalLineTo(71.2f)
                close()
                moveTo(45.6f, 25.6f)
                horizontalLineToRelative(10.2f)
                verticalLineTo(128.0f)
                horizontalLineTo(45.6f)
                close()
                moveTo(20.0f, 0.0f)
                horizontalLineToRelative(10.2f)
                verticalLineToRelative(76.8f)
                horizontalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
