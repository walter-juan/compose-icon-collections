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

public val SolidGroup.Document: ImageVector
    get() {
        if (_document != null) {
            return _document!!
        }
        _document = Builder(name = "Document", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.625f, 1.5f)
                curveTo(4.589f, 1.5f, 3.75f, 2.339f, 3.75f, 3.375f)
                verticalLineTo(20.625f)
                curveTo(3.75f, 21.66f, 4.589f, 22.5f, 5.625f, 22.5f)
                horizontalLineTo(18.375f)
                curveTo(19.41f, 22.5f, 20.25f, 21.66f, 20.25f, 20.625f)
                verticalLineTo(12.75f)
                curveTo(20.25f, 10.679f, 18.571f, 9.0f, 16.5f, 9.0f)
                horizontalLineTo(14.625f)
                curveTo(13.59f, 9.0f, 12.75f, 8.161f, 12.75f, 7.125f)
                verticalLineTo(5.25f)
                curveTo(12.75f, 3.179f, 11.071f, 1.5f, 9.0f, 1.5f)
                horizontalLineTo(5.625f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.971f, 1.816f)
                curveTo(13.768f, 2.736f, 14.25f, 3.937f, 14.25f, 5.25f)
                verticalLineTo(7.125f)
                curveTo(14.25f, 7.332f, 14.418f, 7.5f, 14.625f, 7.5f)
                horizontalLineTo(16.5f)
                curveTo(17.813f, 7.5f, 19.014f, 7.982f, 19.934f, 8.779f)
                curveTo(19.046f, 5.38f, 16.37f, 2.704f, 12.971f, 1.816f)
                close()
            }
        }
        .build()
        return _document!!
    }

private var _document: ImageVector? = null