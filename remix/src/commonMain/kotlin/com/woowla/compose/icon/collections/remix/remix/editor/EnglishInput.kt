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

public val EditorGroup.EnglishInput: ImageVector
    get() {
        if (_englishInput != null) {
            return _englishInput!!
        }
        _englishInput = Builder(name = "EnglishInput", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 10.0f)
                horizontalLineTo(16.0f)
                lineTo(16.0f, 10.757f)
                curveTo(16.715f, 10.279f, 17.575f, 10.0f, 18.5f, 10.0f)
                curveTo(20.985f, 10.0f, 23.0f, 12.015f, 23.0f, 14.5f)
                verticalLineTo(20.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(14.5f)
                curveTo(21.0f, 13.07f, 19.826f, 12.0f, 18.5f, 12.0f)
                curveTo(17.174f, 12.0f, 16.0f, 13.07f, 16.0f, 14.5f)
                verticalLineTo(20.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(10.0f)
                close()
                moveTo(12.0f, 4.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(12.0f)
                close()
            }
        }
        .build()
        return _englishInput!!
    }

private var _englishInput: ImageVector? = null
