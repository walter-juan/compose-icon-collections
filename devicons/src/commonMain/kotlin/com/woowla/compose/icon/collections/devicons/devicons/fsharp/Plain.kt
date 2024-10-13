package com.woowla.compose.icon.collections.devicons.devicons.fsharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.FsharpGroup

public val FsharpGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 64.5f)
                lineTo(60.7f, 3.8f)
                verticalLineToRelative(30.4f)
                lineTo(30.4f, 64.5f)
                lineToRelative(30.4f, 30.4f)
                verticalLineToRelative(30.4f)
                lineTo(0.0f, 64.5f)
                close()
                moveTo(39.1f, 64.5f)
                lineToRelative(21.7f, -21.7f)
                verticalLineToRelative(43.4f)
                lineTo(39.1f, 64.5f)
                close()
                moveTo(128.0f, 64.5f)
                lineTo(65.1f, 3.8f)
                verticalLineToRelative(30.4f)
                lineToRelative(30.4f, 30.4f)
                lineToRelative(-30.4f, 30.3f)
                verticalLineToRelative(30.4f)
                lineTo(128.0f, 64.5f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
