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

public val SolidGroup.SquaresPlus: ImageVector
    get() {
        if (_squaresPlus != null) {
            return _squaresPlus!!
        }
        _squaresPlus = Builder(name = "SquaresPlus", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 3.0f)
                curveTo(4.343f, 3.0f, 3.0f, 4.343f, 3.0f, 6.0f)
                verticalLineTo(8.25f)
                curveTo(3.0f, 9.907f, 4.343f, 11.25f, 6.0f, 11.25f)
                horizontalLineTo(8.25f)
                curveTo(9.907f, 11.25f, 11.25f, 9.907f, 11.25f, 8.25f)
                verticalLineTo(6.0f)
                curveTo(11.25f, 4.343f, 9.907f, 3.0f, 8.25f, 3.0f)
                horizontalLineTo(6.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.75f, 3.0f)
                curveTo(14.093f, 3.0f, 12.75f, 4.343f, 12.75f, 6.0f)
                verticalLineTo(8.25f)
                curveTo(12.75f, 9.907f, 14.093f, 11.25f, 15.75f, 11.25f)
                horizontalLineTo(18.0f)
                curveTo(19.657f, 11.25f, 21.0f, 9.907f, 21.0f, 8.25f)
                verticalLineTo(6.0f)
                curveTo(21.0f, 4.343f, 19.657f, 3.0f, 18.0f, 3.0f)
                horizontalLineTo(15.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 12.75f)
                curveTo(4.343f, 12.75f, 3.0f, 14.093f, 3.0f, 15.75f)
                verticalLineTo(18.0f)
                curveTo(3.0f, 19.657f, 4.343f, 21.0f, 6.0f, 21.0f)
                horizontalLineTo(8.25f)
                curveTo(9.907f, 21.0f, 11.25f, 19.657f, 11.25f, 18.0f)
                verticalLineTo(15.75f)
                curveTo(11.25f, 14.093f, 9.907f, 12.75f, 8.25f, 12.75f)
                horizontalLineTo(6.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.625f, 13.5f)
                curveTo(17.625f, 13.086f, 17.289f, 12.75f, 16.875f, 12.75f)
                curveTo(16.461f, 12.75f, 16.125f, 13.086f, 16.125f, 13.5f)
                verticalLineTo(16.125f)
                horizontalLineTo(13.5f)
                curveTo(13.086f, 16.125f, 12.75f, 16.461f, 12.75f, 16.875f)
                curveTo(12.75f, 17.289f, 13.086f, 17.625f, 13.5f, 17.625f)
                horizontalLineTo(16.125f)
                verticalLineTo(20.25f)
                curveTo(16.125f, 20.664f, 16.461f, 21.0f, 16.875f, 21.0f)
                curveTo(17.289f, 21.0f, 17.625f, 20.664f, 17.625f, 20.25f)
                verticalLineTo(17.625f)
                horizontalLineTo(20.25f)
                curveTo(20.664f, 17.625f, 21.0f, 17.289f, 21.0f, 16.875f)
                curveTo(21.0f, 16.461f, 20.664f, 16.125f, 20.25f, 16.125f)
                horizontalLineTo(17.625f)
                verticalLineTo(13.5f)
                close()
            }
        }
        .build()
        return _squaresPlus!!
    }

private var _squaresPlus: ImageVector? = null
