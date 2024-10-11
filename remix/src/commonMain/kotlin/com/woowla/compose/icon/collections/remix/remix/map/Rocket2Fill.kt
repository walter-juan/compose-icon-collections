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

public val MapGroup.Rocket2Fill: ImageVector
    get() {
        if (_rocket2Fill != null) {
            return _rocket2Fill!!
        }
        _rocket2Fill = Builder(name = "Rocket2Fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.498f, 20.005f)
                horizontalLineTo(15.502f)
                curveTo(14.843f, 21.584f, 13.579f, 22.848f, 12.0f, 23.507f)
                curveTo(10.421f, 22.848f, 9.157f, 21.584f, 8.498f, 20.005f)
                close()
                moveTo(18.0f, 14.809f)
                lineTo(20.0f, 17.078f)
                verticalLineTo(19.005f)
                horizontalLineTo(4.0f)
                verticalLineTo(17.078f)
                lineTo(6.0f, 14.809f)
                verticalLineTo(9.005f)
                curveTo(6.0f, 5.522f, 8.504f, 2.558f, 12.0f, 1.46f)
                curveTo(15.496f, 2.558f, 18.0f, 5.522f, 18.0f, 9.005f)
                verticalLineTo(14.809f)
                close()
                moveTo(12.0f, 11.005f)
                curveTo(13.105f, 11.005f, 14.0f, 10.109f, 14.0f, 9.005f)
                curveTo(14.0f, 7.9f, 13.105f, 7.005f, 12.0f, 7.005f)
                curveTo(10.895f, 7.005f, 10.0f, 7.9f, 10.0f, 9.005f)
                curveTo(10.0f, 10.109f, 10.895f, 11.005f, 12.0f, 11.005f)
                close()
            }
        }
        .build()
        return _rocket2Fill!!
    }

private var _rocket2Fill: ImageVector? = null
