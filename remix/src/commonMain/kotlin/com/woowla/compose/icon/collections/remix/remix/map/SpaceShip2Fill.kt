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

public val MapGroup.SpaceShip2Fill: ImageVector
    get() {
        if (_spaceShip2Fill != null) {
            return _spaceShip2Fill!!
        }
        _spaceShip2Fill = Builder(name = "SpaceShip2Fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.949f, 17.293f)
                curveTo(11.34f, 16.903f, 11.973f, 16.903f, 12.363f, 17.293f)
                curveTo(12.754f, 17.683f, 12.754f, 18.317f, 12.363f, 18.708f)
                lineTo(9.524f, 21.546f)
                curveTo(9.134f, 21.936f, 8.501f, 21.936f, 8.11f, 21.546f)
                curveTo(7.72f, 21.155f, 7.72f, 20.522f, 8.11f, 20.132f)
                lineTo(10.949f, 17.293f)
                close()
                moveTo(9.172f, 13.414f)
                curveTo(9.562f, 13.024f, 10.195f, 13.024f, 10.586f, 13.414f)
                curveTo(10.976f, 13.804f, 10.976f, 14.438f, 10.586f, 14.829f)
                lineTo(4.929f, 20.485f)
                curveTo(4.538f, 20.876f, 3.905f, 20.876f, 3.515f, 20.485f)
                curveTo(3.124f, 20.095f, 3.124f, 19.462f, 3.515f, 19.071f)
                lineTo(9.172f, 13.414f)
                close()
                moveTo(17.423f, 2.713f)
                curveTo(18.641f, 2.224f, 19.877f, 2.525f, 20.676f, 3.323f)
                curveTo(21.474f, 4.122f, 21.775f, 5.358f, 21.286f, 6.576f)
                lineTo(17.032f, 17.173f)
                curveTo(16.873f, 17.569f, 16.48f, 17.82f, 16.054f, 17.799f)
                curveTo(15.627f, 17.777f, 15.262f, 17.488f, 15.144f, 17.078f)
                curveTo(14.588f, 15.157f, 13.574f, 13.378f, 12.098f, 11.901f)
                curveTo(10.621f, 10.425f, 8.842f, 9.412f, 6.921f, 8.856f)
                curveTo(6.511f, 8.738f, 6.222f, 8.372f, 6.2f, 7.946f)
                curveTo(6.179f, 7.52f, 6.43f, 7.127f, 6.826f, 6.968f)
                lineTo(17.423f, 2.713f)
                close()
                moveTo(5.293f, 11.637f)
                curveTo(5.683f, 11.246f, 6.316f, 11.246f, 6.707f, 11.637f)
                curveTo(7.097f, 12.027f, 7.097f, 12.66f, 6.707f, 13.051f)
                lineTo(3.868f, 15.889f)
                curveTo(3.478f, 16.28f, 2.845f, 16.28f, 2.454f, 15.889f)
                curveTo(2.063f, 15.499f, 2.064f, 14.866f, 2.454f, 14.475f)
                lineTo(5.293f, 11.637f)
                close()
            }
        }
        .build()
        return _spaceShip2Fill!!
    }

private var _spaceShip2Fill: ImageVector? = null
