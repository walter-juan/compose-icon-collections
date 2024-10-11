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

public val EditorGroup.Superscript2: ImageVector
    get() {
        if (_superscript2 != null) {
            return _superscript2!!
        }
        _superscript2 = Builder(name = "Superscript2", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 7.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(11.0f)
                close()
                moveTo(19.551f, 6.58f)
                curveTo(19.704f, 6.435f, 19.8f, 6.228f, 19.8f, 6.0f)
                curveTo(19.8f, 5.558f, 19.442f, 5.2f, 19.0f, 5.2f)
                curveTo(18.558f, 5.2f, 18.2f, 5.558f, 18.2f, 6.0f)
                curveTo(18.2f, 6.076f, 18.211f, 6.15f, 18.231f, 6.22f)
                lineTo(17.076f, 6.55f)
                curveTo(17.027f, 6.375f, 17.0f, 6.191f, 17.0f, 6.0f)
                curveTo(17.0f, 4.895f, 17.895f, 4.0f, 19.0f, 4.0f)
                curveTo(20.105f, 4.0f, 21.0f, 4.895f, 21.0f, 6.0f)
                curveTo(21.0f, 6.573f, 20.759f, 7.089f, 20.374f, 7.454f)
                lineTo(18.744f, 9.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(9.0f)
                lineTo(19.551f, 6.58f)
                verticalLineTo(6.58f)
                close()
            }
        }
        .build()
        return _superscript2!!
    }

private var _superscript2: ImageVector? = null
