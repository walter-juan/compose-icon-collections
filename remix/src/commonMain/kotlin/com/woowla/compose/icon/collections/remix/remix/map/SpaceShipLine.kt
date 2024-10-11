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

public val MapGroup.SpaceShipLine: ImageVector
    get() {
        if (_spaceShipLine != null) {
            return _spaceShipLine!!
        }
        _spaceShipLine = Builder(name = "SpaceShipLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.88f, 18.049f)
                curveTo(4.23f, 12.056f, 7.075f, 6.629f, 11.003f, 2.18f)
                curveTo(11.111f, 2.058f, 11.247f, 1.907f, 11.411f, 1.729f)
                curveTo(11.71f, 1.403f, 12.216f, 1.382f, 12.541f, 1.681f)
                curveTo(12.558f, 1.696f, 12.574f, 1.712f, 12.589f, 1.729f)
                curveTo(12.755f, 1.91f, 12.893f, 2.062f, 13.002f, 2.185f)
                curveTo(16.927f, 6.633f, 19.77f, 12.058f, 21.12f, 18.049f)
                curveTo(18.979f, 18.5f, 16.78f, 18.796f, 14.536f, 18.924f)
                lineTo(12.447f, 23.101f)
                curveTo(12.324f, 23.348f, 12.023f, 23.448f, 11.776f, 23.325f)
                curveTo(11.68f, 23.276f, 11.601f, 23.198f, 11.553f, 23.101f)
                lineTo(9.464f, 18.924f)
                curveTo(7.22f, 18.796f, 5.021f, 18.5f, 2.88f, 18.049f)
                close()
                moveTo(9.577f, 16.927f)
                lineTo(10.735f, 16.993f)
                lineTo(12.0f, 19.523f)
                lineTo(13.265f, 16.993f)
                lineTo(14.422f, 16.927f)
                curveTo(15.844f, 16.846f, 17.254f, 16.694f, 18.649f, 16.472f)
                curveTo(17.323f, 11.919f, 15.054f, 7.705f, 12.0f, 4.085f)
                curveTo(8.946f, 7.705f, 6.677f, 11.919f, 5.351f, 16.472f)
                curveTo(6.746f, 16.694f, 8.156f, 16.846f, 9.577f, 16.927f)
                close()
                moveTo(12.0f, 14.995f)
                curveTo(10.343f, 14.995f, 9.0f, 13.652f, 9.0f, 11.995f)
                curveTo(9.0f, 10.339f, 10.343f, 8.995f, 12.0f, 8.995f)
                curveTo(13.657f, 8.995f, 15.0f, 10.339f, 15.0f, 11.995f)
                curveTo(15.0f, 13.652f, 13.657f, 14.995f, 12.0f, 14.995f)
                close()
                moveTo(12.0f, 12.995f)
                curveTo(12.552f, 12.995f, 13.0f, 12.548f, 13.0f, 11.995f)
                curveTo(13.0f, 11.443f, 12.552f, 10.995f, 12.0f, 10.995f)
                curveTo(11.448f, 10.995f, 11.0f, 11.443f, 11.0f, 11.995f)
                curveTo(11.0f, 12.548f, 11.448f, 12.995f, 12.0f, 12.995f)
                close()
            }
        }
        .build()
        return _spaceShipLine!!
    }

private var _spaceShipLine: ImageVector? = null
