package com.woowla.compose.icon.collections.devicons.devicons.poetry

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.PoetryGroup

public val PoetryGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF0080c5)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.22f, 5.33f)
                verticalLineToRelative(95.61f)
                horizontalLineToRelative(0.0f)
                lineTo(40.07f, 124.8f)
                arcToRelative(121.72f, 121.72f, 0.0f, false, false, 62.24f, -33.37f)
                lineTo(83.82f, 72.94f)
                lineTo(16.25f, 5.37f)
                lineToRelative(69.35f, 65.74f)
                curveToRelative(16.25f, -17.14f, 26.22f, -40.29f, 26.22f, -65.77f)
                horizontalLineTo(16.22f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
