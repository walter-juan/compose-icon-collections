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

public val EditorGroup.Subscript2: ImageVector
    get() {
        if (_subscript2 != null) {
            return _subscript2!!
        }
        _subscript2 = Builder(name = "Subscript2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 6.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(11.0f)
                close()
                moveTo(19.551f, 16.58f)
                curveTo(19.704f, 16.434f, 19.8f, 16.228f, 19.8f, 16.0f)
                curveTo(19.8f, 15.558f, 19.442f, 15.2f, 19.0f, 15.2f)
                curveTo(18.558f, 15.2f, 18.2f, 15.558f, 18.2f, 16.0f)
                curveTo(18.2f, 16.076f, 18.211f, 16.15f, 18.231f, 16.22f)
                lineTo(17.076f, 16.55f)
                curveTo(17.027f, 16.375f, 17.0f, 16.191f, 17.0f, 16.0f)
                curveTo(17.0f, 14.895f, 17.895f, 14.0f, 19.0f, 14.0f)
                curveTo(20.105f, 14.0f, 21.0f, 14.895f, 21.0f, 16.0f)
                curveTo(21.0f, 16.573f, 20.759f, 17.089f, 20.374f, 17.454f)
                lineTo(18.744f, 19.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(19.0f)
                lineTo(19.551f, 16.58f)
                verticalLineTo(16.58f)
                close()
            }
        }
        .build()
        return _subscript2!!
    }

private var _subscript2: ImageVector? = null
