package com.woowla.compose.icon.collections.heroicons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.SolidGroup

public val SolidGroup.Italic: ImageVector
    get() {
        if (_italic != null) {
            return _italic!!
        }
        _italic = Builder(name = "Italic", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.497f, 3.744f)
                curveTo(10.497f, 3.33f, 10.833f, 2.994f, 11.247f, 2.994f)
                horizontalLineTo(18.747f)
                curveTo(19.161f, 2.994f, 19.497f, 3.33f, 19.497f, 3.744f)
                curveTo(19.497f, 4.158f, 19.161f, 4.494f, 18.747f, 4.494f)
                horizontalLineTo(15.472f)
                lineTo(10.115f, 19.496f)
                horizontalLineTo(12.747f)
                curveTo(13.161f, 19.496f, 13.497f, 19.831f, 13.497f, 20.246f)
                curveTo(13.497f, 20.66f, 13.161f, 20.996f, 12.747f, 20.996f)
                horizontalLineTo(5.247f)
                curveTo(4.833f, 20.996f, 4.497f, 20.66f, 4.497f, 20.246f)
                curveTo(4.497f, 19.831f, 4.833f, 19.496f, 5.247f, 19.496f)
                horizontalLineTo(8.522f)
                lineTo(13.879f, 4.494f)
                horizontalLineTo(11.247f)
                curveTo(10.833f, 4.494f, 10.497f, 4.158f, 10.497f, 3.744f)
                close()
            }
        }
        .build()
        return _italic!!
    }

private var _italic: ImageVector? = null
