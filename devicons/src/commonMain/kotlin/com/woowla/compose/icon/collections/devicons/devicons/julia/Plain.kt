package com.woowla.compose.icon.collections.devicons.devicons.julia

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.JuliaGroup

public val JuliaGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(29.1f, 94.2f)
                moveToRelative(-29.1f, 0.0f)
                arcToRelative(29.1f, 29.1f, 0.0f, true, true, 58.2f, 0.0f)
                arcToRelative(29.1f, 29.1f, 0.0f, true, true, -58.2f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(98.9f, 94.2f)
                moveToRelative(-29.1f, 0.0f)
                arcToRelative(29.1f, 29.1f, 0.0f, true, true, 58.2f, 0.0f)
                arcToRelative(29.1f, 29.1f, 0.0f, true, true, -58.2f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 33.8f)
                moveToRelative(-29.1f, 0.0f)
                arcToRelative(29.1f, 29.1f, 0.0f, true, true, 58.2f, 0.0f)
                arcToRelative(29.1f, 29.1f, 0.0f, true, true, -58.2f, 0.0f)
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
