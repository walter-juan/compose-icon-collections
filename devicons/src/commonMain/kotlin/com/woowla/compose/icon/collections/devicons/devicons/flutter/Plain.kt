package com.woowla.compose.icon.collections.devicons.devicons.flutter

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.FlutterGroup

public val FlutterGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF3FB6D3)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.3f, 64.2f)
                lineTo(76.3f, 0.0f)
                horizontalLineToRelative(39.4f)
                lineTo(32.1f, 83.6f)
                close()
                moveTo(76.3f, 128.0f)
                horizontalLineToRelative(39.4f)
                lineTo(81.6f, 93.9f)
                lineToRelative(34.1f, -34.8f)
                horizontalLineTo(76.3f)
                lineTo(42.2f, 93.5f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
