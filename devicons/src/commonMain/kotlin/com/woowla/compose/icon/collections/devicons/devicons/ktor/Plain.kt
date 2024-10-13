package com.woowla.compose.icon.collections.devicons.devicons.ktor

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.KtorGroup

public val KtorGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFFfc801d)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(47.54f, 14.63f)
                lineTo(14.63f, 47.54f)
                lineToRelative(32.41f, 32.41f)
                lineTo(47.04f, 47.04f)
                horizontalLineToRelative(32.91f)
                lineTo(47.54f, 14.63f)
                close()
                moveTo(48.04f, 48.04f)
                verticalLineToRelative(31.91f)
                horizontalLineToRelative(31.91f)
                lineTo(79.96f, 48.04f)
                lineTo(48.04f, 48.04f)
                close()
                moveTo(80.96f, 48.04f)
                verticalLineToRelative(32.91f)
                lineTo(48.04f, 80.96f)
                lineToRelative(32.41f, 32.41f)
                lineToRelative(32.91f, -32.91f)
                lineToRelative(-32.41f, -32.41f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
