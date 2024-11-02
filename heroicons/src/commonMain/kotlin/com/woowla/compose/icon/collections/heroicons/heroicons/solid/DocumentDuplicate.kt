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

public val SolidGroup.DocumentDuplicate: ImageVector
    get() {
        if (_documentDuplicate != null) {
            return _documentDuplicate!!
        }
        _documentDuplicate = Builder(name = "DocumentDuplicate", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.5f, 3.375f)
                curveTo(7.5f, 2.339f, 8.339f, 1.5f, 9.375f, 1.5f)
                horizontalLineTo(9.75f)
                curveTo(11.821f, 1.5f, 13.5f, 3.179f, 13.5f, 5.25f)
                verticalLineTo(7.125f)
                curveTo(13.5f, 8.161f, 14.34f, 9.0f, 15.375f, 9.0f)
                horizontalLineTo(17.25f)
                curveTo(19.321f, 9.0f, 21.0f, 10.679f, 21.0f, 12.75f)
                verticalLineTo(16.125f)
                curveTo(21.0f, 17.16f, 20.16f, 18.0f, 19.125f, 18.0f)
                horizontalLineTo(9.375f)
                curveTo(8.339f, 18.0f, 7.5f, 17.16f, 7.5f, 16.125f)
                verticalLineTo(3.375f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 5.25f)
                curveTo(15.0f, 3.937f, 14.518f, 2.736f, 13.721f, 1.816f)
                curveTo(17.12f, 2.704f, 19.796f, 5.38f, 20.684f, 8.779f)
                curveTo(19.764f, 7.982f, 18.563f, 7.5f, 17.25f, 7.5f)
                horizontalLineTo(15.375f)
                curveTo(15.168f, 7.5f, 15.0f, 7.332f, 15.0f, 7.125f)
                verticalLineTo(5.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.875f, 6.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(16.125f)
                curveTo(6.0f, 17.989f, 7.511f, 19.5f, 9.375f, 19.5f)
                horizontalLineTo(16.5f)
                verticalLineTo(20.625f)
                curveTo(16.5f, 21.66f, 15.66f, 22.5f, 14.625f, 22.5f)
                horizontalLineTo(4.875f)
                curveTo(3.839f, 22.5f, 3.0f, 21.66f, 3.0f, 20.625f)
                verticalLineTo(7.875f)
                curveTo(3.0f, 6.839f, 3.839f, 6.0f, 4.875f, 6.0f)
                close()
            }
        }
        .build()
        return _documentDuplicate!!
    }

private var _documentDuplicate: ImageVector? = null
