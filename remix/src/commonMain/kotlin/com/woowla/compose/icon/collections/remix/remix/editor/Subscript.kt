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

public val EditorGroup.Subscript: ImageVector
    get() {
        if (_subscript != null) {
            return _subscript!!
        }
        _subscript = Builder(name = "Subscript", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.596f, 4.0f)
                lineTo(10.5f, 9.928f)
                lineTo(15.404f, 4.0f)
                horizontalLineTo(18.0f)
                lineTo(11.798f, 11.497f)
                lineTo(18.0f, 18.994f)
                verticalLineTo(19.0f)
                horizontalLineTo(15.409f)
                lineTo(10.5f, 13.066f)
                lineTo(5.591f, 19.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(18.994f)
                lineTo(9.202f, 11.497f)
                lineTo(3.0f, 4.0f)
                horizontalLineTo(5.596f)
                close()
                moveTo(21.8f, 16.0f)
                curveTo(21.8f, 15.558f, 21.442f, 15.2f, 21.0f, 15.2f)
                curveTo(20.558f, 15.2f, 20.2f, 15.558f, 20.2f, 16.0f)
                curveTo(20.2f, 16.076f, 20.211f, 16.15f, 20.231f, 16.22f)
                lineTo(19.076f, 16.55f)
                curveTo(19.027f, 16.375f, 19.0f, 16.191f, 19.0f, 16.0f)
                curveTo(19.0f, 14.895f, 19.895f, 14.0f, 21.0f, 14.0f)
                curveTo(22.105f, 14.0f, 23.0f, 14.895f, 23.0f, 16.0f)
                curveTo(23.0f, 16.573f, 22.759f, 17.089f, 22.374f, 17.454f)
                lineTo(20.744f, 19.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(19.0f)
                lineTo(21.551f, 16.58f)
                curveTo(21.704f, 16.434f, 21.8f, 16.228f, 21.8f, 16.0f)
                close()
            }
        }
        .build()
        return _subscript!!
    }

private var _subscript: ImageVector? = null
