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

public val MapGroup.Rocket2Line: ImageVector
    get() {
        if (_rocket2Line != null) {
            return _rocket2Line!!
        }
        _rocket2Line = Builder(name = "Rocket2Line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.502f, 20.005f)
                curveTo(14.843f, 21.584f, 13.579f, 22.848f, 12.0f, 23.507f)
                curveTo(10.421f, 22.848f, 9.157f, 21.584f, 8.498f, 20.005f)
                horizontalLineTo(10.757f)
                curveTo(11.084f, 20.493f, 11.505f, 20.917f, 12.0f, 21.248f)
                curveTo(12.495f, 20.917f, 12.916f, 20.493f, 13.243f, 20.005f)
                horizontalLineTo(15.502f)
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
                moveTo(17.269f, 17.005f)
                lineTo(16.0f, 15.565f)
                verticalLineTo(9.005f)
                curveTo(16.0f, 6.687f, 14.429f, 4.574f, 12.0f, 3.584f)
                curveTo(9.571f, 4.574f, 8.0f, 6.687f, 8.0f, 9.005f)
                verticalLineTo(15.565f)
                lineTo(6.731f, 17.005f)
                horizontalLineTo(17.269f)
                close()
                moveTo(12.0f, 11.005f)
                curveTo(10.895f, 11.005f, 10.0f, 10.109f, 10.0f, 9.005f)
                curveTo(10.0f, 7.9f, 10.895f, 7.005f, 12.0f, 7.005f)
                curveTo(13.105f, 7.005f, 14.0f, 7.9f, 14.0f, 9.005f)
                curveTo(14.0f, 10.109f, 13.105f, 11.005f, 12.0f, 11.005f)
                close()
            }
        }
        .build()
        return _rocket2Line!!
    }

private var _rocket2Line: ImageVector? = null
