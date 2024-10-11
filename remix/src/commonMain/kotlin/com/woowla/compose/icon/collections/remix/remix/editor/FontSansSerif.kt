package com.woowla.compose.icon.collections.remix.remix.editor

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.EditorGroup

public val EditorGroup.FontSansSerif: ImageVector
    get() {
        if (_fontSansSerif != null) {
            return _fontSansSerif!!
        }
        _fontSansSerif = Builder(name = "FontSansSerif", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 4.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(17.5f)
                curveTo(17.0f, 6.0f, 17.0f, 5.0f, 15.0f, 5.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(13.0f)
                curveTo(14.0f, 12.0f, 15.0f, 11.5f, 15.0f, 10.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(15.0f)
                curveTo(15.0f, 13.5f, 14.0f, 13.0f, 13.0f, 13.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(17.5f)
                curveTo(10.0f, 20.0f, 13.5f, 20.0f, 13.5f, 20.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(20.0f)
                curveTo(7.0f, 19.5f, 7.0f, 18.5f, 7.0f, 17.5f)
                verticalLineTo(7.5f)
                curveTo(7.0f, 6.5f, 7.0f, 5.5f, 5.0f, 5.0f)
                verticalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _fontSansSerif!!
    }

private var _fontSansSerif: ImageVector? = null
