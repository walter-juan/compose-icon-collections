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

public val SolidGroup.Folder: ImageVector
    get() {
        if (_folder != null) {
            return _folder!!
        }
        _folder = Builder(name = "Folder", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.5f, 21.0f)
                curveTo(21.157f, 21.0f, 22.5f, 19.657f, 22.5f, 18.0f)
                verticalLineTo(13.5f)
                curveTo(22.5f, 11.843f, 21.157f, 10.5f, 19.5f, 10.5f)
                horizontalLineTo(4.5f)
                curveTo(2.843f, 10.5f, 1.5f, 11.843f, 1.5f, 13.5f)
                verticalLineTo(18.0f)
                curveTo(1.5f, 19.657f, 2.843f, 21.0f, 4.5f, 21.0f)
                horizontalLineTo(19.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.5f, 10.146f)
                verticalLineTo(6.0f)
                curveTo(1.5f, 4.343f, 2.843f, 3.0f, 4.5f, 3.0f)
                horizontalLineTo(9.879f)
                curveTo(10.475f, 3.0f, 11.048f, 3.237f, 11.47f, 3.659f)
                lineTo(13.591f, 5.78f)
                curveTo(13.732f, 5.921f, 13.922f, 6.0f, 14.121f, 6.0f)
                horizontalLineTo(19.5f)
                curveTo(21.157f, 6.0f, 22.5f, 7.343f, 22.5f, 9.0f)
                verticalLineTo(10.146f)
                curveTo(21.704f, 9.433f, 20.653f, 9.0f, 19.5f, 9.0f)
                horizontalLineTo(4.5f)
                curveTo(3.347f, 9.0f, 2.296f, 9.433f, 1.5f, 10.146f)
                close()
            }
        }
        .build()
        return _folder!!
    }

private var _folder: ImageVector? = null
