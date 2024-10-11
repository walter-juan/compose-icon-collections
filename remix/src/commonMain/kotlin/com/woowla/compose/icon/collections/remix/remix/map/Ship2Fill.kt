package com.woowla.compose.icon.collections.remix.remix.map

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.MapGroup

public val MapGroup.Ship2Fill: ImageVector
    get() {
        if (_ship2Fill != null) {
            return _ship2Fill!!
        }
        _ship2Fill = Builder(name = "Ship2Fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 4.0f)
                horizontalLineTo(14.446f)
                curveTo(14.79f, 4.0f, 15.111f, 4.178f, 15.294f, 4.47f)
                lineTo(18.75f, 10.0f)
                horizontalLineTo(23.158f)
                curveTo(23.434f, 10.0f, 23.658f, 10.224f, 23.658f, 10.5f)
                curveTo(23.658f, 10.584f, 23.637f, 10.666f, 23.597f, 10.739f)
                lineTo(19.66f, 17.957f)
                curveTo(19.444f, 17.985f, 19.224f, 18.0f, 19.0f, 18.0f)
                curveTo(17.364f, 18.0f, 15.912f, 17.215f, 15.0f, 16.0f)
                curveTo(14.088f, 17.215f, 12.636f, 18.0f, 11.0f, 18.0f)
                curveTo(9.364f, 18.0f, 7.912f, 17.215f, 7.0f, 16.0f)
                curveTo(6.088f, 17.215f, 4.636f, 18.0f, 3.0f, 18.0f)
                curveTo(2.814f, 18.0f, 2.63f, 17.99f, 2.449f, 17.97f)
                lineTo(1.214f, 11.179f)
                curveTo(1.116f, 10.635f, 1.476f, 10.115f, 2.019f, 10.016f)
                curveTo(2.078f, 10.005f, 2.138f, 10.0f, 2.198f, 10.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(5.0f)
                curveTo(3.0f, 4.448f, 3.448f, 4.0f, 4.0f, 4.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(4.0f)
                close()
                moveTo(5.0f, 10.0f)
                horizontalLineTo(16.392f)
                lineTo(13.892f, 6.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(10.0f)
                close()
                moveTo(3.0f, 20.0f)
                curveTo(4.537f, 20.0f, 5.938f, 19.422f, 7.0f, 18.472f)
                curveTo(8.062f, 19.422f, 9.463f, 20.0f, 11.0f, 20.0f)
                curveTo(12.537f, 20.0f, 13.939f, 19.422f, 15.0f, 18.472f)
                curveTo(16.062f, 19.422f, 17.463f, 20.0f, 19.0f, 20.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(19.0f)
                curveTo(17.543f, 22.0f, 16.177f, 21.61f, 15.0f, 20.93f)
                curveTo(13.823f, 21.61f, 12.457f, 22.0f, 11.0f, 22.0f)
                curveTo(9.543f, 22.0f, 8.177f, 21.61f, 7.0f, 20.93f)
                curveTo(5.823f, 21.61f, 4.457f, 22.0f, 3.0f, 22.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(3.0f)
                close()
            }
        }
        .build()
        return _ship2Fill!!
    }

private var _ship2Fill: ImageVector? = null
