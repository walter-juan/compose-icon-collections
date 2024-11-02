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

public val SolidGroup.ViewColumns: ImageVector
    get() {
        if (_viewColumns != null) {
            return _viewColumns!!
        }
        _viewColumns = Builder(name = "ViewColumns", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 3.75f)
                horizontalLineTo(9.0f)
                verticalLineTo(20.25f)
                horizontalLineTo(15.0f)
                verticalLineTo(3.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 20.25f)
                horizontalLineTo(19.875f)
                curveTo(20.91f, 20.25f, 21.75f, 19.41f, 21.75f, 18.375f)
                verticalLineTo(5.625f)
                curveTo(21.75f, 4.589f, 20.91f, 3.75f, 19.875f, 3.75f)
                horizontalLineTo(16.5f)
                verticalLineTo(20.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.125f, 3.75f)
                horizontalLineTo(7.5f)
                verticalLineTo(20.25f)
                horizontalLineTo(4.125f)
                curveTo(3.089f, 20.25f, 2.25f, 19.41f, 2.25f, 18.375f)
                verticalLineTo(5.625f)
                curveTo(2.25f, 4.589f, 3.089f, 3.75f, 4.125f, 3.75f)
                close()
            }
        }
        .build()
        return _viewColumns!!
    }

private var _viewColumns: ImageVector? = null
