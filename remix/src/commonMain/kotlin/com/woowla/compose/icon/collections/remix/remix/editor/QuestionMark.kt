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

public val EditorGroup.QuestionMark: ImageVector
    get() {
        if (_questionMark != null) {
            return _questionMark!!
        }
        _questionMark = Builder(name = "QuestionMark", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 19.0f)
                curveTo(12.828f, 19.0f, 13.5f, 19.672f, 13.5f, 20.5f)
                curveTo(13.5f, 21.328f, 12.828f, 22.0f, 12.0f, 22.0f)
                curveTo(11.172f, 22.0f, 10.5f, 21.328f, 10.5f, 20.5f)
                curveTo(10.5f, 19.672f, 11.172f, 19.0f, 12.0f, 19.0f)
                close()
                moveTo(12.0f, 2.0f)
                curveTo(15.314f, 2.0f, 18.0f, 4.686f, 18.0f, 8.0f)
                curveTo(18.0f, 10.165f, 17.247f, 11.291f, 15.326f, 12.923f)
                curveTo(13.399f, 14.56f, 13.0f, 15.297f, 13.0f, 17.0f)
                horizontalLineTo(11.0f)
                curveTo(11.0f, 14.526f, 11.787f, 13.305f, 14.031f, 11.399f)
                curveTo(15.548f, 10.11f, 16.0f, 9.434f, 16.0f, 8.0f)
                curveTo(16.0f, 5.791f, 14.209f, 4.0f, 12.0f, 4.0f)
                curveTo(9.791f, 4.0f, 8.0f, 5.791f, 8.0f, 8.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(8.0f)
                curveTo(6.0f, 4.686f, 8.686f, 2.0f, 12.0f, 2.0f)
                close()
            }
        }
        .build()
        return _questionMark!!
    }

private var _questionMark: ImageVector? = null
