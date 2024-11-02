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

public val SolidGroup.VideoCameraSlash: ImageVector
    get() {
        if (_videoCameraSlash != null) {
            return _videoCameraSlash!!
        }
        _videoCameraSlash = Builder(name = "VideoCameraSlash", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.97f, 3.97f)
                curveTo(1.263f, 3.677f, 1.737f, 3.677f, 2.03f, 3.97f)
                lineTo(17.03f, 18.97f)
                curveTo(17.323f, 19.263f, 17.323f, 19.737f, 17.03f, 20.03f)
                curveTo(16.737f, 20.323f, 16.263f, 20.323f, 15.97f, 20.03f)
                lineTo(0.97f, 5.03f)
                curveTo(0.677f, 4.737f, 0.677f, 4.263f, 0.97f, 3.97f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.25f, 16.061f)
                lineTo(19.939f, 18.75f)
                curveTo(20.884f, 19.695f, 22.5f, 19.026f, 22.5f, 17.689f)
                verticalLineTo(6.311f)
                curveTo(22.5f, 4.974f, 20.884f, 4.305f, 19.939f, 5.25f)
                lineTo(17.25f, 7.939f)
                verticalLineTo(16.061f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.75f, 7.5f)
                verticalLineTo(15.568f)
                lineTo(4.682f, 4.5f)
                horizontalLineTo(12.75f)
                curveTo(14.407f, 4.5f, 15.75f, 5.843f, 15.75f, 7.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.5f, 16.5f)
                verticalLineTo(7.682f)
                lineTo(13.273f, 19.455f)
                curveTo(13.103f, 19.485f, 12.928f, 19.5f, 12.75f, 19.5f)
                horizontalLineTo(4.5f)
                curveTo(2.843f, 19.5f, 1.5f, 18.157f, 1.5f, 16.5f)
                close()
            }
        }
        .build()
        return _videoCameraSlash!!
    }

private var _videoCameraSlash: ImageVector? = null
