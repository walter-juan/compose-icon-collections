package com.woowla.compose.icon.collections.heroicons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.SolidGroup

public val SolidGroup.Square2Stack: ImageVector
    get() {
        if (_square2Stack != null) {
            return _square2Stack!!
        }
        _square2Stack = Builder(name = "Square2Stack", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 6.0f)
                curveTo(16.5f, 4.343f, 15.157f, 3.0f, 13.5f, 3.0f)
                horizontalLineTo(6.0f)
                curveTo(4.343f, 3.0f, 3.0f, 4.343f, 3.0f, 6.0f)
                verticalLineTo(13.5f)
                curveTo(3.0f, 15.157f, 4.343f, 16.5f, 6.0f, 16.5f)
                verticalLineTo(10.5f)
                curveTo(6.0f, 8.015f, 8.015f, 6.0f, 10.5f, 6.0f)
                horizontalLineTo(16.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 7.5f)
                curveTo(19.657f, 7.5f, 21.0f, 8.843f, 21.0f, 10.5f)
                verticalLineTo(18.0f)
                curveTo(21.0f, 19.657f, 19.657f, 21.0f, 18.0f, 21.0f)
                horizontalLineTo(10.5f)
                curveTo(8.843f, 21.0f, 7.5f, 19.657f, 7.5f, 18.0f)
                verticalLineTo(10.5f)
                curveTo(7.5f, 8.843f, 8.843f, 7.5f, 10.5f, 7.5f)
                horizontalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _square2Stack!!
    }

private var _square2Stack: ImageVector? = null
