package com.woowla.compose.icon.collections.devicons.devicons.haxe

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.HaxeGroup

public val HaxeGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFFEA8220)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(32.3f)
                lineTo(64.0f, 16.0f)
                lineTo(96.3f, 0.0f)
                horizontalLineTo(128.0f)
                verticalLineToRelative(32.6f)
                lineTo(111.8f, 64.0f)
                lineTo(128.0f, 95.8f)
                verticalLineTo(128.0f)
                horizontalLineTo(95.2f)
                lineTo(64.0f, 112.1f)
                lineTo(32.6f, 128.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(94.7f)
                lineTo(15.7f, 64.0f)
                lineTo(0.0f, 31.8f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
