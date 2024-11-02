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

public val SolidGroup.Tag: ImageVector
    get() {
        if (_tag != null) {
            return _tag!!
        }
        _tag = Builder(name = "Tag", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.25f, 2.25f)
                curveTo(3.593f, 2.25f, 2.25f, 3.593f, 2.25f, 5.25f)
                verticalLineTo(9.568f)
                curveTo(2.25f, 10.364f, 2.566f, 11.127f, 3.129f, 11.689f)
                lineTo(12.71f, 21.271f)
                curveTo(13.629f, 22.19f, 15.099f, 22.456f, 16.257f, 21.698f)
                curveTo(18.424f, 20.279f, 20.279f, 18.424f, 21.698f, 16.257f)
                curveTo(22.456f, 15.099f, 22.19f, 13.629f, 21.271f, 12.71f)
                lineTo(11.689f, 3.129f)
                curveTo(11.127f, 2.566f, 10.364f, 2.25f, 9.568f, 2.25f)
                horizontalLineTo(5.25f)
                close()
                moveTo(6.375f, 7.5f)
                curveTo(6.996f, 7.5f, 7.5f, 6.996f, 7.5f, 6.375f)
                curveTo(7.5f, 5.754f, 6.996f, 5.25f, 6.375f, 5.25f)
                curveTo(5.754f, 5.25f, 5.25f, 5.754f, 5.25f, 6.375f)
                curveTo(5.25f, 6.996f, 5.754f, 7.5f, 6.375f, 7.5f)
                close()
            }
        }
        .build()
        return _tag!!
    }

private var _tag: ImageVector? = null
