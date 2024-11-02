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

public val SolidGroup.VideoCamera: ImageVector
    get() {
        if (_videoCamera != null) {
            return _videoCamera!!
        }
        _videoCamera = Builder(name = "VideoCamera", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.5f, 4.5f)
                curveTo(2.843f, 4.5f, 1.5f, 5.843f, 1.5f, 7.5f)
                verticalLineTo(16.5f)
                curveTo(1.5f, 18.157f, 2.843f, 19.5f, 4.5f, 19.5f)
                horizontalLineTo(12.75f)
                curveTo(14.407f, 19.5f, 15.75f, 18.157f, 15.75f, 16.5f)
                verticalLineTo(7.5f)
                curveTo(15.75f, 5.843f, 14.407f, 4.5f, 12.75f, 4.5f)
                horizontalLineTo(4.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.939f, 18.75f)
                lineTo(17.25f, 16.061f)
                verticalLineTo(7.939f)
                lineTo(19.939f, 5.25f)
                curveTo(20.884f, 4.305f, 22.5f, 4.974f, 22.5f, 6.311f)
                verticalLineTo(17.689f)
                curveTo(22.5f, 19.026f, 20.884f, 19.695f, 19.939f, 18.75f)
                close()
            }
        }
        .build()
        return _videoCamera!!
    }

private var _videoCamera: ImageVector? = null
