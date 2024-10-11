package com.woowla.compose.icon.collections.remix.remix.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.LogosGroup

public val LogosGroup.FacebookCircleLine: ImageVector
    get() {
        if (_facebookCircleLine != null) {
            return _facebookCircleLine!!
        }
        _facebookCircleLine = Builder(name = "FacebookCircleLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.001f, 19.938f)
                curveTo(16.947f, 19.446f, 20.001f, 16.08f, 20.001f, 12.0f)
                curveTo(20.001f, 7.582f, 16.419f, 4.0f, 12.001f, 4.0f)
                curveTo(7.583f, 4.0f, 4.001f, 7.582f, 4.001f, 12.0f)
                curveTo(4.001f, 16.08f, 7.055f, 19.446f, 11.001f, 19.938f)
                verticalLineTo(14.0f)
                horizontalLineTo(9.001f)
                verticalLineTo(12.0f)
                horizontalLineTo(11.001f)
                verticalLineTo(10.346f)
                curveTo(11.001f, 9.009f, 11.14f, 8.524f, 11.402f, 8.035f)
                curveTo(11.663f, 7.546f, 12.047f, 7.162f, 12.536f, 6.901f)
                curveTo(12.918f, 6.696f, 13.393f, 6.573f, 14.223f, 6.52f)
                curveTo(14.552f, 6.499f, 14.978f, 6.525f, 15.501f, 6.6f)
                verticalLineTo(8.5f)
                horizontalLineTo(15.001f)
                curveTo(14.084f, 8.5f, 13.705f, 8.543f, 13.479f, 8.664f)
                curveTo(13.339f, 8.739f, 13.24f, 8.838f, 13.165f, 8.978f)
                curveTo(13.044f, 9.204f, 13.001f, 9.429f, 13.001f, 10.346f)
                verticalLineTo(12.0f)
                horizontalLineTo(15.501f)
                lineTo(15.001f, 14.0f)
                horizontalLineTo(13.001f)
                verticalLineTo(19.938f)
                close()
                moveTo(12.001f, 22.0f)
                curveTo(6.478f, 22.0f, 2.001f, 17.523f, 2.001f, 12.0f)
                curveTo(2.001f, 6.477f, 6.478f, 2.0f, 12.001f, 2.0f)
                curveTo(17.524f, 2.0f, 22.001f, 6.477f, 22.001f, 12.0f)
                curveTo(22.001f, 17.523f, 17.524f, 22.0f, 12.001f, 22.0f)
                close()
            }
        }
        .build()
        return _facebookCircleLine!!
    }

private var _facebookCircleLine: ImageVector? = null
