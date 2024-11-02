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

public val SolidGroup.Identification: ImageVector
    get() {
        if (_identification != null) {
            return _identification!!
        }
        _identification = Builder(name = "Identification", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.5f, 3.75f)
                curveTo(2.843f, 3.75f, 1.5f, 5.093f, 1.5f, 6.75f)
                verticalLineTo(17.25f)
                curveTo(1.5f, 18.907f, 2.843f, 20.25f, 4.5f, 20.25f)
                horizontalLineTo(19.5f)
                curveTo(21.157f, 20.25f, 22.5f, 18.907f, 22.5f, 17.25f)
                verticalLineTo(6.75f)
                curveTo(22.5f, 5.093f, 21.157f, 3.75f, 19.5f, 3.75f)
                horizontalLineTo(4.5f)
                close()
                moveTo(8.625f, 6.75f)
                curveTo(7.382f, 6.75f, 6.375f, 7.757f, 6.375f, 9.0f)
                curveTo(6.375f, 10.243f, 7.382f, 11.25f, 8.625f, 11.25f)
                curveTo(9.868f, 11.25f, 10.875f, 10.243f, 10.875f, 9.0f)
                curveTo(10.875f, 7.757f, 9.868f, 6.75f, 8.625f, 6.75f)
                close()
                moveTo(4.752f, 15.453f)
                curveTo(5.331f, 13.877f, 6.845f, 12.75f, 8.625f, 12.75f)
                curveTo(10.405f, 12.75f, 11.919f, 13.877f, 12.498f, 15.453f)
                curveTo(12.627f, 15.804f, 12.477f, 16.197f, 12.147f, 16.373f)
                curveTo(11.096f, 16.933f, 9.896f, 17.25f, 8.625f, 17.25f)
                curveTo(7.354f, 17.25f, 6.154f, 16.933f, 5.103f, 16.373f)
                curveTo(4.773f, 16.197f, 4.623f, 15.804f, 4.752f, 15.453f)
                close()
                moveTo(15.0f, 8.25f)
                curveTo(14.586f, 8.25f, 14.25f, 8.586f, 14.25f, 9.0f)
                curveTo(14.25f, 9.414f, 14.586f, 9.75f, 15.0f, 9.75f)
                horizontalLineTo(18.75f)
                curveTo(19.164f, 9.75f, 19.5f, 9.414f, 19.5f, 9.0f)
                curveTo(19.5f, 8.586f, 19.164f, 8.25f, 18.75f, 8.25f)
                horizontalLineTo(15.0f)
                close()
                moveTo(14.25f, 12.0f)
                curveTo(14.25f, 11.586f, 14.586f, 11.25f, 15.0f, 11.25f)
                horizontalLineTo(18.75f)
                curveTo(19.164f, 11.25f, 19.5f, 11.586f, 19.5f, 12.0f)
                curveTo(19.5f, 12.414f, 19.164f, 12.75f, 18.75f, 12.75f)
                horizontalLineTo(15.0f)
                curveTo(14.586f, 12.75f, 14.25f, 12.414f, 14.25f, 12.0f)
                close()
                moveTo(15.0f, 14.25f)
                curveTo(14.586f, 14.25f, 14.25f, 14.586f, 14.25f, 15.0f)
                curveTo(14.25f, 15.414f, 14.586f, 15.75f, 15.0f, 15.75f)
                horizontalLineTo(18.75f)
                curveTo(19.164f, 15.75f, 19.5f, 15.414f, 19.5f, 15.0f)
                curveTo(19.5f, 14.586f, 19.164f, 14.25f, 18.75f, 14.25f)
                horizontalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _identification!!
    }

private var _identification: ImageVector? = null
