package com.woowla.compose.icon.collections.heroicons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val SolidGroup.DocumentArrowUp: ImageVector
    get() {
        if (_documentArrowUp != null) {
            return _documentArrowUp!!
        }
        _documentArrowUp = Builder(name = "DocumentArrowUp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.625f, 1.5f)
                horizontalLineTo(9.0f)
                curveTo(11.071f, 1.5f, 12.75f, 3.179f, 12.75f, 5.25f)
                verticalLineTo(7.125f)
                curveTo(12.75f, 8.161f, 13.59f, 9.0f, 14.625f, 9.0f)
                horizontalLineTo(16.5f)
                curveTo(18.571f, 9.0f, 20.25f, 10.679f, 20.25f, 12.75f)
                verticalLineTo(20.625f)
                curveTo(20.25f, 21.66f, 19.41f, 22.5f, 18.375f, 22.5f)
                horizontalLineTo(5.625f)
                curveTo(4.589f, 22.5f, 3.75f, 21.66f, 3.75f, 20.625f)
                verticalLineTo(3.375f)
                curveTo(3.75f, 2.339f, 4.589f, 1.5f, 5.625f, 1.5f)
                close()
                moveTo(12.53f, 11.47f)
                curveTo(12.39f, 11.329f, 12.199f, 11.25f, 12.0f, 11.25f)
                curveTo(11.801f, 11.25f, 11.61f, 11.329f, 11.47f, 11.47f)
                lineTo(8.47f, 14.47f)
                curveTo(8.177f, 14.763f, 8.177f, 15.237f, 8.47f, 15.53f)
                curveTo(8.763f, 15.823f, 9.237f, 15.823f, 9.53f, 15.53f)
                lineTo(11.25f, 13.811f)
                lineTo(11.25f, 18.0f)
                curveTo(11.25f, 18.414f, 11.586f, 18.75f, 12.0f, 18.75f)
                curveTo(12.414f, 18.75f, 12.75f, 18.414f, 12.75f, 18.0f)
                lineTo(12.75f, 13.811f)
                lineTo(14.47f, 15.53f)
                curveTo(14.763f, 15.823f, 15.237f, 15.823f, 15.53f, 15.53f)
                curveTo(15.823f, 15.237f, 15.823f, 14.763f, 15.53f, 14.47f)
                lineTo(12.53f, 11.47f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.25f, 5.25f)
                curveTo(14.25f, 3.937f, 13.768f, 2.736f, 12.971f, 1.816f)
                curveTo(16.37f, 2.704f, 19.046f, 5.38f, 19.934f, 8.779f)
                curveTo(19.014f, 7.982f, 17.813f, 7.5f, 16.5f, 7.5f)
                horizontalLineTo(14.625f)
                curveTo(14.418f, 7.5f, 14.25f, 7.332f, 14.25f, 7.125f)
                verticalLineTo(5.25f)
                close()
            }
        }
        .build()
        return _documentArrowUp!!
    }

private var _documentArrowUp: ImageVector? = null
