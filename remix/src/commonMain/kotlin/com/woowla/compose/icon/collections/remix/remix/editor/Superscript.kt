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

public val EditorGroup.Superscript: ImageVector
    get() {
        if (_superscript != null) {
            return _superscript!!
        }
        _superscript = Builder(name = "Superscript", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.596f, 5.0f)
                lineTo(10.5f, 10.928f)
                lineTo(15.404f, 5.0f)
                horizontalLineTo(18.0f)
                lineTo(11.798f, 12.497f)
                lineTo(18.0f, 19.994f)
                verticalLineTo(20.0f)
                horizontalLineTo(15.409f)
                lineTo(10.5f, 14.066f)
                lineTo(5.591f, 20.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(19.994f)
                lineTo(9.202f, 12.497f)
                lineTo(3.0f, 5.0f)
                horizontalLineTo(5.596f)
                close()
                moveTo(21.551f, 6.58f)
                curveTo(21.704f, 6.435f, 21.8f, 6.228f, 21.8f, 6.0f)
                curveTo(21.8f, 5.558f, 21.442f, 5.2f, 21.0f, 5.2f)
                curveTo(20.558f, 5.2f, 20.2f, 5.558f, 20.2f, 6.0f)
                curveTo(20.2f, 6.076f, 20.211f, 6.15f, 20.231f, 6.22f)
                lineTo(19.076f, 6.55f)
                curveTo(19.027f, 6.375f, 19.0f, 6.191f, 19.0f, 6.0f)
                curveTo(19.0f, 4.895f, 19.895f, 4.0f, 21.0f, 4.0f)
                curveTo(22.105f, 4.0f, 23.0f, 4.895f, 23.0f, 6.0f)
                curveTo(23.0f, 6.573f, 22.759f, 7.089f, 22.374f, 7.454f)
                lineTo(20.744f, 9.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(9.0f)
                lineTo(21.551f, 6.58f)
                verticalLineTo(6.58f)
                close()
            }
        }
        .build()
        return _superscript!!
    }

private var _superscript: ImageVector? = null
