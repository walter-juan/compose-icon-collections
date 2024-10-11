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

public val EditorGroup.TextWrap: ImageVector
    get() {
        if (_textWrap != null) {
            return _textWrap!!
        }
        _textWrap = Builder(name = "TextWrap", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 18.0f)
                horizontalLineTo(16.5f)
                curveTo(17.881f, 18.0f, 19.0f, 16.881f, 19.0f, 15.5f)
                curveTo(19.0f, 14.119f, 17.881f, 13.0f, 16.5f, 13.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(16.5f)
                curveTo(18.985f, 11.0f, 21.0f, 13.015f, 21.0f, 15.5f)
                curveTo(21.0f, 17.985f, 18.985f, 20.0f, 16.5f, 20.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(22.0f)
                lineTo(11.0f, 19.0f)
                lineTo(15.0f, 16.0f)
                verticalLineTo(18.0f)
                close()
                moveTo(3.0f, 4.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(4.0f)
                close()
                moveTo(9.0f, 18.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _textWrap!!
    }

private var _textWrap: ImageVector? = null
